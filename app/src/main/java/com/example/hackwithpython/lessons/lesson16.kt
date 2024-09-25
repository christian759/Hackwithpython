package com.example.hackwithpython.lessons

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Button
import androidx.compose.ui.Modifier
import androidx.compose.runtime.Composable
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController

@Composable
fun Lesson16Screen(navController: NavController) {
    Column(modifier = Modifier.padding(16.dp)
            .verticalScroll(rememberScrollState())) {
        Text(
            text = "Lesson 16: Web Application Security Testing",
            fontWeight = FontWeight.Bold,
            style = androidx.compose.material3.MaterialTheme.typography.headlineMedium,
            modifier = Modifier.padding(vertical = 8.dp)
        )

        // Introduction Section
        Text(
            text = """
                Web applications are a primary target for attackers due to their accessibility and the valuable data they often hold. 
                Conducting security testing on web applications is essential to identify vulnerabilities and ensure the application 
                is resistant to various forms of attack. In this lesson, we will explore advanced techniques for testing web 
                application security, including tools and methodologies commonly used in the industry.
            """.trimIndent(),
            modifier = Modifier.padding(vertical = 8.dp)
        )

        // Importance of Web Application Security Testing
        Text(
            text = "Importance of Web Application Security Testing",
            fontWeight = FontWeight.Bold,
            style = androidx.compose.material3.MaterialTheme.typography.headlineMedium,
            modifier = Modifier.padding(vertical = 8.dp)
        )
        Text(
            text = """
                Web applications are often susceptible to various vulnerabilities such as SQL injection, cross-site scripting (XSS), 
                and cross-site request forgery (CSRF). The consequences of these vulnerabilities can be severe, including data breaches, 
                loss of customer trust, and significant financial damage. Regular security testing helps organizations:
                - Identify and mitigate vulnerabilities before attackers can exploit them.
                - Comply with legal and regulatory requirements for data protection.
                - Enhance the overall security posture of the web application.
            """.trimIndent(),
            modifier = Modifier.padding(vertical = 8.dp)
        )

        // Common Web Application Vulnerabilities
        Text(
            text = "Common Web Application Vulnerabilities",
            fontWeight = FontWeight.Bold,
            style = androidx.compose.material3.MaterialTheme.typography.headlineMedium,
            modifier = Modifier.padding(vertical = 8.dp)
        )
        Text(
            text = """
                Understanding common vulnerabilities is crucial for effective security testing. Some prevalent vulnerabilities include:
                - **SQL Injection**: Attackers manipulate SQL queries to execute arbitrary commands. 
                  Example: Injecting malicious SQL code through input fields to retrieve sensitive information from the database.
                - **Cross-Site Scripting (XSS)**: Attackers inject malicious scripts into web pages viewed by users, 
                  enabling them to steal session cookies or redirect users to malicious sites.
                - **Cross-Site Request Forgery (CSRF)**: Attackers trick users into executing unwanted actions on a different site 
                  where they are authenticated, potentially compromising their account.
                - **Insecure Direct Object References (IDOR)**: Users can access unauthorized resources by manipulating URL parameters.
                - **Security Misconfiguration**: Poorly configured web servers, databases, or frameworks can lead to vulnerabilities.
            """.trimIndent(),
            modifier = Modifier.padding(vertical = 8.dp)
        )

        // Advanced Testing Techniques
        Text(
            text = "Advanced Testing Techniques",
            fontWeight = FontWeight.Bold,
            style = androidx.compose.material3.MaterialTheme.typography.headlineMedium,
            modifier = Modifier.padding(vertical = 8.dp)
        )
        Text(
            text = """
                Several advanced techniques can be employed to test web application security:
                - **Automated Scanning**: Using tools like OWASP ZAP or Burp Suite to perform automated security scans on web applications. 
                  These tools can identify common vulnerabilities and provide detailed reports.
                - **Manual Testing**: Skilled testers perform manual testing to identify vulnerabilities that automated tools may miss. 
                  This includes inspecting the application logic, reviewing source code, and attempting to exploit identified weaknesses.
                - **Fuzz Testing**: Sending random data (fuzz) to the application to observe how it handles unexpected input. 
                  This technique helps uncover input validation issues and crashes.
                - **Penetration Testing**: Simulating real-world attacks on the application to identify security weaknesses. 
                  This involves using a combination of automated tools and manual techniques to exploit vulnerabilities.
                - **API Security Testing**: Testing the security of APIs that the web application uses, ensuring they are protected against unauthorized access and data leaks.
            """.trimIndent(),
            modifier = Modifier.padding(vertical = 8.dp)
        )

        // Practical Python Example: SQL Injection Test
        Text(
            text = "Practical Example: SQL Injection Test",
            fontWeight = FontWeight.Bold,
            style = androidx.compose.material3.MaterialTheme.typography.headlineMedium,
            modifier = Modifier.padding(vertical = 8.dp)
        )
        Text(
            text = """
                Below is a simple Python script that demonstrates a basic SQL injection test using the 'sqlite3' library. 
                This example is for educational purposes only. Use responsibly and ethically.
            """.trimIndent(),
            modifier = Modifier.padding(vertical = 8.dp)
        )
        Text(
            text = "Python Code:",
            fontWeight = FontWeight.Bold,
            modifier = Modifier.padding(vertical = 8.dp)
        )
        Text(
            text = """
                ```python
                import sqlite3

                # Function to demonstrate SQL injection
                def sql_injection_demo(user_input):
                    # Connect to the SQLite database
                    conn = sqlite3.connect('example.db')
                    cursor = conn.cursor()

                    # Crafting a SQL injection query
                    query = f"SELECT * FROM users WHERE username = '{user_input}'"
                    cursor.execute(query)

                    # Fetching results
                    results = cursor.fetchall()
                    return results

                # Example usage
                # Normally, user input would be sanitized before using in SQL queries.
                # Here, we simulate an injection attack.
                attack_input = "' OR '1'='1"
                print(sql_injection_demo(attack_input))
                ```
            """.trimIndent(),
            modifier = Modifier.padding(vertical = 8.dp)
        )
        Text(
            text = """
                In this example, the function `sql_injection_demo` simulates an SQL injection attack. 
                The `attack_input` variable contains a typical SQL injection payload that manipulates the query logic to return all users.
                Always ensure to use prepared statements to avoid such vulnerabilities in real applications.
            """.trimIndent(),
            modifier = Modifier.padding(vertical = 8.dp)
        )

        // Tools for Web Application Security Testing
        Text(
            text = "Tools for Web Application Security Testing",
            fontWeight = FontWeight.Bold,
            style = androidx.compose.material3.MaterialTheme.typography.headlineMedium,
            modifier = Modifier.padding(vertical = 8.dp)
        )
        Text(
            text = """
                Several tools can assist in web application security testing:
                - **OWASP ZAP**: An open-source web application security scanner that helps find security vulnerabilities automatically.
                - **Burp Suite**: A powerful platform for performing security testing of web applications, combining automated scanners with manual tools.
                - **Nessus**: A vulnerability scanner that detects potential vulnerabilities in web applications and networks.
                - **Acunetix**: A web application security scanner that automatically scans for vulnerabilities like SQL Injection, XSS, and more.
                - **Postman**: While primarily an API development tool, it can be used for API security testing through automated testing scripts.
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
                In this lesson, we explored advanced techniques for testing web application security, focusing on common vulnerabilities 
                and methodologies for identifying and mitigating them. By leveraging both automated and manual testing techniques, 
                organizations can significantly enhance their security posture. In the next lesson, we will cover advanced network 
                security concepts to further enrich your knowledge in ethical hacking.
            """.trimIndent(),
            modifier = Modifier.padding(vertical = 8.dp)
        )

        Spacer(modifier = Modifier.height(32.dp))

        // Button to navigate to the next lesson
        Button(onClick = { navController.navigate("lesson17") }) {
            Text(text = "Next Lesson")
        }
    }
}
