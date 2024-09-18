package com.example.triptogether

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.triptogether.pages.CurrentTripsScreen
import com.example.triptogether.pages.OverviewScreen
import com.example.triptogether.pages.PlanTripScreen

@Composable
fun NavigationRouter(){
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = Routes.openingScreen, builder = {
        composable(Routes.openingScreen){
            OpeningScreen(navController)
        }
        composable(Routes.overviewScreen){
            OverviewScreen(navController)
        }
        composable(Routes.planTripScreen){
            PlanTripScreen(navController)
        }
        composable(Routes.currentTripsScreen){
            CurrentTripsScreen(navController)
        }
    } )
}