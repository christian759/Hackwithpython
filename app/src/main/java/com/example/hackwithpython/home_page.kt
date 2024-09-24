package com.example.hackwithpython

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController

val HackerGreen = Color(11, 91, 21) // Bright green for buttons
val HackerBlack = Color(0, 0, 0) // Black background
val HackerWhite = Color(233, 245, 219) // White text

val gradientBackground = Brush.linearGradient(listOf(HackerBlack, HackerGreen))

@Composable
fun homeScreen(navController: NavController, modifier: Modifier = Modifier) {
    Column(
        modifier = modifier
            .fillMaxSize()
            .background(gradientBackground),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        OutlinedCard(
            modifier = modifier
                .padding(10.dp)
        ) {
            Text(
                text = "Hack with Python",
                style = MaterialTheme.typography.headlineLarge,
                fontWeight = FontWeight.Bold,
                color = HackerWhite,
                modifier = Modifier.padding(15.dp)
            )

            Text(
                text = "Learn the art of hacking using Python through practical exercises and tutorials.",
                style = MaterialTheme.typography.bodyMedium,
                textAlign = androidx.compose.ui.text.style.TextAlign.Center,
                color = HackerWhite,
                modifier = Modifier.padding(15.dp)
            )
        }
        OutlinedButton(
            onClick = { navController.navigate("lessons") },
            modifier = Modifier
                .padding(bottom = 16.dp)
                .height(56.dp),
            colors = ButtonDefaults.buttonColors(containerColor = HackerGreen)
        ) {
            Text(text = "Start Learning", color = HackerBlack)
        }

        OutlinedButton(
            onClick = { /* Navigate to Projects */ },
            modifier = Modifier
                .height(56.dp),
            colors = ButtonDefaults.buttonColors(containerColor = HackerGreen)
        ) {
            Text(text = "View Projects", color = HackerBlack)
        }
    }
}