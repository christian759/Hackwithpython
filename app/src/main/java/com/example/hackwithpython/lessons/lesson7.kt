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
fun Lesson7Screen(navController: NavController) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
            .verticalScroll(rememberScrollState()),
        verticalArrangement = Arrangement.Top
    ) {
        // Lesson Title
        Text(
            text = "Lesson 7: Working with APIs",
            fontWeight = FontWeight.Bold,
            style = MaterialTheme.typography.headlineLarge,
            modifier = Modifier.padding(8.dp),
            color = MaterialTheme.colorScheme.primary
        )

        Spacer(modifier = Modifier.height(16.dp))

        // Introduction
        Text(
            text = """
                APIs (Application Programming Interfaces) allow applications to communicate with one another. As a hacker, understanding APIs is crucial for various reasons, including data extraction, vulnerability testing, and leveraging third-party services.
                
                In this lesson, we will explore how to interact with APIs effectively, discover potential security flaws, and understand common techniques used in API exploitation.
            """.trimIndent(),
            style = MaterialTheme.typography.bodyLarge,
            color = MaterialTheme.colorScheme.onBackground
        )

        Spacer(modifier = Modifier.height(16.dp))

        // What is an API?
        Text(
            text = "1. What is an API?",
            style = MaterialTheme.typography.titleMedium,
            fontWeight = FontWeight.Bold,
            color = MaterialTheme.colorScheme.secondary
        )
        Text(
            text = """
                An API provides a set of rules that allows software programs to communicate. APIs often expose data in structured formats like JSON or XML, which makes it easier for hackers to automate tasks such as data scraping, testing, and reconnaissance.
                
                Understanding how to make API calls will enable you to gather intelligence on your target or integrate functionality into your own applications.
            """.trimIndent(),
            style = MaterialTheme.typography.bodySmall,
            textAlign = TextAlign.Start,
            color = MaterialTheme.colorScheme.onBackground
        )

        Spacer(modifier = Modifier.height(16.dp))

        // Basic API Request Example
        Text(
            text = "2. Making Basic API Requests",
            style = MaterialTheme.typography.titleMedium,
            fontWeight = FontWeight.Bold,
            color = MaterialTheme.colorScheme.secondary
        )
        Text(
            text = """
                You can interact with APIs using Python's `requests` library. Here's how to make a simple GET request:
            """.trimIndent(),
            style = MaterialTheme.typography.bodySmall,
            textAlign = TextAlign.Start,
            color = MaterialTheme.colorScheme.onBackground
        )

        Spacer(modifier = Modifier.height(8.dp))

        // Basic API Request Code
        Text(
            text = """
                ```python
                import requests

                url = "https://api.example.com/data"
                response = requests.get(url)

                if response.status_code == 200:
                    data = response.json()
                    print(data)
                else:
                    print("Failed to retrieve data:", response.status_code)
                ```

                This basic script demonstrates:
                - Sending a GET request to an API endpoint.
                - Checking the response status and printing the data if successful.
            """.trimIndent(),
            style = MaterialTheme.typography.bodySmall,
            textAlign = TextAlign.Start,
            color = MaterialTheme.colorScheme.onBackground
        )

        Spacer(modifier = Modifier.height(16.dp))

        // API Endpoints and Parameters
        Text(
            text = "3. Understanding API Endpoints and Parameters",
            style = MaterialTheme.typography.titleMedium,
            fontWeight = FontWeight.Bold,
            color = MaterialTheme.colorScheme.secondary
        )
        Text(
            text = """
                APIs are divided into endpoints, each serving a specific function. By manipulating these endpoints and their parameters, you can gather a variety of data. Hackers often probe endpoints to discover unintended functionalities or vulnerabilities.

                Here’s how to send parameters with your requests:
            """.trimIndent(),
            style = MaterialTheme.typography.bodySmall,
            textAlign = TextAlign.Start,
            color = MaterialTheme.colorScheme.onBackground
        )

        Spacer(modifier = Modifier.height(8.dp))

        // API with Parameters Example
        Text(
            text = """
                ```python
                import requests

                url = "https://api.openweathermap.org/data/2.5/weather"
                params = {
                    "q": "London",
                    "appid": "your_api_key"
                }
                response = requests.get(url, params=params)

                if response.status_code == 200:
                    data = response.json()
                    print(data)
                else:
                    print("Error:", response.status_code)
                ```

                In this code:
                - Parameters allow you to specify what data you want.
                - Always sanitize your input to avoid issues like SQL injection.
            """.trimIndent(),
            style = MaterialTheme.typography.bodySmall,
            textAlign = TextAlign.Start,
            color = MaterialTheme.colorScheme.onBackground
        )

        Spacer(modifier = Modifier.height(16.dp))

        // Authentication and Security
        Text(
            text = "4. Authentication and Security",
            style = MaterialTheme.typography.titleMedium,
            fontWeight = FontWeight.Bold,
            color = MaterialTheme.colorScheme.secondary
        )
        Text(
            text = """
                Many APIs require authentication to access their data, typically via API keys or OAuth tokens. Understanding how to manipulate authentication can reveal vulnerabilities.

                Example of an API key in headers:
            """.trimIndent(),
            style = MaterialTheme.typography.bodySmall,
            textAlign = TextAlign.Start,
            color = MaterialTheme.colorScheme.onBackground
        )

        Spacer(modifier = Modifier.height(8.dp))

        // Example with API Key
        Text(
            text = """
                ```python
                headers = {
                    "Authorization": "Bearer your_api_key"
                }
                response = requests.get("https://api.example.com/data", headers=headers)

                if response.status_code == 200:
                    data = response.json()
                    print(data)
                else:
                    print("Authentication failed:", response.status_code)
                ```

                Be aware of:
                - **Exposed API keys**: These can be found in public repositories or via misconfigurations. 
                - **Replay attacks**: Intercepting requests can allow attackers to re-use valid sessions.
            """.trimIndent(),
            style = MaterialTheme.typography.bodySmall,
            textAlign = TextAlign.Start,
            color = MaterialTheme.colorScheme.onBackground
        )

        Spacer(modifier = Modifier.height(16.dp))

        // API Rate Limiting and Denial of Service
        Text(
            text = "5. API Rate Limiting and Denial of Service",
            style = MaterialTheme.typography.titleMedium,
            fontWeight = FontWeight.Bold,
            color = MaterialTheme.colorScheme.secondary
        )
        Text(
            text = """
                Many APIs implement rate limiting to prevent abuse. As a hacker, understanding these limits can be advantageous when attempting to exploit APIs through denial-of-service attacks.

                Here's an example of how to test for rate limits:
            """.trimIndent(),
            style = MaterialTheme.typography.bodySmall,
            textAlign = TextAlign.Start,
            color = MaterialTheme.colorScheme.onBackground
        )

        Spacer(modifier = Modifier.height(8.dp))

        // Rate Limiting Code Example
        Text(
            text = """
                ```python
                import requests
                import time

                url = "https://api.example.com/data"
                for _ in range(100):  # Excessive requests
                    response = requests.get(url)
                    print(response.status_code)
                    time.sleep(0.1)  # Minimal delay to bypass rate limiting
                ```

                Use such techniques with caution. Continuous hitting of endpoints could lead to IP bans or legal action.
            """.trimIndent(),
            style = MaterialTheme.typography.bodySmall,
            textAlign = TextAlign.Start,
            color = MaterialTheme.colorScheme.onBackground
        )

        Spacer(modifier = Modifier.height(16.dp))

        // Error Handling and Exploitation
        Text(
            text = "6. Error Handling and Exploitation",
            style = MaterialTheme.typography.titleMedium,
            fontWeight = FontWeight.Bold,
            color = MaterialTheme.colorScheme.secondary
        )
        Text(
            text = """
                Handling errors correctly can help you identify vulnerabilities. APIs often expose sensitive information in error messages.

                Example of error handling:
            """.trimIndent(),
            style = MaterialTheme.typography.bodySmall,
            textAlign = TextAlign.Start,
            color = MaterialTheme.colorScheme.onBackground
        )

        Spacer(modifier = Modifier.height(8.dp))

        // Error Handling Code Example
        Text(
            text = """
                ```python
                try:
                    response = requests.get("https://api.example.com/data")
                    response.raise_for_status()  # Raises an HTTPError for 4xx/5xx
                    data = response.json()
                    print(data)
                except requests.exceptions.HTTPError as err:
                    print("HTTP error:", err.response.text)  # Potentially sensitive info
                except Exception as err:
                    print("An error occurred:", err)
                ```

                Take note:
                - **Error messages** can reveal backend structures or sensitive data, making them useful for attackers.
                - Always handle exceptions properly to avoid leaking information.
            """.trimIndent(),
            style = MaterialTheme.typography.bodySmall,
            textAlign = TextAlign.Start,
            color = MaterialTheme.colorScheme.onBackground
        )

        Spacer(modifier = Modifier.height(16.dp))

        // Conclusion
        Text(
            text = "7. Conclusion",
            style = MaterialTheme.typography.titleMedium,
            fontWeight = FontWeight.Bold,
            color = MaterialTheme.colorScheme.secondary
        )
        Text(
            text = """
                Understanding APIs is vital for any hacker or developer. They offer powerful ways to access data and services but can also expose vulnerabilities.

                In the next lesson, we will delve into interacting with databases and understanding how to store and retrieve data securely in your applications.
            """.trimIndent(),
            style = MaterialTheme.typography.bodySmall,
            textAlign = TextAlign.Start,
            color = MaterialTheme.colorScheme.onBackground
        )

        Spacer(modifier = Modifier.height(32.dp))

        // Button to navigate to the next lesson
        Button(onClick = { navController.navigate("lesson8") }) {
            Text(text = "Next Lesson: Interacting with Databases")
        }
    }
}
