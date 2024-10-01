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
fun Project4Screen(navController: NavController) {
    Column(modifier = Modifier
        .padding(16.dp)
    .verticalScroll(rememberScrollState()),
        verticalArrangement = Arrangement.Top,
        horizontalAlignment = Alignment.Start) {
        Text(
            text = "Project 4: Web Scraping for Vulnerabilities",
            fontWeight = FontWeight.Bold,
            style = androidx.compose.material3.MaterialTheme.typography.headlineMedium,
            modifier = Modifier.padding(vertical = 8.dp)
        )

        // Project Introduction
        Text(
            text = """
                In this project, you will learn how to automate the detection of web vulnerabilities 
                by scraping websites and analyzing their content using Python and BeautifulSoup. 
                You will learn to identify common vulnerabilities such as insecure forms, exposed sensitive information, 
                and outdated software versions by scraping website data and performing analysis on it.
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
                - **BeautifulSoup**: A Python library used for scraping and parsing HTML and XML documents.
                - **Requests**: A library that allows you to send HTTP requests to websites to retrieve their content.
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
                   Install `beautifulsoup4` and `requests` via pip.
                   ```bash
                   pip install beautifulsoup4 requests
                   ```
                """)
        SelectionContainer {
            BasicText(
                text = """
                   # Use the `requests` library to retrieve the content of a website.
                   import requests
                   
                   url = "https://example.com"
                   response = requests.get(url)

                   if response.status_code == 200:
                       print("Website content retrieved successfully")
                   else:
                       print("Failed to retrieve website content")

                   # Use BeautifulSoup to parse and extract data from the HTML content of the website.
                   from bs4 import BeautifulSoup

                   soup = BeautifulSoup(response.text, "html.parser")

                   # Example: Extract all form elements
                   forms = soup.find_all("form")
                   for form in forms:
                       print(f"Form action: {form.get('action')}, Method: {form.get('method')}")
                   

                   # Analyze the website for common vulnerabilities. For example, detecting insecure forms that don't use HTTPS
                   
                   insecure_forms = []
                   for form in forms:
                       if form.get('action') and not form.get('action').startswith("https"):
                           insecure_forms.append(form)

                   print(f"Found {len(insecure_forms)} insecure forms")
                   
                   
                   # Scrape version numbers of known CMS (Content Management System) or software and compare them with the latest version
                   version_tags = soup.find_all(text=lambda text: "version" in text.lower())

                   for tag in version_tags:
                       print(f"Potential software version: {tag}")
                  
                   #Set up a loop to continuously scrape and analyze multiple websites for vulnerabilities.
                   websites = ["https://example1.com", "https://example2.com"]
                   for website in websites:
                       response = requests.get(website)
                       soup = BeautifulSoup(response.text, "html.parser")
                       
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

        // Ethical Considerations Section
        Text(
            text = "Ethical Considerations",
            fontWeight = FontWeight.Bold,
            style = androidx.compose.material3.MaterialTheme.typography.headlineMedium,
            modifier = Modifier.padding(vertical = 8.dp)
        )
        Text(
            text = """
                As always, ensure that you have explicit permission from website owners before scraping or testing their websites for vulnerabilities. 
                Unauthorized web scraping or vulnerability testing may violate legal and ethical standards, leading to severe consequences.
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
                In this project, you learned how to use Python and BeautifulSoup to scrape websites and analyze them for vulnerabilities. 
                This tool can be further expanded to include more advanced analysis techniques, but it's essential to adhere to legal and ethical standards when performing such tests.
            """.trimIndent(),
            modifier = Modifier.padding(vertical = 8.dp)
        )

        Spacer(modifier = Modifier.height(32.dp))

        // Button to navigate to the next project
        Button(onClick = { navController.navigate("project5") }) {
            Text(text = "Next Project")
        }
    }
}
