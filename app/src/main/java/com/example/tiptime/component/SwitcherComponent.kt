package com.example.tiptime.component

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.wrapContentWidth
import androidx.compose.material3.Switch
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import com.example.tiptime.R

class SwitcherComponent {
    @Composable
    fun SwitcherWidget(
        modifier: Modifier = Modifier, roundUp: Boolean,
        onRoundUpChanged: (Boolean) -> Unit,
    ) {
        Row(
            modifier = modifier
                .fillMaxWidth()
                .size(48.dp),
//            verticalAlignment = Alignment.CenterVertically
        ) {
            Text(text = stringResource(R.string.round_up_tip))
            Switch(
                checked = roundUp,
                onCheckedChange = onRoundUpChanged,
                modifier = modifier
                    .fillMaxWidth()
                    .wrapContentWidth(Alignment.End),
            )
        }
    }
}