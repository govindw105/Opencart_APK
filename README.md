# OpenCart Automation Project

## 📌 Project Overview
This project automates the **product search and add-to-cart functionality** on the OpenCart web application
using **Java and Selenium WebDriver**. It also includes handling elements using **scrolling techniques** and
integrates with **CI/CD pipelines using Jenkins**.

## 🛠️ Technologies Used
- **Java** (Programming Language)
- **Selenium WebDriver** (Browser Automation)
- **TestNG** (Test Framework)
- **Maven** (Build Tool)
- **Jenkins** (CI/CD Integration)
- **GitHub** (Version Control)
- **Postman** (API Testing)
- **Extent Reports** (Test Reporting)

## 🚀 Features Automated
- **Search Products** in OpenCart
- **Add Products to Cart**
- **Handle Scrolling to Locate Elements**
- **Validate API Responses for OpenCart**
- **Execute Tests in Jenkins Pipeline**

## 📂 Project Setup
### Prerequisites
Ensure the following are installed:
- Java (JDK 11 or later)
- Maven
- Selenium WebDriver dependencies
- TestNG
- ChromeDriver / GeckoDriver
- Git

### Clone Repository
```sh
git clone https://github.com/your-username/opencart-automation.git
cd opencart-automation
```

### Install Dependencies
```sh
mvn clean install
```

## 🏃‍♂️ Running Tests
### Run Tests Using TestNG
```sh
mvn test
```

### Run Tests in Jenkins
- Configure Jenkins with a **Maven project**
- Set up a **GitHub webhook** for automatic builds
- Define `mvn clean test` in Jenkins build steps

## 📊 Test Reporting
- **Extent Reports** are generated after execution
- Report location: `./test-output/ExtentReports.html`

## 🔄 CI/CD Integration
- **Jenkins** fetches the latest code from GitHub
- Executes tests in an automated pipeline
- Reports are generated and stored

## 🤝 Contributing
1. Fork the repository
2. Create a new feature branch (`git checkout -b feature-name`)
3. Commit changes (`git commit -m 'Added new feature'`)
4. Push to the branch (`git push origin feature-name`)
5. Create a Pull Request

## 📞 Contact
For queries, reach out via gmail: govindw105@gmail.com

---
### 🎯 Happy Testing! 🚀

