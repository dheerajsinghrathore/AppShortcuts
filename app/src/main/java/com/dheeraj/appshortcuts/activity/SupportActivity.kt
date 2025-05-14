package com.dheeraj.appshortcuts.activity

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.dheeraj.appshortcuts.activity.ui.theme.AppShortcutsComposeTheme

class SupportActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            AppShortcutsComposeTheme {
                SupportScreen()
            }
        }
    }
}

@Composable
fun SupportScreen() {
    Surface(modifier = Modifier.fillMaxSize()) {
        Text("Welcome to Support", modifier = Modifier.padding(16.dp))
    }
}
