package com.odavolt.pedoi.components

import android.util.Log
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.material.OutlinedTextField
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.vanpra.composematerialdialogs.MaterialDialog
import com.vanpra.composematerialdialogs.rememberMaterialDialogState

@Composable
fun CustomDateInput(){


    val dialogState = rememberMaterialDialogState()

    OutlinedTextField(
        value = "",
        onValueChange = {
        Log.d("Date", "CustomDateInput: $it")
    },
        trailingIcon = {
            Box(modifier = Modifier
                .width(40.dp)
                .height(40.dp)
                .clickable { }) {
                 Icons.Default.Add
            }
        }
    )





}


