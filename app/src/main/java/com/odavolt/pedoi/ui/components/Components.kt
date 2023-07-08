package com.odavolt.pedoi.ui.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.outlined.MoreVert
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.odavolt.pedoi.ui.theme.*


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
    icon: ImageVector,
    keyboardActions: KeyboardActions,
    keyboardOptions: KeyboardOptions,
    value:TextFieldValue,
    onValueChange:(value:TextFieldValue)-> Unit
){

     OutlinedTextField(
         modifier = modifier
             .fillMaxWidth()
         ,
         colors = TextFieldDefaults.outlinedTextFieldColors(
             focusedBorderColor = Color.Transparent,
             backgroundColor = gray500,
             cursorColor = green700,
             unfocusedBorderColor = Color.Transparent


         ),
         shape = RoundedCornerShape(24.dp),
         placeholder= {
                 Text(text = placeholder)
         },
         leadingIcon = {
              Icon(imageVector = icon , contentDescription ="icon" )

         },
         value = value,
         singleLine = true,
         maxLines = 1,
         onValueChange ={
             onValueChange(it)

         }
     )

 }



@Composable
fun PasswordTextInput(
    modifier: Modifier = Modifier,
    placeholder:String,
    icon: ImageVector,
    keyboardActions: KeyboardActions,
    keyboardOptions: KeyboardOptions = KeyboardOptions(
        keyboardType = KeyboardType.Password
    ),
    value:TextFieldValue,
    onValueChange:(value:TextFieldValue)-> Unit
){

    OutlinedTextField(
        modifier = modifier
            .fillMaxWidth()
        ,
        colors = TextFieldDefaults.outlinedTextFieldColors(
            focusedBorderColor = Color.Transparent,
            backgroundColor = gray500,
            cursorColor = green700,
            unfocusedBorderColor = Color.Transparent


        ),
        shape = RoundedCornerShape(24.dp),
        placeholder= {
            Text(text = placeholder)
        },
        leadingIcon = {
            Icon(imageVector = icon , contentDescription ="icon" )

        },
        trailingIcon = {
            Icon(imageVector = Icons.Outlined.MoreVert, contentDescription ="visibility icon" )
        },
        value = value,
        singleLine = true,
        maxLines = 1,
        onValueChange ={
            onValueChange(it)

        }
    )

}


@Composable
fun CustomButton(
    modifier:Modifier = Modifier,
    title:String,
    onClick:()->Unit
){

    Button(
        modifier = Modifier
            .fillMaxWidth()
            .height(48.dp),
        colors = ButtonDefaults.buttonColors(
            backgroundColor = green700,

        ),
        shape = RoundedCornerShape(24.dp),
        onClick = { /*TODO*/ }) {
           Text(text = title, fontSize = 14.sp, color =  white, fontWeight = FontWeight.Medium, textAlign = TextAlign.Center)
    }
}