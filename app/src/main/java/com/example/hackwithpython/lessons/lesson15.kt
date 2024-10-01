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
fun Lesson15Screen(navController: NavController) {
    Column(modifier = Modifier.padding(16.dp)
            .verticalScroll(rememberScrollState()),) {
        Text(
            text = "Lesson 15: Social Engineering Techniques",
            fontWeight = FontWeight.Bold,
            style = androidx.compose.material3.MaterialTheme.typography.headlineMedium,
            modifier = Modifier.padding(vertical = 8.dp)
        )

        // Introduction Section
        Text(
            text = """
                Social engineering is the art of manipulating people into revealing confidential information. 
                Unlike technical hacking, which exploits system vulnerabilities, social engineering takes advantage of human psychology. 
                Attackers rely on social interactions, emotional responses, and the natural tendency of people to trust others. 
                In this lesson, we will delve into various social engineering techniques, the psychological principles behind them, 
                and effective strategies to protect against such attacks.
            """.trimIndent(),
            modifier = Modifier.padding(vertical = 8.dp)
        )

        // Understanding Social Engineering
        Text(
            text = "Understanding Social Engineering",
            fontWeight = FontWeight.Bold,
            style = androidx.compose.material3.MaterialTheme.typography.headlineMedium,
            modifier = Modifier.padding(vertical = 8.dp)
        )
        Text(
            text = """
                Social engineering can be defined as a non-technical method of intrusion that relies heavily on human interaction 
                and often involves tricking people into breaking normal security procedures. The ultimate goal is to gain access 
                to sensitive data or systems by exploiting the trust and naivety of individuals. Some common techniques include:
                - **Phishing**: Deceptive emails or messages that appear to come from reputable sources to steal sensitive information.
                - **Pretexting**: Creating a fabricated scenario to obtain personal information from a target.
                - **Baiting**: Offering something enticing to lure victims into a trap that compromises their security.
                - **Tailgating**: Gaining unauthorized access to a restricted area by following someone who is authorized.
                - **Spear Phishing**: A targeted attempt to steal sensitive information from a specific individual or organization, often for malicious reasons.
                - **Vishing**: Voice phishing, where attackers use phone calls to trick victims into revealing personal information.
            """.trimIndent(),
            modifier = Modifier.padding(vertical = 8.dp)
        )

        // Psychological Principles
        Text(
            text = "Psychological Principles",
            fontWeight = FontWeight.Bold,
            style = androidx.compose.material3.MaterialTheme.typography.headlineMedium,
            modifier = Modifier.padding(vertical = 8.dp)
        )
        Text(
            text = """
                Social engineering exploits several psychological principles, including:
                - **Authority**: People are more likely to comply with requests from individuals perceived as authority figures. 
                  This principle can be manipulated by attackers posing as executives or IT staff.
                - **Urgency**: Creating a sense of urgency can compel individuals to act quickly without thinking. 
                  For instance, an attacker may create an email stating that account access will be suspended unless immediate action is taken.
                - **Scarcity**: Limited availability can create pressure, leading individuals to make poor security decisions. 
                  An attacker might say that a special offer is only available for a short time.
                - **Social Proof**: People tend to follow the actions of others, especially in uncertain situations. 
                  An attacker may mention that "everyone is doing this" to encourage compliance.
                - **Familiarity**: Familiarity breeds trust. Attackers often impersonate someone the victim knows or trusts to gain their confidence.
            """.trimIndent(),
            modifier = Modifier.padding(vertical = 8.dp)
        )

        // Common Social Engineering Techniques
        Text(
            text = "Common Social Engineering Techniques",
            fontWeight = FontWeight.Bold,
            style = androidx.compose.material3.MaterialTheme.typography.headlineMedium,
            modifier = Modifier.padding(vertical = 8.dp)
        )
        Text(
            text = """
                Below are some of the most common social engineering techniques employed by attackers:
                - **Phishing Emails**: Emails that appear legitimate but contain malicious links or attachments. 
                  For instance, an email from a "bank" requesting account verification could lead to a phishing site.
                - **Phone Scams (Vishing)**: Attackers impersonate legitimate entities over the phone to extract sensitive information. 
                  They might pose as bank representatives asking for your account details.
                - **Fake Websites**: Creating replicas of legitimate websites to deceive users into providing personal data. 
                  An attacker might use a URL resembling a bank’s site to trick users.
                - **USB Drop**: Leaving infected USB drives in public places to entice individuals to plug them into their computers. 
                  The USB might contain malware that compromises the user's system.
                - **Pretexting Scenarios**: Attackers create a false identity and scenario to convince the victim to divulge information. 
                  For example, posing as an IT support agent needing to verify employee credentials.
            """.trimIndent(),
            modifier = Modifier.padding(vertical = 8.dp)
        )

        // Practical Python Example: Phishing Email Simulation
        Text(
            text = "Practical Example: Phishing Email Simulation",
            fontWeight = FontWeight.Bold,
            style = androidx.compose.material3.MaterialTheme.typography.headlineMedium,
            modifier = Modifier.padding(vertical = 8.dp)
        )
        Text(
            text = """
                Below is a simple Python script that simulates sending a phishing email using the 'smtplib' library. 
                **Note:** This is for educational purposes only. Do not use it for malicious activities.
            """.trimIndent(),
            modifier = Modifier.padding(vertical = 8.dp)
        )
        Text(
            text = "Python Code:",
            fontWeight = FontWeight.Bold,
            modifier = Modifier.padding(vertical = 8.dp)
        )
        SelectionContainer {
            BasicText(
                text = """
                import smtplib
                from email.mime.text import MIMEText
                
                # Function to send a phishing email
                def send_phishing_email(to_email):
                    subject = "Urgent: Account Verification Required"
                    body = "Dear user, please verify your account by clicking the link below:\n\nhttp://malicious-link.com"
                    
                    msg = MIMEText(body)
                    msg['Subject'] = subject
                    msg['From'] = "fake-email@example.com"
                    msg['To'] = to_email
                    
                    # Connect to the SMTP server
                    try:
                        with smtplib.SMTP('smtp.example.com', 587) as server:
                            server.starttls()
                            server.login("your-email@example.com", "your-password")
                            server.send_message(msg)
                            print("Phishing email sent to", to_email)
                    except Exception as e:
                        print("Failed to send email:", e)

                # Example usage
                send_phishing_email("victim@example.com")
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
                This code demonstrates how a phishing email could be sent to a target. It includes error handling to manage connection issues. 
                Always ensure to use such scripts responsibly and ethically.
            """.trimIndent(),
            modifier = Modifier.padding(vertical = 8.dp)
        )

        // Preventing Social Engineering Attacks
        Text(
            text = "Preventing Social Engineering Attacks",
            fontWeight = FontWeight.Bold,
            style = androidx.compose.material3.MaterialTheme.typography.headlineMedium,
            modifier = Modifier.padding(vertical = 8.dp)
        )
        Text(
            text = """
                Protecting against social engineering attacks involves awareness and vigilance:
                - **Education and Training**: Regular training sessions on identifying social engineering tactics. 
                  Employees should be aware of common phishing techniques and the importance of skepticism.
                - **Verify Requests**: Always verify requests for sensitive information through trusted channels. 
                  If you receive an unexpected request, contact the requester through a known method rather than replying directly.
                - **Be Skeptical**: Question unexpected requests and remain cautious about unsolicited communications. 
                  If something feels off, it’s better to investigate further.
                - **Implement Security Policies**: Establishing strict security protocols can mitigate the risks associated with social engineering. 
                  Policies should include measures for data handling, password management, and incident reporting.
                - **Use Multi-Factor Authentication (MFA)**: Enabling MFA adds an extra layer of security, making it harder for attackers to gain access.
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
                In this lesson, we explored the various social engineering techniques and the psychological principles that underpin them. 
                Understanding these tactics is crucial for defending against manipulation and maintaining security. 
                Awareness and proactive measures can significantly reduce the risk of falling victim to social engineering attacks. 
                In the next lesson, we will cover resources for further learning to expand your knowledge in ethical hacking.
            """.trimIndent(),
            modifier = Modifier.padding(vertical = 8.dp)
        )

        Spacer(modifier = Modifier.height(32.dp))
         // Button to navigate to the next lesson
        Button(onClick = { navController.navigate("lesson16") }) {
            Text(text = "Next Lesson")
        }
    }
}
