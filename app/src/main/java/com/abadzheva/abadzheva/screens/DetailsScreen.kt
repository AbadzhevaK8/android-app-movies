package com.abadzheva.abadzheva.screens

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import com.abadzheva.abadzheva.MainViewModel

@Composable
fun DetailsScreen(navController: NavHostController, viewModel: MainViewModel, itemId: String) {
    Text("Details screen: item id: ${itemId}")
}