package com.example.hackwithpython.projects

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.foundation.layout.*
import androidx.compose.material3.Button
import androidx.compose.ui.Modifier
import androidx.compose.runtime.Composable
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.material3.MaterialTheme
import androidx.navigation.NavController

@Composable
fun Project16Screen(navController: NavController) {
    Column(modifier = Modifier.padding(16.dp)) {
        Text(
            text = "Project 16: MITM Attack Tool",
            fontWeight = FontWeight.Bold,
            style = MaterialTheme.typography.headlineMedium,
            modifier = Modifier.padding(vertical = 8.dp)
        )

        // Introduction Section
        Text(
            text = """
                In this project, you will create a man-in-the-middle (MITM) attack tool using Python. 
                This tool will intercept and modify communications between two parties without their knowledge. 
                This project is intended for educational purposes to demonstrate the vulnerabilities in unencrypted communications.
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
                - Basic knowledge of networking concepts.
                - Familiarity with Python programming.
                - Installed the `scapy` and `dnspython` libraries.
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
                - Set up a network environment for MITM attacks.
                - Use Python to intercept packets and modify the data.
                - Demonstrate how unencrypted communications can be exploited.
            """.trimIndent(),
            modifier = Modifier.padding(vertical = 8.dp)
        )

        // Python Example Code
        Text(
            text = "Python Code Example: MITM Attack Tool",
            fontWeight = FontWeight.Bold,
            style = MaterialTheme.typography.headlineMedium,
            modifier = Modifier.padding(vertical = 8.dp)
        )
        Text(
            text = """
                Below is an example of how to implement a basic MITM attack tool in Python:
            """.trimIndent(),
            modifier = Modifier.padding(vertical = 8.dp)
        )
        Text(
            text = """
                from scapy.all import *

                def mitm_attack(target_ip, spoof_ip):
                    # Function to modify packets
                    def packet_callback(packet):
                        if packet[IP].dst == target_ip:
                            # Modify the packet as needed
                            packet[Raw].load = "You've been hacked!"
                            send(packet)  # Send the modified packet

                    # Start sniffing packets
                    print(f"[*] Starting MITM attack on {target_ip}")
                    sniff(filter="ip", prn=packet_callback)

                # Example usage
                target = "192.168.1.5"  # Replace with target IP
                spoof = "192.168.1.1"   # Replace with the spoofing IP
                mitm_attack(target, spoof)
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
                Unauthorized interception of communication is illegal. 
                Always seek permission and ensure you are in compliance with local laws before testing or demonstrating this type of project.
            """.trimIndent(),
            modifier = Modifier.padding(vertical = 8.dp)
        )

        Spacer(modifier = Modifier.height(32.dp))

        // Button to navigate to the next section or project
        Button(onClick = { navController.navigate("project17") }) {
            Text(text = "Next Project")
        }
    }
}
