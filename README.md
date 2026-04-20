# potential-octo-disco
Technical skills demonstration 

*A full‑stack enterprise demo showcasing modern cloud architecture, code quality, and best practices.*

---
## 1. Overview
This repository demonstrates a **production‑style reference implementation** of a cloud‑native web application, 
built to illustrate architectural depth and hands‑on technical ability.
The system features a secure RESTful backend, reactive frontend, containerized deployment, automated testing, 
and CI/CD integration — all provisioned for cloud execution.

---
## 2. High‑Level Architecture
**Stack Highlights**
- **Backend:** Spring Boot (Java 17), Spring Security (JWT), JPA, Flyway, REST API
- **Frontend:** Angular 17, Material Design
- **Database:** PostgreSQL 15 (via JDBC / Flyway migrations)
- **Testing:** JUnit 5, Mockito, Karma, Jasmine
- **Infrastructure:** Docker, Kubernetes (local Minikube or AWS EKS)
- **DevOps & Cloud:** GitHub Actions CI/CD, AWS RDS, S3, CloudFront 

**Conceptual Architecture Diagram**

┌───────────────┐       REST API       ┌──────────────┐
│   Angular UI  │ <------------------> │ Spring Boot  │
│  (Frontend)   │                      │ Backend API  │
└──────┬────────┘                      └──────┬───────┘
       │                                      │
       │             JDBC / Flyway            │
       ▼                                      ▼
┌────────────────────┐           ┌────────────────────┐
│  PostgreSQL (RDS)  │           │  Auth Service/JWT  │
└────────────────────┘           └────────────────────┘

---
## 3. Core Features
- 🔐 ** JWT Authentication & Authorization ** using Spring Security
- 🧾 ** RESTful CRUD Endpoints ** documented via OpenAPI/Swagger
- 🗃️  ** Database Migration Automation ** with Flyway scripts
- 💡 ** Responsive Frontend ** built in Angular & Material 
- 🧪 ** Full TDD Coverage ** (JUnit + Mockito + Karma)
- 🐳 ** Containerized Architecture ** using Docker & Compose
- ☁️  ** Cloud‑Ready Deployment ** to AWS via Kubernetes manifests
- 🔄 ** CI/CD Pipeline ** powered by GitHub Actions

---
## 4. Repository Structure
potential-octo-disco/ 
.
├── backend
│   ├── src
│   │   ├── main
│   │   │   ├── java
│   │   │   │   └── .gitkeep
│   │   │   └── resources
│   │   │       └── .gitkeep
│   │   └── test
│   │       └── .gitkeep
│   ├── Dockerfile
│   └── pom.xml
├── docs
│   └── .gitkeep
├── frontend
│   ├── e2e
│   │   └── .gitkeep
│   └── src
│       ├── app
│       │   └── .gitkeep
│       └── assets
│           └── .gitkeep
├── .github
│   └── workflows
│       └── .gitkeep
├── docker-compose.yml
├── .gitignore
├── README.md


## 5. Getting Started (Local)
### Prerequisites
- Docker & Docker Compose 
- Java 17 
- Node.js LTS + Angular CLI 
- psql (PostgreSQL client)
### Run Locally
{{bash}}
# 5.1. Build and start all services
docker-compose up --build
# 5.2. Access frontend
[localhost](http://localhost:4200)
# 5.3. API endpoint
[localhost](http://localhost:8080/api/v1)


## 6. Testing
  Backend
  {{bash}}
    cd backend
    ./mvnw test
  Frontend
  {{bash}}
    cd frontend
    npm test


## 7. Cloud & CI/CD (Roadmap) - Deploy database on AWS RDS
- Backend container to AWS EKS (Kubernetes)
- Frontend hosted on AWS S3 + CloudFront
- Continuous Integration using GitHub Actions


## 8. Future Extensions - Split architecture into user‑service and order‑service microservices
- Add API gateway and service discovery
- Include Terraform for infrastructure as code
- Integrate Grafana / Prometheus monitoring

## 9. License MIT License — designed for open demonstration and educational use.
