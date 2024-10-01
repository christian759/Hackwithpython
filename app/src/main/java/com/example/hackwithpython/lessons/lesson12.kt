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
fun Lesson12Screen(navController: NavController) {
    Column(modifier = Modifier.padding(16.dp)
            .verticalScroll(rememberScrollState()),) {
        Text(
            text = "Lesson 12: Introduction to Malware Analysis",
            fontWeight = FontWeight.Bold,
            style = androidx.compose.material3.MaterialTheme.typography.headlineMedium,
            modifier = Modifier.padding(vertical = 8.dp)
        )

        // Introduction Section
        Text(
            text = """
                Malware analysis is a critical component of cybersecurity that focuses on understanding malicious software 
                to determine its behavior, capabilities, and potential impact on systems and networks. By analyzing malware, 
                security professionals can develop effective defenses, improve incident response strategies, and educate 
                users about the dangers of malicious software. 
                
                This lesson covers the foundational concepts of malware analysis, including common types of malware, 
                tools and techniques used for analysis, and the steps involved in static and dynamic analysis. 
                We will also delve into ethical considerations and best practices when working with malware samples.
            """.trimIndent(),
            modifier = Modifier.padding(vertical = 8.dp)
        )

        // Importance of Malware Analysis
        Text(
            text = "Importance of Malware Analysis",
            fontWeight = FontWeight.Bold,
            style = androidx.compose.material3.MaterialTheme.typography.headlineMedium,
            modifier = Modifier.padding(vertical = 8.dp)
        )
        Text(
            text = """
                Understanding malware is essential for several reasons:
                - **Threat Detection**: Identifying new malware strains helps in updating antivirus signatures and intrusion detection systems.
                - **Incident Response**: Knowledge of malware behavior aids in effective incident response and remediation efforts.
                - **Security Awareness**: Educating users about the risks and characteristics of malware helps in reducing infection rates.
                - **Vulnerability Management**: Understanding how malware exploits vulnerabilities guides the development of patches and security updates.
            """.trimIndent(),
            modifier = Modifier.padding(vertical = 8.dp)
        )

        // Common Types of Malware
        Text(
            text = "Common Types of Malware",
            fontWeight = FontWeight.Bold,
            style = androidx.compose.material3.MaterialTheme.typography.headlineMedium,
            modifier = Modifier.padding(vertical = 8.dp)
        )
        Text(
            text = """
                Malware can take various forms, each with unique characteristics. Here are some common types:
                - **Viruses**: Self-replicating programs that attach themselves to legitimate files. They spread when infected files are executed.
                - **Worms**: Standalone malware that replicates itself to spread across networks, often exploiting vulnerabilities in software or systems.
                - **Trojans**: Malicious software disguised as legitimate applications. Unlike viruses and worms, Trojans do not self-replicate.
                - **Ransomware**: A type of malware that encrypts files on a victim's computer, demanding a ransom for decryption keys. Notable examples include WannaCry and CryptoLocker.
                - **Spyware**: Secretly collects user information, such as browsing habits or personal data, often without user consent. 
                - **Adware**: Displays unwanted advertisements, often bundled with free software. While less harmful than other types, it can degrade system performance.
                - **Rootkits**: A type of malware designed to gain unauthorized access to a computer while concealing its presence. They can be used to control the system remotely.
                - **Keyloggers**: Programs that record keystrokes, potentially capturing sensitive information such as passwords and credit card numbers.
            """.trimIndent(),
            modifier = Modifier.padding(vertical = 8.dp)
        )

        // Tools for Malware Analysis
        Text(
            text = "Tools for Malware Analysis",
            fontWeight = FontWeight.Bold,
            style = androidx.compose.material3.MaterialTheme.typography.headlineMedium,
            modifier = Modifier.padding(vertical = 8.dp)
        )
        Text(
            text = """
                Malware analysis requires various tools to facilitate the process. Here are some essential tools used by analysts:
                - **Static Analysis Tools**: Analyze malware without executing it, which helps in understanding its structure and behavior. Examples include:
                    - **PEiD**: Detects packers and compilers used to obfuscate executable files.
                    - **CFF Explorer**: Analyzes the PE (Portable Executable) file format, revealing headers and sections.
                    - **Strings**: Extracts printable strings from binary files, which can provide insights into the malware’s functions.
                    - **ExifTool**: Analyzes metadata in files, which can reveal information about the file’s origin and modifications.
                - **Dynamic Analysis Tools**: Execute malware in a controlled environment (sandbox) to observe its behavior during execution. Examples include:
                    - **Cuckoo Sandbox**: An automated malware analysis system that executes files in a virtualized environment.
                    - **Process Monitor**: Monitors real-time file system, registry, and process/thread activity to identify changes made by malware.
                    - **Wireshark**: A network protocol analyzer that captures and inspects packets transmitted over a network, enabling the analysis of network behavior of malware.
                    - **OllyDbg**: A 32-bit assembler-level analyzing debugger for Windows, which allows analysts to step through the execution of a program and examine its behavior.
                    - **Sandboxie**: A tool that creates isolated environments for running programs, which is useful for observing malware behavior without risking the host system.
            """.trimIndent(),
            modifier = Modifier.padding(vertical = 8.dp)
        )

        // Static Analysis
        Text(
            text = "Static Analysis",
            fontWeight = FontWeight.Bold,
            style = androidx.compose.material3.MaterialTheme.typography.headlineMedium,
            modifier = Modifier.padding(vertical = 8.dp)
        )
        Text(
            text = """
                Static analysis involves examining the malware's code and structure without executing it. This process provides insights into its potential behavior and functionality. 
                Key steps involved in static analysis include:
                - **File Identification**: Determine the type of file (e.g., executable, script) and analyze its properties using tools like `file` command in Linux.
                - **Code Disassembly**: Use disassemblers (e.g., Ghidra, IDA Pro) to convert binary code into assembly code, allowing analysts to understand its functions and logic.
                - **String Analysis**: Extract readable strings from the binary file to identify potential command-and-control (C2) servers, error messages, or file paths. Strings can often reveal critical information about how the malware operates.
                - **Control Flow Analysis**: Examine the flow of the program to identify how it operates and its decision-making processes, which can help reveal malicious behaviors.
                - **Signature-Based Detection**: Utilize antivirus software and intrusion detection systems to scan for known malware signatures.
            """.trimIndent(),
            modifier = Modifier.padding(vertical = 8.dp)
        )

        // Example of Static Analysis with Python
        Text(
            text = "Static Analysis Example with Python",
            fontWeight = FontWeight.Bold,
            style = androidx.compose.material3.MaterialTheme.typography.headlineMedium,
            modifier = Modifier.padding(vertical = 8.dp)
        )
        Text(
            text = """
                We can use Python to perform a simple static analysis task, such as extracting strings from a binary file. 
                Here’s an example of how to do this:
            """.trimIndent(),
            modifier = Modifier.padding(vertical = 8.dp)
        )

        // Code Example for Static Analysis
        Text(
            text = "Extracting Strings from a Binary File",
            fontWeight = FontWeight.Bold,
            style = androidx.compose.material3.MaterialTheme.typography.headlineMedium,
            modifier = Modifier.padding(vertical = 8.dp)
        )

        SelectionContainer {
            BasicText(
                text = """
                import subprocess

                def extract_strings(file_path):
                    
                    #    Uses the 'strings' command to extract printable strings from a binary file.
                    #    Args:
                    #        file_path (str): The path to the binary file.
                    #    Returns:
                    #       list: A list of extracted strings.
                    
                    result = subprocess.run(['strings', file_path], capture_output=True, text=True)
                    return result.stdout.splitlines()

                # Example usage
                binary_file = '/path/to/malware.exe'
                extracted_strings = extract_strings(binary_file)

                for string in extracted_strings:
                    print(string)

                # This script utilizes the `strings` command-line tool to extract and print readable strings from a specified binary file.
                # Extracted strings can provide valuable information about the malware's capabilities and intentions.
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

        // Dynamic Analysis
        Text(
            text = "Dynamic Analysis",
            fontWeight = FontWeight.Bold,
            style = androidx.compose.material3.MaterialTheme.typography.headlineMedium,
            modifier = Modifier.padding(vertical = 8.dp)
        )
        Text(
            text = """
                Dynamic analysis involves executing the malware in a controlled environment (sandbox) to observe its behavior. 
                This approach can help analysts understand how the malware interacts with the system and network. Key steps in dynamic analysis include:
                - **Sandbox Setup**: Create a secure environment to execute the malware without risking your system. Tools like VirtualBox or VMware can be used to create isolated virtual machines for testing.
                - **Behavior Monitoring**: Observe changes made to the file system, registry, and network traffic during execution. Tools such as Process Monitor and Wireshark are instrumental in this process.
                - **Network Analysis**: Capture and analyze network traffic to identify communication with command-and-control (C2) servers. This can reveal how the malware spreads or receives instructions.
                - **Log Analysis**: Examine logs generated during execution to track the malware's actions, such as file modifications, process creations, and network connections.
            """.trimIndent(),
            modifier = Modifier.padding(vertical = 8.dp)
        )

        // Ethical Considerations in Malware Analysis
        Text(
            text = "Ethical Considerations in Malware Analysis",
            fontWeight = FontWeight.Bold,
            style = androidx.compose.material3.MaterialTheme.typography.headlineMedium,
            modifier = Modifier.padding(vertical = 8.dp)
        )
        Text(
            text = """
                Engaging in malware analysis comes with ethical responsibilities. Here are some considerations:
                - **Legality**: Ensure that you are legally permitted to analyze the malware, especially when working with samples obtained from the internet.
                - **Safety**: Always conduct analysis in a secure and isolated environment to prevent unintentional spread or damage.
                - **Disclosure**: If you discover vulnerabilities or exploits during analysis, consider responsible disclosure practices to inform affected parties.
                - **Privacy**: Respect user privacy and avoid analyzing malware that may expose personal information without consent.
                - **Documentation**: Keep detailed records of your analysis process and findings for future reference and to assist others in the field.
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
                Malware analysis is a vital skill in the cybersecurity domain, enabling professionals to combat malicious threats effectively. 
                By understanding different types of malware, employing appropriate tools, and following ethical guidelines, analysts can contribute to a safer digital environment. 
                In subsequent lessons, we will explore advanced topics in malware analysis, including reverse engineering and the use of machine learning techniques for threat detection.
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
        Button(onClick = {navController.navigate("lesson13")},
            modifier = Modifier.padding(16.dp)) {
            Text(text = "Next Lesson")
            }
        }
    }
}
