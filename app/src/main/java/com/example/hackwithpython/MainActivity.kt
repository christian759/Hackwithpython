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
import com.example.hackwithpython.projects.*

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
        composable("projects") { ProjectScreen(navController) }

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
        composable("lesson10") { Lesson10Screen(navController) }
        composable("lesson11") { Lesson11Screen(navController) }
        composable("lesson12") { Lesson12Screen(navController) }
        composable("lesson13") { Lesson13Screen(navController) }
        composable("lesson14") { Lesson14Screen(navController) }
        composable("lesson15") { Lesson15Screen(navController) }
        composable("lesson16") { Lesson16Screen(navController) }
        composable("lesson17") { Lesson17Screen(navController) }
        composable("lesson18") { Lesson18Screen(navController) }
        composable("lesson19") { Lesson19Screen(navController) }
        composable("lesson20") { Lesson20Screen(navController) }

        // project pages
        composable("project1") { Project1Screen(navController) }
        composable("project2") { Project2Screen(navController) }
        composable("project3") { Project3Screen(navController) }
        composable("project4") { Project4Screen(navController) }
        composable("project5") { Project5Screen(navController) }
        composable("project6") { Project6Screen(navController) }
        composable("project7") { Project7Screen(navController) }
        composable("project8") { Project8Screen(navController) }
        composable("project9") { Project9Screen(navController) }
        composable("project10") { Project10Screen(navController) }
        composable("project11") { Project11Screen(navController) }
        composable("project12") { Project12Screen(navController) }
        composable("project13") { Project13Screen(navController) }
        composable("project14") { Project14Screen(navController) }
        composable("project15") { Project15Screen(navController) }
        composable("project16") { Project16Screen(navController) }
        composable("project17") { Project17Screen(navController) }
        composable("project18") { Project18Screen(navController) }
        composable("project19") { Project19Screen(navController) }
        composable("project20") { Project20Screen(navController) }

    }
}

