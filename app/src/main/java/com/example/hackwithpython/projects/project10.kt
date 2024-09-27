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
fun Project10Screen(navController: NavController) {
    Column(modifier = Modifier
        .padding(16.dp)
        .verticalScroll(rememberScrollState()),
        verticalArrangement = Arrangement.Top,
        horizontalAlignment = Alignment.Start) {
        Text(
            text = "Project 10: Malware Analysis",
            fontWeight = FontWeight.Bold,
            style = androidx.compose.material3.MaterialTheme.typography.headlineMedium,
            modifier = Modifier.padding(vertical = 8.dp)
        )

        // Introduction Section
        Text(
            text = """
                In this project, you will analyze and reverse-engineer a simple piece of malware using Python.
                The goal is to understand its behavior, detect its effects, and explore methods to mitigate its impact. 
                Malware analysis is a crucial skill in cybersecurity as it helps in identifying threats and implementing 
                defenses against malicious software.
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
                - A basic understanding of malware types and behaviors.
                - Familiarity with Python programming.
                - Knowledge of Python libraries such as `pefile` and `pyshark` for analyzing executables and network traffic.
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
                - Analyze a sample piece of malware (ensure you use a safe environment).
                - Extract indicators of compromise (IoCs).
                - Detect malicious behavior such as file manipulation or network communication.
                - Implement a basic mitigation strategy to neutralize its effects.
            """.trimIndent(),
            modifier = Modifier.padding(vertical = 8.dp)
        )

        // Python Example Code
        Text(
            text = "Python Code Example: Malware Analysis",
            fontWeight = FontWeight.Bold,
            style = androidx.compose.material3.MaterialTheme.typography.headlineMedium,
            modifier = Modifier.padding(vertical = 8.dp)
        )
        Text(
            text = """
                Below is an example of using Python to analyze a malware sample:
            """.trimIndent(),
            modifier = Modifier.padding(vertical = 8.dp)
        )
        Text(
            text = """
                import pefile
                import requests

                # Function to analyze the PE file
                def analyze_malware(file_path):
                    pe = pefile.PE(file_path)
                    print("Detected file: ", file_path)
                    print("Entry point: ", hex(pe.OPTIONAL_HEADER.AddressOfEntryPoint))
                    print("Number of sections: ", len(pe.sections))
                    for section in pe.sections:
                        print("Section Name: ", section.Name.decode().strip('\x00'))
                        print("Section Size: ", section.SizeOfRawData)
                    
                # Example usage
                analyze_malware('malware_sample.exe')

                # Detecting network activity (placeholder for demonstration)
                def check_network_activity():
                    response = requests.get('http://malicious.site/check')
                    if response.status_code == 200:
                        print("Detected connection to malicious site.")

                check_network_activity()
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
                This project is for educational purposes only. Conduct your analysis in a controlled environment, 
                such as a virtual machine, and never deploy malware on production systems.
            """.trimIndent(),
            modifier = Modifier.padding(vertical = 8.dp)
        )

        Spacer(modifier = Modifier.height(32.dp))

        // Button to navigate to the next project
        Button(onClick = { navController.navigate("project11") }) {
            Text(text = "Next Project")
        }
    }
}
