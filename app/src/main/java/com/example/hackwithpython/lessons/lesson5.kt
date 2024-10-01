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
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.unit.dp
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.hackwithpython.HackerBlack
import com.example.hackwithpython.HackerWhite

@Composable
fun Lesson5Screen(navController: NavController) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
            .verticalScroll(rememberScrollState()),
        verticalArrangement = Arrangement.Top
    ) {
        // Lesson Title
        Text(
            text = "Lesson 5: Web Scraping with Python",
            fontWeight = FontWeight.Bold,
            style = MaterialTheme.typography.headlineLarge,
            modifier = Modifier.padding(8.dp),
            color = MaterialTheme.colorScheme.primary
        )

        Spacer(modifier = Modifier.height(16.dp))

        // Introduction to Web Scraping
        Text(
            text = """
                Web scraping refers to the technique of extracting data from websites. With Python, web scraping becomes much easier due to the powerful libraries available like `BeautifulSoup`, `Selenium`, and `Scrapy`.
                
                In this lesson, we'll focus on `BeautifulSoup`, a Python library that allows us to parse HTML and XML documents and extract data in a structured way.
            """.trimIndent(),
            style = MaterialTheme.typography.bodyLarge,
            color = MaterialTheme.colorScheme.onBackground
        )

        Spacer(modifier = Modifier.height(16.dp))

        // What is Web Scraping
        Text(
            text = "1. What is Web Scraping?",
            style = MaterialTheme.typography.titleMedium,
            fontWeight = FontWeight.Bold,
            color = MaterialTheme.colorScheme.secondary
        )
        Text(
            text = """
                Web scraping is a process used to extract large amounts of data from websites where data is not readily available for download. With scraping, we can collect information about products, services, market trends, and much more directly from the web.

                For example, instead of manually copying product prices from an e-commerce website, we can use a Python script to automate this task and gather hundreds or thousands of product details within seconds.
            """.trimIndent(),
            style = MaterialTheme.typography.bodySmall,
            textAlign = TextAlign.Start,
            color = MaterialTheme.colorScheme.onBackground
        )

        Spacer(modifier = Modifier.height(16.dp))

        // Why Web Scraping is Useful
        Text(
            text = "2. Why Web Scraping?",
            style = MaterialTheme.typography.titleMedium,
            fontWeight = FontWeight.Bold,
            color = MaterialTheme.colorScheme.secondary
        )
        Text(
            text = """
                Web scraping helps to automate the data collection process, which can be extremely useful in fields like:
                - **Market Research**: Gathering data about competitors, pricing trends, customer reviews, etc.
                - **Data Aggregation**: Combining data from multiple sources for better insights.
                - **Machine Learning**: Collecting training data for NLP models or other AI/ML algorithms.
            """.trimIndent(),
            style = MaterialTheme.typography.bodySmall,
            textAlign = TextAlign.Start,
            color = MaterialTheme.colorScheme.onBackground
        )

        Spacer(modifier = Modifier.height(16.dp))

        // Setting Up for Web Scraping
        Text(
            text = "3. Setting Up Web Scraping Environment",
            style = MaterialTheme.typography.titleMedium,
            fontWeight = FontWeight.Bold,
            color = MaterialTheme.colorScheme.secondary
        )
        Text(
            text = """
                Before we can start scraping, we need to install a few libraries:

                ```bash
                pip install beautifulsoup4 requests
                ```

                - **BeautifulSoup**: Helps in parsing the HTML content.
                - **Requests**: Used for sending HTTP requests to websites.
            """.trimIndent(),
            style = MaterialTheme.typography.bodySmall,
            textAlign = TextAlign.Start,
            color = MaterialTheme.colorScheme.onBackground
        )

        Spacer(modifier = Modifier.height(16.dp))

        // Steps for Web Scraping
        Text(
            text = "4. Steps to Scrape a Website",
            style = MaterialTheme.typography.titleMedium,
            fontWeight = FontWeight.Bold,
            color = MaterialTheme.colorScheme.secondary
        )
        Text(
            text = """
                Here are the general steps involved in scraping a website:
                1. **Send a Request**: Use the `requests` library to get the content of the website.
                2. **Parse the Data**: Use `BeautifulSoup` to navigate the HTML structure and extract relevant data.
                3. **Handle Data**: Clean, structure, or save the data as needed (CSV, JSON, etc.).

                Below is an example of a Python script that scrapes data from a webpage:
            """.trimIndent(),
            style = MaterialTheme.typography.bodySmall,
            textAlign = TextAlign.Start,
            color = MaterialTheme.colorScheme.onBackground
        )

        Spacer(modifier = Modifier.height(8.dp))

        // Code Example
        SelectionContainer{
            BasicText(text =
                """
                    import requests
                    from bs4 import BeautifulSoup
    
                    url = "https://example.com"
                    response = requests.get(url)
    
                    # Parsing the HTML content
                    soup = BeautifulSoup(response.content, "html.parser")
    
                    # Extracting data (example: extracting all links from the page)
                    for link in soup.find_all('a'):
                        print(link.get('href'))
    
                    #Explanation:
                    #- We use `requests.get()` to fetch the HTML content of the webpage.
                    #- `BeautifulSoup` is used to parse the HTML, making it easier to navigate and extract specific elements.
                    #- The `find_all('a')` method extracts all anchor tags (`<a>`), which are typically used for links
                """.trimIndent()
                ,
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

        // Dealing with Dynamic Content
        Text(
            text = "5. Dealing with Dynamic Content",
            style = MaterialTheme.typography.titleMedium,
            fontWeight = FontWeight.Bold,
            color = MaterialTheme.colorScheme.secondary
        )
        Text(
            text = """
                Some websites load data dynamically using JavaScript. In such cases, `BeautifulSoup` may not be sufficient since the content is not immediately available in the HTML. For these sites, we need to use tools like **Selenium**, which simulates browser actions.

                Here's an example using Selenium:
            """.trimIndent(),
            style = MaterialTheme.typography.bodySmall,
            textAlign = TextAlign.Start,
            color = MaterialTheme.colorScheme.onBackground
        )

        Spacer(modifier = Modifier.height(8.dp))

        // Selenium Code Example
        SelectionContainer {
            BasicText(
                text = """
                    
                    from selenium import webdriver
    
                    # Create a new instance of the Firefox driver
                    driver = webdriver.Firefox()
    
                    # Navigate to the webpage
                    driver.get("https://example.com")
    
                    # Extract dynamic content
                    element = driver.find_element_by_xpath("//div[@id='content']")
                    print(element.text)
    
                    driver.quit()
    
                    #**Explanation**:
                    #- `webdriver.Firefox()` initializes a new Firefox browser.
                    #- `get()` loads the specified URL.
                    #- `find_element_by_xpath()` locates an element using an XPath query, useful for extracting data from dynamically loaded sections.
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

        // Legal and Ethical Considerations
        Text(
            text = "6. Legal and Ethical Considerations",
            style = MaterialTheme.typography.titleMedium,
            fontWeight = FontWeight.Bold,
            color = MaterialTheme.colorScheme.secondary
        )
        Text(
            text = """
                While web scraping is a powerful tool, it's important to keep in mind the legal and ethical implications. Many websites have **Terms of Service** that explicitly forbid scraping, especially if it results in excessive server load or is used for malicious purposes.
                
                Always ensure that you're allowed to scrape the website and respect the **robots.txt** file, which dictates which parts of a site are open to crawlers.
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
        Button(onClick = {navController.navigate("lesson6")},
            modifier = Modifier.padding(16.dp)) {
            Text(text = "Next Lesson")
            }
        }
    }
}
