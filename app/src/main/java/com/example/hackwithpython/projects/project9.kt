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
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import java.net.InetSocketAddress
import java.net.Socket

@Composable
fun Project9Screen(navController: NavController) {
    Column(modifier = Modifier
        .padding(16.dp)
        .verticalScroll(rememberScrollState()),
        verticalArrangement = Arrangement.Top,
        horizontalAlignment = Alignment.Start) {
        Text(
            text = "Project 9: Port Scanner",
            fontWeight = FontWeight.Bold,
            style = androidx.compose.material3.MaterialTheme.typography.headlineMedium,
            modifier = Modifier.padding(vertical = 8.dp)
        )

        // Introduction Section
        Text(
            text = """
                In this project, you will create a multi-threaded port scanner using Python's socket library.
                The port scanner will help you identify open ports on a specified network, which is essential for assessing 
                network security. Understanding which ports are open on a system can help identify potential vulnerabilities.
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
                - Basic understanding of networking concepts.
                - Familiarity with Python programming.
                - Python installed on your machine.
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
                This project consists of creating a port scanner that will:
                - Take an IP address and a range of ports as input.
                - Scan each port to check if it's open or closed.
                - Display the results to the user.
                
                Multi-threading will improve the speed of the scanning process by allowing multiple ports to be scanned simultaneously.
            """.trimIndent(),
            modifier = Modifier.padding(vertical = 8.dp)
        )

        // Python Example Code
        Text(
            text = "Python Code Example: Multi-threaded Port Scanner",
            fontWeight = FontWeight.Bold,
            style = androidx.compose.material3.MaterialTheme.typography.headlineMedium,
            modifier = Modifier.padding(vertical = 8.dp)
        )
        Text(
            text = """
                Below is an example of a multi-threaded port scanner implemented in Python:
            """.trimIndent(),
            modifier = Modifier.padding(vertical = 8.dp)
        )
        SelectionContainer {
        BasicText(
            text = """
                import socket
                import threading

                open_ports = []

                def scan(port):
                    s = socket.socket(socket.AF_INET, socket.SOCK_STREAM)
                    socket.setdefaulttimeout(1)
                    result = s.connect_ex((target_ip, port))
                    if result == 0:
                        open_ports.append(port)
                    s.close()

                target_ip = input("Enter the target IP: ")
                start_port = int(input("Enter start port: "))
                end_port = int(input("Enter end port: "))

                threads = []

                for port in range(start_port, end_port + 1):
                    thread = threading.Thread(target=scan, args=(port,))
                    threads.append(thread)
                    thread.start()

                for thread in threads:
                    thread.join()

                print("Open ports:", open_ports)
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
                This project is for educational purposes only. Ensure that you have permission to scan any network 
                and use this knowledge responsibly to enhance security.
            """.trimIndent(),
            modifier = Modifier.padding(vertical = 8.dp)
        )

        Spacer(modifier = Modifier.height(32.dp))

        // Button to navigate to the next project
        Button(onClick = { navController.navigate("project10") }) {
            Text(text = "Next Project")
        }
    }
}
