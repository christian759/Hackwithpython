package com.example.hackwithpython.projects

import android.text.Selection
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
fun Project12Screen(navController: NavController) {
    Column(modifier = Modifier
        .padding(16.dp)
        .verticalScroll(rememberScrollState()),
        verticalArrangement = Arrangement.Top,
        horizontalAlignment = Alignment.Start) {
        Text(
            text = "Project 12: Steganography",
            fontWeight = FontWeight.Bold,
            style = androidx.compose.material3.MaterialTheme.typography.headlineMedium,
            modifier = Modifier.padding(vertical = 8.dp)
        )

        // Introduction Section
        Text(
            text = """
                In this project, you will develop a Python program that uses steganography techniques to hide secret messages within image files. 
                Steganography is the practice of concealing information within other non-secret data, making it a useful method for secure communication.
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
                - A basic understanding of image file formats (e.g., PNG, BMP).
                - Familiarity with Python programming.
                - The `Pillow` library for image manipulation. Install it using: `pip install Pillow`.
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
                - Develop a function to hide a secret message in an image.
                - Create a function to extract the hidden message from the image.
                - Understand the implications of using steganography for secure communication.
            """.trimIndent(),
            modifier = Modifier.padding(vertical = 8.dp)
        )

        // Python Example Code
        Text(
            text = "Python Code Example: Steganography",
            fontWeight = FontWeight.Bold,
            style = androidx.compose.material3.MaterialTheme.typography.headlineMedium,
            modifier = Modifier.padding(vertical = 8.dp)
        )
        Text(
            text = """
                Below is an example of how to implement steganography in Python:
            """.trimIndent(),
            modifier = Modifier.padding(vertical = 8.dp)
        )
        SelectionContainer {
            BasicText(
                text = """
                from PIL import Image
                import binascii

                # Function to hide a message in an image
                def hide_message(image_path, secret_message, output_path):
                    img = Image.open(image_path)
                    binary_message = ''.join(format(ord(i), '08b') for i in secret_message)
                    binary_message += '1111111111111110'  # Delimiter to indicate end of message
                    data = img.getdata()

                    new_data = []
                    data_index = 0
                    for item in data:
                        if data_index < len(binary_message):
                            new_pixel = list(item)
                            new_pixel[0] = (new_pixel[0] & 254) | int(binary_message[data_index])  # Change LSB
                            new_data.append(tuple(new_pixel))
                            data_index += 1
                        else:
                            new_data.append(item)

                    img.putdata(new_data)
                    img.save(output_path)
                    print("Message hidden in the image.")

                # Function to extract a message from an image
                def extract_message(image_path):
                    img = Image.open(image_path)
                    binary_message = ''
                    data = img.getdata()

                    for item in data:
                        binary_message += str(item[0] & 1)  # Get LSB

                    message = ''
                    for i in range(0, len(binary_message), 8):
                        byte = binary_message[i:i+8]
                        if byte == '11111111':  # Delimiter for end of message
                            break
                        message += chr(int(byte, 2))

                    return message

                # Example usage
                hide_message('input_image.png', 'Hello, this is a secret message!', 'output_image.png')
                print(extract_message('output_image.png'))
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
                This project is intended for educational purposes only. Use steganography responsibly and avoid illegal or unethical activities.
                Always respect privacy and seek permission before attempting to hide or extract messages from any images.
            """.trimIndent(),
            modifier = Modifier.padding(vertical = 8.dp)
        )

        Spacer(modifier = Modifier.height(32.dp))

        // Button to navigate to the next project
        Button(onClick = { navController.navigate("project13") }) {
            Text(text = "Next Project")
        }
    }
}
