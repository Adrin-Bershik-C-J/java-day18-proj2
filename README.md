# 🏠 Hostel Management System – Spring Boot

A Spring Boot application for managing **Students**, **Rooms**, and **Wardens** in a hostel.  
Includes **role-based authentication** with Spring Security:
- **Warden (ADMIN)** can create, update, and delete students.
- **Student (USER)** can view student information.

---

## 📂 Project Structure
```
Directory structure:
└── adrin-bershik-c-j-java-day18-proj2/
    ├── mvnw
    ├── mvnw.cmd
    ├── pom.xml
    ├── src/
    │   ├── main/
    │   │   ├── java/
    │   │   │   └── com/
    │   │   │       └── springboot/
    │   │   │           └── day14proj2/
    │   │   │               ├── Day14proj2Application.java
    │   │   │               ├── config/
    │   │   │               │   └── SecurityConfig.java
    │   │   │               ├── controller/
    │   │   │               │   ├── StudentController.java
    │   │   │               │   └── WardenController.java
    │   │   │               ├── dto/
    │   │   │               │   └── StudentResponseDTO.java
    │   │   │               ├── entity/
    │   │   │               │   ├── Room.java
    │   │   │               │   ├── Student.java
    │   │   │               │   └── Warden.java
    │   │   │               ├── mapper/
    │   │   │               │   └── StudentMapper.java
    │   │   │               ├── repository/
    │   │   │               │   ├── RoomRepository.java
    │   │   │               │   ├── StudentRepository.java
    │   │   │               │   └── WardenRepository.java
    │   │   │               └── service/
    │   │   │                   ├── StudentService.java
    │   │   │                   └── WardenService.java
    │   │   └── resources/
    │   │       └── application.properties
    │   └── test/
    │       └── java/
    │           └── com/
    │               └── springboot/
    │                   └── day14proj2/
    │                       └── Day14proj2ApplicationTests.java
    └── .mvn/
        └── wrapper/
            └── maven-wrapper.properties
```

---

## 🚀 Features
- **Role-based access control** with Spring Security.
- **CRUD operations** for students (restricted to Warden).
- **Filter & pagination** for listing students.
- **Entity relationships**:
  - `Warden` → manages multiple `Room`s
  - `Room` → has multiple `Student`s
- Preloaded sample data via `CommandLineRunner`.

---

## 🔐 Authentication
Two in-memory users are configured:

| Role   | Username | Password   |
|--------|----------|------------|
| ADMIN  | admin    | admin123   |
| USER   | user     | user123    |

Uses **HTTP Basic Auth**.

---

## ⚙️ Setup & Run

### 1️⃣ Clone the repository
```bash
git clone https://github.com/Adrin-Bershik-C-J/java-day18-proj2.git
cd adrin-bershik-c-j-java-day18-proj2
