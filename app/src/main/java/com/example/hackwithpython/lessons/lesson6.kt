package com.example.hackwithpython.lessons

import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.text.BasicText
import androidx.compose.foundation.text.selection.SelectionContainer
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.modifier.modifierLocalMapOf
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.unit.dp
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.hackwithpython.HackerWhite

@Composable
fun Lesson6Screen(navController: NavController) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
            .verticalScroll(rememberScrollState()),
        verticalArrangement = Arrangement.Top
    ) {
        // Lesson Title
        Text(
            text = "Lesson 6: Advanced Web Scraping",
            fontWeight = FontWeight.Bold,
            style = MaterialTheme.typography.headlineLarge,
            modifier = Modifier.padding(8.dp),
            color = MaterialTheme.colorScheme.primary
        )

        Spacer(modifier = Modifier.height(16.dp))

        // Introduction
        Text(
            text = """
                In the previous lesson, we explored the basics of web scraping using `BeautifulSoup` and `requests`. Now, we will dive deeper into advanced scraping techniques such as scraping dynamic content, handling JavaScript-heavy websites, managing sessions, handling CAPTCHAs, and rate limiting.
                
                This lesson will help you go beyond basic scraping and tackle more complex scenarios you might encounter when dealing with modern websites.
            """.trimIndent(),
            style = MaterialTheme.typography.bodyLarge,
            color = MaterialTheme.colorScheme.onBackground
        )

        Spacer(modifier = Modifier.height(16.dp))

        // Scraping Dynamic Content
        Text(
            text = "1. Scraping Dynamic Content",
            style = MaterialTheme.typography.titleMedium,
            fontWeight = FontWeight.Bold,
            color = MaterialTheme.colorScheme.secondary
        )
        Text(
            text = """
                Many websites today load content dynamically using JavaScript frameworks like React, Angular, or Vue. This means the initial HTML source you download might not contain the data you're looking for, as it is populated after the page is loaded.

                To scrape such content, we use tools like **Selenium** or **Playwright**, which simulate a browser and allow you to interact with the page like a real user. Here's a brief example using Selenium:
            """.trimIndent(),
            style = MaterialTheme.typography.bodySmall,
            textAlign = TextAlign.Start,
            color = MaterialTheme.colorScheme.onBackground
        )

        Spacer(modifier = Modifier.height(8.dp))

        // Selenium Example for Dynamic Content
        SelectionContainer {
            BasicText(
                text =
                """
                    from selenium import webdriver
                    from selenium.webdriver.common.by import By
    
                    driver = webdriver.Chrome()
    
                    driver.get("https://example.com")
    
                    # Wait for the page to load
                    driver.implicitly_wait(10)
    
                    # Extract data
                    dynamic_element = driver.find_element(By.XPATH, "//div[@id='dynamic-content']")
                    print(dynamic_element.text)
    
                    driver.quit()
    
                    #In this code:
                    #- We use Selenium's `find_element` function to locate the dynamically loaded content.
                    #- The script waits for the page to load, ensuring that JavaScript has populated the required elements.
                """.trimIndent(),
                style = TextStyle(
                    fontFamily = FontFamily.Monospace,
                    fontSize = 14.sp,
                    color = HackerWhite
                ),
                modifier = Modifier
                    .padding(12.dp)
                    .horizontalScroll(rememberScrollState())
                )
            }

        Spacer(modifier = Modifier.height(16.dp))

        // Managing Sessions and Cookies
        Text(
            text = "2. Managing Sessions and Cookies",
            style = MaterialTheme.typography.titleMedium,
            fontWeight = FontWeight.Bold,
            color = MaterialTheme.colorScheme.secondary
        )
        Text(
            text = """
                Many websites require a session to stay logged in, especially if you're scraping after login or interacting with authenticated pages. Python's `requests` library allows you to manage cookies and sessions seamlessly using the `requests.Session()` object.

                Example of session management:
            """.trimIndent(),
            style = MaterialTheme.typography.bodySmall,
            textAlign = TextAlign.Start,
            color = MaterialTheme.colorScheme.onBackground
        )

        Spacer(modifier = Modifier.height(8.dp))

        // Session Management Example
        SelectionContainer {
            BasicText(
                text =
                """
                    import requests
    
                    session = requests.Session()
    
                    # Log in to a website (POST request)
                    
                    login_url = "https://example.com/login"
                    payload = {"username": "user", "password": "pass"}
                    session.post(login_url, data=payload)
    
                    # Scrape data while logged in
                    
                    response = session.get("https://example.com/dashboard")
                    print(response.content)
    
                    #- The `session` object stores cookies and handles requests.
                    #- Once logged in, you can scrape any page that requires authentication.
                """.trimIndent(),
                style = TextStyle(
                    fontFamily = FontFamily.Monospace,
                    fontSize = 14.sp,
                    color = HackerWhite
                ),
                modifier = Modifier
                    .padding(12.dp)
                    .horizontalScroll(rememberScrollState())
            )
        }

        Spacer(modifier = Modifier.height(16.dp))

        // Handling CAPTCHAs
        Text(
            text = "3. Handling CAPTCHAs",
            style = MaterialTheme.typography.titleMedium,
            fontWeight = FontWeight.Bold,
            color = MaterialTheme.colorScheme.secondary
        )
        Text(
            text = """
                Some websites implement CAPTCHAs to prevent automated scraping. While solving CAPTCHAs programmatically can be challenging, there are services like **2Captcha** and **Anti-Captcha** that can be integrated to bypass them.

                However, be cautious when using such services, as bypassing CAPTCHAs without permission can lead to legal consequences.
            """.trimIndent(),
            style = MaterialTheme.typography.bodySmall,
            textAlign = TextAlign.Start,
            color = MaterialTheme.colorScheme.onBackground
        )

        Spacer(modifier = Modifier.height(16.dp))

        // Rate Limiting and Avoiding Detection
        Text(
            text = "4. Rate Limiting and Avoiding Detection",
            style = MaterialTheme.typography.titleMedium,
            fontWeight = FontWeight.Bold,
            color = MaterialTheme.colorScheme.secondary
        )
        Text(
            text = """
                Websites can detect scraping activities and may block your IP if requests are too frequent. To avoid detection:
                - **Respect robots.txt**: Always check if the website's robots.txt file allows scraping.
                - **Rate limiting**: Add delays between requests using `time.sleep()` to mimic human-like behavior.
                - **Rotate User Agents**: Use different user-agent strings for each request to disguise your scraper as a regular browser.
                - **Proxy usage**: Rotate through different IP addresses using proxy services to avoid getting blocked.
            """.trimIndent(),
            style = MaterialTheme.typography.bodySmall,
            textAlign = TextAlign.Start,
            color = MaterialTheme.colorScheme.onBackground
        )

        Spacer(modifier = Modifier.height(8.dp))

        // Code Example with Rate Limiting and User-Agent Rotation
        SelectionContainer {
            BasicText(
                text = """
                   
                    import requests
                    import random
                    import time
    
                    user_agents = [
                        "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/91.0.4472.124 Safari/537.36",
                        "Mozilla/5.0 (X11; Ubuntu; Linux x86_64; rv:89.0) Gecko/20100101 Firefox/89.0",
                        # Add more user agents
                    ]
    
                    url = "https://example.com"
    
                    for i in range(10):  # Scraping 10 pages
                        headers = {"User-Agent": random.choice(user_agents)}
                        response = requests.get(url, headers=headers)
                        print(response.status_code)
    
                        # Rate limit
                        time.sleep(random.uniform(3, 6))  # Sleep for 3 to 6 seconds
    
                    #In this code:
                    #- We randomly choose a user agent for each request to avoid detection.
                    #- We also introduce a delay using `time.sleep()` to slow down our scraping and mimic human behavior.
                """.trimIndent(),
                style = TextStyle(
                    fontSize = 14.sp,
                    fontFamily = FontFamily.Monospace,
                    color = HackerWhite
                ),
                modifier = Modifier
                    .padding(12.dp)
                    .horizontalScroll(rememberScrollState())
            )
        }

        Spacer(modifier = Modifier.height(16.dp))

        // Conclusion
        Text(
            text = "5. Conclusion",
            style = MaterialTheme.typography.titleMedium,
            fontWeight = FontWeight.Bold,
            color = MaterialTheme.colorScheme.secondary
        )
        Text(
            text = """
                Advanced web scraping requires understanding not only how to extract content from static pages but also how to deal with dynamic content, manage sessions, bypass CAPTCHAs, and respect the limits of web servers. While web scraping is a powerful tool, always ensure you scrape ethically and responsibly.
                
                In the next lesson, we will dive into working with APIs to extract data more efficiently without the need for web scraping.
            """.trimIndent(),
            style = MaterialTheme.typography.bodySmall,
            textAlign = TextAlign.Start,
            color = MaterialTheme.colorScheme.onBackground
        )

        Spacer(modifier = Modifier.height(32.dp))

        // Button to navigate to next lesson
        Row {
        Button(onClick = {navController.navigate("lessons")},
            modifier = Modifier.padding(16.dp)){
            Text(text = "Home")
        }
        Button(onClick = {navController.navigate("lesson7")},
            modifier = Modifier.padding(16.dp)) {
            Text(text = "Next Lesson")
            }
        }
    }
}
