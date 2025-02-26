package org.example.composemultiplatform

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import org.example.composemultiplatform.book.presentation.book_list.components.BookSearchBar
import androidx.compose.ui.tooling.preview.Preview

/**
 * @author dkoller
 * @since 26.02.2025
 *
 * previews of composables in the project, since the preview for KMP is not yet supported in commonMain
 *
 * preview is working in android implementation
 */

@Preview(
    showBackground = true
)
@Composable
fun BookSearchBarPreview(){
    MaterialTheme {
        BookSearchBar(
            searchQuery = "Kotlin",
            onSearchQueryChange = {

            },
            onImeSearch = {

            },
            modifier = Modifier
                .fillMaxWidth()
                .background(
                    color = Color.White
                )
        )
    }
}