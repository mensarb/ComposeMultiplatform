package org.example.composemultiplatform.book.presentation.book_list

import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import org.example.composemultiplatform.book.domain.Book
import org.koin.compose.viewmodel.koinViewModel

/**
* @author dkoller
* @since 26.02.2025
 *
 * created as a kotlin file
 *
 * extra composable for preview BookListScreenRoot()
 *
 * BookListScreen() is now isolated from viewmodel
*/

@Composable
fun BookListScreenRoot(
    viewModel: BookListViewModel = koinViewModel(), //injected viewModel via koin DI
    onBookClick: (Book) -> Unit, //lambda method as parameter
    modifier: Modifier = Modifier
){
    val state by viewModel.state.collectAsStateWithLifecycle()

    BookListScreen(
        state = state,
        onAction = {
            action ->

            when(action){
                is BookListAction.OnBookClick -> {

                    //handle book click in composable. viewmodel might not have the access that is needed
                    onBookClick(action.book)
                }
                else -> {
                    viewModel.onAction(action) //forward remaining action to viewmodel
                }
            }
        }
    )
}

@Composable
private fun BookListScreen(
    state: BookListSate,
    onAction: (BookListAction) -> Unit
){

}