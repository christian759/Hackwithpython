package com.example.hackwithpython.lessons

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.foundation.layout.*
import androidx.compose.material3.Button
import androidx.compose.ui.Modifier
import androidx.compose.runtime.Composable
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController

@Composable
fun Lesson19Screen(navController: NavController) {
    Column(modifier = Modifier.padding(16.dp)) {
        Text(
            text = "Lesson 19: Wireless Network Hacking",
            fontWeight = FontWeight.Bold,
            style = androidx.compose.material3.MaterialTheme.typography.headlineMedium,
            modifier = Modifier.padding(vertical = 8.dp)
        )

        // Introduction Section
        Text(
            text = """
                Wireless network hacking involves exploiting vulnerabilities in Wi-Fi networks to gain unauthorized access, 
                intercept data, or disrupt network services. In this lesson, we will explore common techniques for wireless 
                network hacking, tools used in the process, and practical examples using Python to demonstrate these techniques.
            """.trimIndent(),
            modifier = Modifier.padding(vertical = 8.dp)
        )

        // Common Techniques for Wireless Network Hacking
        Text(
            text = "Common Techniques",
            fontWeight = FontWeight.Bold,
            style = androidx.compose.material3.MaterialTheme.typography.headlineMedium,
            modifier = Modifier.padding(vertical = 8.dp)
        )
        Text(
            text = """
                Some common techniques for wireless network hacking include:
                - **WEP Cracking**: Exploiting vulnerabilities in the outdated WEP encryption protocol.
                - **WPA/WPA2 Cracking**: Using dictionary or brute-force attacks to compromise WPA/WPA2 secured networks.
                - **Evil Twin Attacks**: Creating a rogue access point to trick users into connecting to it.
                - **Packet Sniffing**: Intercepting and analyzing network traffic to capture sensitive information.
                - **Deauthentication Attacks**: Forcing users to disconnect from the network to capture the handshake for cracking.
            """.trimIndent(),
            modifier = Modifier.padding(vertical = 8.dp)
        )

        // WEP Cracking Example
        Text(
            text = "Practical Example: WEP Cracking",
            fontWeight = FontWeight.Bold,
            style = androidx.compose.material3.MaterialTheme.typography.headlineMedium,
            modifier = Modifier.padding(vertical = 8.dp)
        )
        Text(
            text = """
                WEP (Wired Equivalent Privacy) is an outdated encryption protocol with significant vulnerabilities. 
                Here's how you might exploit WEP using Python to analyze network traffic. We will use the `scapy` library 
                for packet manipulation.
            """.trimIndent(),
            modifier = Modifier.padding(vertical = 8.dp)
        )
        Text(
            text = "Installing Scapy:",
            fontWeight = FontWeight.Bold,
            modifier = Modifier.padding(vertical = 8.dp)
        )
        Text(
            text = """
                First, ensure you have the Scapy library installed. You can install it using pip:
                
                ```bash
                pip install scapy
                ```
            """.trimIndent(),
            modifier = Modifier.padding(vertical = 8.dp)
        )
        Text(
            text = "Python WEP Cracking Code:",
            fontWeight = FontWeight.Bold,
            modifier = Modifier.padding(vertical = 8.dp)
        )
        Text(
            text = """
                ```python
                from scapy.all import *

                # Function to capture packets
                def packet_handler(packet):
                    if packet.haslayer(WEP):
                        print(f"WEP Packet Captured: {packet.summary()}")

                # Sniff packets on the specified interface
                print("Sniffing for WEP packets...")
                sniff(iface="wlan0", prn=packet_handler, store=0)
                ```
            """.trimIndent(),
            modifier = Modifier.padding(vertical = 8.dp)
        )
        Text(
            text = """
                In this code, we use Scapy to sniff packets on a wireless interface (`wlan0`). The `packet_handler` function 
                checks if a captured packet contains a WEP layer and prints its summary. This allows you to gather 
                enough packets for a potential attack.
            """.trimIndent(),
            modifier = Modifier.padding(vertical = 8.dp)
        )

        // WPA/WPA2 Cracking Example
        Text(
            text = "Practical Example: WPA/WPA2 Cracking",
            fontWeight = FontWeight.Bold,
            style = androidx.compose.material3.MaterialTheme.typography.headlineMedium,
            modifier = Modifier.padding(vertical = 8.dp)
        )
        Text(
            text = """
                Cracking WPA/WPA2 networks typically involves capturing the handshake and then attempting to crack the password 
                using a dictionary attack. Below is a Python script that demonstrates how to capture the handshake using Scapy:
            """.trimIndent(),
            modifier = Modifier.padding(vertical = 8.dp)
        )
        Text(
            text = "Python WPA/WPA2 Cracking Code:",
            fontWeight = FontWeight.Bold,
            modifier = Modifier.padding(vertical = 8.dp)
        )
        Text(
            text = """
                ```python
                from scapy.all import *

                # Function to capture WPA/WPA2 handshake
                def capture_handshake(packet):
                    if packet.haslayer(EAPOL):
                        print("WPA/WPA2 Handshake Captured!")
                        # Save the handshake for further analysis
                        wrpcap("handshake.cap", packet)

                # Sniff packets on the specified interface
                print("Sniffing for WPA/WPA2 handshakes...")
                sniff(iface="wlan0", prn=capture_handshake, store=0)
                ```
            """.trimIndent(),
            modifier = Modifier.padding(vertical = 8.dp)
        )
        Text(
            text = """
                This code listens for packets containing EAPOL frames, which are part of the WPA/WPA2 handshake process. 
                When a handshake is captured, it is saved to a file (`handshake.cap`) for later analysis using tools like 
                aircrack-ng to crack the password.
            """.trimIndent(),
            modifier = Modifier.padding(vertical = 8.dp)
        )

        // Conclusion
        Text(
            text = "Conclusion",
            fontWeight = FontWeight.Bold,
            style = androidx.compose.material3.MaterialTheme.typography.headlineMedium,
            modifier = Modifier.padding(vertical = 8.dp)
        )
        Text(
            text = """
                In this lesson, we explored techniques for wireless network hacking, including WEP cracking and WPA/WPA2 
                cracking using Python. Understanding these techniques is crucial for ethical hacking and improving wireless 
                security. In the next lesson, we will delve into secure wireless network configurations to mitigate these 
                risks and enhance security.
            """.trimIndent(),
            modifier = Modifier.padding(vertical = 8.dp)
        )

        Spacer(modifier = Modifier.height(32.dp))

        // Button to navigate to the next lesson
        Button(onClick = { navController.navigate("lesson20") }) {
            Text(text = "Next Lesson: Secure Wireless Network Configurations")
        }
    }
}
