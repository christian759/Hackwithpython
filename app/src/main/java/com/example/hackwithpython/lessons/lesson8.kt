package com.example.hackwithpython.lessons

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.navigation.NavController

@Composable
fun Lesson8Screen(navController: NavController) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
            .verticalScroll(rememberScrollState()),
        verticalArrangement = Arrangement.Top
    ) {
        // Lesson Title
        Text(
            text = "Lesson 8: Penetration Testing Basics",
            fontWeight = FontWeight.Bold,
            style = MaterialTheme.typography.headlineLarge,
            modifier = Modifier.padding(8.dp),
            color = MaterialTheme.colorScheme.primary
        )

        Spacer(modifier = Modifier.height(16.dp))

        // Introduction
        Text(
            text = """
                Penetration testing, or "pen testing," is a security assessment technique used to find vulnerabilities in computer systems, networks, or web applications. By simulating real-world attacks, security professionals can identify weaknesses before attackers do. In this lesson, you'll explore the core concepts, methodologies, and tools needed to perform basic penetration testing.
                
                Ethical hacking involves following legal guidelines and obtaining permissions before testing any system. Unauthorized testing is illegal and punishable by law.
            """.trimIndent(),
            style = MaterialTheme.typography.bodyLarge,
            color = MaterialTheme.colorScheme.onBackground
        )

        Spacer(modifier = Modifier.height(16.dp))

        // What is Penetration Testing?
        Text(
            text = "1. What is Penetration Testing?",
            style = MaterialTheme.typography.titleMedium,
            fontWeight = FontWeight.Bold,
            color = MaterialTheme.colorScheme.secondary
        )
        Text(
            text = """
                Penetration testing is the practice of testing a system, network, or application for security weaknesses that could be exploited by an attacker. The main goals include:

                - **Identifying Vulnerabilities**: Detect security flaws in systems.
                - **Testing Security Controls**: Evaluate the effectiveness of current security measures.
                - **Prioritizing Risks**: Determine which vulnerabilities pose the greatest threat.
                - **Improving Security**: Provide recommendations to fix vulnerabilities and improve defenses.
                
                Penetration testing is a hands-on approach that goes beyond automated tools to understand real attack vectors.
            """.trimIndent(),
            style = MaterialTheme.typography.bodySmall,
            textAlign = TextAlign.Start,
            color = MaterialTheme.colorScheme.onBackground
        )

        Spacer(modifier = Modifier.height(16.dp))

        // Types of Penetration Testing
        Text(
            text = "2. Types of Penetration Testing",
            style = MaterialTheme.typography.titleMedium,
            fontWeight = FontWeight.Bold,
            color = MaterialTheme.colorScheme.secondary
        )
        Text(
            text = """
                Different types of penetration tests are conducted based on the system or area of focus:

                - **Network Penetration Testing**: Focuses on identifying weaknesses in the network infrastructure, including firewalls, routers, switches, and network protocols.
                - **Web Application Penetration Testing**: Targets the security of web applications, looking for issues such as SQL injection, Cross-Site Scripting (XSS), and Cross-Site Request Forgery (CSRF).
                - **Mobile Application Penetration Testing**: Involves testing the security of mobile applications, focusing on issues like insecure data storage and improper encryption.
                - **Physical Penetration Testing**: Tests the physical security of an organization by attempting to gain unauthorized access to buildings or devices.

                Each type of test requires different tools and methodologies to successfully identify vulnerabilities.
            """.trimIndent(),
            style = MaterialTheme.typography.bodySmall,
            textAlign = TextAlign.Start,
            color = MaterialTheme.colorScheme.onBackground
        )

        Spacer(modifier = Modifier.height(16.dp))

        // Phases of Penetration Testing
        Text(
            text = "3. Phases of Penetration Testing",
            style = MaterialTheme.typography.titleMedium,
            fontWeight = FontWeight.Bold,
            color = MaterialTheme.colorScheme.secondary
        )
        Text(
            text = """
                Penetration testing typically follows five phases. Understanding these phases is crucial to conducting an effective test:

                - **Reconnaissance (Information Gathering)**: The first step is to gather information about the target. This can include searching for exposed credentials, public IP addresses, open ports, and more. Techniques like passive scanning and social engineering are used to collect as much data as possible without alerting the target.
                
                - **Scanning**: Once the basic information is collected, scanning tools are used to find open ports, running services, and potential vulnerabilities. Nmap, Nessus, and OpenVAS are popular tools for network scanning.
                
                - **Exploitation (Gaining Access)**: In this phase, vulnerabilities found during scanning are exploited to gain unauthorized access. For example, a vulnerable web application might be attacked with SQL injection to retrieve sensitive data. Tools like Metasploit and Burp Suite are commonly used for exploitation.
                
                - **Post-Exploitation (Maintaining Access)**: After successfully gaining access, the next step is to maintain that access. This may involve installing backdoors or rootkits, allowing the attacker to retain control over the system even if the vulnerability is patched.
                
                - **Reporting (Analysis and Remediation)**: The final step is to document the findings. A report should include the vulnerabilities discovered, their severity, potential impact, and recommendations for remediation.
            """.trimIndent(),
            style = MaterialTheme.typography.bodySmall,
            textAlign = TextAlign.Start,
            color = MaterialTheme.colorScheme.onBackground
        )

        Spacer(modifier = Modifier.height(16.dp))

        // Tools for Penetration Testing
        Text(
            text = "4. Tools for Penetration Testing",
            style = MaterialTheme.typography.titleMedium,
            fontWeight = FontWeight.Bold,
            color = MaterialTheme.colorScheme.secondary
        )
        Text(
            text = """
                A variety of tools are used in penetration testing, each serving a specific purpose. Some of the most popular tools include:

                - **Nmap**: A powerful tool for network discovery and security auditing. It allows you to scan hosts, detect open ports, and identify services running on the target system.
                
                - **Metasploit**: A widely-used penetration testing framework that provides exploits for known vulnerabilities. It allows testers to automate the process of discovering and exploiting security flaws.
                
                - **Burp Suite**: A web vulnerability scanner that helps find common vulnerabilities like SQL injection and Cross-Site Scripting (XSS) in web applications.
                
                - **Wireshark**: A network protocol analyzer used to capture and analyze network traffic in real-time. It can help uncover issues like insecure communications or data leakage.
                
                - **Hydra**: A password-cracking tool used to perform brute-force attacks against various protocols like SSH, FTP, and HTTP.
                
                - **John the Ripper**: A password cracking tool that can be used to recover weak passwords stored in hashes.
            """.trimIndent(),
            style = MaterialTheme.typography.bodySmall,
            textAlign = TextAlign.Start,
            color = MaterialTheme.colorScheme.onBackground
        )

        Spacer(modifier = Modifier.height(16.dp))

        // Practical Example: Using Nmap for Network Scanning
        Text(
            text = "5. Practical Example: Using Nmap for Network Scanning",
            style = MaterialTheme.typography.titleMedium,
            fontWeight = FontWeight.Bold,
            color = MaterialTheme.colorScheme.secondary
        )
        Text(
            text = """
                Nmap (Network Mapper) is an essential tool for identifying open ports and services on a target system. Here’s how to use Nmap for a basic scan:

                ```bash
                nmap -sS -O -A target_ip
                ```

                - **-sS**: Performs a stealth scan by sending SYN packets to detect open ports.
                - **-O**: Detects the operating system running on the target machine.
                - **-A**: Enables advanced features, including version detection and OS detection.

                This command helps identify the operating system, services, and version numbers running on the target. With this information, you can proceed to find vulnerabilities specific to the detected services.
            """.trimIndent(),
            style = MaterialTheme.typography.bodySmall,
            textAlign = TextAlign.Start,
            color = MaterialTheme.colorScheme.onBackground
        )

        Spacer(modifier = Modifier.height(16.dp))

        // Exploiting Vulnerabilities
        Text(
            text = "6. Exploiting Vulnerabilities",
            style = MaterialTheme.typography.titleMedium,
            fontWeight = FontWeight.Bold,
            color = MaterialTheme.colorScheme.secondary
        )
        Text(
            text = """
                Exploitation is one of the core phases of penetration testing. In this step, vulnerabilities discovered during scanning are exploited to gain unauthorized access to the target system.

                A popular framework for exploitation is **Metasploit**. Let’s demonstrate how to exploit a vulnerability like **EternalBlue**:

                ```bash
                msfconsole
                use exploit/windows/smb/ms17_010_eternalblue
                set RHOST target_ip
                exploit
                ```

                This exploits a known vulnerability in Microsoft’s SMB protocol, allowing attackers to remotely execute code on the target machine.

                However, ethical hackers must stop after gaining access and avoid causing damage or tampering with sensitive data.
            """.trimIndent(),
            style = MaterialTheme.typography.bodySmall,
            textAlign = TextAlign.Start,
            color = MaterialTheme.colorScheme.onBackground
        )

        Spacer(modifier = Modifier.height(32.dp))

        // Button to navigate to the next lesson
        Row {
        Button(onClick = {navController.navigate("lessons")},
            modifier = Modifier.padding(16.dp)){
            Text(text = "Home")
        }
        Button(onClick = {navController.navigate("lesson9")},
            modifier = Modifier.padding(16.dp)) {
            Text(text = "Next Lesson")
            }
        }
    }
}
