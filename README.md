# online-hospital-management-system
A Java Spring MVC and MySQL-based Hospital Management System for managing patients, appointments, doctors, and administrative workflows with role-based access control.

# Online Hospital Management System – Spring MVC + MySQL

This is a web-based application built using Java Spring MVC and MySQL, designed to streamline hospital operations including patient management, doctor scheduling, and administrative tasks through a centralized platform.

## 👥 User Roles
- **Admin**: Manage departments, doctors, and system configuration
- **Doctor**: View appointments, patient records, and treatment history
- **Receptionist/Nurse**: Register patients, book appointments, assist in patient management
- **Patient**: Book appointments, view reports, and track treatment status

## 🔧 Tech Stack
- **Backend**: Java, Spring MVC, JDBC
- **Frontend**: JSP, HTML, CSS, Bootstrap
- **Database**: MySQL
- **Server**: Apache Tomcat

## ✨ Key Features
- User registration and secure login
- Patient registration and records management
- Appointment scheduling and cancellation
- Doctor assignment and availability management
- Admin dashboard with role-based access control
- Reporting module for appointments and patient history

## 🚀 Getting Started
1. Clone the repository
2. Import into Eclipse/IntelliJ as a Maven project
3. Create a MySQL database (`hospital_db`) and import the `hospital_schema.sql`
4. Update DB credentials in your configuration (e.g. `application.properties` or XML)
5. Deploy the WAR on Tomcat and access via browser

---

Let me know if you’d like:
- Full `README.md` with screenshots and setup scripts
- SQL table creation scripts or Spring MVC entities  
- This project converted to **Spring Boot** for modern deployment.
