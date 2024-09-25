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
fun Lesson20Screen(navController: NavController) {
    Column(modifier = Modifier.padding(16.dp)
            .verticalScroll(rememberScrollState()),) {
        Text(
            text = "Lesson 20: Cybersecurity Frameworks and Compliance",
            fontWeight = FontWeight.Bold,
            style = androidx.compose.material3.MaterialTheme.typography.headlineMedium,
            modifier = Modifier.padding(vertical = 8.dp)
        )

        // Introduction Section
        Text(
            text = """
                In today's digital landscape, organizations face numerous cybersecurity threats. To mitigate these risks, 
                various cybersecurity frameworks and compliance regulations have been developed. This lesson provides an 
                overview of major frameworks and regulations, their importance, and how they help organizations enhance 
                their cybersecurity posture.
            """.trimIndent(),
            modifier = Modifier.padding(vertical = 8.dp)
        )

        // Importance of Cybersecurity Frameworks
        Text(
            text = "Importance of Cybersecurity Frameworks",
            fontWeight = FontWeight.Bold,
            style = androidx.compose.material3.MaterialTheme.typography.headlineMedium,
            modifier = Modifier.padding(vertical = 8.dp)
        )
        Text(
            text = """
                Cybersecurity frameworks provide a structured approach to managing cybersecurity risks. They help 
                organizations:
                - Identify and assess security risks.
                - Implement effective security controls.
                - Monitor and improve their security posture.
                - Ensure compliance with industry standards and regulations.
            """.trimIndent(),
            modifier = Modifier.padding(vertical = 8.dp)
        )

        // Major Cybersecurity Frameworks
        Text(
            text = "Major Cybersecurity Frameworks",
            fontWeight = FontWeight.Bold,
            style = androidx.compose.material3.MaterialTheme.typography.headlineMedium,
            modifier = Modifier.padding(vertical = 8.dp)
        )
        Text(
            text = """
                1. **NIST Cybersecurity Framework (CSF)**: 
                   Developed by the National Institute of Standards and Technology, the NIST CSF provides guidelines 
                   for managing cybersecurity risk. It consists of five core functions: Identify, Protect, Detect, 
                   Respond, and Recover.
                
                2. **ISO/IEC 27001**: 
                   This international standard outlines the requirements for establishing, implementing, maintaining, 
                   and continually improving an information security management system (ISMS).
                
                3. **CIS Controls**: 
                   The Center for Internet Security (CIS) provides a set of best practices and controls designed to 
                   help organizations improve their cybersecurity posture.
                
                4. **COBIT**: 
                   The Control Objectives for Information and Related Technologies (COBIT) is a framework for 
                   developing, implementing, monitoring, and improving IT governance and management practices.
            """.trimIndent(),
            modifier = Modifier.padding(vertical = 8.dp)
        )

        // Overview of Compliance Regulations
        Text(
            text = "Overview of Compliance Regulations",
            fontWeight = FontWeight.Bold,
            style = androidx.compose.material3.MaterialTheme.typography.headlineMedium,
            modifier = Modifier.padding(vertical = 8.dp)
        )
        Text(
            text = """
                Compliance regulations are legal requirements that organizations must follow to ensure data protection 
                and cybersecurity. Some notable regulations include:
                
                - **GDPR (General Data Protection Regulation)**: 
                  A regulation in the EU that mandates strict data protection and privacy for individuals.
                
                - **HIPAA (Health Insurance Portability and Accountability Act)**: 
                  U.S. legislation that provides data privacy and security provisions for safeguarding medical information.
                
                - **PCI DSS (Payment Card Industry Data Security Standard)**: 
                  A set of security standards designed to ensure that all companies that accept, process, store, or transmit 
                  credit card information maintain a secure environment.
                
                - **SOX (Sarbanes-Oxley Act)**: 
                  U.S. legislation aimed at protecting investors from fraudulent financial reporting by corporations.
            """.trimIndent(),
            modifier = Modifier.padding(vertical = 8.dp)
        )

        // Implementing a Cybersecurity Framework
        Text(
            text = "Implementing a Cybersecurity Framework",
            fontWeight = FontWeight.Bold,
            style = androidx.compose.material3.MaterialTheme.typography.headlineMedium,
            modifier = Modifier.padding(vertical = 8.dp)
        )
        Text(
            text = """
                To implement a cybersecurity framework, organizations should follow these steps:
                1. **Assess Current State**: Evaluate existing security measures and identify gaps.
                2. **Define Objectives**: Establish clear security goals based on the framework.
                3. **Develop a Plan**: Create an action plan outlining the implementation of security controls.
                4. **Implement Controls**: Deploy the necessary technical and administrative controls.
                5. **Monitor and Review**: Continuously monitor the effectiveness of controls and review the framework regularly.
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
                In this lesson, we explored the significance of cybersecurity frameworks and compliance regulations. 
                Understanding and implementing these frameworks is essential for organizations to manage cybersecurity 
                risks effectively and ensure compliance with legal requirements. By adopting a structured approach, 
                organizations can strengthen their security posture and protect sensitive data from cyber threats.
            """.trimIndent(),
            modifier = Modifier.padding(vertical = 8.dp)
        )

        Spacer(modifier = Modifier.height(32.dp))

        // Button to finish the course or navigate to another section
        Button(onClick = { navController.navigate("home") }) {
            Text(text = "Finish Course")
        }
    }
}
