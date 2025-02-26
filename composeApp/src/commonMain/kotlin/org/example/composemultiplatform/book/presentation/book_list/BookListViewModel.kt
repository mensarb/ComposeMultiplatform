package org.example.composemultiplatform.book.presentation.book_list

import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update


/**
 * @author dkoller
 * @since 26.02.2025
 */
class BookListViewModel: ViewModel() {

    private val _state = MutableStateFlow(BookListSate()) //mutable private state
    val state = _state.asStateFlow() //public usable state

    /**
     * update state based on action
     *
     *  - use update{} to update state in a threadsafe manner
     *  - use copy() to update the parameter
     */
    fun onAction(
        action: BookListAction
    ){
        when(action){
            is BookListAction.OnBookClick -> {
                //handled outside
            }
            is BookListAction.OnSearchQueryChange -> {
                _state.update {
                    state ->

                    //update the search query with the one from action
                    state.copy(
                        searchQuery = action.query
                    )
                }
            }
            is BookListAction.OnTabSelected -> {
                _state.update {
                    state ->

                    state.copy(
                        selectedTaIndex = action.index
                    )
                }
            }
        }
    }
}