package com.example.hackwithpython.projects

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Text
import androidx.compose.material3.Button
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController

@Composable
fun Project2Screen(navController: NavController) {
    Column(modifier = Modifier
        .padding(16.dp)
    .verticalScroll(rememberScrollState()),
        verticalArrangement = Arrangement.Top,
        horizontalAlignment = Alignment.Start) {
        Text(
            text = "Project 2: Packet Sniffing",
            fontWeight = FontWeight.Bold,
            style = androidx.compose.material3.MaterialTheme.typography.headlineMedium,
            modifier = Modifier.padding(vertical = 8.dp)
        )

        // Project Introduction
        Text(
            text = """
                In this project, you will use Python and Scapy to create a packet sniffer that monitors network traffic and captures sensitive information.
                You will learn how to:
                - Intercept packets on the network.
                - Analyze the contents of captured packets.
                - Detect specific types of network traffic, such as login credentials or HTTP requests.
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
                - Scapy: A Python library used for network packet crafting, sending, and sniffing.
                - TCPDump: A command-line packet analyzer used to capture and analyze network traffic.
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
                1. Setting Up the Sniffer:
                   Use Scapy to sniff network packets.
                   ```python
                   from scapy.all import sniff

                   def packet_callback(packet):
                       print(packet.show())  # Display the packet details

                   # Sniff packets on the default interface
                   sniff(prn=packet_callback, count=10)
                   ```

                2. Capturing Specific Protocols (e.g., HTTP):
                   Modify the sniffer to capture HTTP packets.
                   ```python
                   from scapy.all import sniff, IP, TCP

                   def packet_callback(packet):
                       if packet.haslayer(IP) and packet.haslayer(TCP):
                           if packet[TCP].dport == 80:
                               print(f"HTTP Packet: {packet[IP].src} -> {packet[IP].dst}")
                   
                   sniff(prn=packet_callback, count=20)
                   ```

                3. Filtering Sensitive Information (e.g., Login Credentials):
                   Detect sensitive information from packets.
                   ```python
                   def packet_callback(packet):
                       if packet.haslayer(TCP) and packet[TCP].dport == 80:
                           payload = str(packet[TCP].payload)
                           if "username" in payload or "password" in payload:
                               print(f"Sensitive Data Found: {payload}")

                   sniff(prn=packet_callback, count=50)
                   ```

                4. Saving Captured Packets:
                   Save the sniffed packets to a file for later analysis.
                   ```python
                   from scapy.all import sniff, wrpcap

                   packets = sniff(count=100)
                   wrpcap('captured_packets.pcap', packets)
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
                Packet sniffing is a critical technique used in network analysis and cybersecurity.
                This project demonstrated how to use Python and Scapy to intercept and analyze network packets, with a focus on detecting sensitive information.
                Always remember to use packet sniffing tools responsibly and within legal boundaries.
            """.trimIndent(),
            modifier = Modifier.padding(vertical = 8.dp)
        )

        Spacer(modifier = Modifier.height(32.dp))

        // Button to navigate back or to another project
        Button(onClick = { navController.navigate("project3") }) {
            Text(text = "Next Project")
        }
    }
}
