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
fun Lesson4Screen(navController: NavController) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
            .verticalScroll(rememberScrollState()),
        verticalArrangement = Arrangement.Top
    ) {
        // Lesson Title
        Text(
            text = "Lesson 4: Python Setup",
            fontWeight = FontWeight.Bold,
            style = MaterialTheme.typography.headlineLarge,
            color = MaterialTheme.colorScheme.primary,
            modifier = Modifier.padding(8.dp)
        )

        // Introduction to Python Setup
        Text(
            text = """
                In this lesson, we will walk through setting up Python for your hacking projects. 
                Having the right environment is crucial for effective coding and testing. 
                This includes installing Python, setting up an IDE, and managing packages.
            """.trimIndent(),
            style = MaterialTheme.typography.bodyLarge,
            textAlign = TextAlign.Left,
            modifier = Modifier.padding(8.dp)
        )

        Spacer(modifier = Modifier.height(16.dp))

        // Step 1: Installing Python
        Text(
            text = "Step 1: Installing Python",
            fontWeight = FontWeight.Bold,
            style = MaterialTheme.typography.titleMedium,
            color = MaterialTheme.colorScheme.secondary,
            modifier = Modifier.padding(8.dp)
        )
        Text(
            text = """
                To get started, you need to install Python on your system. Follow these steps:
                
                1. **Visit the Official Website**: Go to the Python website - (https://www.python.org/downloads/).
                2. **Download the Installer**: Choose the latest version of Python for your operating system (Windows, macOS, Linux).
                3. **Run the Installer**: Follow the prompts. Ensure you check the box that says "Add Python to PATH."
                4. **Verify Installation**: Open your terminal or command prompt and type:
                ```
                python --version
                ```
                You should see the installed version of Python.
            """.trimIndent(),
            style = MaterialTheme.typography.bodyMedium,
            textAlign = TextAlign.Left,
            modifier = Modifier.padding(8.dp)
        )

        Spacer(modifier = Modifier.height(16.dp))

        // Step 2: Setting Up an Integrated Development Environment (IDE)
        Text(
            text = "Step 2: Setting Up an Integrated Development Environment (IDE)",
            fontWeight = FontWeight.Bold,
            style = MaterialTheme.typography.titleMedium,
            color = MaterialTheme.colorScheme.secondary,
            modifier = Modifier.padding(8.dp)
        )
        Text(
            text = """
                An IDE helps streamline your coding process with features like syntax highlighting, debugging, and code completion. Here are a few popular options:
                
                - **PyCharm**: A powerful IDE with many features tailored for Python development. You can download it from JetBrains - (https://www.jetbrains.com/pycharm/).
                - **Visual Studio Code (VS Code)**: A lightweight and versatile editor that supports Python through extensions. Download it from Visual Studio Code - (https://code.visualstudio.com/).
                - **Jupyter Notebook**: Great for data science and prototyping. Install it using pip:
                ```
                pip install notebook
                ```

                After installing your IDE of choice, create a new project or file to start coding.
            """.trimIndent(),
            style = MaterialTheme.typography.bodyMedium,
            textAlign = TextAlign.Left,
            modifier = Modifier.padding(8.dp)
        )

        Spacer(modifier = Modifier.height(16.dp))

        // Step 3: Managing Packages with pip
        Text(
            text = "Step 3: Managing Packages with pip",
            fontWeight = FontWeight.Bold,
            style = MaterialTheme.typography.titleMedium,
            color = MaterialTheme.colorScheme.secondary,
            modifier = Modifier.padding(8.dp)
        )
        Text(
            text = """
                Python's package manager, pip, allows you to install and manage additional libraries that are essential for your projects. 
                Here’s how to use it:
                
                - **Installing Packages**: To install a package, open your terminal and type:
                ```
                pip install package_name
                ```
                For example, to install the requests library, you would run:
                ```
                pip install requests
                ```

                - **Upgrading Packages**: To upgrade an existing package, use:
                ```
                pip install --upgrade package_name
                ```

                - **Listing Installed Packages**: To see all installed packages, run:
                ```
                pip list
                ```

                - **Creating a Requirements File**: To manage dependencies for your project, create a `requirements.txt` file and list your packages. You can install them using:
                ```
                pip install -r requirements.txt
                ```
            """.trimIndent(),
            style = MaterialTheme.typography.bodyMedium,
            textAlign = TextAlign.Left,
            modifier = Modifier.padding(8.dp)
        )

        Spacer(modifier = Modifier.height(16.dp))

        // Step 4: Setting Up a Virtual Environment
        Text(
            text = "Step 4: Setting Up a Virtual Environment",
            fontWeight = FontWeight.Bold,
            style = MaterialTheme.typography.titleMedium,
            color = MaterialTheme.colorScheme.secondary,
            modifier = Modifier.padding(8.dp)
        )
        Text(
            text = """
                A virtual environment allows you to manage dependencies for different projects separately. This prevents version conflicts and keeps your global Python installation clean. Here’s how to set it up:
                
                1. **Create a Virtual Environment**:
                ```
                python -m venv myenv
                ```
                Replace `myenv` with your desired environment name.

                2. **Activate the Virtual Environment**:
                - On Windows:
                ```
                myenv\Scripts\activate
                ```
                - On macOS/Linux:
                ```
                source myenv/bin/activate
                ```

                You’ll notice the environment name appears in your terminal, indicating it's active.

                3. **Install Packages**: Now you can install packages using pip, and they will only be available in this environment.

                4. **Deactivate the Virtual Environment**: To exit the virtual environment, simply run:
                ```
                deactivate
                ```
            """.trimIndent(),
            style = MaterialTheme.typography.bodyMedium,
            textAlign = TextAlign.Left,
            modifier = Modifier.padding(8.dp)
        )

        Spacer(modifier = Modifier.height(16.dp))

        // Conclusion
        Text(
            text = """
                Setting up Python correctly is the first step toward becoming proficient in hacking and automation. 
                Now that you have Python installed, an IDE set up, and package management skills, you're ready to dive into programming. 
                In the next lesson, we will explore basic programming concepts in Python.
            """.trimIndent(),
            style = MaterialTheme.typography.bodyMedium,
            textAlign = TextAlign.Left,
            modifier = Modifier.padding(8.dp)
        )

        Spacer(modifier = Modifier.height(32.dp))

        // Button to navigate to the next lesson
        Button(onClick = { navController.navigate("lesson5") }) {
            Text(text = "Next Lesson")
        }
    }
}
