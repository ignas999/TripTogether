package com.example.triptogether.pages

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material3.Button
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.triptogether.R
import com.example.triptogether.Routes

@Composable
fun PlanTripScreen(navController: NavController, modifier: Modifier = Modifier) {

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
            .fillMaxWidth()
    ) {
        Image(painter = painterResource(id = R.drawable.planrouteapi), contentDescription = "img")
        // Date time input (fake for now)
        Text(text = "Data ir laikas")
        Spacer(modifier = Modifier.height(8.dp))
        Text(text = "Pasirinkite data ir laika") // Replace with date time picker

        Spacer(modifier = Modifier.height(16.dp))

        // Starting point input (fake for now)
        Text(text = "Pradinis tikslas")
        Spacer(modifier = Modifier.height(8.dp))
        Text(text = "iveskite pradini tiksla") // Replace with starting point input

        Spacer(modifier = Modifier.height(16.dp))

        // Final destination input (fake for now)
        Text(text = "Galutinis tikslas")
        Spacer(modifier = Modifier.height(8.dp))
        Text(text = "Iveskite galutini tiksla") // Replace with final destination input

        Spacer(modifier = Modifier.height(16.dp))

        // Date time input (fake for now)
        Text(text = "Kelionės Pavadinimas")
        Spacer(modifier = Modifier.height(8.dp))

        OutlinedTextField(value = "",
            onValueChange = {},
            label = { Text("Iveskite keliones pavadinimą") })
        Spacer(modifier = Modifier.height(16.dp))
        // List of friends
        Text(text = "Galite prideti draugus i kelionę")
        FriendList()

        Spacer(modifier = Modifier.weight(1f))

        // Button to confirm trip plan
        Button(
            onClick = { navController.navigate(Routes.currentTripsScreen) },
            modifier = Modifier.fillMaxWidth()
        ) {
            Text(text = "Planuooti kelionę")
        }
    }
}

@Composable
fun FriendList() {
    val fakeFriends = listOf(
        Friend("Rokas", R.drawable.person_icon),
        Friend("Gytis", R.drawable.person_icon),
        Friend("Laimonas", R.drawable.person_icon)
    )

    Column {
        fakeFriends.forEach { friend ->
            FriendItem(friend)
        }
    }
}

@Composable
fun FriendItem(friend: Friend) {
    Row(
        verticalAlignment = Alignment.CenterVertically,
        modifier = Modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.spacedBy(8.dp)
    ) {
        Image(
            painter = painterResource(id = friend.icon),
            contentDescription = null,
            modifier = Modifier.size(48.dp)
        )
        Text(text = friend.name)
        Button(
            onClick = { /* Handle button click to add friend to the trip */ }
        ) {
            Text(text = "+")
        }
    }
}

data class Friend(
    val name: String,
    val icon: Int
)


