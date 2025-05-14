package com.dheeraj.appshortcuts.activity

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

class BookRideActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BookRideScreen()
        }
    }
}


@Composable
fun BookRideScreen() {
    Surface(modifier = Modifier.fillMaxSize()) {
        Text("Book your ride now!", modifier = Modifier.padding(16.dp))
    }
}