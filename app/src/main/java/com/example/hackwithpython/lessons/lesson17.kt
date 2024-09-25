package com.example.hackwithpython.lessons

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.foundation.layout.*
import androidx.compose.material3.Button
import androidx.compose.ui.Modifier
import androidx.compose.runtime.Composable
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController

@Composable
fun Lesson17Screen(navController: NavController) {
    Column(modifier = Modifier.padding(16.dp)) {
        Text(
            text = "Lesson 17: Reverse Engineering Software",
            fontWeight = FontWeight.Bold,
            style = androidx.compose.material3.MaterialTheme.typography.headlineMedium,
            modifier = Modifier.padding(vertical = 8.dp)
        )

        // Introduction Section
        Text(
            text = """
                Reverse engineering involves analyzing software to uncover its components and functionalities. 
                This practice can be used for various purposes, including security assessment, malware analysis, 
                software debugging, and recovering lost code. In this lesson, we will explore the principles of reverse engineering, 
                tools used in the process, and practical examples of how to reverse engineer software effectively.
            """.trimIndent(),
            modifier = Modifier.padding(vertical = 8.dp)
        )

        // Why Reverse Engineering?
        Text(
            text = "Why Reverse Engineering?",
            fontWeight = FontWeight.Bold,
            style = androidx.compose.material3.MaterialTheme.typography.headlineMedium,
            modifier = Modifier.padding(vertical = 8.dp)
        )
        Text(
            text = """
                Reverse engineering can be beneficial for several reasons:
                - **Security Analysis**: Identifying vulnerabilities in software applications to mitigate risks.
                - **Malware Analysis**: Understanding malicious software behavior to develop effective countermeasures.
                - **Legacy System Maintenance**: Analyzing outdated software for updates or migrations.
                - **Learning and Research**: Gaining insights into how certain software works to enhance programming skills.
            """.trimIndent(),
            modifier = Modifier.padding(vertical = 8.dp)
        )

        // Legal Considerations
        Text(
            text = "Legal Considerations",
            fontWeight = FontWeight.Bold,
            style = androidx.compose.material3.MaterialTheme.typography.headlineMedium,
            modifier = Modifier.padding(vertical = 8.dp)
        )
        Text(
            text = """
                It is important to be aware of the legal implications of reverse engineering:
                - **Intellectual Property**: Reverse engineering can infringe on copyrights and patents.
                - **License Agreements**: Always check software license agreements to understand permissible uses.
                - **Ethical Considerations**: Ensure that reverse engineering is conducted ethically and legally.
            """.trimIndent(),
            modifier = Modifier.padding(vertical = 8.dp)
        )

        // Tools for Reverse Engineering
        Text(
            text = "Tools for Reverse Engineering",
            fontWeight = FontWeight.Bold,
            style = androidx.compose.material3.MaterialTheme.typography.headlineMedium,
            modifier = Modifier.padding(vertical = 8.dp)
        )
        Text(
            text = """
                Various tools are available for reverse engineering software:
                - **Ghidra**: A powerful open-source reverse engineering tool developed by the NSA, useful for analyzing binaries.
                - **IDA Pro**: A commercial disassembler and debugger that provides extensive analysis capabilities.
                - **Radare2**: An open-source framework for reverse engineering and analyzing binaries, known for its scripting capabilities.
                - **OllyDbg**: A popular x86 debugger that allows users to analyze and modify executable files.
                - **Binary Ninja**: A user-friendly reverse engineering platform with powerful analysis tools.
            """.trimIndent(),
            modifier = Modifier.padding(vertical = 8.dp)
        )

        // Reverse Engineering Process
        Text(
            text = "Reverse Engineering Process",
            fontWeight = FontWeight.Bold,
            style = androidx.compose.material3.MaterialTheme.typography.headlineMedium,
            modifier = Modifier.padding(vertical = 8.dp)
        )
        Text(
            text = """
                The reverse engineering process typically involves several steps:
                1. **Initial Analysis**: Gather information about the software, including its purpose and potential vulnerabilities.
                2. **Static Analysis**: Analyze the software's code without executing it. Use tools like Ghidra or IDA Pro to examine binary files.
                3. **Dynamic Analysis**: Run the software in a controlled environment to observe its behavior. Utilize debuggers like OllyDbg.
                4. **Reconstructing Logic**: Based on the analysis, reconstruct the software's logic and functionality.
                5. **Documentation**: Document findings, including code structures, potential vulnerabilities, and insights gained during the process.
            """.trimIndent(),
            modifier = Modifier.padding(vertical = 8.dp)
        )

        // Practical Example: Analyzing a Simple Program
        Text(
            text = "Practical Example: Analyzing a Simple Program",
            fontWeight = FontWeight.Bold,
            style = androidx.compose.material3.MaterialTheme.typography.headlineMedium,
            modifier = Modifier.padding(vertical = 8.dp)
        )
        Text(
            text = """
                Let's consider a simple Python script and reverse engineer it to understand its components:
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
                def add(a, b):
                    return a + b

                def subtract(a, b):
                    return a - b

                def main():
                    x = 5
                    y = 3
                    print("Addition:", add(x, y))
                    print("Subtraction:", subtract(x, y))

                if __name__ == "__main__":
                    main()
                ```
            """.trimIndent(),
            modifier = Modifier.padding(vertical = 8.dp)
        )
        Text(
            text = """
                In this example, the script defines two functions: `add` and `subtract`. 
                The `main` function calls these functions and prints the results. To reverse engineer this code, we can:
                - Identify the function names and their purpose.
                - Analyze the flow of the program by tracking how data is passed between functions.
                - Understand the input and output of each function to assess functionality.
                - Explore potential vulnerabilities, such as the absence of input validation.
            """.trimIndent(),
            modifier = Modifier.padding(vertical = 8.dp)
        )

        // Practical Example: Decompiled Code Analysis
        Text(
            text = "Practical Example: Decompiled Code Analysis",
            fontWeight = FontWeight.Bold,
            style = androidx.compose.material3.MaterialTheme.typography.headlineMedium,
            modifier = Modifier.padding(vertical = 8.dp)
        )
        Text(
            text = """
                Consider a simple compiled Python program that has been decompiled. 
                Here's an example of what the decompiled code might look like:
            """.trimIndent(),
            modifier = Modifier.padding(vertical = 8.dp)
        )
        Text(
            text = "Decompiled Python Code:",
            fontWeight = FontWeight.Bold,
            modifier = Modifier.padding(vertical = 8.dp)
        )
        Text(
            text = """
                ```python
                def calculate(value):
                    if value < 0:
                        raise ValueError("Value cannot be negative")
                    return value ** 2

                def main():
                    try:
                        result = calculate(-10)
                        print("Result:", result)
                    except ValueError as e:
                        print("Error:", e)

                if __name__ == "__main__":
                    main()
                ```
            """.trimIndent(),
            modifier = Modifier.padding(vertical = 8.dp)
        )
        Text(
            text = """
                In this decompiled code, the `calculate` function raises a `ValueError` if the input is negative. 
                To reverse engineer this:
                - Identify the exception handling mechanism.
                - Understand how input validation is implemented.
                - Analyze how exceptions are managed and propagated through the program.
            """.trimIndent(),
            modifier = Modifier.padding(vertical = 8.dp)
        )

        // More Complex Example: Analyzing a Simple Class
        Text(
            text = "More Complex Example: Analyzing a Simple Class",
            fontWeight = FontWeight.Bold,
            style = androidx.compose.material3.MaterialTheme.typography.headlineMedium,
            modifier = Modifier.padding(vertical = 8.dp)
        )
        Text(
            text = """
                Let's analyze a Python class that represents a simple bank account. Here’s the code:
            """.trimIndent(),
            modifier = Modifier.padding(vertical = 8.dp)
        )
        Text(
            text = "Bank Account Code:",
            fontWeight = FontWeight.Bold,
            modifier = Modifier.padding(vertical = 8.dp)
        )
        Text(
            text = """
                ```python
                class BankAccount:
                    def __init__(self, owner, balance=0):
                        self.owner = owner
                        self.balance = balance

                    def deposit(self, amount):
                        if amount > 0:
                            self.balance += amount
                        else:
                            raise ValueError("Deposit amount must be positive")

                    def withdraw(self, amount):
                        if 0 < amount <= self.balance:
                            self.balance -= amount
                        else:
                            raise ValueError("Invalid withdrawal amount")

                    def get_balance(self):
                        return self.balance
                ```
            """.trimIndent(),
            modifier = Modifier.padding(vertical = 8.dp)
        )
        Text(
            text = """
                To reverse engineer this class:
                - Identify class attributes and methods.
                - Analyze how methods interact with class attributes.
                - Evaluate input validation in `deposit` and `withdraw` methods.
                - Consider edge cases, such as withdrawing more than the balance.
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
                In this lesson, we explored the principles and processes of reverse engineering software. 
                By understanding how to analyze software effectively, you can enhance your skills in security assessment 
                and gain valuable insights into software behavior. In the next lesson, we will delve into mobile application 
                security testing to further expand your knowledge in ethical hacking.
            """.trimIndent(),
            modifier = Modifier.padding(vertical = 8.dp)
        )

        Spacer(modifier = Modifier.height(32.dp))

        // Button to navigate to the next lesson
        Button(onClick = { navController.navigate("lesson18") }) {
            Text(text = "Next Lesson: Mobile Application Security Testing")
        }
    }
}
