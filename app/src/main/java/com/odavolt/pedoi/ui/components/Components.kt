package com.odavolt.pedoi.ui.components

import android.graphics.drawable.VectorDrawable
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.OutlinedTextField
import androidx.compose.material.Text
import androidx.compose.material.TextFieldColors
import androidx.compose.material.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.odavolt.pedoi.ui.theme.black
import com.odavolt.pedoi.ui.theme.gray500
import com.odavolt.pedoi.ui.theme.gray700
import com.odavolt.pedoi.ui.theme.green700


/**
* this carries all the test styles for the normal text
*/

@Composable
fun TextNormal(modifier: Modifier = Modifier, value:String ){

    Text(text = value , fontSize = 18.sp, fontWeight = FontWeight.Normal, color = gray700)
}


/**
 * this carries all the test styles for the heading texts
 */
@Composable
fun TextHeading(modifier: Modifier = Modifier, value:String ){

    Text(text = value , fontSize = 25.sp, fontWeight = FontWeight.Bold, color = black)
}


@Composable
 fun CustomTextInput(
    modifier: Modifier = Modifier,
    placeholder:String,
    icon:VectorDrawable = VectorDrawable(),
    keyboardActions: KeyboardActions,
    keyboardOptions: KeyboardOptions,
    value:TextFieldValue,
    onValueChange:(value:TextFieldValue)-> Unit
){

     OutlinedTextField(
         modifier = modifier
             .fillMaxWidth()
             .border(width = 1.dp, color = gray500)
             .clip(shape = RoundedCornerShape(4.dp))
         ,
         colors = TextFieldDefaults.outlinedTextFieldColors(
             focusedBorderColor = gray500,
             backgroundColor = gray500,
             cursorColor = green700,


         ),
         placeholder= {
                 Text(text = placeholder)
         },
         value = value,
         onValueChange ={
             onValueChange(it)

         }
     )

 }