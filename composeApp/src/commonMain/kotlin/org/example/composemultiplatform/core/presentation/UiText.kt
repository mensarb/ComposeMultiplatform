package org.example.composemultiplatform.core.presentation

import androidx.compose.runtime.Composable
import org.jetbrains.compose.resources.StringResource
import org.jetbrains.compose.resources.stringResource

/**
 * @author dkoller
 * @since 26.02.2025
 */
sealed interface UiText {

    data class DynamicString(
        val value: String
    ): UiText

    class StringResourceId(
        val id: StringResource,
        val args: Array<Any> = arrayOf()
    ): UiText

    @Composable
    fun asString(): String{
        return when(this){
            is DynamicString -> {
                value
            }
            is StringResourceId -> {
                stringResource(
                    resource = id,
                    formatArgs = args
                )
            }
        }
    }
}