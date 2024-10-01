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
fun Lesson11Screen(navController: NavController) {
    Column(modifier = Modifier.padding(16.dp)
            .verticalScroll(rememberScrollState()),) {
        Text(
            text = "Lesson 11: Automating Tasks with Python",
            fontWeight = FontWeight.Bold,
            style = androidx.compose.material3.MaterialTheme.typography.headlineMedium,
            modifier = Modifier.padding(vertical = 8.dp)
        )

        // Introduction Section
        Text(
            text = """
                Automation is a powerful technique that allows you to save time and reduce errors by 
                performing repetitive tasks using scripts. Python, with its simplicity and extensive 
                libraries, is an excellent choice for automating various tasks, whether it's file manipulation, 
                web scraping, sending emails, or data processing. 
                In this lesson, we'll explore how to write Python scripts to automate common tasks.
            """.trimIndent(),
            modifier = Modifier.padding(vertical = 8.dp)
        )

        // Common Automation Tasks
        Text(
            text = "Common Automation Tasks",
            fontWeight = FontWeight.Bold,
            style = androidx.compose.material3.MaterialTheme.typography.headlineMedium,
            modifier = Modifier.padding(vertical = 8.dp)
        )
        Text(
            text = """
                Here are some common tasks that can be automated with Python:
                - File handling (creating, moving, renaming files)
                - Sending emails
                - Web scraping for data collection
                - Data processing and analysis
                - Automating software testing
                - Scheduling tasks
            """.trimIndent(),
            modifier = Modifier.padding(vertical = 8.dp)
        )

        // Automating File Handling
        Text(
            text = "Automating File Handling",
            fontWeight = FontWeight.Bold,
            style = androidx.compose.material3.MaterialTheme.typography.headlineMedium,
            modifier = Modifier.padding(vertical = 8.dp)
        )
        Text(
            text = """
                One common task is managing files. Python's `os` and `shutil` modules make it easy to 
                perform file operations. Here’s an example of a script that organizes files in a directory 
                based on their extensions:
            """.trimIndent(),
            modifier = Modifier.padding(vertical = 8.dp)
        )

        // Code Example for File Handling
        Text(
            text = "File Organization Script",
            fontWeight = FontWeight.Bold,
            style = androidx.compose.material3.MaterialTheme.typography.headlineMedium,
            modifier = Modifier.padding(vertical = 8.dp)
        )

        SelectionContainer {
        BasicText(
            text = """
                import os
                import shutil

                def organize_files(directory):
                    for filename in os.listdir(directory):
                        if os.path.isfile(os.path.join(directory, filename)):
                            ext = filename.split('.')[-1]
                            ext_dir = os.path.join(directory, ext)
                            if not os.path.exists(ext_dir):
                                os.makedirs(ext_dir)
                            shutil.move(os.path.join(directory, filename), os.path.join(ext_dir, filename))

                # Organize files in the specified directory
                organize_files('/path/to/your/directory')
                ```

                #This script moves files from the specified directory into subdirectories based on their extensions. 
                #For example, all `.jpg` files will be moved to a `jpg` folder.
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

        // Automating Email Sending
        Text(
            text = "Automating Email Sending",
            fontWeight = FontWeight.Bold,
            style = androidx.compose.material3.MaterialTheme.typography.headlineMedium,
            modifier = Modifier.padding(vertical = 8.dp)
        )
        Text(
            text = """
                Another common automation task is sending emails. The `smtplib` module in Python 
                allows you to send emails easily. Here’s how to send a simple email:
            """.trimIndent(),
            modifier = Modifier.padding(vertical = 8.dp)
        )

        // Code Example for Sending Emails
        Text(
            text = "Email Sending Script",
            fontWeight = FontWeight.Bold,
            style = androidx.compose.material3.MaterialTheme.typography.headlineMedium,
            modifier = Modifier.padding(vertical = 8.dp)
        )
        SelectionContainer {
            BasicText(
                text = """
               
                import smtplib
                from email.mime.text import MIMEText

                def send_email(subject, body, to_email):
                    from_email = 'your_email@example.com'
                    msg = MIMEText(body)
                    msg['Subject'] = subject
                    msg['From'] = from_email
                    msg['To'] = to_email

                    with smtplib.SMTP('smtp.example.com', 587) as server:
                        server.starttls()
                        server.login(from_email, 'your_password')
                        server.send_message(msg)

                # Send a test email
                send_email('Test Subject', 'This is a test email body.', 'recipient@example.com')
                
                #In this example, replace `your_email@example.com` with your email address and provide the appropriate 
                #SMTP server details. This script sends an email with a subject and body to the specified recipient.
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

        // Automating Web Scraping
        Text(
            text = "Automating Web Scraping",
            fontWeight = FontWeight.Bold,
            style = androidx.compose.material3.MaterialTheme.typography.headlineMedium,
            modifier = Modifier.padding(vertical = 8.dp)
        )
        Text(
            text = """
                Web scraping can also be automated with Python using libraries like `requests` and `BeautifulSoup`. 
                Here’s an example of a script that scrapes headlines from a news website:
            """.trimIndent(),
            modifier = Modifier.padding(vertical = 8.dp)
        )

        // Code Example for Web Scraping
        Text(
            text = "Web Scraping Script",
            fontWeight = FontWeight.Bold,
            style = androidx.compose.material3.MaterialTheme.typography.headlineMedium,
            modifier = Modifier.padding(vertical = 8.dp)
        )
        SelectionContainer {
            BasicText(
                text = """
                import requests
                from bs4 import BeautifulSoup

                def scrape_headlines(url):
                    response = requests.get(url)
                    soup = BeautifulSoup(response.text, 'html.parser')
                    headlines = soup.find_all('h2')

                    for index, headline in enumerate(headlines):
                        print(f"{index + 1}. {headline.text.strip()}")

                # Scrape headlines from a news website
                scrape_headlines('https://www.example-news-website.com')
           
                # This script fetches the webpage content and extracts all the headlines from `h2` tags, printing them to the console.
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

        // Scheduling Tasks
        Text(
            text = "Scheduling Tasks",
            fontWeight = FontWeight.Bold,
            style = androidx.compose.material3.MaterialTheme.typography.headlineMedium,
            modifier = Modifier.padding(vertical = 8.dp)
        )
        Text(
            text = """
                You can also automate the scheduling of your tasks using the `schedule` library. 
                Here’s an example that runs a task every day at a specific time:
            """.trimIndent(),
            modifier = Modifier.padding(vertical = 8.dp)
        )

        // Code Example for Scheduling Tasks
        Text(
            text = "Task Scheduling Script",
            fontWeight = FontWeight.Bold,
            style = androidx.compose.material3.MaterialTheme.typography.headlineMedium,
            modifier = Modifier.padding(vertical = 8.dp)
        )
        SelectionContainer {
            BasicText(
                text = """
                import schedule
                import time

                def job():
                    print("Task is running...")

                # Schedule the job every day at 10:00 AM
                schedule.every().day.at("10:00").do(job)

                while True:
                    schedule.run_pending()
                    time.sleep(1)

                # This script schedules a task to run daily at 10:00 AM. The `job` function will be executed at that time.
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
                In this lesson, we explored how to automate various tasks using Python. 
                We covered file handling, sending emails, web scraping, and scheduling tasks. 
                Automation can greatly enhance productivity and reduce the chances of human error in repetitive tasks.
            """.trimIndent(),
            modifier = Modifier.padding(vertical = 8.dp)
        )

        Spacer(modifier = Modifier.height(32.dp))

        // Button to navigate to the next lesson
        Button(onClick = { navController.navigate("lesson12") }) {
            Text(text = "Next Lesson")
        }
    }
}
