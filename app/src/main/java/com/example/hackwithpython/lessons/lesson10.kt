package com.example.hackwithpython.lessons

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
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.hackwithpython.HackerBlack

@Composable
fun Lesson10Screen(navController: NavController) {
    Column(modifier = Modifier.padding(16.dp)
            .verticalScroll(rememberScrollState()),) {
        Text(
            text = "Lesson 10: Using Python for Network Sniffing",
            fontWeight = FontWeight.Bold,
            style = androidx.compose.material3.MaterialTheme.typography.headlineMedium,
            modifier = Modifier.padding(vertical = 8.dp)
        )

        // Introduction Section
        Text(
            text = """
                Network sniffing is the process of capturing and analyzing network packets that travel through a network. 
                This can be useful for various purposes, such as network troubleshooting, security analysis, and traffic monitoring. 
                In this lesson, we will explore how to use the Python library Scapy to capture and analyze network packets.
            """.trimIndent(),
            modifier = Modifier.padding(vertical = 8.dp)
        )

        // What is Scapy?
        Text(
            text = "What is Scapy?",
            fontWeight = FontWeight.Bold,
            style = androidx.compose.material3.MaterialTheme.typography.headlineMedium,
            modifier = Modifier.padding(vertical = 8.dp)
        )
        Text(
            text = """
                Scapy is a powerful Python library used for packet manipulation, network scanning, and sniffing. 
                It allows you to create, send, and capture packets, as well as analyze them easily. 
                Scapy supports various protocols, including IP, TCP, UDP, and more, making it a versatile tool for network security professionals.
            """.trimIndent(),
            modifier = Modifier.padding(vertical = 8.dp)
        )

        // Installing Scapy
        Text(
            text = "Installing Scapy",
            fontWeight = FontWeight.Bold,
            style = androidx.compose.material3.MaterialTheme.typography.headlineMedium,
            modifier = Modifier.padding(vertical = 8.dp)
        )
        Text(
            text = """
                To use Scapy, you need to install it. You can install Scapy using pip:
                
                ```bash
                pip install scapy
                ```
            """.trimIndent(),
            modifier = Modifier.padding(vertical = 8.dp)
        )

        // Capturing Packets
        Text(
            text = "Capturing Packets",
            fontWeight = FontWeight.Bold,
            style = androidx.compose.material3.MaterialTheme.typography.headlineMedium,
            modifier = Modifier.padding(vertical = 8.dp)
        )
        Text(
            text = """
                Scapy provides an easy way to capture packets from the network. 
                You can use the `sniff` function to capture packets. Here's a simple example:
            """.trimIndent(),
            modifier = Modifier.padding(vertical = 8.dp)
        )

        // Code Example for Sniffing
        Text(
            text = "Packet Sniffing Example",
            fontWeight = FontWeight.Bold,
            style = androidx.compose.material3.MaterialTheme.typography.headlineMedium,
            modifier = Modifier.padding(vertical = 8.dp)
        )
        SelectionContainer {
        BasicText(
            text = """
                from scapy.all import sniff

                def packet_callback(packet):
                    print(packet.summary())

                # Sniff packets on the network
                sniff(prn=packet_callback, count=10)
                
                # In this example, the `sniff` function captures 10 packets from the network. 
                # The `prn` parameter specifies a callback function (`packet_callback`) that is called for each captured packet. 
                # The `packet.summary()` method prints a brief summary of the packet.
            """.trimIndent(),
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

        // Filtering Packets
        Text(
            text = "Filtering Packets",
            fontWeight = FontWeight.Bold,
            style = androidx.compose.material3.MaterialTheme.typography.headlineMedium,
            modifier = Modifier.padding(vertical = 8.dp)
        )
        Text(
            text = """
                You can filter packets based on specific criteria, such as protocol, source IP, or destination port. 
                This is done using the `filter` parameter in the `sniff` function. 
                For example, to capture only TCP packets, you can do the following:
            """.trimIndent(),
            modifier = Modifier.padding(vertical = 8.dp)
        )

        // Code Example for Filtering
        Text(
            text = "TCP Packet Sniffing Example",
            fontWeight = FontWeight.Bold,
            style = androidx.compose.material3.MaterialTheme.typography.headlineMedium,
            modifier = Modifier.padding(vertical = 8.dp)
        )
        SelectionContainer {
        BasicText(
            text = """
                ```python
                from scapy.all import sniff

                def packet_callback(packet):
                    print(packet.summary())

                # Sniff only TCP packets
                sniff(filter="tcp", prn=packet_callback, count=10)
                ```

                In this example, the `filter` parameter is set to `"tcp"`, 
                allowing the sniffing of only TCP packets on the network.
            """.trimIndent(),
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
        // Analyzing Captured Packets
        Text(
            text = "Analyzing Captured Packets",
            fontWeight = FontWeight.Bold,
            style = androidx.compose.material3.MaterialTheme.typography.headlineMedium,
            modifier = Modifier.padding(vertical = 8.dp)
        )
        Text(
            text = """
                After capturing packets, you may want to analyze them to extract useful information. 
                Scapy allows you to access various fields of the packet. Here's how to analyze IP packets:
            """.trimIndent(),
            modifier = Modifier.padding(vertical = 8.dp)
        )

        // Code Example for Analyzing IP Packets
        Text(
            text = "IP Packet Analysis Example",
            fontWeight = FontWeight.Bold,
            style = androidx.compose.material3.MaterialTheme.typography.headlineMedium,
            modifier = Modifier.padding(vertical = 8.dp)
        )
        Text(
            text = """
                In this example, we check if the IP layer is present in the captured packet. 
                If it is, we access the source and destination IP addresses and print them.
            """.trimIndent(),
            modifier = Modifier.padding(vertical = 8.dp)
        )

        SelectionContainer {
            BasicText(
                text = """
                    from scapy.all import sniff, IP

                    def packet_callback(packet):
                        if IP in packet:
                            ip_layer = packet[IP]
                            print(f"Source IP: {ip_layer.src}, Destination IP: {ip_layer.dst}")

                    # Sniff packets and analyze IP fields
                    sniff(prn=packet_callback, count=10)
                """.trimIndent(),
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

        // Packet Manipulation
        Text(
            text = "Packet Manipulation",
            fontWeight = FontWeight.Bold,
            style = androidx.compose.material3.MaterialTheme.typography.headlineMedium,
            modifier = Modifier.padding(vertical = 8.dp)
        )
        Text(
            text = """
                Scapy also allows you to create and manipulate packets. 
                For example, you can create a custom packet and send it over the network:
            """.trimIndent(),
            modifier = Modifier.padding(vertical = 8.dp)
        )

        // Code Example for Creating and Sending Packets
        Text(
            text = "Creating and Sending a Packet Example",
            fontWeight = FontWeight.Bold,
            style = androidx.compose.material3.MaterialTheme.typography.headlineMedium,
            modifier = Modifier.padding(vertical = 8.dp)
        )
        Text(
            text = """
                In this example, we create an ICMP Echo Request packet targeting Google's public DNS server (8.8.8.8) 
                and send it using the `send` function.
            """.trimIndent(),
            modifier = Modifier.padding(vertical = 8.dp)
        )

        SelectionContainer {
            BasicText(
                text = """
                from scapy.all import IP, ICMP, send

                # Create an ICMP Echo Request packet
                packet = IP(dst="8.8.8.8")/ICMP()

                # Send the packet
                send(packet)
                """.trimIndent(),
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

        // Conclusion
        Text(
            text = "Conclusion",
            fontWeight = FontWeight.Bold,
            style = androidx.compose.material3.MaterialTheme.typography.headlineMedium,
            modifier = Modifier.padding(vertical = 8.dp)
        )
        Text(
            text = """
                In this lesson, we learned how to use Scapy for network sniffing and analysis. 
                We covered capturing packets, filtering them based on specific criteria, analyzing packet contents, and creating custom packets. 
                Scapy is a powerful tool for network analysis, and mastering it can significantly enhance your network security skills.
            """.trimIndent(),
            modifier = Modifier.padding(vertical = 8.dp)
        )
        Spacer(modifier = Modifier.height(32.dp))

        // Button to navigate to the next lesson
        Row {
        Button(onClick = {navController.navigate("lessons")},
            modifier = Modifier.padding(16.dp)){
            Text(text = "Home")
        }
        Button(onClick = {navController.navigate("lesson11")},
            modifier = Modifier.padding(16.dp)) {
            Text(text = "Next Lesson")
            }
        }
    }
}
