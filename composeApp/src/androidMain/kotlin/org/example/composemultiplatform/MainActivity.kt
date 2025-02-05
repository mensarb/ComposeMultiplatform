package org.example.composemultiplatform

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        enableEdgeToEdge()
        setContent {
            BaseLayout()
        }
    }

    @Preview(
        showBackground = true
    )
    @Composable
    fun Preview() {
        BaseLayout()
    }

    /**
     * =============================================================================================
     * base layout
     * =============================================================================================
     */

    @Composable
    fun BaseLayout(){
        App()
    }
}