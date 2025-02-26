package org.example.composemultiplatform.book.presentation.book_list.components

import androidx.compose.material.OutlinedTextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

/**
 * @author dkoller
 * @since 26.02.2025
 */

@Composable
fun BookSearchBar(
    searchQuery: String, //display search query
    onSearchQueryChange: (String) -> Unit, //trigger on query change
    onImeSearch: () -> Unit, //trigger on keyboard submit
    modifier: Modifier = Modifier
){
    OutlinedTextField(
        value = searchQuery,
        onValueChange = onSearchQueryChange,
        modifier = Modifier
    )
}