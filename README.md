# ☕ Java Programming Practice

![Java](https://img.shields.io/badge/Java-17%2B-orange?logo=openjdk&logoColor=white)
![OOP](https://img.shields.io/badge/Concepts-OOP%20%7C%20DSA%20%7C%20Collections-blue)
![License](https://img.shields.io/badge/license-MIT-green)

> A structured collection of Java programs covering core language fundamentals, OOP principles, and common DSA patterns — built during academic training at GITAM University and extended during TCS preparation.

---

## 📌 Table of Contents

- [About](#about)
- [Topics Covered](#topics-covered)
- [Folder Structure](#folder-structure)
- [How to Run](#how-to-run)
- [About the Author](#about-the-author)

---

## About

This repository documents a progressive Java learning journey from basic syntax through object-oriented design. It covers variable handling, arithmetic operations, class design (constructors, inheritance, polymorphism), string manipulation, and data structure patterns.

Files follow a numbered/named convention (`first.java`, `second.java`, `Car.java`, `bank.java`) that mirrors the sequence of topics learned.

---

## Topics Covered

| Category              | Files                                                         |
|-----------------------|---------------------------------------------------------------|
| Variables & I/O       | `first.java`, `Argsvar.java`, `readcommandline.java`         |
| Arithmetic & Operators| `arithmaticops.java`, `Arthmeticchar.java`, `keywords.java`  |
| Control Flow          | `second.java` – `tenth.java`, `modfour*.java`, `modfive*.java` |
| OOP – Classes         | `Car.java`, `Student.java`, `book.java`, `bank.java`         |
| OOP – Constructors    | `constructoroverload.java`                                    |
| OOP – Polymorphism    | `dynamic.java`                                               |
| Static & Keywords     | `Static.java`                                                 |
| String Handling       | `stringbuffer1.java`                                         |
| Problem Solving       | `Solution.java`, `positivenegative.cpp`                      |

> `modfour*` and `modfive*` files = module exercises (numbered by topic sequence)

---

## Folder Structure

**Current (flat, all at root):**

```
java/
├── first.java ... tenth.java
├── Car.java, Student.java, bank.java, book.java
├── modfour*.java, modfive*.java
├── *.class                    ← compiled binaries (should be gitignored)
├── tcs java.iml               ← IDE project file
└── README.md
```

**Recommended:**

```
java/
├── basics/
│   ├── HelloWorld.java
│   ├── Variables.java
│   └── ArithmeticOps.java
│
├── control-flow/
│   ├── IfElse.java
│   ├── Loops.java
│   └── SwitchCase.java
│
├── oop/
│   ├── Car.java
│   ├── Student.java
│   ├── Bank.java
│   ├── Book.java
│   ├── ConstructorOverload.java
│   └── DynamicPolymorphism.java
│
├── strings/
│   └── StringBufferDemo.java
│
├── problem-solving/
│   └── Solution.java
│
├── .gitignore                 ← add *.class, *.iml, out/
└── README.md
```

**Key fixes:**
- Remove all `.class` files (add `*.class` to `.gitignore`)
- Remove `tcs java.iml` (IDE-specific, should not be committed)
- Rename files to `PascalCase.java` (Java convention)

---

## How to Run

```bash
# Clone
git clone https://github.com/ShivaGunuru/java.git
cd java

# Compile any file
javac Car.java

# Run
java Car
```

> Requires JDK 11+ installed. Verify with `java -version`.

---

## .gitignore

```gitignore
*.class
*.iml
out/
.idea/
.vscode/
```

---

## About the Author

**Gunuru Venkata Shiva Kumar**
B.Tech CSE | GITAM University, Visakhapatnam (CGPA: 8.99)
Backend Developer — Java, Spring Boot, Microservices

- 📧 shiva.gunuru@gmail.com
- 🔗 [GitHub](https://github.com/ShivaGunuru)
- 🔗 [LinkedIn](https://linkedin.com/in/shiva-gunuru)
