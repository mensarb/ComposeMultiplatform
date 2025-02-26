package org.example.composemultiplatform.book.presentation.book_list

import org.example.composemultiplatform.book.domain.Book

/**
 * @author dkoller
 * @since 26.02.2025
 */
sealed interface BookListAction {

    data class OnSearchQueryChange(
        val query: String
    ): BookListAction

    data class OnBookClick(
        val book: Book
    ): BookListAction

    data class OnTabSelected(
        val index: Int
    ): BookListAction

}