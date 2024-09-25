package com.example.hackwithpython.lessons

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController

@Composable
fun Lesson9Screen(navController: NavHostController) {
    Column(modifier = Modifier.padding(16.dp)) {
        Text(
            text = "Lesson 9: Exploiting Web Vulnerabilities",
            fontWeight = FontWeight.Bold,
            style = androidx.compose.material3.MaterialTheme.typography.headlineMedium,
            modifier = Modifier.padding(vertical = 8.dp)
        )

        // SQL Injection Section
        Text(
            text = "SQL Injection",
            fontWeight = FontWeight.Bold,
            style = androidx.compose.material3.MaterialTheme.typography.headlineMedium,
            modifier = Modifier.padding(vertical = 8.dp)
        )
        Text(
            text = """
                SQL Injection is a common web vulnerability where attackers can manipulate SQL queries by injecting malicious input into them. This can allow attackers to access, modify, or delete data in the database.
                
                ### Python Example of SQL Injection
                Here's a simple example of a Python script vulnerable to SQL injection:

                ```python
                import sqlite3

                def login(username, password):
                    conn = sqlite3.connect('example.db')
                    cursor = conn.cursor()
                    query = f"SELECT * FROM users WHERE username = '{username}' AND password = '{password}'"
                    cursor.execute(query)
                    user = cursor.fetchone()
                    if user:
                        print("Login successful!")
                    else:
                        print("Login failed!")
                
                # Malicious input
                login("admin' --", "")
                ```

                In this example, the attacker could bypass authentication by inputting `admin' --` as the username, which effectively comments out the rest of the SQL query.

                ### Preventing SQL Injection
                To prevent SQL Injection, always use parameterized queries or prepared statements:

                ```python
                def login(username, password):
                    conn = sqlite3.connect('example.db')
                    cursor = conn.cursor()
                    query = "SELECT * FROM users WHERE username = ? AND password = ?"
                    cursor.execute(query, (username, password))
                    user = cursor.fetchone()
                    if user:
                        print("Login successful!")
                    else:
                        print("Login failed!")
                ```
            """.trimIndent(),
            modifier = Modifier.padding(vertical = 8.dp)
        )

        // Cross-Site Scripting (XSS) Section
        Text(
            text = "Cross-Site Scripting (XSS)",
            fontWeight = FontWeight.Bold,
            style = androidx.compose.material3.MaterialTheme.typography.headlineMedium,
            modifier = Modifier.padding(vertical = 8.dp)
        )
        Text(
            text = """
                Cross-Site Scripting (XSS) is a vulnerability that allows attackers to inject malicious scripts into web pages viewed by other users. This can lead to the theft of sensitive data, such as cookies or session tokens.
                
                ### Python Example of XSS
                Consider a simple web application using Flask:

                ```python
                from flask import Flask, request, render_template_string

                app = Flask(__name__)

                @app.route('/')
                def index():
                    name = request.args.get('name', '')
                    template = f"<h1>Hello, {name}!</h1>"
                    return render_template_string(template)

                if __name__ == '__main__':
                    app.run()
                ```

                If a user inputs `<script>alert('XSS');</script>` as their name, the script will execute in the browser, demonstrating an XSS vulnerability.

                ### Preventing XSS
                Use template engines that automatically escape content, or manually escape input before rendering it:

                ```python
                from flask import Flask, request, render_template_string, escape

                app = Flask(__name__)

                @app.route('/')
                def index():
                    name = request.args.get('name', '')
                    safe_name = escape(name)
                    template = f"<h1>Hello, {safe_name}!</h1>"
                    return render_template_string(template)

                if __name__ == '__main__':
                    app.run()
                ```
            """.trimIndent(),
            modifier = Modifier.padding(vertical = 8.dp)
        )

        // CSRF Section
        Text(
            text = "Cross-Site Request Forgery (CSRF)",
            fontWeight = FontWeight.Bold,
            style = androidx.compose.material3.MaterialTheme.typography.headlineMedium,
            modifier = Modifier.padding(vertical = 8.dp)
        )
        Text(
            text = """
                Cross-Site Request Forgery (CSRF) tricks users into executing unwanted actions on a web application where they are authenticated.

                ### Python Example of CSRF
                Here's an example of a Flask route vulnerable to CSRF:

                ```python
                from flask import Flask, request, session

                app = Flask(__name__)
                app.secret_key = 'your_secret_key'

                @app.route('/transfer', methods=['POST'])
                def transfer():
                    if 'logged_in' in session:
                        # Process transfer
                        return "Transfer completed!"
                    else:
                        return "Please log in first."

                if __name__ == '__main__':
                    app.run()
                ```

                An attacker could craft a form on another site that submits to `/transfer`, exploiting this vulnerability.

                ### Preventing CSRF
                Use CSRF tokens to validate requests:

                ```python
                from flask import Flask, request, session, render_template_string

                app = Flask(__name__)
                app.secret_key = 'your_secret_key'

                @app.route('/transfer', methods=['GET', 'POST'])
                def transfer():
                    if request.method == 'POST':
                        token = session.pop('_csrf_token', None)
                        if not token or token != request.form.get('_csrf_token'):
                            return "CSRF detected!"
                        # Process transfer
                        return "Transfer completed!"
                    else:
                        session['_csrf_token'] = 'random_generated_token'
                        return render_template_string("
                            <form method="POST">
                                <input type="hidden" name="_csrf_token" value="{{ _csrf_token }}">
                                <button type="submit">Transfer</button>
                            </form>
                        ")

                if __name__ == '__main__':
                    app.run()
                ```
            """.trimIndent(),
            modifier = Modifier.padding(vertical = 8.dp)
        )

        // Remote Code Execution (RCE) Section
        Text(
            text = "Remote Code Execution (RCE)",
            fontWeight = FontWeight.Bold,
            style = androidx.compose.material3.MaterialTheme.typography.headlineMedium,
            modifier = Modifier.padding(vertical = 8.dp)
        )
        Text(
            text = """
                Remote Code Execution (RCE) allows attackers to execute arbitrary code on the target server, often due to improper input validation.

                ### Python Example of RCE
                Consider the following insecure Python code:

                ```python
                import os

                def run_command(command):
                    os.system(command)

                # Malicious input
                run_command('rm -rf /')
                ```

                In this example, if user input is passed directly to `run_command()`, it could lead to severe consequences.

                ### Preventing RCE
                Always sanitize and validate user inputs before executing them:

                ```python
                import subprocess

                def run_command(command):
                    safe_command = subprocess.run(command, shell=False)
                    return safe_command
                ```

                Here, using `subprocess.run` with `shell=False` ensures that user input is not executed as a command line string.
            """.trimIndent(),
            modifier = Modifier.padding(vertical = 8.dp)
        )

        // File Upload Vulnerabilities Section
        Text(
            text = "File Upload Vulnerabilities",
            fontWeight = FontWeight.Bold,
            style = androidx.compose.material3.MaterialTheme.typography.headlineMedium,
            modifier = Modifier.padding(vertical = 8.dp)
        )
        Text(
            text = """
                File upload vulnerabilities occur when an application allows users to upload files without properly validating and sanitizing them.

                ### Python Example of a Vulnerable File Upload
                Here's a Flask app vulnerable to file upload attacks:

                ```python
                from flask import Flask, request

                app = Flask(__name__)

                @app.route('/upload', methods=['POST'])
                def upload():
                    file = request.files['file']
                    file.save(f"/uploads/{file.filename}")
                    return "File uploaded!"

                if __name__ == '__main__':
                    app.run()
                ```

                Attackers could upload a malicious script that gets executed on the server.

                ### Preventing File Upload Vulnerabilities
                Always validate file uploads:

                ```python
                import os
                from flask import Flask, request, redirect

                app = Flask(__name__)

                ALLOWED_EXTENSIONS = {'png', 'jpg', 'jpeg', 'gif'}

                def allowed_file(filename):
                    return '.' in filename and \
                           filename.rsplit('.', 1)[1].lower() in ALLOWED_EXTENSIONS

                @app.route('/upload', methods=['POST'])
                def upload():
                    file = request.files['file']
                    if file and allowed_file(file.filename):
                        filename = secure_filename(file.filename)
                        file.save(os.path.join("/uploads", filename))
                        return "File uploaded!"
                    return "Invalid file type!"

                if __name__ == '__main__':
                    app.run()
                ```
            """.trimIndent(),
            modifier = Modifier.padding(vertical = 8.dp)
        )

        // Session Hijacking Section
        Text(
            text = "Session Hijacking",
            fontWeight = FontWeight.Bold,
            style = androidx.compose.material3.MaterialTheme.typography.headlineMedium,
            modifier = Modifier.padding(vertical = 8.dp)
        )
        Text(
            text = """
                Session hijacking involves stealing or predicting a session token to gain unauthorized access to a user's session.

                ### Python Example of Session Hijacking
                Consider this Flask session management example:

                ```python
                from flask import Flask, session

                app = Flask(__name__)
                app.secret_key = 'your_secret_key'

                @app.route('/login')
                def login():
                    session['user'] = 'admin'
                    return "Logged in as admin!"

                @app.route('/profile')
                def profile():
                    if 'user' in session:
                        return f"Profile of {session['user']}"
                    return "Please log in first!"

                if __name__ == '__main__':
                    app.run()
                ```

                Attackers could steal the session token from the user's cookies.

                ### Preventing Session Hijacking
                Implement secure session management:

                ```python
                from flask import Flask, session, request, redirect

                app = Flask(__name__)
                app.secret_key = 'your_secret_key'

                @app.before_request
                def before_request():
                    if request.is_secure:
                        session.permanent = True

                @app.route('/login')
                def login():
                    session['user'] = 'admin'
                    return "Logged in as admin!"

                @app.route('/profile')
                def profile():
                    if 'user' in session:
                        return f"Profile of {session['user']}"
                    return "Please log in first!"

                if __name__ == '__main__':
                    app.run(ssl_context=('cert.pem', 'key.pem'))
                ```

                Ensure that your application uses HTTPS and sets secure session cookies to prevent hijacking.
            """.trimIndent(),
            modifier = Modifier.padding(vertical = 8.dp)
        )
        Spacer(modifier = Modifier.height(32.dp))

        // Button to navigate to the next lesson
        Button(onClick = { navController.navigate("lesson10") }) {
            Text(text = "Next Lesson: Interacting with Databases")
        }
    }
}
