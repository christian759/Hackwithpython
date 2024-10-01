package com.example.hackwithpython.lessons

import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.text.BasicText
import androidx.compose.foundation.text.selection.SelectionContainer
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.unit.dp
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.hackwithpython.HackerBlack
import com.example.hackwithpython.HackerWhite

@Composable
fun Lesson2Screen(navController: NavController) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
            .verticalScroll(rememberScrollState()),
        verticalArrangement = Arrangement.Top
    ) {
        // Lesson Title
        Text(
            text = "Lesson 2: Understanding Networks",
            fontWeight = FontWeight.Bold,
            style = MaterialTheme.typography.headlineLarge,
            color = MaterialTheme.colorScheme.primary,
            modifier = Modifier.padding(8.dp)
        )

        // Lesson Content
        Text(
            text = """
                In this lesson, we dive deep into the world of networking. 
                Understanding networks is essential for hacking and security.
                
                ## What is a Network?
                A network is a group of computers or devices connected to share resources, exchange data, or communicate.
                The internet is the largest and most well-known network.
                
                ### Types of Networks:
                - **Local Area Network (LAN):** A network that connects computers in a small geographic area, such as a home or office.
                - **Wide Area Network (WAN):** A network that spans a large geographic area, like a city or the internet.
                - **Wireless LAN (WLAN):** A wireless version of LAN, using Wi-Fi to connect devices.

                ### Network Components:
                - **Router:** Directs traffic between networks and connects devices.
                - **Switch:** Connects devices within a LAN.
                - **Firewall:** A security system that controls incoming and outgoing network traffic.
                
                ### Key Network Concepts:
                - **IP Address:** A unique identifier assigned to each device on a network.
                - **DNS (Domain Name System):** Translates domain names (like google.com) to IP addresses.
                - **MAC Address:** A hardware address unique to each device.

                ## Network Protocols
                Network protocols are sets of rules that define how data is transmitted over a network. Here are some critical ones:

                ### TCP/IP (Transmission Control Protocol/Internet Protocol)
                - TCP/IP is the fundamental protocol suite of the internet.
                - **TCP**: Ensures reliable transmission of data by breaking it into packets.
                - **IP**: Routes the packets to their destination.

                ### HTTP/HTTPS (HyperText Transfer Protocol)
                - **HTTP**: The protocol used for transmitting web pages.
                - **HTTPS**: A secure version of HTTP that encrypts data.

                ### FTP (File Transfer Protocol)
                - FTP is used for transferring files between computers over a network.

                ### SSH (Secure Shell)
                - SSH allows secure remote access to another computer, commonly used by hackers and system administrators.
                
                ## Networking Tools for Hacking
                - **Wireshark**: A network protocol analyzer that captures and inspects network traffic.
                - **Nmap**: A powerful tool used for network discovery and security auditing.
                - **Netcat**: A versatile networking tool used for reading and writing data across network connections.
                
                ## Python Networking
                Python is an excellent language for network programming. Using Python, you can create network connections, monitor traffic, and automate attacks.

                Here’s a Python script for scanning open ports on a server:
                 
                """.trimIndent()
        )
        val socket_code2 = """
                import socket
                def scan_ports(host):
                    open_ports = []
                    for port in range(1, 1025):  # Scanning ports 1 to 1024
                        try:
                            sock = socket.socket(socket.AF_INET, socket.SOCK_STREAM)
                            sock.settimeout(0.5)
                            result = sock.connect_ex((host, port))
                            if result == 0:
                                open_ports.append(port)
                            sock.close()
                        except Exception as e:
                            pass
                    return open_ports

                host = '127.0.0.1'  # Example: scan localhost
                open_ports = scan_ports(host)
                print(f"Open ports on {host}: {open_ports}")
                """.trimIndent()

        SelectionContainer {
            BasicText(
                text = socket_code2,
                style = TextStyle(
                    fontFamily = FontFamily.Monospace,
                    fontSize = 14.sp,
                    color = HackerWhite
                ),
                modifier =Modifier.padding(12.dp)
                    .horizontalScroll(rememberScrollState())
            )
        }

        Text(text = """
                ### Explanation:
                - The script uses the Python `socket` module to scan ports on a target server.
                - The function `scan_ports` tries to connect to ports between 1 and 1024. If it connects, the port is open.
                - This script can be expanded to scan larger ranges of ports or multiple hosts.
                
                ## Deeper Dive: Layers of TCP/IP Model
                The TCP/IP model consists of four layers:
                1. **Link Layer**: Handles the physical transmission of data over a network.
                2. **Internet Layer**: Manages addressing, routing, and delivery of data packets.
                3. **Transport Layer**: Ensures data is delivered without errors.
                4. **Application Layer**: Handles high-level protocols like HTTP, FTP, and SMTP.
                
                ### Common Ports:
                - **80**: HTTP
                - **443**: HTTPS
                - **22**: SSH
                - **21**: FTP

                Understanding which ports are open and what services are running on them is key to hacking and penetration testing.
                
                ## Tools You Can Use to Monitor Networks
                - **Wireshark**: Analyzes and inspects packets in real-time.
                - **tcpdump**: Command-line packet analyzer.
                
                Python libraries like **scapy** and **paramiko** are powerful for advanced network manipulation and automation.

                ### Example of Using `scapy` to Craft and Send Packets:
            """.trimIndent())

        val scapy_code =
            """
                from scapy.all import *

                packet = IP(dst="8.8.8.8") / ICMP()
                send(packet)
                print("Packet sent to 8.8.8.8")
            """.trimIndent()

        SelectionContainer {
            BasicText(text = scapy_code,
                style = TextStyle(
                    fontFamily = FontFamily.Monospace,
                    fontSize = 14.sp,
                    color = HackerBlack
                ),
                modifier = Modifier
                    .padding(12.dp)
                    .horizontalScroll(rememberScrollState())
            )
        }

        Text(text =
            """
                - This script sends an ICMP (ping) packet to Google's public DNS server (8.8.8.8).
                - `scapy` allows you to create custom packets and send them over the network.

                Use this knowledge to explore networks, scan vulnerabilities, and understand how devices communicate. 
                In the next lesson, we'll cover more about how to interact with network services and how Python helps automate that interaction.
            """.trimIndent()
        )

        Spacer(modifier = Modifier.height(32.dp))

        // Button to navigate to the next lesson
        Button(onClick = { navController.navigate("lesson3") }) {
            Text(text = "Next Lesson")
        }
    }
}
