package com.example.triptogether.pages

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Card
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.triptogether.R

@Composable
fun CurrentTripsScreen(navController: NavController,modifier: Modifier = Modifier){
    val fakeTrips = listOf(
        Trip("Trakai Su draugais", R.drawable.current_trip, "2024-04-21"),
        Trip("Naktinis Pasivažinėjimas", R.drawable.current_trip, "2024-04-23"),
        Trip("Ratas aplink kauną", R.drawable.current_trip, "2024-04-25")
    )

    Column {
        Text(text = "Aktyvios kelionės" , textAlign = TextAlign.Center, modifier = Modifier.fillMaxWidth().padding(bottom = 20.dp, top = 20.dp))
        fakeTrips.forEach { trip ->
            TripCard(trip)
        }
    }
}

@Composable
fun TripCard(trip: Trip) {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(bottom = 16.dp)
    ) {
        Row(
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier.padding(16.dp)
        ) {
            // Trip icon
            Box(
                modifier = Modifier.size(10.dp)
            ) {
                // Replace with actual trip icon
            }

            Image(painter = painterResource(id = trip.icon ), contentDescription = "",Modifier.width( 50.dp))
            
            Spacer(modifier = Modifier.width(16.dp))

            // Trip name
            Text(
                text = trip.name,

                color = Color.Black
            )

            Spacer(modifier = Modifier.weight(1f))

            // Trip date
            Text(
                text = trip.date,

                color = Color.Gray
            )
        }
    }
}

data class Trip(
    val name: String,
    val icon: Int,
    val date: String
)

