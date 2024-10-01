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
fun Lesson18Screen(navController: NavController) {
    Column(modifier = Modifier.padding(16.dp)
            .verticalScroll(rememberScrollState()),) {
        Text(
            text = "Lesson 18: Exploit Development",
            fontWeight = FontWeight.Bold,
            style = androidx.compose.material3.MaterialTheme.typography.headlineMedium,
            modifier = Modifier.padding(vertical = 8.dp)
        )

        // Introduction Section
        Text(
            text = """
                Exploit development involves creating and testing code that takes advantage of vulnerabilities in software. 
                This practice is essential for security professionals to understand how attackers might exploit weaknesses 
                in applications and systems. In this lesson, we will cover the types of exploits, the exploit development process, 
                and practical examples of creating basic exploits using Python.
            """.trimIndent(),
            modifier = Modifier.padding(vertical = 8.dp)
        )

        // Types of Exploits
        Text(
            text = "Types of Exploits",
            fontWeight = FontWeight.Bold,
            style = androidx.compose.material3.MaterialTheme.typography.headlineMedium,
            modifier = Modifier.padding(vertical = 8.dp)
        )
        Text(
            text = """
                Exploits can be categorized into several types:
                - **Remote Exploits**: Attackers execute code on a target system from a remote location.
                - **Local Exploits**: Exploits that require access to a target system, often escalating privileges.
                - **Denial of Service (DoS) Exploits**: Aimed at making a service unavailable to users by overwhelming it with requests.
                - **Web Application Exploits**: Target vulnerabilities in web applications, such as SQL injection and Cross-Site Scripting (XSS).
                - **Buffer Overflow Exploits**: Involve overflowing a buffer to overwrite memory and execute arbitrary code.
            """.trimIndent(),
            modifier = Modifier.padding(vertical = 8.dp)
        )

        // Exploit Development Process
        Text(
            text = "Exploit Development Process",
            fontWeight = FontWeight.Bold,
            style = androidx.compose.material3.MaterialTheme.typography.headlineMedium,
            modifier = Modifier.padding(vertical = 8.dp)
        )
        Text(
            text = """
                The exploit development process typically involves the following steps:
                1. **Identifying Vulnerabilities**: Discovering software weaknesses through testing or research.
                2. **Understanding the Vulnerability**: Analyzing how the vulnerability can be exploited and the potential impact.
                3. **Creating the Exploit**: Writing code to demonstrate the vulnerability and execute arbitrary commands.
                4. **Testing the Exploit**: Validating that the exploit works as intended against the target software.
                5. **Refining and Documenting**: Improving the exploit for reliability and documenting the findings.
            """.trimIndent(),
            modifier = Modifier.padding(vertical = 8.dp)
        )

        // Practical Example: Buffer Overflow Exploit
        Text(
            text = "Practical Example: Buffer Overflow Exploit",
            fontWeight = FontWeight.Bold,
            style = androidx.compose.material3.MaterialTheme.typography.headlineMedium,
            modifier = Modifier.padding(vertical = 8.dp)
        )
        Text(
            text = """
                Let's consider a simple example of a buffer overflow exploit using Python. 
                Assume we have a vulnerable C program that accepts input but does not properly validate the size:
            """.trimIndent(),
            modifier = Modifier.padding(vertical = 8.dp)
        )
        Text(
            text = "Vulnerable C Code:",
            fontWeight = FontWeight.Bold,
            modifier = Modifier.padding(vertical = 8.dp)
        )
        SelectionContainer {
            BasicText(
                text = """
                #include <stdio.h>
                #include <string.h>

                void vulnerable_function(char *input) {
                    char buffer[64];
                    strcpy(buffer, input);
                    printf("Buffer: %s\n", buffer);
                }

                int main(int argc, char *argv[]) {
                    if (argc < 2) {
                        printf("Usage: %s <input>\n", argv[0]);
                        return 1;
                    }
                    vulnerable_function(argv[1]);
                    return 0;
                }
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
        Text(
            text = """
                In this code, the `strcpy` function copies the input into a fixed-size buffer without checking the length, 
                creating a buffer overflow vulnerability. We can exploit this using Python:
            """.trimIndent(),
            modifier = Modifier.padding(vertical = 8.dp)
        )
        Text(
            text = "Python Exploit Code:",
            fontWeight = FontWeight.Bold,
            modifier = Modifier.padding(vertical = 8.dp)
        )
        SelectionContainer {
        BasicText(
            text = """
                import os

                # Create a payload that exceeds the buffer size
                payload = b"A" * 72  # Adjust size to overflow the buffer

                # Execute the vulnerable program with the payload
                os.system(f"./vulnerable_program '{payload.decode()}'")
                
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
        Text(
            text = """
                In this example, the exploit code constructs a payload filled with 'A' characters to overflow the buffer. 
                The `os.system` function executes the vulnerable program with the crafted payload, demonstrating how an attacker 
                might exploit the vulnerability.
            """.trimIndent(),
            modifier = Modifier.padding(vertical = 8.dp)
        )

        // Practical Example: Command Injection Exploit
        Text(
            text = "Practical Example: Command Injection Exploit",
            fontWeight = FontWeight.Bold,
            style = androidx.compose.material3.MaterialTheme.typography.headlineMedium,
            modifier = Modifier.padding(vertical = 8.dp)
        )
        Text(
            text = """
                Another common type of exploit is command injection. Consider a vulnerable Python script:
            """.trimIndent(),
            modifier = Modifier.padding(vertical = 8.dp)
        )
        Text(
            text = "Vulnerable Python Code:",
            fontWeight = FontWeight.Bold,
            modifier = Modifier.padding(vertical = 8.dp)
        )
        SelectionContainer {
        BasicText(
            text = """
                import os

                def execute_command(command):
                    os.system(command)

                if __name__ == "__main__":
                    user_input = input("Enter command: ")
                    execute_command(user_input)
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
        Text(
            text = """
                In this script, the `execute_command` function executes user input without validation, leading to a command injection vulnerability. 
                An attacker can exploit this by entering malicious commands. Here’s how we can demonstrate this:
            """.trimIndent(),
            modifier = Modifier.padding(vertical = 8.dp)
        )
        Text(
            text = "Python Exploit Code:",
            fontWeight = FontWeight.Bold,
            modifier = Modifier.padding(vertical = 8.dp)
        )
        SelectionContainer {
        BasicText(
            text = """
                import os

                # Malicious command to be executed
                malicious_command = "echo Exploit successful > exploit.txt; cat exploit.txt"

                # Execute the vulnerable script with the malicious command
                os.system(f"python vulnerable_script.py '{malicious_command}'")
               
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
        Text(
            text = """
                In this example, the exploit code crafts a malicious command that creates a file and displays its contents. 
                The `os.system` function simulates an attacker running the vulnerable script with a crafted command, 
                highlighting how command injection vulnerabilities can be exploited.
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
                In this lesson, we explored the fundamentals of exploit development, including types of exploits and the 
                development process. By understanding how to create and test exploits, you can better appreciate the 
                security implications of software vulnerabilities. In the next lesson, we will focus on developing secure coding 
                practices to mitigate the risks associated with vulnerabilities.
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
        Button(onClick = {navController.navigate("lesson19")},
            modifier = Modifier.padding(16.dp)) {
            Text(text = "Next Lesson")
            }
        }
    }
}
