package com.example.hackwithpython.projects

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.text.ClickableText
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.AnnotatedString
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.hackwithpython.ui.theme.HackWithPythonTheme


@Composable
fun ProjectScreen(navController: NavController) {
    HackWithPythonTheme {
        Scaffold(
            topBar = {
                TopAppBar(
                    title = { Text("Hacking Projects") },
                    backgroundColor = MaterialTheme.colors.primary
                )
            },
            content = { padding ->
                ProjectList(navController, Modifier.padding(padding))
            }
        )
    }
}

@Composable
fun ProjectList(navController: NavController, modifier: Modifier = Modifier) {
    LazyColumn(
        modifier = modifier.fillMaxSize().padding(16.dp),
        verticalArrangement = Arrangement.spacedBy(12.dp)
    ) {
        items(hackingProjects.size) { index ->
            ProjectItem(project = hackingProjects[index], navController)
        }
    }
}

@Composable
fun ProjectItem(project: HackingProject, navController: NavController) {
    Card(
        elevation = 4.dp,
        modifier = Modifier.fillMaxWidth()
    ) {
        Column(
            modifier = Modifier.padding(16.dp),
            verticalArrangement = Arrangement.spacedBy(8.dp)
        ) {
            Text(text = project.name, style = MaterialTheme.typography.h6)
            Text(text = project.description, style = MaterialTheme.typography.body2)
            ClickableText(
                text = AnnotatedString("Learn More"),
                onClick = {
                    // Navigate to a detailed screen if required
                }
            )
        }
    }
}

// Data class for Hacking Projects
data class HackingProject(
    val name: String,
    val description: String
)

// Sample list of projects
val hackingProjects = listOf(
    HackingProject(
        "Wi-Fi Cracking",
        "Learn how to crack weak WEP and WPA Wi-Fi passwords using Python and tools like Aircrack-ng."
    ),
    HackingProject(
        "Packet Sniffing",
        "Use Python and Scapy to create a packet sniffer that monitors network traffic and captures sensitive information."
    ),
    HackingProject(
        "Keylogger",
        "Build a Python-based keylogger to capture keystrokes and send the logs to an email."
    ),
    HackingProject(
        "Web Scraping for Vulnerabilities",
        "Automate the detection of web vulnerabilities by scraping and analyzing websites using BeautifulSoup and Python."
    ),
    HackingProject(
        "SSH Brute Force Tool",
        "Create a Python tool that performs brute force attacks on SSH logins, using wordlists to attempt passwords."
    ),
    HackingProject(
        "DNS Spoofing",
        "Learn how to create a tool that can manipulate DNS responses to redirect traffic, and understand its countermeasures."
    ),
    HackingProject(
        "Social Engineering Toolkit",
        "Develop a Python-based social engineering tool for phishing, credential harvesting, and other manipulative techniques."
    ),
    HackingProject(
        "Exploit Vulnerable Web Apps",
        "Set up and exploit a vulnerable web application (like DVWA) and create automated scripts for SQL injection and XSS attacks."
    ),
    HackingProject(
        "Port Scanner",
        "Create a multi-threaded port scanner to find open ports on a network using Python’s socket library."
    ),
    HackingProject(
        "Malware Analysis",
        "Analyze and reverse-engineer a simple piece of malware using Python, focusing on detecting and mitigating its effects."
    ),
    HackingProject(
        "Reverse Shell",
        "Create a reverse shell using Python that allows remote control over a victim's machine, handling various commands."
    ),
    HackingProject(
        "Steganography",
        "Develop a Python program to hide and extract secret messages within image files using the concept of steganography."
    ),
    HackingProject(
        "Ransomware Simulation",
        "Simulate basic ransomware attacks using Python to encrypt files and prompt the user for ransom. This project includes decryption as well."
    ),
    HackingProject(
        "Phishing Attack Simulation",
        "Create a phishing attack simulator that can send fake emails to users and capture credentials."
    ),
    HackingProject(
        "Credential Stuffing Tool",
        "Develop a tool that automates credential stuffing attacks by testing multiple username-password combinations on websites."
    ),
    HackingProject(
        "MITM Attack Tool",
        "Create a Python-based man-in-the-middle (MITM) attack tool to intercept and modify communication between two parties."
    ),
    HackingProject(
        "Fake Access Point",
        "Learn how to set up a fake access point to capture traffic from users who connect to it."
    ),
    HackingProject(
        "Browser Exploit",
        "Simulate a browser-based exploit using Python to exploit common vulnerabilities in outdated browsers."
    ),
    HackingProject(
        "Android Pentesting",
        "Learn Android hacking by using Python scripts and tools to find vulnerabilities in Android apps and devices."
    ),
    HackingProject(
        "Automated Vulnerability Scanner",
        "Build a Python-based vulnerability scanner that automates the process of checking websites for common vulnerabilities."
    ),
    HackingProject(
        "Trojan Horse",
        "Create a Python-based trojan that can open backdoors on a machine, disguised as a legitimate program."
    ),
    HackingProject(
        "HTTP Request Smuggling",
        "Develop a tool to perform HTTP request smuggling attacks, exploiting misconfigurations in web servers."
    ),
    HackingProject(
        "Firewall Evasion Techniques",
        "Experiment with Python scripts to bypass firewalls using techniques like IP fragmentation or obfuscation."
    ),
    HackingProject(
        "Automated Exploit Framework",
        "Create a mini exploit framework in Python to automate the exploitation of common vulnerabilities in web apps and services."
    )
)
