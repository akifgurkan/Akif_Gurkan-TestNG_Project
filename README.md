# Selenium TestNG - Insider Website Test Automation

## Project Description
This project automates the testing of the **Insider** website using **Java** and **Selenium**. It is built with the **TestNG** framework and follows the **Page Object Model (POM)** design pattern. Additionally, the `Driver` class is implemented using the **Singleton Pattern**.

### Tasks:
1. **Home Page Test**: Verify that the homepage of [https://useinsider.com/](https://useinsider.com/) loads correctly.
2. **Career Page Test**:
    - Navigate to "Company" -> "Careers" from the navigation bar.
    - Verify the "Career" page, Locations, Teams, and Life at Insider sections are displayed correctly.
3. **Quality Assurance Job Listings**:
    - Visit the [Careers Page](https://useinsider.com/careers/quality-assurance/) and click "See all QA jobs".
    - Apply filters: Location = "Istanbul, Turkey" and Department = "Quality Assurance".
    - Verify that all job listings:
        - **Position** contains "Quality Assurance".
        - **Department** contains "Quality Assurance".
        - **Location** contains "Istanbul, Turkey".
4. **Job Details Test**: Click the "View Role" button and verify the redirection to the Lever Application form page.

## Technologies Used
- **Java**
- **Selenium WebDriver**
- **TestNG**
- **Page Object Model (POM)**
- **Singleton Pattern**

## Installation Instructions
1. Clone the repository:
   ```bash
   git clone https://github.com/akifgurkan/insiderAutomationTask.git
