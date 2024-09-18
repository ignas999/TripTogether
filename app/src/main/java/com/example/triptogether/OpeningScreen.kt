package com.example.triptogether

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Button
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.triptogether.pages.OverviewScreen

@Composable
fun OpeningScreen(navController: NavController, modifier: Modifier = Modifier){


    var loginName = remember {
        mutableStateOf("")
    }
    var password = remember {
        mutableStateOf("")
    }
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        verticalArrangement = Arrangement.SpaceAround,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Image(painter = painterResource(id = R.drawable.mainlogo), contentDescription = "contentlogo", alignment = Alignment.TopStart)
        Spacer(modifier = Modifier.height(16.dp))
        Text(text = stringResource(R.string.Welcome_Description), textAlign = TextAlign.Center )
        Spacer(modifier = Modifier.height(16.dp))
        OutlinedTextField(
            value = loginName.value,
            onValueChange = { loginName.value = it },
            label = { Text("Vardas") },
            keyboardOptions = KeyboardOptions.Default.copy(keyboardType = KeyboardType.Text)
        )
        OutlinedTextField(
            value = password.value,
            onValueChange = { password.value = it},
            label = { Text("Slaptažodis") },
            keyboardOptions = KeyboardOptions.Default.copy(keyboardType = KeyboardType.Password)
        )
        Button(onClick = { navController.navigate(Routes.overviewScreen) }, modifier = Modifier.fillMaxWidth()) {
            Text(text = "Prisijungti")
        }
    }


}
