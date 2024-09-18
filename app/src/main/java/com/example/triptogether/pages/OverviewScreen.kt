package com.example.triptogether.pages

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.wrapContentWidth
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.triptogether.R
import com.example.triptogether.Routes

@Composable
fun OverviewScreen(navController: NavController, modifier: Modifier = Modifier){
    val messages = remember {
        fakeMessages
    }
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        verticalArrangement = Arrangement.spacedBy(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Image(painter = painterResource(id = R.drawable.logged_in_banner), contentDescription = "random" )
        Column(
            modifier = Modifier.weight(1f),
            verticalArrangement = Arrangement.spacedBy(16.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Button(
                onClick = { navController.navigate(Routes.planTripScreen) },
                modifier = Modifier.fillMaxWidth()
            ) {
                Text(text = "Suplanuoti kelionę")
            }
            Button(
                onClick = { navController.navigate(Routes.currentTripsScreen) },
                modifier = Modifier.fillMaxWidth()
            ) {
                Text(text = "Aktyvios keliones")
            }
            Text(text = "Profilio info")
            Row(modifier = Modifier
                .fillMaxWidth()
                ) {

                Button(
                    onClick = {  },
                    modifier = Modifier

                        .weight(1F)

                    ) {
                    Text(text = "Mano Profilis")
                }
                Button(
                    onClick = {  },
                    modifier = Modifier

                ) {
                    Text(text = "Atsijungti")
                }
            }

        }
        Row(
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.spacedBy(16.dp)
        ) {
            Text(
                text = "Susirašinėjimai",

                color = Color.Black
            )
            Button(
                onClick = {  },
                modifier = Modifier.wrapContentWidth()
            ) {
                Text(text = "Prideti draugų")
            }
        }
        Box(
            modifier = Modifier.weight(2f),
            contentAlignment = Alignment.Center
        ) {
            LazyColumn(
                modifier = Modifier.fillMaxSize(),
                contentPadding = PaddingValues(16.dp)
            ) {
                items(messages.size) { index ->
                    MessageItem(
                        message = messages[index],
                        onClick = { /* Handle message click */ }
                    )
                }
            }
        }
    }
}




@Composable
fun MessageItem(message: Message, onClick: () -> Unit) {
    Row(
        modifier = Modifier.fillMaxWidth(),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.spacedBy(16.dp)
    ) {
        Image(
            painter = painterResource(id = message.icon),
            contentDescription = null,
            modifier = Modifier.size(78.dp)
        )
        Column {
            Text(
                text = message.senderName,
                //style = MaterialTheme.typography.subtitle1,
                color = Color.Black
            )
            Text(
                text = message.lastMessage,
                //style = MaterialTheme.typography.body2,
                color = Color.Gray,
                maxLines = 1,
                overflow = TextOverflow.Ellipsis
            )
        }
    }
}

data class Message(
    val icon: Int,
    val senderName: String,
    val lastMessage: String
)

val fakeMessages = listOf(
    Message(
        icon = R.drawable.person_icon,
        senderName = "Martynas Petraitis",
        lastMessage = "Sveikas !hjkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkk"
    ),
    Message(
        icon = R.drawable.person_icon,
        senderName = "Rolandas",
        lastMessage = "nežinau dėl šito"
    ),
    Message(
        icon = R.drawable.person_icon,
        senderName = "Gitanas",
        lastMessage = "Sutarta."
    )
    ,
    Message(
        icon = R.drawable.person_icon,
        senderName = "Gitanas",
        lastMessage = "Sutarta."
    )
    ,
    Message(
        icon = R.drawable.person_icon,
        senderName = "Gitanas",
        lastMessage = "Sutarta."
    )
    ,
    Message(
        icon = R.drawable.person_icon,
        senderName = "Gitanas",
        lastMessage = "Sutarta."
    )
    ,
    Message(
        icon = R.drawable.person_icon,
        senderName = "Gitanas",
        lastMessage = "Sutarta."
    )
    ,
    Message(
        icon = R.drawable.person_icon,
        senderName = "Gitanas",
        lastMessage = "Sutarta."
    )
)

