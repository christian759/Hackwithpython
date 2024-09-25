package com.example.hackwithpython.lessons

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Button
import androidx.compose.ui.Modifier
import androidx.compose.runtime.Composable
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController

@Composable
fun Lesson14Screen(navController: NavController) {
    Column(modifier = Modifier.padding(16.dp)
            .verticalScroll(rememberScrollState()),) {
        Text(
            text = "Lesson 14: Ethical Hacking and Penetration Testing",
            fontWeight = FontWeight.Bold,
            style = androidx.compose.material3.MaterialTheme.typography.headlineMedium,
            modifier = Modifier.padding(vertical = 8.dp)
        )

        // Introduction Section
        Text(
            text = """
                Ethical hacking, also known as penetration testing, involves testing computer systems, networks, and applications 
                for security vulnerabilities in a lawful and constructive manner. 
                Unlike malicious hackers, ethical hackers use their skills to improve security and protect sensitive information 
                from potential attacks. In this lesson, we will explore the methodologies of ethical hacking, 
                the tools and techniques used, and the importance of conducting penetration tests legally and ethically.
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
                Before diving into ethical hacking and penetration testing, make sure you have:
                - A basic understanding of computer networks and systems.
                - Familiarity with operating systems, particularly Linux, as many penetration testing tools are Linux-based.
                - Basic programming skills in languages such as Python or Bash.
                - A willingness to learn about security protocols and vulnerabilities.
            """.trimIndent(),
            modifier = Modifier.padding(vertical = 8.dp)
        )

        // What is Ethical Hacking?
        Text(
            text = "What is Ethical Hacking?",
            fontWeight = FontWeight.Bold,
            style = androidx.compose.material3.MaterialTheme.typography.headlineMedium,
            modifier = Modifier.padding(vertical = 8.dp)
        )
        Text(
            text = """
                Ethical hacking refers to the practice of intentionally probing computer systems and networks to discover vulnerabilities 
                that could be exploited by malicious attackers. The primary goals of ethical hacking include:
                - Identifying security weaknesses in systems.
                - Evaluating security policies and measures.
                - Providing recommendations for mitigating risks.
                
                Ethical hackers obtain explicit permission from organizations before conducting any tests, ensuring that their activities are legal 
                and do not violate any laws or regulations.
            """.trimIndent(),
            modifier = Modifier.padding(vertical = 8.dp)
        )

        // The Penetration Testing Process
        Text(
            text = "The Penetration Testing Process",
            fontWeight = FontWeight.Bold,
            style = androidx.compose.material3.MaterialTheme.typography.headlineMedium,
            modifier = Modifier.padding(vertical = 8.dp)
        )
        Text(
            text = """
                The penetration testing process typically involves several key phases:
                1. **Planning and Preparation**: 
                    - Define the scope of the test, including systems and networks to be tested.
                    - Obtain written permission and establish rules of engagement.
                2. **Reconnaissance**: 
                    - Gather information about the target systems using passive and active reconnaissance techniques.
                    - Tools like Nmap and Maltego can be used for network scanning and information gathering.
                3. **Scanning and Enumeration**: 
                    - Identify open ports, services, and potential vulnerabilities using tools like Nessus or OpenVAS.
                    - Perform enumeration to gather detailed information about the systems and services.
                4. **Exploitation**: 
                    - Attempt to exploit identified vulnerabilities to gain unauthorized access or escalate privileges.
                    - Tools such as Metasploit and Burp Suite can assist in this phase.
                5. **Post-Exploitation**: 
                    - Determine the extent of access gained and assess the potential impact on the organization.
                    - Document findings and maintain evidence of the test.
                6. **Reporting**: 
                    - Prepare a comprehensive report detailing the vulnerabilities discovered, the exploitation methods used, and recommendations for remediation.
                    - Present findings to stakeholders, including technical teams and management.
            """.trimIndent(),
            modifier = Modifier.padding(vertical = 8.dp)
        )

        // Tools of the Trade
        Text(
            text = "Tools of the Trade",
            fontWeight = FontWeight.Bold,
            style = androidx.compose.material3.MaterialTheme.typography.headlineMedium,
            modifier = Modifier.padding(vertical = 8.dp)
        )
        Text(
            text = """
                Ethical hackers utilize a variety of tools to assist in their testing efforts. Here are some essential tools:
                - **Nmap**: A powerful network scanning tool used to discover hosts and services on a network.
                - **Wireshark**: A network protocol analyzer that captures and inspects packets on a network.
                - **Burp Suite**: An integrated platform for web application security testing.
                - **Metasploit**: A widely-used framework for developing and executing exploit code against remote targets.
                - **OWASP ZAP**: An open-source web application security scanner designed for finding vulnerabilities in web applications.
                - **Kali Linux**: A popular Linux distribution specifically tailored for penetration testing and ethical hacking.
            """.trimIndent(),
            modifier = Modifier.padding(vertical = 8.dp)
        )

        // Legal and Ethical Considerations
        Text(
            text = "Legal and Ethical Considerations",
            fontWeight = FontWeight.Bold,
            style = androidx.compose.material3.MaterialTheme.typography.headlineMedium,
            modifier = Modifier.padding(vertical = 8.dp)
        )
        Text(
            text = """
                Conducting penetration tests requires a clear understanding of legal and ethical implications:
                - **Written Permission**: Always obtain explicit permission from the organization before testing their systems.
                - **Scope of Testing**: Clearly define what is included and excluded in the penetration test.
                - **Non-Disclosure Agreements (NDAs)**: Protect sensitive information obtained during testing through NDAs.
                - **Responsible Disclosure**: If vulnerabilities are found, report them responsibly and provide recommendations for remediation.
                
                Failing to adhere to these guidelines can result in legal consequences and damage to your reputation as an ethical hacker.
            """.trimIndent(),
            modifier = Modifier.padding(vertical = 8.dp)
        )

        // Common Vulnerabilities
        Text(
            text = "Common Vulnerabilities",
            fontWeight = FontWeight.Bold,
            style = androidx.compose.material3.MaterialTheme.typography.headlineMedium,
            modifier = Modifier.padding(vertical = 8.dp)
        )
        Text(
            text = """
                As an ethical hacker, it's crucial to understand common vulnerabilities that you may encounter during testing:
                - **SQL Injection**: An attack that allows attackers to execute arbitrary SQL code on a database.
                - **Cross-Site Scripting (XSS)**: A vulnerability that allows attackers to inject malicious scripts into web pages viewed by users.
                - **Remote Code Execution (RCE)**: A vulnerability that allows an attacker to run arbitrary code on a target machine.
                - **Buffer Overflow**: A vulnerability that occurs when a program writes more data to a block of memory than it can hold.
                - **Insecure Direct Object References (IDOR)**: A vulnerability that occurs when an attacker can access or modify objects they shouldn't be able to.
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
                In this lesson, you learned about the principles of ethical hacking and the penetration testing process. 
                Understanding how to conduct penetration tests ethically and legally is crucial for improving security 
                and protecting sensitive information. In the next lesson, we will explore more advanced penetration testing techniques.
            """.trimIndent(),
            modifier = Modifier.padding(vertical = 8.dp)
        )

        Spacer(modifier = Modifier.height(32.dp))

        // Button to navigate to the next lesson
        Button(onClick = { navController.navigate("lesson15") }) {
            Text(text = "Next Lesson")
        }
    }
}
