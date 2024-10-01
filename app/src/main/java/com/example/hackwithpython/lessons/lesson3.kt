package com.example.hackwithpython.lessons

import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.text.BasicText
import androidx.compose.foundation.text.selection.SelectionContainer
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.hackwithpython.HackerBlack
import com.example.hackwithpython.HackerWhite

@Composable
fun Lesson3Screen(navController: NavController) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
            .verticalScroll(rememberScrollState()),
        verticalArrangement = Arrangement.Top,
        horizontalAlignment = Alignment.Start
    ) {
        Text(
            text = "Lesson 3: Basics of Python Programming",
            style = MaterialTheme.typography.headlineLarge
        )
        Spacer(modifier = Modifier.height(16.dp))

        Text(
            text = "Python is a powerful and flexible programming language that is widely used in various fields, including web development, data analysis, automation, and ethical hacking. This lesson aims to equip you with the fundamental concepts of Python programming necessary for hacking applications.",
            style = MaterialTheme.typography.bodyMedium
        )
        Spacer(modifier = Modifier.height(16.dp))

        Text(
            text = "Why Learn Python?",
            style = MaterialTheme.typography.titleMedium
        )
        Spacer(modifier = Modifier.height(8.dp))

        Text(
            text = "Python’s popularity in hacking stems from its simplicity and versatility. Here are some reasons why Python is favored among hackers:\n" +
                    "- Readable Syntax: Python's clear and concise syntax allows you to write code faster and understand it more easily.\n" +
                    "- Extensive Libraries: Python has a rich ecosystem of libraries that enable quick development of powerful tools.\n" +
                    "- Cross-Platform: Python runs on various operating systems, making it accessible for different environments.".trimIndent(),
            modifier = Modifier.padding(vertical = 8.dp),
            style = MaterialTheme.typography.bodyMedium
        )
        Spacer(modifier = Modifier.height(16.dp))

        Text(
            text = "1. Python Syntax",
            style = MaterialTheme.typography.titleMedium
        )
        Spacer(modifier = Modifier.height(8.dp))

        Text(
            text = """
                Understanding Python's syntax is crucial for writing " +
                effective scripts. Python uses indentation to define blocks of code. 
                Unlike many other programming languages that use braces or keywords, Python relies on whitespace, which enhances readability
                Example:""".trimIndent(),
            modifier = Modifier.padding(vertical = 8.dp),
            style = MaterialTheme.typography.bodyMedium
        )

        SelectionContainer {
            BasicText(text =
                """
                    if 5 > 2
                        print(\"Five is greater than two!\")
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

        Text(
            text = "2. Data Types",
            style = MaterialTheme.typography.titleMedium
        )
        Spacer(modifier = Modifier.height(8.dp))

        Text(
            text = "Python has several built-in data types:\n" +
                    "- Integers: Whole numbers, e.g., `1`, `2`, `3`.\n" +
                    "- Floats: Decimal numbers, e.g., `1.0`, `2.5`.\n" +
                    "- Strings: Text enclosed in quotes, e.g., `\"Hello, World!\"`.\n" +
                    "- Lists: Ordered collections, e.g., `[1, 2, 3]`.\n" +
                    "- Dictionaries: Key-value pairs, e.g., `{'username': 'hacker123'}`.".trimIndent(),
            modifier = Modifier.padding(vertical = 8.dp),
            style = MaterialTheme.typography.bodyMedium
        )
        Spacer(modifier = Modifier.height(16.dp))

        Text(
            text = "3. Control Structures",
            style = MaterialTheme.typography.titleMedium
        )
        Spacer(modifier = Modifier.height(8.dp))

        Text(
            text = """
                Control structures help you direct the flow of your program. Key types include:\n
                - If Statements: Execute code based on conditions.\n" +
                - Loops: Repeat blocks of code.\n
                Example of a loop:\n
                """.trimIndent(),
            modifier = Modifier.padding(vertical = 8.dp),
            style = MaterialTheme.typography.bodyMedium
        )

        SelectionContainer {
            BasicText(
                text = """
                    user_input = input("Enter a keyword: ")
                    if user_input.lower() == "hacker":
                       print("Access Granted!")
                    else: 
                        print("Access Denied!")
                """.trimIndent(),style = TextStyle(
                    fontFamily = FontFamily.Monospace,
                    fontSize = 14.sp,
                    color = HackerBlack
                ),
                modifier = Modifier
                    .padding(12.dp)
                    .horizontalScroll(rememberScrollState())
            )
        }

        Spacer(modifier = Modifier.height(16.dp))

        Text(
            text = "4. Functions",
            style = MaterialTheme.typography.titleMedium
        )
        Spacer(modifier = Modifier.height(8.dp))

        Text(
            text = "Functions encapsulate code into reusable blocks." +
                    "Example:\n" ,
            style = MaterialTheme.typography.bodyMedium
        )

        SelectionContainer {
            BasicText(
                text = """
                    def greet(name): +
                        return f"hello {name}"
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

        Text(
            text = "5. Working with Libraries",
            style = MaterialTheme.typography.titleMedium
        )
        Spacer(modifier = Modifier.height(8.dp))

        Text(
            text = "You can import libraries to extend functionality. For example, use the `math` library for mathematical functions:\n",
            style = MaterialTheme.typography.bodyMedium
        )

        SelectionContainer {
            BasicText(
             text = """
                     import math
                     print(math.sqrt(16))  # Outputs: 4.0\n"       
                    """.trimIndent(),
                style = TextStyle(
                    fontSize = 14.sp,
                    fontFamily = FontFamily.Monospace,
                    color = HackerBlack
                ),
                modifier = Modifier
                    .padding(12.dp)
                    .horizontalScroll(rememberScrollState())
            )
        }

        Spacer(modifier = Modifier.height(16.dp))

        Text(
            text = "6. Writing Your First Script",
            style = MaterialTheme.typography.titleMedium
        )
        Spacer(modifier = Modifier.height(8.dp))

        Text(
            text = "Now let’s combine what we’ve learned into a simple script that takes user input and checks if it’s a hacker keyword.\n",
            style = MaterialTheme.typography.bodyMedium
        )

        SelectionContainer {
            BasicText(
                text = """
                    user_input = input(\"Enter a keyword: \")
                    if user_input.lower() == "hacker": 
                        print("Access Granted!") +
                    else:
                        print("Access Denied!")
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

        Button(onClick = { navController.navigate("lesson4") }) {
            Text(text = "Next Lesson")
        }
    }
}