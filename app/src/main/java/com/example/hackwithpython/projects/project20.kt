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
fun Project20Screen(navController: NavController) {
    Column(modifier = Modifier
        .padding(16.dp)
        .verticalScroll(rememberScrollState()),
        verticalArrangement = Arrangement.Top,
        horizontalAlignment = Alignment.Start) {
        Text(
            text = "Project 20: Automated Vulnerability Scanner",
            fontWeight = FontWeight.Bold,
            style = MaterialTheme.typography.headlineMedium,
            modifier = Modifier.padding(vertical = 8.dp)
        )

        // Introduction Section
        Text(
            text = """
                In this project, you will build a Python-based vulnerability scanner that automates the process of 
                checking websites for common vulnerabilities such as SQL injection, XSS, and more. This tool will 
                help you understand how vulnerabilities can be detected and the importance of securing web applications.
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
                - Basic understanding of web technologies (HTML, JavaScript, etc.).
                - Familiarity with Python programming.
                - Installed necessary libraries like `requests` and `BeautifulSoup`.
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
                - Develop a Python script that checks for common vulnerabilities on a specified website.
                - Understand how to interpret the results and provide recommendations for mitigation.
                - Learn about different scanning techniques and how they apply to web security.
            """.trimIndent(),
            modifier = Modifier.padding(vertical = 8.dp)
        )

        // Python Example Code
        Text(
            text = "Python Code Example: Basic Vulnerability Check",
            fontWeight = FontWeight.Bold,
            style = MaterialTheme.typography.headlineMedium,
            modifier = Modifier.padding(vertical = 8.dp)
        )
        Text(
            text = """
                Below is an example of how to create a basic vulnerability scanner using Python:
            """.trimIndent(),
            modifier = Modifier.padding(vertical = 8.dp)
        )
        SelectionContainer {
        BasicText(
            text = """
                import requests

                def check_sql_injection(url):
                    payload = "' OR '1'='1"
                    response = requests.get(url + payload)
                    if "SQL syntax" in response.text:
                        print("Potential SQL Injection Vulnerability Detected!")
                    else:
                        print("No SQL Injection Vulnerability Found.")

                # Example usage
                check_sql_injection("http://example.com/product?id=")
            """.trimIndent(),
            style = TextStyle(
                    fontFamily = FontFamily.Monospace,
                    fontSize = 14.sp,
                    color = HackerWhite
                ),
            modifier =Modifier.padding(12.dp)
                .horizontalScroll(rememberScrollState())
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
                Scanning websites without authorization is illegal and unethical. 
                Always seek permission and ensure you are in compliance with local laws before testing or demonstrating this type of project.
            """.trimIndent(),
            modifier = Modifier.padding(vertical = 8.dp)
        )

        Spacer(modifier = Modifier.height(32.dp))

        // Button to navigate to the home screen or previous project
        Button(onClick = { navController.navigate("home") }) {
            Text(text = "Back to Home")
        }
    }
}
