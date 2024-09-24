package com.example.hackwithpython.lessons

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.text.style.TextAlign
import androidx.navigation.NavController

@Composable
fun Lesson1Screen(navController: NavController, modifier: Modifier = Modifier) {
    Column(
        modifier = modifier
            .fillMaxSize()
            .padding(16.dp)
            .verticalScroll(rememberScrollState()),
        verticalArrangement = Arrangement.Top,
        horizontalAlignment = Alignment.Start
    ) {
        Text(
            text = "Lesson 1: Introduction to Hacking",
            style = MaterialTheme.typography.headlineSmall,
            fontWeight = FontWeight.Bold,
            textAlign = TextAlign.Start,
            color = MaterialTheme.colorScheme.primary // Use a bright green color
        )
        Spacer(modifier = Modifier.height(16.dp))

        // Introduction to hacking
        Text(
            text = "In this lesson, we will explore the basics of hacking, types of hackers, and why Python is an ideal language for hacking.",
            style = MaterialTheme.typography.bodyMedium,
            textAlign = TextAlign.Start,
            color = MaterialTheme.colorScheme.onBackground // White text on a black background
        )

        Spacer(modifier = Modifier.height(16.dp))

        // What is hacking
        Text(
            text = "1. What is Hacking?",
            style = MaterialTheme.typography.titleMedium,
            fontWeight = FontWeight.Bold,
            color = MaterialTheme.colorScheme.secondary // Use a darker green color
        )
        Text(
            text = "Hacking is the practice of exploiting weaknesses or vulnerabilities in computer systems to gain unauthorized access. Hackers can use their skills for both good and malicious purposes, depending on their intent.",
            style = MaterialTheme.typography.bodySmall,
            textAlign = TextAlign.Start,
            color = MaterialTheme.colorScheme.onBackground // White text
        )
        Spacer(modifier = Modifier.height(16.dp))

        // Types of Hackers
        Text(
            text = "2. Types of Hackers",
            style = MaterialTheme.typography.titleMedium,
            fontWeight = FontWeight.Bold,
            color = MaterialTheme.colorScheme.secondary // Dark green
        )
        Text(
            text = """
                - **White Hat Hackers**: Ethical hackers who use their skills to protect systems and networks. They work with organizations to prevent breaches.
                
                - **Black Hat Hackers**: Malicious hackers who exploit vulnerabilities for personal gain, often engaging in illegal activities like stealing data or causing damage.
                
                - **Grey Hat Hackers**: These hackers fall between white and black hats. They may hack systems without permission but typically have no malicious intent and may later inform the system owner of the vulnerabilities.
            """.trimIndent(),
            style = MaterialTheme.typography.bodySmall,
            textAlign = TextAlign.Start,
            color = MaterialTheme.colorScheme.onBackground // White text
        )

        Spacer(modifier = Modifier.height(16.dp))

        // Why Python for Hacking
        Text(
            text = "3. Why Python for Hacking?",
            style = MaterialTheme.typography.titleMedium,
            fontWeight = FontWeight.Bold,
            color = MaterialTheme.colorScheme.secondary // Dark green
        )
        Text(
            text = """
                Python is one of the most popular languages used in hacking due to its simplicity, flexibility, and rich library support. Here are a few reasons why Python is favored for hacking:
                
                - **Easy to Learn**: Python’s simple syntax makes it ideal for beginners.
                - **Powerful Libraries**: Libraries like `Scapy`, `Socket`, and `Requests` are powerful tools for creating scripts that scan networks, perform penetration testing, or automate tasks.
                - **Cross-Platform**: Python runs on multiple platforms, making it versatile for hackers who work across different systems.
                - **Automation**: Python allows hackers to write scripts for automating repetitive tasks such as scanning networks or cracking passwords.
            """.trimIndent(),
            style = MaterialTheme.typography.bodySmall,
            textAlign = TextAlign.Start,
            color = MaterialTheme.colorScheme.onBackground // White text
        )

        Spacer(modifier = Modifier.height(16.dp))

        // Python Example for Hacking
        Text(
            text = "4. Example: Network Scanning with Python",
            style = MaterialTheme.typography.titleMedium,
            fontWeight = FontWeight.Bold,
            color = MaterialTheme.colorScheme.secondary // Dark green
        )
        Text(
            text = """
                In this section, we will look at how you can use Python to scan a network and find active devices. The script uses the `socket` library to connect to devices in a given IP range.

                **Example Code**:
            """.trimIndent(),
            style = MaterialTheme.typography.bodySmall,
            textAlign = TextAlign.Start,
            color = MaterialTheme.colorScheme.onBackground // White text
        )
        Spacer(modifier = Modifier.height(8.dp))
        Text(
            text = """
                ```python
                import socket

                def scan(ip):
                    try:
                        sock = socket.socket(socket.AF_INET, socket.SOCK_STREAM)
                        sock.settimeout(1)
                        sock.connect((ip, 80))
                        return True
                    except:
                        return False
                    finally:
                        sock.close()

                for i in range(1, 255):
                    ip = f"192.168.1.{i}"
                    if scan(ip):
                        print(f"Device found at {ip}")
                ```
            """.trimIndent(),
            style = MaterialTheme.typography.bodySmall,
            textAlign = TextAlign.Start,
            color = MaterialTheme.colorScheme.onBackground // White text
        )

        Spacer(modifier = Modifier.height(24.dp))

        // Final message and navigation to next lesson
        Text(
            text = "This was just an introduction. In the next lesson, we will dive deeper into how to write Python scripts for ethical hacking. Stay tuned for practical exercises.",
            style = MaterialTheme.typography.bodyMedium,
            textAlign = TextAlign.Start,
            color = MaterialTheme.colorScheme.onBackground // White text
        )

        Spacer(modifier = Modifier.height(32.dp))

        Button(onClick = { navController.navigate("lesson2") }) {
            Text(text = "Next Lesson")
        }
    }
}
