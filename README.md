# 📱 Experiment 8 – Implement Menus and WebView

## Develop an Android Application Using Menus and WebView

---

## 👨‍💻 Student Details

**Name:** Manikandan P
**USN:** 25MCAR0186
**Subject:** Mobile Application Development Lab
**Package Name:** `com.project.exp8`

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

## Test Case 1 – Application Launch

### Objective

To verify that the application launches successfully and displays the student information page.

### Input

Launch the application.

### Expected Result

The application should display the home screen with the toolbar, student information card, menu buttons, and WebView content.

### Actual Result

The home screen is displayed successfully with the student information and WebView content.

### Status

✅ **Passed**

### Screenshot

Add the screenshot of the application home screen here.

---

## 🧪 Test Case 2 – Options Menu

### Objective

To verify that the Options Menu displays the available application actions.

### Input

Tap the Options Menu icon on the toolbar.

### Expected Result

The menu should display the available options, such as Home, Open Website, and About.

### Actual Result

The Options Menu is displayed, and the user can select the available actions.

### Status

✅ **Passed**

### Screenshot

Add the screenshot showing the Options Menu here.

---

## 🧪 Test Case 3 – Context Menu

### Objective

To verify that the Context Menu appears when the student information card is long-pressed.

### Input

Long-press the student information card.

### Expected Result

The Context Menu should appear and display the actions configured for the selected view.

### Actual Result

The Context Menu appears after the student information card is long-pressed.

### Status

✅ **Passed**

### Screenshot

Add the screenshot showing the Context Menu here.

---

## 🧪 Test Case 4 – Popup Menu

### Objective

To verify that the Popup Menu appears when the Popup Menu button is clicked.

### Input

Tap the Popup Menu button.

### Expected Result

A Popup Menu should appear near the button with the available menu actions.

### Actual Result

The Popup Menu is displayed successfully.

### Status

✅ **Passed**

### Screenshot

Add the screenshot showing the Popup Menu here.

---

## 🧪 Test Case 5 – WebView Integration

### Objective

To verify that the application displays HTML content and loads a website using WebView.

### Input

Select the Open Website option from the Options Menu.

### Expected Result

The selected website should load inside the application's WebView without requiring a separate browser.

### Actual Result

The website is displayed inside the WebView when an internet connection is available.

### Status

✅ **Passed**

### Screenshot

Add the screenshot showing the website loaded inside WebView here.

---
