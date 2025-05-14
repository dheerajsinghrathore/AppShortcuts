package com.dheeraj.appshortcuts

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.unit.dp
import com.dheeraj.appshortcuts.ui.theme.AppShortcutsComposeTheme

//Static shortcuts require API level 25 (Android 7.1) or higher.


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            AppShortcutsComposeTheme {
                Surface {
                    MainScreen()
                }
            }
        }
    }
}

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun MainScreen() {
    Scaffold(
        content = {
            Text(
                text = "Long-press the app icon to see shortcuts.",
                modifier = androidx.compose.ui.Modifier.padding(16.dp)
            )
        }
    )
}
