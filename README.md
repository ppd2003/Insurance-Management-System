# Insurance-Management-System

The **Insurance Management System (Pro2)** is a Java-based web application that allows users to **track their insurance claims** and authorized personnel to **manage and update insurance data**.  
It provides a simple and efficient way to handle insurance-related operations using **Java, MySQL, JDBC**, and **Apache Tomcat**.

---

## 📋 Table of Contents
- [About the Project](#about-the-project)
- [Features](#features)
- [Tech Stack](#tech-stack)
- [System Architecture](#system-architecture)
- [Installation & Setup](#installation--setup)
- [Configuration](#configuration)
- [Usage](#usage)
- [Screenshots](#screenshots)
- [Contributing](#contributing)
- [License](#license)

---

## 🧠 About the Project

The **Insurance Management System** simplifies the process of managing insurance records, tracking customer claims, and maintaining policy data.  
It provides secure role-based access:
- **Users** can view policy details and claim statuses.
- **Authorized personnel (Admin/Agents)** can update, approve, or reject claims and modify client or policy data.

This project can be used by small and medium-sized insurance agencies to digitalize and automate their workflows.

---

## ✨ Features
- 👤 **User Login & Registration**
- 🧾 **Track Insurance Claims**
- 🧑‍💼 **Admin Dashboard for Authorized Personnel**
- 🧩 **Add / Update / Delete Policies and Customer Data**
- 💾 **MySQL Database Integration**
- 🔒 **Role-Based Access Control (User / Admin)**
- 📊 **Claim Status Tracking and Reports**

---

## 🛠 Tech Stack
| Component | Technology |
|------------|-------------|
| **Language** | Java (JDK 17+) |
| **Backend Framework** | JDBC |
| **Database** | MySQL |
| **Server** | Apache Tomcat |
| **IDE (recommended)** | Eclipse / IntelliJ IDEA / NetBeans |
| **Version Control** | Git, GitHub |

---

## 🏗 System Architecture
User Interface → Servlet (Controller) → JDBC (Model) → MySQL Database


- **Frontend:** HTML, JSP  
- **Controller Layer:** Java Servlets  
- **Database Access Layer:** JDBC  
- **Database:** MySQL (Relational schema with tables for Users, Policies, Claims, etc.)

---

## ⚙️ Installation & Setup

### 1. Clone the Repository
```bash
git clone https://github.com/ppd2003/Insurance-Management-System.git
cd Insurance-Management-System/Pro2
