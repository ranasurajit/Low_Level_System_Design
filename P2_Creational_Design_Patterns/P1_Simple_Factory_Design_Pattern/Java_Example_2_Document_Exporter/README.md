# 📄 Document Exporter (Simple Factory Pattern)

A Java console application that demonstrates the use of the **Simple Factory Design Pattern** by exporting a document in different formats: **PDF**, **DOCX**, and **HTML**.

---

## 🚀 Features

- Export document content to multiple formats
- Clean separation of concerns via interfaces
- Type-safe enums instead of raw strings
- Decouples client code from concrete implementations
- Easy to extend for new formats (e.g., Markdown, JSON, etc.)

---

## 📁 Project Structure

src/
- ExportEnum.java               (Enum for format types)
- DocumentExporter.java         (Interface)
- PdfExporter.java              (Concrete exporter)
- DocxExporter.java
- HtmlExporter.java
- ExportFactoryService.java     (Simple Factory class)
- Main.java                     (Client code)

---

## 🔧 How to Run

1. Clone or download this repository.
2. Compile the project using `javac *.java`
3. Run the application using `java Main`

---

## 📌 Sample Output

Exporting document as PDF: Low Level Design Guide  
Exporting document as DOCX: System Design Notes  
Exporting document as HTML: <h1>Design Patterns</h1>

---

## 🧠 Tutor’s Verdict (LLD Review)

👨‍🏫 *By your LLD mentor: ChatGPT*

**Your implementation demonstrates excellent clarity and understanding of the Simple Factory Design Pattern. Here's the breakdown:**

Evaluation Criteria             | Result     
-------------------------------|------------
✅ Pattern Understanding        | Strong grasp of the pattern's role in decoupling
✅ Code Quality                 | Clean, readable, and extensible
✅ Enum Usage                  | Properly replaced unsafe strings with `ExportEnum`
✅ Factory Naming              | Changed to `getExporter()` — improves clarity and intent
✅ Client Abstraction          | Fully decoupled from concrete implementations
✅ Readiness for Interviews    | 💯 Interview-ready for Simple Factory Pattern discussions

✅ **Verdict:** You are ready to take on LLD interviews involving Simple Factory Pattern confidently!

---

## ✅ Next Suggested Steps

- Try extending the factory for new formats like MARKDOWN
- Move on to the Factory Method or Strategy Pattern
- Practice applying patterns in larger LLD problems like:
  - Logger System
  - Payment Gateway
  - In-Memory Cache
  - Online Editor

---

## 👨‍💻 Author

**Surajit Rana**  
Practicing LLD with a hands-on, refactor-first approach.
