# 👥 Postulants Management Core Engine & Relational Database (Java & PostgreSQL)

![Maven CI](https://github.com/VicHZR/postulantes-crud-java/actions/workflows/maven-ci.yml/badge.svg)

<p align="left">
  <a href="https://oracle.com">
    <img src="https://img.shields.io/badge/Oracle-F80000?style=for-the-badge&logo=oracle&logoColor=white"/>
  </a>
  <a href="https://postgresql.org">
    <img src="https://img.shields.io/badge/PostgreSQL-4169E1?style=for-the-badge&logo=postgresql&logoColor=white"/>
  </a>
  <a href="https://maven.apache.org">
    <img src="https://img.shields.io/badge/Maven-C71A36?style=for-the-badge&logo=apachemaven&logoColor=white"/>
  </a>
  <a href="https://github.com">
    <img src="https://img.shields.io/badge/GitHub-181717?style=for-the-badge&logo=github&logoColor=white"/>
  </a>
</p>

---

## 🚀 Overview

A production-grade **Postulants CRUD Management Core Engine** engineered with a **Java Console interface** and integrated with **PostgreSQL** via high-performance **JDBC** data streams. 

This enterprise showcase explicitly models transactional data operations using server-side **Stored Procedures (PL/pgSQL)**. It also implements data normalization structures aligned with the official demographic table of the National Institute of Statistics and Informatics (**INEI UBIGEO**), ensuring strict regional data integrity.

🎯 Focus: **Relational persistence layers, server-side transactional procedures, business rule constraints, and corporate CI pipeline integrations.**

---

## 🎯 Key Technical Features

- ⚙️ **Core Functional CRUD Operations:** Complete data manipulation matrix to Register postulants, List active entries, Update target email channels, and Delete records safely.
- 🗺️ **Advanced Regional Querying:** Search indexing algorithms driven by District Names or explicit UBIGEO geographic codes (supporting both 4-digit and 6-digit layouts).
- 🔒 **Server-Side Transactional Logic:** Business validation rules and database queries executed cleanly using pre-compiled PostgreSQL **Stored Procedures**.
- 📦 **Automated Continuous Integration:** Production deployment blueprint integrated with **GitHub Actions** executing compile audits and code packaging via Maven CI.

---

## 🛡️ Implemented Business Validations

- **Identity Modifications Bounds:** First name and paternal last name fields are structurally mandatory, containing isolated string lengths restricted from 3 to 60 characters.
- **DNI Structural Key:** Fixed-length 8-digit unique token configuration with automated duplication constraint checking.
- **Contact Channel Isolation:** Pattern-matched secure email format validation rejecting duplicate address records in the database.
- **Categorical Constraints:** Gender attributes are tightly restricted to discrete primitive flags (`M` / `F`).
- **Referential Integrity Mapping:** Strict database lookup verification against normalized **INEI UBIGEO data** matrices.

---

## 🏗️ Technical Architecture & Repository Structure

The project files segregate business logic layers, database schemas, and continuous pipelines systematically:

```text
postulantes-crud-java/
│
├── .github/workflows/         # Automation continuous integration pipeline configurations (Maven CI)
├── src/                       # Java application core (Main source paths & console drivers)
├── geodir-ubigeo-inei-limpio.csv # Normalized INEI demographic dataset matrix reference
├── ScriptProyecto.sql         # Relational database schema definitions and Stored Procedures
├── pom.xml                    # Apache Maven manifest managing technical library versions
└── README.md                  # Technical engineering documentation
```

---

## 📊 Impact (CV-Level Highlights)

- 📈 **Optimized Query Efficiency:** Slashed database round-trip processing times by offloading core transactional checks onto server-side **PL/pgSQL Stored Procedures**.
- 🛡️ **Fintech-Grade Data Consistency:** Prevented schema data contamination by engineering strict database validation constraints directly over transactional fields (DNI and Email parameters).
- 🔄 **Continuous Integration (CI) Automation:** Established a fully automated **GitHub Actions loop** to clean, compile, and package code models seamlessly on every event push.

---

## ⚙️ Requirements & Local Setup

### 1. Prerequisites
Ensure your local host workstation has the following platform layers active:
- **Java SE Development Kit (JDK 11 or higher)**
- **PostgreSQL Database Server (v14 or higher)**
- **Apache Maven 3.8+**

### 2. Project Bootstrapping
```bash
git clone https://github.com
cd postulantes-crud-java
```

### 3. Initialize the Database Layer
Open your preferred PostgreSQL database administrator engine (pgAdmin, DBeaver, or psql), create a database instance, and execute the structural scripts inside `ScriptProyecto.sql` to initialize tables, records, and procedures.

### 4. Execute the Application Suite
To resolve dependencies, package the binary, and compile via Maven, run:
```bash
mvn clean install
```

---

## 👨‍💻 Author

**Victor Hugo Guzman Prieto**  
*Computational Scientist | Backend Engineer | Software Quality & Test Automation Specialist*  
- 🔗 **LinkedIn:** [https://linkedin.com](https://www.linkedin.com/in/victor-h-guzm%C3%A1n-a19361187/)
