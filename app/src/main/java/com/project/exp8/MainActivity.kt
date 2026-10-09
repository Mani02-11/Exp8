package com.project.exp8


import android.os.Bundle
import android.view.ContextMenu
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.webkit.WebView
import android.webkit.WebViewClient
import android.widget.PopupMenu
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private lateinit var webView: WebView
    private lateinit var titleText: TextView
    private lateinit var studentInfoText: TextView
    private lateinit var btnPopupMenu: Button

    @android.annotation.SuppressLint("SetJavaScriptEnabled")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        webView = findViewById(R.id.webView)
        titleText = findViewById(R.id.titleText)
        studentInfoText = findViewById(R.id.studentInfoText)
        btnPopupMenu = findViewById(R.id.btnPopupMenu)

        webView.settings.javaScriptEnabled = true
        webView.webViewClient = WebViewClient()

        // Load a blank or default placeholder page initially
        webView.loadData(
            "<html><body style='text-align:center; padding-top:20px; color:#4C1D95; font-family:sans-serif;'><h3>Welcome to Web Explorer</h3><p>Use the Options Menu to open a website.</p></body></html>",
            "text/html",
            "UTF-8"
        )

        // Test Case 3: Register Context Menu on the student information card
        registerForContextMenu(studentInfoText)

        // Test Case 2: Implement Popup Menu
        btnPopupMenu.setOnClickListener { view ->
            val popup = PopupMenu(this, view)
            popup.menu.add(Menu.NONE, 1, 1, "Refresh Page")
            popup.menu.add(Menu.NONE, 2, 2, "Go Back")
            popup.setOnMenuItemClickListener { menuItem ->
                when (menuItem.itemId) {
                    1 -> {
                        webView.reload()
                        Toast.makeText(this, "Refreshing...", Toast.LENGTH_SHORT).show()
                    }
                    2 -> {
                        if (webView.canGoBack()) {
                            webView.goBack()
                        } else {
                            Toast.makeText(this, "Cannot go back", Toast.LENGTH_SHORT).show()
                        }
                    }
                }
                true
            }
            popup.show()
        }

        onBackPressedDispatcher.addCallback(
            this,
            object : androidx.activity.OnBackPressedCallback(enabled = true) {
                override fun handleOnBackPressed() {
                    if (::webView.isInitialized && webView.canGoBack()) {
                        webView.goBack()
                    } else {
                        isEnabled = false
                        onBackPressedDispatcher.onBackPressed()
                        isEnabled = true
                    }
                }
            },
        )
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        menuInflater.inflate(R.menu.main_menu, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            R.id.menu_home -> {
                webView.loadUrl("https://www.google.com")
                return true
            }

            R.id.menu_google -> {
                webView.loadUrl("https://www.google.com")
                return true
            }

            R.id.menu_about -> {
                Toast.makeText(
                    this,
                    "Experiment 8: Menus and WebView",
                    Toast.LENGTH_SHORT,
                ).show()
                return true
            }
        }

        return super.onOptionsItemSelected(item)
    }

    override fun onCreateContextMenu(
        menu: ContextMenu,
        v: View,
        menuInfo: ContextMenu.ContextMenuInfo?,
    ) {
        super.onCreateContextMenu(menu, v, menuInfo)
        menu.setHeaderTitle("Student Options")
        menu.add(0, 1, 0, "Show Student Details")
    }

    override fun onContextItemSelected(item: MenuItem): Boolean {
        if (item.itemId == 1) {
            Toast.makeText(
                this,
                "Manikandan P - 25MCAR0186",
                Toast.LENGTH_LONG,
            ).show()
            return true
        }

        return super.onContextItemSelected(item)
    }

}