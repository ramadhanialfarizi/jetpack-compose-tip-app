package com.example.tiptime.component

import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.input.KeyboardType

class TextFieldComponent {
    @Composable
    fun TextFieldWidget(
        modifier: Modifier = Modifier,
        value: String?,
        onValueChange: (String) -> Unit,
        label: @Composable() (() -> Unit)? = {},
        placeholder: @Composable() (() -> Unit)? = {},
        keyboardOption: KeyboardOptions? = KeyboardOptions(),
        leadingIcons :  @Composable() (() -> Unit)? = {},
    ) {
        TextField(
            value = value ?: "",
            onValueChange = onValueChange,
            modifier = modifier,
            label = label,
            singleLine = true,
            placeholder = placeholder,
            keyboardOptions = keyboardOption ?: KeyboardOptions(),
            leadingIcon = leadingIcons,
            )
    }
}