# WIP, NOT FUNCTIONAL AT THE MOMENT, DONT EVEN TRY TO RUN IT

# FocusPad

**FocusPad** is a minimal, terminal-based task manager designed for individual use.  
It allows users to create, view, edit, and delete tasks directly from the command line – without distractions, accounts, or cloud storage.

---

## 🎯 Target Audience

FocusPad is built for:
- Developers and power users who prefer the terminal
- Privacy-conscious individuals (no cloud, no storage)
- Anyone looking for a simple and clean productivity tool without UI overhead

---

## 🧩 Core Features (v1.0)

- Create new tasks with title and description
- Display all current tasks
- Edit task title, description, and completion state
- Delete tasks by ID or title
- Assigns each task a unique identifier (UUID)
- Simple and user-friendly menu navigation

---

## 🛠️ Technical Overview

- Language: **Java 17+**
- No persistent storage: tasks exist in memory only (for the moment, at release it will be stored locally)
- Structured OOP design: `Task`, `TaskManager`, `UiHandler`
- No external libraries or frameworks required

---

## 🗂️ Project Structure
 TODO