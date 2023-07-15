package com.odavolt.pedoi.Components

import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.odavolt.pedoi.ui.theme.black
import com.odavolt.pedoi.ui.theme.gray500


@Composable
fun NormalText(
    modifier: Modifier = Modifier,
    value:String
){

    Text(text = value, color = gray500, fontSize = 12.sp, fontWeight = FontWeight.Normal, modifier = modifier)

}

@Composable
fun TitleText(
    modifier: Modifier = Modifier,
    value:String
){

    Text(text = value, color = black, fontSize = 18.sp, fontWeight = FontWeight.Bold, modifier = modifier)

}