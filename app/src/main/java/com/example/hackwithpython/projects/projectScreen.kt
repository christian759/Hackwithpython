package com.example.hackwithpython.projects

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.hackwithpython.HackerBlack
import com.example.hackwithpython.HackerGreen
import com.example.hackwithpython.HackerWhite



@Composable
fun ProjectScreen(navController: NavController) {
    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text("Projects", color = HackerBlack, style = MaterialTheme.typography.h5 )},
                backgroundColor = HackerWhite
            )
        },
        content = { padding ->
            ProjectList(navController, Modifier.padding(padding))
        }
    )
}

@Composable
fun ProjectList(navController: NavController, modifier: Modifier = Modifier) {
    Column(
        modifier = modifier
            .fillMaxSize()
            .padding(16.dp)
            .background(color = HackerWhite),
        verticalArrangement = Arrangement.spacedBy(12.dp)
    ) {
        for (project in hackingProjects) {
            ProjectItem(project) {
                navController.navigate("project${project.id}")
            }
            Spacer(modifier = Modifier.height(8.dp))

        }
    }
}

@Composable
fun ProjectItem(project: HackingProject, onClick: () -> Unit) {
    Card(
        elevation = 4.dp,
        modifier = Modifier.fillMaxWidth()
            .clickable(onClick = onClick),
        backgroundColor = HackerGreen
    ) {
        Column(
            modifier = Modifier.padding(16.dp),
            verticalArrangement = Arrangement.spacedBy(8.dp),
        ) {
            Text(
                text = project.name,
                style = MaterialTheme.typography.h6,
                color = HackerBlack
            )
            Text(
                text = project.description,
                style = MaterialTheme.typography.body2,
                color = HackerBlack
                )
        }
    }
}
// Data class for Hacking Projects
data class HackingProject(
    val id: Int,
    val name: String,
    val description: String
)

// Sample list of projects
val hackingProjects = listOf(
    HackingProject(
        1,
        "Wi-Fi Cracking",
        "Learn how to crack weak WEP and WPA Wi-Fi passwords using Python and tools like Aircrack-ng."
    ),
    HackingProject(
        2,
        "Packet Sniffing",
        "Use Python and Scapy to create a packet sniffer that monitors network traffic and captures sensitive information."
    ),
    HackingProject(
        3,
        "Keylogger",
        "Build a Python-based keylogger to capture keystrokes and send the logs to an email."
    ),
    HackingProject(
        4,
        "Web Scraping for Vulnerabilities",
        "Automate the detection of web vulnerabilities by scraping and analyzing websites using BeautifulSoup and Python."
    ),
    HackingProject(
        5,
        "SSH Brute Force Tool",
        "Create a Python tool that performs brute force attacks on SSH logins, using wordlists to attempt passwords."
    ),
    HackingProject(
        6,
        "DNS Spoofing",
        "Learn how to create a tool that can manipulate DNS responses to redirect traffic, and understand its countermeasures."
    ),
    HackingProject(
        7,
        "Social Engineering Toolkit",
        "Develop a Python-based social engineering tool for phishing, credential harvesting, and other manipulative techniques."
    ),
    HackingProject(
        8,
        "Exploit Vulnerable Web Apps",
        "Set up and exploit a vulnerable web application (like DVWA) and create automated scripts for SQL injection and XSS attacks."
    ),
    HackingProject(
        9,
        "Port Scanner",
        "Create a multi-threaded port scanner to find open ports on a network using Python’s socket library."
    ),
    HackingProject(
        10,
        "Malware Analysis",
        "Analyze and reverse-engineer a simple piece of malware using Python, focusing on detecting and mitigating its effects."
    ),
    HackingProject(
        11,
        "Reverse Shell",
        "Create a reverse shell using Python that allows remote control over a victim's machine, handling various commands."
    ),
    HackingProject(
        12,
        "Steganography",
        "Develop a Python program to hide and extract secret messages within image files using the concept of steganography."
    ),
    HackingProject(
        13,
        "Ransomware Simulation",
        "Simulate basic ransomware attacks using Python to encrypt files and prompt the user for ransom. This project includes decryption as well."
    ),
    HackingProject(
        14,
        "Phishing Attack Simulation",
        "Create a phishing attack simulator that can send fake emails to users and capture credentials."
    ),
    HackingProject(
        15,
        "Credential Stuffing Tool",
        "Develop a tool that automates credential stuffing attacks by testing multiple username-password combinations on websites."
    ),
    HackingProject(
        16,
        "MITM Attack Tool",
        "Create a Python-based man-in-the-middle (MITM) attack tool to intercept and modify communication between two parties."
    ),
    HackingProject(
        17,
        "Fake Access Point",
        "Learn how to set up a fake access point to capture traffic from users who connect to it."
    ),
    HackingProject(
        18,
        "Browser Exploit",
        "Simulate a browser-based exploit using Python to exploit common vulnerabilities in outdated browsers."
    ),
    HackingProject(
        19,
        "Android Pentesting",
        "Learn Android hacking by using Python scripts and tools to find vulnerabilities in Android apps and devices."
    ),
    HackingProject(
        20,
        "Automated Vulnerability Scanner",
        "Build a Python-based vulnerability scanner that automates the process of checking websites for common vulnerabilities."
    )
)
