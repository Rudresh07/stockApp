package com.rudy.stockmarketapp.presentation.destinations

import androidx.compose.runtime.Composable
import androidx.navigation.NavBackStackEntry
import androidx.navigation.NavHostController
import androidx.navigation.NavType
import androidx.navigation.navArgument
import com.ramcosta.composedestinations.navigation.DestinationDependenciesContainer
import com.ramcosta.composedestinations.navargs.DestinationsStringNavType
import com.ramcosta.composedestinations.spec.Direction
import com.ramcosta.composedestinations.navigation.DestinationsNavController
import com.rudy.stockmarketapp.presentation.company_listings.CompanyListingsScreen

object CompanyListingsScreenDestination : DirectionDestination {
         
    operator fun invoke() = this
    
    override val route = "company_listings_screen"
    
    @Composable
    override fun Content(
        navController: NavHostController,
        navBackStackEntry: NavBackStackEntry,
        dependencyContainer: DestinationDependenciesContainer
    ) {
		CompanyListingsScreen(
			navigator = DestinationsNavController(navController, navBackStackEntry)
		)
    }
    
}