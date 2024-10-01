package com.example.hackwithpython.projects

import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.text.BasicText
import androidx.compose.foundation.text.selection.SelectionContainer
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Button
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.material3.MaterialTheme
import androidx.compose.ui.Alignment
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.hackwithpython.HackerWhite

@Composable
fun Project18Screen(navController: NavController) {
    Column(modifier = Modifier
        .padding(16.dp)
        .verticalScroll(rememberScrollState()),
        verticalArrangement = Arrangement.Top,
        horizontalAlignment = Alignment.Start) {
        Text(
            text = "Project 18: Browser Exploit",
            fontWeight = FontWeight.Bold,
            style = MaterialTheme.typography.headlineMedium,
            modifier = Modifier.padding(vertical = 8.dp)
        )

        // Introduction Section
        Text(
            text = """
                In this project, you will learn how to simulate a browser-based exploit using Python to target 
                common vulnerabilities in outdated web browsers. This is an essential skill in understanding how 
                attackers exploit weaknesses in software and the importance of keeping software updated.
            """.trimIndent(),
            modifier = Modifier.padding(vertical = 8.dp)
        )

        // Prerequisites
        Text(
            text = "Prerequisites",
            fontWeight = FontWeight.Bold,
            style = MaterialTheme.typography.headlineMedium,
            modifier = Modifier.padding(vertical = 8.dp)
        )
        Text(
            text = """
                Before starting this project, ensure you have:
                - A basic understanding of web technologies.
                - Familiarity with Python programming.
                - Installed the `requests` library for HTTP requests.
                - An ethical mindset and awareness of legal implications.
            """.trimIndent(),
            modifier = Modifier.padding(vertical = 8.dp)
        )

        // Project Description
        Text(
            text = "Project Description",
            fontWeight = FontWeight.Bold,
            style = MaterialTheme.typography.headlineMedium,
            modifier = Modifier.padding(vertical = 8.dp)
        )
        Text(
            text = """
                In this project, you will:
                - Identify a common vulnerability in outdated browsers.
                - Simulate an exploit using Python to demonstrate how attackers can gain unauthorized access.
                - Understand the importance of browser updates and security measures.
            """.trimIndent(),
            modifier = Modifier.padding(vertical = 8.dp)
        )

        // Python Example Code
        Text(
            text = "Python Code Example: Simulating a Browser Exploit",
            fontWeight = FontWeight.Bold,
            style = MaterialTheme.typography.headlineMedium,
            modifier = Modifier.padding(vertical = 8.dp)
        )
        Text(
            text = """
                Below is an example of how to simulate a simple browser exploit using Python:
            """.trimIndent(),
            modifier = Modifier.padding(vertical = 8.dp)
        )
        SelectionContainer {
        BasicText(
            text = """
                import requests

                # Example of a simple exploit targeting a known vulnerability
                def exploit_vulnerability(target_url):
                    payload = {
                        'username': 'admin',
                        'password': 'password123',  # This is just a demonstration
                    }
                    response = requests.post(target_url, data=payload)

                    if "Welcome" in response.text:
                        print("[+] Exploit successful!")
                    else:
                        print("[-] Exploit failed.")

                # Example usage
                target_url = "http://example.com/login"  # Replace with a target URL
                exploit_vulnerability(target_url)
            """.trimIndent(),
            style = TextStyle(
                    fontFamily = FontFamily.Monospace,
                    fontSize = 14.sp,
                    color = HackerWhite
                ),
            modifier =Modifier.padding(12.dp)
        )
            }

        // Ethical Use Disclaimer
        Text(
            text = "Ethical Use Disclaimer",
            fontWeight = FontWeight.Bold,
            style = MaterialTheme.typography.headlineMedium,
            modifier = Modifier.padding(vertical = 8.dp)
        )
        Text(
            text = """
                This project is intended for educational purposes only. 
                Exploiting vulnerabilities without authorization is illegal and unethical. 
                Always seek permission and ensure you are in compliance with local laws before testing or demonstrating this type of project.
            """.trimIndent(),
            modifier = Modifier.padding(vertical = 8.dp)
        )

        Spacer(modifier = Modifier.height(32.dp))

        // Button to navigate to the next section or project
        Button(onClick = { navController.navigate("project19") }) {
            Text(text = "Next Project")
        }
    }
}
