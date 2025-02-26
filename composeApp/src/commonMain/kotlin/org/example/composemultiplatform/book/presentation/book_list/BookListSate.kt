package org.example.composemultiplatform.book.presentation.book_list

import org.example.composemultiplatform.book.domain.Book
import org.example.composemultiplatform.core.presentation.UiText

/**
 * @author dkoller
 * @since 26.02.2025
 *
 * book list has two tabs:
 *  - search results
 *  - favorites
 */
data class BookListSate(

    val searchQuery: String = "Kotlin",
    val searchResults: List<Book> = emptyList(),
    val favoriteBooks: List<Book> = emptyList(),
    val isLoading: Boolean = false,
    val selectedTaIndex: Int = 0,
    val errorMessage: UiText? = null) {
}