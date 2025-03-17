
# Bookstore Inventory Management System

A **REST API** for managing a **bookstore inventory** using **Spring Boot** and **MySQL**. This system provides **secure authentication**, **role-based access control (RBAC)**, and **advanced book search functionality** (by title, author, or genre). It includes **CRUD operations** for managing **books, authors, genres, and users**, ensuring an efficient and well-organized inventory system.


## 🚀 Features

#### Books, Authors, Genres, and Users CRUD Operations
- 📌 Create, update, and delete (Admin only)
- 📌 Fetch all books or search by title, author, or genre and Display the results in a paginated format (Admin & User)
#### User Authentication & Authorization
- 🛡️ Admin users: Can manage Books, Authors, Genres, and Users (CRUD operations)
- 🔒 Regular users: Can view and search  books
#### Secure Authentication
- 🔑 Passwords stored securely using BCrypt hashing
- 🔐 Role-based access with Spring Security
- 🏗️ No sessions, Basic Auth for testing
#### Database Schema (MySQL)
- 📚 Book (Book details)
- ✍️ Author (Author details)
- 🏷️ Genre (Book categories)
- 👥 User (Login credentials & roles)



## 📂 Project Structure

![Image](https://github.com/user-attachments/assets/231583fc-7c08-4698-9f01-e9730d37f49a)
## Tech Stack

- **Language**: Java
- **Framework**: Spring Boot
- **Database**: MySQL
- **Dependencies**: Spring Web, MySQL Driver, Spring Data JPA, Spring Security, Lombok, DevTools
- **IDE**: IntelliJ IDEA
- **API Testing**: Postman


##  ⚙️ Setup Instructions

#### 1️⃣ Clone the Repository
https://github.com/engr-sakil/Bookstore-Inventory-Management-System.git

#### 2️⃣ Configure MySQL Database
- Open application.properties
- Update the database settings

#### 3️⃣ Run the Project
## REST API Endpoints

#### Books
| Method | Endpoint     | Description                |
| :-------- | :------- | :------------------------- |
| `POST` | `/admin/api/book` | Add a new book |
| `GET` | `/book/{book_id}` | Get book by ID |
| `GET` | `/all-book` | Get all books |
| `PUT` | `/admin/api/book` | Update book details |
| `DELETE` | `admin/api//book/{book_id}` | Delete a book |
| `GET` | `/search` | Search by title, author, or genre |

#### Authors
| Method | Endpoint     | Description                |
| :-------- | :------- | :------------------------- |
| `POST` | `/admin/api/author` | Add a new author |
| `GET` | `/admin/api/author/{author_id}` | Get author by ID |
| `GET` | `/admin/api/all-author` | Get all author |
| `PUT` | `/admin/api/author` | Update author details |
| `DELETE` | `/admin/api/author/{author_id}` | Delete a author |

#### Genres
| Method | Endpoint     | Description                |
| :-------- | :------- | :------------------------- |
| `POST` | `/admin/api/genre` | Add a new genre |
| `GET` | `/admin/api/genre/{genre_id}` | Get genre by ID |
| `GET` | `/admin/api/all-genre` | Get all genre |
| `PUT` | `/admin/api/genre` | Update genre details |
| `DELETE` | `/admin/api/genre/{genre_id}` | Delete a genre |

#### Users
| Method | Endpoint     | Description                |
| :-------- | :------- | :------------------------- |
| `POST` | `/admin/api/user` | Add a new user |
| `GET` | `/admin/api/user/{user_id}` | Get user by ID |
| `GET` | `/admin/api/all-user` | Get all user |
| `PUT` | `/admin/api/user` | Update user details |
| `DELETE` | `/admin/api/user/{user_id}` | Delete a user |

## 📧 Contact

- 💡 Have any questions? Reach out to me on:
- 📧 Email: sakilmia.swe@gmail.com
