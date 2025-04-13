
# CareSync Backend API

## 🏥 Healthcare Governance & Ethical Billing System

The backend API for **CareSync** – a comprehensive healthcare governance platform designed to ensure fairness, transparency, and accountability in healthcare operations.

![CareSync](https://via.placeholder.com/800x400?text=CareSync+Backend+API)

---

## 🚀 Overview

CareSync addresses critical challenges in the healthcare sector including:

- Unregulated billing practices
- Lack of operational transparency
- Limited administrative control
- Inefficient resource management

### 🔍 Key Features

- ✅ Automated billing verification against standardized treatment costs
- 🔐 Real-time audit tracking for all critical events
- 🏥 Hospital verification workflows for administrative oversight
- 🛏️ Resource tracking for beds, doctors, and medicines
- 📊 Treatment cost comparison across healthcare providers

---

## 🛠️ Technology Stack

- **Framework**: Spring Boot
- **Language**: Java
- **Database**: MongoDB
- **API Architecture**: RESTful
- **Authentication**: Token-based (JWT)
- **Deployment**: Containerized (Docker)

---

## 📌 API Endpoints

### 👥 User Management

- `POST /user/add` – Register a new user
- `GET /user/users` – Get all users
- `GET /user/user/{email}` – Find user by email

### 🏥 Hospital Management

- `POST /hosp/add` – Register a new hospital
- `GET /hosp/all` – Get all hospitals
- `GET /hosp/find/{hosp}` – Find hospital by name
- `GET /hosp/find/email/{email}` – Find hospital by email
- `GET /hosp/verify/{email}` – Toggle hospital verification status

### 👨‍⚕️ Doctor Management

- `POST /hosp/doctor` – Add a new doctor
- `GET /hosp/doctor` – Get all doctors
- `GET /hosp/doctor/{dname}` – Find doctor by name
- `GET /hosp/doctor/find/{email}` – Find doctor by email

### 🧑‍🦽 Patient Management

- `POST /hosp/pati` – Register a new patient
- `GET /hosp/pati` – Get all patients

### 📅 Appointment Management

- `POST /appointment/create` – Create a new appointment
- `POST /appointment/update-status/{id}` – Update appointment status
- `GET /appointment/patient/{patientId}` – Get appointments by patient
- `GET /appointment/doctor/{doctorId}` – Get appointments by doctor
- `GET /appointment/hospital/{hospitalName}` – Get appointments by hospital
- `GET /appointment/status/{status}` – Get appointments by status
- `GET /appointment/all` – Get all appointments

### 💳 Billing Management

- `POST /billing/create` – Create a new billing transaction
- `POST /billing/verify/{id}` – Verify a billing transaction
- `GET /billing/flagged` – Get flagged transactions
- `GET /billing/hospital/{hospitalName}` – Get transactions by hospital
- `GET /billing/patient/{patientId}` – Get transactions by patient
- `GET /billing/all` – Get all transactions

### 💊 Treatment Cost Management

- `POST /treatment/standard/add` – Add a standard treatment cost
- `GET /treatment/standard/all` – Get all standard treatment costs
- `GET /treatment/standard/{code}` – Get standard cost by code
- `POST /treatment/hospital/add` – Add a hospital-specific treatment cost
- `GET /treatment/hospital/{hospitalName}` – Get hospital-specific costs
- `GET /treatment/compare/{treatmentCode}` – Compare treatment costs

### 📋 Audit Logging

- `POST /audit/add` – Create an audit log entry
- `GET /audit/all` – Get all audit logs

---

## ⚙️ Setup Instructions

### Prerequisites

- Java 17+
- Maven
- MongoDB

### Installation

```bash
git clone https://github.com/yourusername/patient-saathi-backend.git
cd patient-saathi-backend
```

Configure MongoDB in `application.properties`:

```
spring.data.mongodb.uri=mongodb://localhost:27017/CareSync
```

Build and run the project:

```bash
mvn clean install
mvn spring-boot:run
```

API runs at: `http://localhost:8090`

### Environment Variables

Create a `.env` file:

```env
FRONTEND=http://localhost:3000
DB_URL=mongodb://localhost:27017/CareSync
```

### 🔐 Security

- CORS protection allows only requests from configured frontend URL
- Token-based (JWT) authentication and authorization

---

## 🤝 Contribution Guidelines

1. Fork the repository
2. Create your feature branch: `git checkout -b feature/your-feature`
3. Commit your changes: `git commit -m 'Add your feature'`
4. Push to the branch: `git push origin feature/your-feature`
5. Open a Pull Request

---

## 📝 License

This project is licensed under the **MIT License** – see the LICENSE file for details.

---

## 🙏 Acknowledgments

- Government of NCT of Delhi – for inspiration and use case
- Healthcare professionals – for domain knowledge
- Open source contributors – for tools and libraries
