package com.example.hackwithpython.lessons

import androidx.compose.foundation.*
import androidx.compose.foundation.gestures.scrollable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.*
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.unit.dp
import androidx.compose.ui.text.font.FontWeight
import androidx.navigation.NavController
import com.example.hackwithpython.HackerBlack
import com.example.hackwithpython.HackerGreen
import com.example.hackwithpython.HackerWhite
import com.example.hackwithpython.gradientBackground


@Composable
fun lessonsScreen(navController: NavController) {
    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text("Lessons", color = HackerBlack, style = MaterialTheme.typography.h5, fontWeight = FontWeight(600))},
                backgroundColor = HackerGreen
            )
        },
        content = { padding ->
            lessonsPart(navController, Modifier.padding(padding).background(gradientBackground))
        }
    )
}

@Composable
fun lessonsPart(navController: NavController, modifier: Modifier) {
    Column(
        modifier = modifier
            .fillMaxSize()
            .padding(16.dp)
            .background(gradientBackground)
            .verticalScroll(rememberScrollState()),
        verticalArrangement = Arrangement.spacedBy(8.dp)
    ) {
        for (lesson  in lessons){
            lessonItem(lesson) {
                navController.navigate("lesson${lesson.id}")
            }
            Spacer(modifier = Modifier.height(5.dp))

        }
    }
}


@Composable
fun lessonItem(lesson: Lesson, onClick: () -> Unit) {
    Card(
        elevation = 4.dp,
        modifier = Modifier.fillMaxWidth()
            .clickable(onClick = onClick)
            .shadow(10.dp),
        backgroundColor = HackerBlack
    ) {
        Column(
            modifier = Modifier.padding(16.dp),
            verticalArrangement = Arrangement.spacedBy(8.dp)
        ) {
            Text(
                text = lesson.title,
                style = MaterialTheme.typography.h6,
                color = HackerWhite
            )
            Text(
                text = lesson.description,
                style = MaterialTheme.typography.body2,
                color = HackerWhite
            )
        }
    }
}

val lessons = listOf(
    Lesson(1, "Introduction to Hacking", "Overview of hacking concepts and ethics."),
    Lesson(2, "Understanding Networks", "Diving deeper into networking"),
    Lesson(3, "Basics of Python Programming", "Introduction to Python syntax and basic programming concepts."),
    Lesson(4, "Python setup", "Downloading and installing Python"),
    Lesson(5, "Web Scraping with Python", "Techniques for extracting data from websites using BeautifulSoup."),
    Lesson(6, "Advanced Web Scraping", "Diving deeper into web scraping"),
    Lesson(7, "Working with APIs", "explore how to interact with APIs effectively"),
    Lesson(8, "Penetration Testing Basics", "finding vulnerabilities in computer systems"),
    Lesson(9, "Exploiting Web Vulnerabilities", "exploiting vulnerabilities on web pages"),
    Lesson(10, "Using Python for Network Sniffing", "Capturing and analyzing network packets with Scapy."),
    Lesson(11, "Automating Tasks with Python", "Writing scripts to automate repetitive tasks."),
    Lesson(12, "Introduction to Malware Analysis", "Basics of analyzing and understanding malware."),
    Lesson(13, "Building a Simple Keylogger", "Creating a basic keylogger to capture keystrokes."),
    Lesson(14, "Ethical Hacking and Penetration Testing", "Conducting penetration tests ethically and legally."),
    Lesson(15, "Social Engineering Techniques", "Understanding psychological manipulation to exploit human behavior."),
    Lesson(16, "Web Application Security Testing", "Advanced techniques for testing web application security."),
    Lesson(17, "Reverse Engineering Software", "Analyzing software to understand its components and functionalities."),
    Lesson(18, "Exploit Development", "Creating and testing exploits for software vulnerabilities."),
    Lesson(19, "Wireless Network Hacking", "Techniques for exploiting weaknesses in wireless networks (Wi-Fi)."),
    Lesson(20, "Cybersecurity Frameworks and Compliance", "Overview of major cybersecurity frameworks and compliance regulations.")
)

