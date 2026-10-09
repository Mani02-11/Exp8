# 📱 Experiment 8 – Implement Menus and WebView

## Develop an Android Application Using Menus and WebView

---

## 👨‍💻 Author

**Name:** Manikandan P  
**USN:** 25MCAR0186  
**Subject:** Mobile Application Development Lab

---


## 📖 Experiment Description

This experiment demonstrates the implementation of **Android Menus and WebView** using Kotlin and XML.

The application provides an attractive student information interface displaying the student's name and USN. It demonstrates three types of menus that allow users to perform different actions. The application also integrates WebView to display HTML content and open a website directly inside the application.

Users can interact with the toolbar menu, long-press the student information card to access the Context Menu, and tap the Popup Menu button to display additional options.

### Scenario

The application simulates a **Student Information and Web Browsing System**.

```text
          Student Information App
                    ↓
              Display Home Page
                    ↓
          ┌─────────┼──────────┐
          ↓         ↓          ↓
     Options Menu  Context    Popup Menu
                    Menu
          ↓         ↓          ↓
        Select     Long Press  Tap Popup
        Action       Card       Button
                    ↓
             Display Web Content
                    ↓
            Open Website in WebView
```

---

## 🧠 Concept / Technology Used

### Android Menus and WebView

Android menus provide users with options to perform actions within an application. WebView allows web content to be displayed inside an Android application.

This application uses the following concepts:

* **Options Menu** – Displays general application actions through the toolbar menu.
* **Context Menu** – Displays actions related to a particular view when the user long-presses it.
* **Popup Menu** – Displays a small menu anchored to a particular view, such as a button.
* **WebView** – Displays HTML content and website pages inside the application.
* **Toolbar** – Provides a top application bar with menu options.
* **Toast** – Displays short messages to the user.
* **Kotlin** – Handles menu selections, click events, and application logic.
* **XML** – Defines the user interface and menu resources.
* **Android Studio** – Used for application development and testing.

---

## 🚀 Features

* 🎓 Attractive student information interface
* 👤 Displays student name
* 🆔 Displays student USN
* 🎨 Gradient background and custom card design
* 📋 Options Menu in the toolbar
* 📌 Context Menu using long press
* 🔽 Popup Menu using a button
* 🌐 WebView integration
* 📄 Displays HTML welcome content
* 🔗 Opens a website inside the application
* 🏠 Home navigation option
* ℹ️ About option
* 💬 Displays status messages for user actions
* 📱 Scrollable user interface

---


---

# 📂 Project Structure

```text
app/
│
├── manifests/
│   └── AndroidManifest.xml
│
├── java/
│   └── com/
│       └── project/
│           └── exp8/
│               └── MainActivity.kt
│
├── res/
│   │
│   ├── drawable/
│   │   ├── bg_gradient.xml
│   │   ├── bg_card.xml
│   │   └── bg_button.xml
│   │
│   ├── layout/
│   │   └── activity_main.xml
│   │
│   ├── menu/
│   │   └── options_menu.xml
│   │
│   └── values/
│       ├── colors.xml
│       ├── strings.xml
│       └── themes.xml
│
└── Gradle Scripts
```

---

# 🎨 User Interface

The application contains a modern interface with the following elements:

* Toolbar with an Options Menu
* Student information card
* Student name and USN
* Home button
* Popup Menu button
* Status message area
* WebView displaying HTML content or a website
* Gradient background
* Custom buttons and card styling
* Footer containing student information

---

# 🧪 Test Cases

## Test Case 1 – Application Launch and Student Details

### Objective

To verify that the application launches successfully and displays the student's name and USN.

### Input

Launch the Experiment 8 application.

### Expected Result

The home screen should display the student information, toolbar, menu controls, and WebView content.

### Actual Result

The application launches and displays the student information and home screen successfully.

### Status

✅ **Passed**

### Screenshot – Application Output

Insert your home-screen screenshot here. Ensure that **Manikandan P** and **25MCAR0186** are visible.

---

## 🧪 Test Case 2 – Options Menu and Popup Menu

### Objective

To verify that the Options Menu and Popup Menu display their available actions.

### Input

1. Tap the Options Menu icon in the toolbar.
2. Close the menu and tap the Popup Menu button.

### Expected Result

The Options Menu should display options such as Home, Open Website, and About. The Popup Menu should display its configured actions.

### Actual Result

The Options Menu and Popup Menu display their available actions successfully.

### Status

✅ **Passed**

### Screenshot

Insert a screenshot showing the Options Menu or Popup Menu here.

---

## 🧪 Test Case 3 – Context Menu and WebView

### Objective

To verify that the Context Menu appears on a long press and that WebView can display website content.

### Input

1. Long-press the student information card to display the Context Menu.
2. Select the Open Website option from the Options Menu.

### Expected Result

The Context Menu should display its configured actions. The selected website should load inside WebView when an internet connection is available.

### Actual Result

The Context Menu appears on long press, and the website loads inside WebView when internet access is available.

### Status

✅ **Passed**

### Screenshot

Insert a screenshot showing the Context Menu or the website loaded inside WebView here.

---
