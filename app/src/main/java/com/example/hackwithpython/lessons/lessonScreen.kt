package com.example.hackwithpython.lessons

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.*
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.text.font.FontWeight
import androidx.navigation.NavController
import com.example.hackwithpython.HackerBlack
import com.example.hackwithpython.HackerGreen
import com.example.hackwithpython.HackerWhite


@Composable
fun lessonsScreen(navController: NavController) {
    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text("Lessons", color = HackerBlack)},
                backgroundColor = HackerWhite
            )
        },
        content = { padding ->
            lessonsPart(navController, Modifier.padding(padding).background(HackerWhite))
        }
    )
}

@Composable
fun lessonsPart(navController: NavController, modifier: Modifier) {
    LazyColumn(
        modifier = modifier
            .fillMaxSize()
            .padding(16.dp)
            .background(color = HackerWhite),
        verticalArrangement = Arrangement.spacedBy(12.dp)
    ) {
        items(lessons.size){ index ->
            lessonItem(lesson = lessons[index], navController = navController)
        }
    }
}


@Composable
fun lessonItem(lesson: Lesson, navController: NavController) {
    Card(
        elevation = 4.dp,
        modifier = Modifier.fillMaxWidth(),
        backgroundColor = HackerGreen
    ) {
        Column(
            modifier = Modifier
                .padding(16.dp)
                .clickable(onClick = {navController.navigate("Lesson${lesson.id}")} ),
            verticalArrangement = Arrangement.spacedBy(8.dp)
        ) {
            Text(
                text = lesson.title,
                style = MaterialTheme.typography.h6,
                color = HackerGreen
            )
            Text(
                text = lesson.description,
                style = MaterialTheme.typography.body2,
                color = HackerBlack
            )
        }
    }
}

val lessons = listOf(
    Lesson(1, "Introduction to Hacking", "Overview of hacking concepts and ethics."),
    Lesson(2, "Networking", "Diving deeper into networking"),
    Lesson(3, "Basics of Python Programming", "Introduction to Python syntax and basic programming concepts."),
    Lesson(4, "Python setup", "downloading and installing Python"),
    Lesson(5, "Web Scraping with Python", "Techniques for extracting data from websites using BeautifulSoup."),
    Lesson(6, "Advanced web Scraping", "Diving deeper into web scraping"),
    Lesson(7, "Creating a Basic Port Scanner", "Building a simple port scanner using Python's socket library."),
    Lesson(8, "Exploiting Web Vulnerabilities", "Understanding common web vulnerabilities (e.g., SQL injection)."),
    Lesson(9, "Password Cracking Techniques", "Methods for cracking weak passwords using Python."),
    Lesson(10, "Using Python for Network Sniffing", "Capturing and analyzing network packets with Scapy."),
    Lesson(11, "Automating Tasks with Python", "Writing scripts to automate repetitive tasks."),
    Lesson(12, "Introduction to Malware Analysis", "Basics of analyzing and understanding malware."),
    Lesson(13, "Building a Simple Keylogger", "Creating a basic keylogger to capture keystrokes."),
    Lesson(14, "Ethical Hacking and Penetration Testing", "Conducting penetration tests ethically and legally."),
    Lesson(15, "Resources for Further Learning", "Recommended books, websites, and courses to continue learning.")
)
