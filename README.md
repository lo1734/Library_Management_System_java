# 📚 Library Management System (Java OOP Project)

A console-based Library Management System built using **Core Java** demonstrating:

- Inheritance
- Polymorphism
- Abstraction
- Encapsulation
- Data Structures (HashMap, ArrayList)
- Date handling (LocalDate, ChronoUnit)

---

## 🚀 Features

- Add Printed Books
- Add EBooks
- Add Members
- Issue Books
- Return Books
- Automatic Due Date Calculation
- Late Fine Calculation
- Menu-driven Console Application

---

## 🏗️ OOP Concepts Used

| Concept        | Implementation |
|---------------|---------------|
| Inheritance    | `EBook` and `PrintedBook` extend `Book` |
| Polymorphism   | Different `calculateFine()` and `getMaxIssueDays()` |
| Abstraction    | `Book` is abstract |
| Encapsulation  | Private members with getters |
| Composition    | `Member` contains `List<Book>` |
| Data Structures| `HashMap`, `ArrayList` |

---

## 📂 Project Structure

```
LibraryManagementSystem/
│
├── src/
│   ├── Book.java
│   ├── EBook.java
│   ├── PrintedBook.java
│   ├── Member.java
│   ├── Library.java
│   └── Main.java
│
└── README.md
```

---

## 📘 Class Design

### 1️⃣ Book (Abstract Class)

- Common properties for all books
- Defines:
  - `getMaxIssueDays()`
  - `calculateFine()`
- Handles:
  - Issue date
  - Due date
  - Return & fine calculation

### 2️⃣ EBook

- Max Issue Days: 7
- Fine: ₹2 per extra day

### 3️⃣ PrintedBook

- Max Issue Days: 14
- Fine: ₹5 per extra day

### 4️⃣ Member

- Stores member details
- Maintains list of issued books

### 5️⃣ Library

- Manages:
  - Book collection (HashMap)
  - Member collection (HashMap)
- Handles issue/return logic

### 6️⃣ Main

- Menu-driven console UI

---

## 🧠 Working Logic

### 📌 Issue Book

1. Validate Book ID
2. Validate Member ID
3. Check if already issued
4. Set:
   - Issue Date = Today
   - Due Date = Today + maxIssueDays

---

### 📌 Return Book

1. Calculate extra days:
   ```
   extraDays = DAYS.between(dueDate, today)
   ```
2. If extraDays > 0:
   ```
   fine = calculateFine(extraDays)
   ```

---

## 🖥️ How to Run

### 🔹 Using Command Line

```bash
cd src
javac *.java
java Main
```

### 🔹 Using IntelliJ / Eclipse

1. Create new Java Project
2. Add all `.java` files inside `src`
3. Run `Main.java`

---

## 📷 Sample Console Output

```
1. Add Printed Book
2. Add EBook
3. Add Member
4. Issue Book
5. Return Book
6. Exit
Choose option: 1

Book ID: P101
Title: Java Programming
Book added successfully.

Choose option: 3
Member ID: M1
Name: Lohit
Member added successfully.

Choose option: 4
Book ID: P101
Member ID: M1
Book issued successfully. Due date: 2026-02-25
```

---

## 🔮 Future Enhancements

- File persistence (CSV/JSON)
- Admin authentication
- Max books per member limit
- GUI version (JavaFX/Swing)
- Spring Boot REST API version
- Database integration (MySQL/PostgreSQL)

---

## 📌 Why This Project is Interview-Friendly?

This project clearly demonstrates:

- Real-world OOP modeling
- Clean class hierarchy
- Proper abstraction
- Polymorphism in action
- Good use of Java Collections
- Date/time API usage

Perfect for:
- OOP interview rounds
- Fresher Java interviews
- ThoughtWorks-style design rounds

---

## 👨‍💻 Author

Lohit  

---

⭐ If you found this useful, consider starring the repository!
