package com.example.hackwithpython.projects

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
import androidx.compose.ui.Alignment
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.hackwithpython.HackerWhite

@Composable
fun Project14Screen(navController: NavController) {
    Column(modifier = Modifier
        .padding(16.dp)
        .verticalScroll(rememberScrollState()),
        verticalArrangement = Arrangement.Top,
        horizontalAlignment = Alignment.Start   ) {
        Text(
            text = "Project 14: Phishing Attack Simulation",
            fontWeight = FontWeight.Bold,
            style = androidx.compose.material3.MaterialTheme.typography.headlineMedium,
            modifier = Modifier.padding(vertical = 8.dp)
        )

        // Introduction Section
        Text(
            text = """
                In this project, you will create a phishing attack simulator that can send fake emails 
                to users and capture their credentials. This project aims to educate users about the dangers of phishing attacks 
                and how to recognize them.
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
                Before starting this project, ensure you have:
                - A basic understanding of email protocols (SMTP/IMAP).
                - The `smtplib` and `email` libraries available in Python.
            """.trimIndent(),
            modifier = Modifier.padding(vertical = 8.dp)
        )

        // Project Description
        Text(
            text = "Project Description",
            fontWeight = FontWeight.Bold,
            style = androidx.compose.material3.MaterialTheme.typography.headlineMedium,
            modifier = Modifier.padding(vertical = 8.dp)
        )
        Text(
            text = """
                In this project, you will:
                - Create a function to send phishing emails.
                - Design a fake login page to capture credentials.
                - Understand the ethical implications and legality of phishing simulations.
            """.trimIndent(),
            modifier = Modifier.padding(vertical = 8.dp)
        )

        // Python Example Code
        Text(
            text = "Python Code Example: Phishing Attack Simulation",
            fontWeight = FontWeight.Bold,
            style = androidx.compose.material3.MaterialTheme.typography.headlineMedium,
            modifier = Modifier.padding(vertical = 8.dp)
        )
        Text(
            text = """
                Below is an example of how to implement a phishing attack simulator in Python:
            """.trimIndent(),
            modifier = Modifier.padding(vertical = 8.dp)
        )
        SelectionContainer {
            BasicText(
                text = """
                import smtplib
                from email.mime.multipart import MIMEMultipart
                from email.mime.text import MIMEText

                # Function to send phishing email
                def send_phishing_email(target_email):
                    # SMTP configuration
                    smtp_server = "smtp.example.com"  # Replace with your SMTP server
                    smtp_port = 587
                    sender_email = "your_email@example.com"
                    sender_password = "your_password"

                    # Create the email
                    msg = MIMEMultipart()
                    msg['From'] = sender_email
                    msg['To'] = target_email
                    msg['Subject'] = "Important Security Update"

                    # Email body with phishing link
                    body = "
                    Dear User,

                    We have detected suspicious activity on your account.
                    Please verify your credentials by clicking the link below:

                    http://fake-login-page.example.com

                    Regards,
                    Support Team
                    "
                    msg.attach(MIMEText(body, 'plain'))

                    # Send the email
                    try:
                        server = smtplib.SMTP(smtp_server, smtp_port)
                        server.starttls()
                        server.login(sender_email, sender_password)
                        server.send_message(msg)
                        print(f"Phishing email sent to {target_email}")
                    except Exception as e:
                        print(f"Error sending email: {e}")
                    finally:
                        server.quit()

                # Example usage
                # send_phishing_email("victim@example.com")  # Replace with target email
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

        // Ethical Use Disclaimer
        Text(
            text = "Ethical Use Disclaimer",
            fontWeight = FontWeight.Bold,
            style = androidx.compose.material3.MaterialTheme.typography.headlineMedium,
            modifier = Modifier.padding(vertical = 8.dp)
        )
        Text(
            text = """
                This project is intended for educational purposes only. 
                Phishing attacks can have serious legal consequences. 
                Always seek permission and ensure you are in compliance with local laws before testing or demonstrating this type of project.
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
        Button(onClick = {navController.navigate("project15")},
            modifier = Modifier.padding(16.dp)) {
            Text(text = "Next Lesson")
            }
        }
    }
}
