package com.example.hackwithpython

import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.hackwithpython.lessons.*
import com.example.hackwithpython.lessons.lessonsScreen
import com.example.hackwithpython.ui.theme.HackWithPythonTheme
import androidx.activity.ComponentActivity
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Work
import androidx.compose.material.icons.filled.Book
import androidx.compose.material.BottomNavigation
import androidx.compose.material.BottomNavigationItem
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.*
import com.example.hackwithpython.projects.ProjectScreen

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            HackWithPythonTheme {
                val navController = rememberNavController()
                Scaffold(
                    bottomBar = { BottomNavigationBar(navController = navController) }
                ) { innerPadding ->
                    NavigationGraph(
                        navController = navController,
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

@Composable
fun BottomNavigationBar(navController: NavHostController) {
    BottomNavigation(modifier = Modifier.background(HackerBlack)) {
        val currentDestination = navController.currentBackStackEntryAsState().value?.destination?.route
        BottomNavigationItem(
            icon = { Icon(imageVector = Icons.Default.Home, contentDescription = "Home",
                modifier = Modifier.background(HackerGreen))},
            label = { Text("Home") },
            selected = currentDestination == "home",
            onClick = { navController.navigate("home") }
        )
        BottomNavigationItem(
            icon = { Icon(imageVector = Icons.Filled.Book, contentDescription = "Lessons",
                modifier = Modifier.background(HackerGreen)) },
            label = { Text("Lessons") },
            selected = currentDestination == "lessons",
            onClick = { navController.navigate("lessons") }
        )
        BottomNavigationItem(
            icon = { Icon(imageVector = Icons.Default.Work, contentDescription = "Projects",
                   modifier = Modifier.background(HackerGreen)) },
            label = { Text("Projects") },
            selected = currentDestination == "projects",
            onClick = { navController.navigate("projects") }
        )
    }
}

@Composable
fun NavigationGraph(navController: NavHostController, modifier: Modifier = Modifier) {
    NavHost(navController, startDestination = "home", modifier = modifier) {
        composable("home") { homeScreen(navController) }

        // lesson pages
        composable("lessons") { lessonsScreen(navController) }
        composable("lesson1") { Lesson1Screen(navController) }
        composable("lesson2") { Lesson2Screen(navController) }
        composable("lesson3") { Lesson3Screen(navController) }
        composable("lesson4") { Lesson4Screen(navController) }
        composable("lesson5") { Lesson5Screen(navController) }
        composable("lesson6") { Lesson6Screen(navController) }
        composable("lesson7") { Lesson7Screen(navController) }
        composable("lesson8") { Lesson8Screen(navController) }
        composable("lesson9") { Lesson9Screen(navController) }
        composable("projects") { ProjectScreen(navController) }
    }
}

