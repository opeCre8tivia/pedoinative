package com.odavolt.pedoi.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.odavolt.pedoi.R
import com.odavolt.pedoi.ui.theme.*


@Composable
fun NormalText(
    modifier: Modifier = Modifier,
    value:String,

){

    Text(text = value, color = gray700, fontSize = 16.sp, fontWeight = FontWeight.Normal, modifier = modifier)

}

@Composable
fun TitleText(
    modifier: Modifier = Modifier,
    value:String,
    style:TextStyle = TextStyle.Default
){

    Text(
        text = value,
        color = black,
        fontSize = 24.sp,
        fontWeight = FontWeight.Bold,
        modifier = modifier,
        style = style

         )

}


@Composable
fun CustomTextField(
    modifier: Modifier = Modifier,
    value:MutableState<TextFieldValue>,
    placeholder:String,
    label:String? = null,
    imeAction: ImeAction = ImeAction.Done,
    keyboardOptions: KeyboardOptions = KeyboardOptions.Default,
    keyboardActions: KeyboardActions = KeyboardActions.Default,
    onValueChange:(value:TextFieldValue)-> Unit
){

    OutlinedTextField(
        value = value.value,
        onValueChange = onValueChange,
        placeholder = {
            Text(text = placeholder)
        },
        singleLine = true,
        keyboardOptions = keyboardOptions ,
        keyboardActions = keyboardActions,
        shape = RoundedCornerShape(10.dp),
        maxLines = 1,
        colors = TextFieldDefaults.outlinedTextFieldColors(
            backgroundColor = gray500,
            unfocusedBorderColor = gray500,
            focusedBorderColor = gray500,
            focusedLabelColor = gray700,
            textColor = gray700,
            cursorColor = gray700
        ),
        modifier = modifier
            .fillMaxWidth()
        
     

    )

}


@Composable
fun CustomButton(
    modifier: Modifier = Modifier,
    title:String,
    enabled:Boolean = false,
    onClick:()-> Unit
){

    Button(
        onClick = onClick,
        modifier = modifier
            .height(50.dp)
            .fillMaxWidth(),
        enabled = enabled,
        colors = ButtonDefaults.buttonColors(
            backgroundColor = green700,
            contentColor = white,
            disabledBackgroundColor = green700.copy(0.6f),
            disabledContentColor = white.copy(0.9f)


        ),
        shape = RoundedCornerShape(50),
    ) {
        Text(text = title)
    }

}


@Composable
fun AccountTypeCard(
    modifier: Modifier = Modifier,
    title:String,
    description:String,
    image:Painter,
    onClick: () -> Unit


){

    Card(
        modifier = Modifier
            .fillMaxWidth()
            .height(224.dp)
            .padding(20.dp)
            .clickable {
                onClick()
            }
        ,
        backgroundColor = green500
    ) {

        Row(modifier = Modifier
            .fillMaxSize()
            .padding(20.dp),
            horizontalArrangement = Arrangement.Start,
            verticalAlignment = Alignment.Top

        ) {

            Box(
                modifier = Modifier
                    .width(80.dp)
                    .fillMaxHeight(),
                    contentAlignment = Alignment.Center

                    ) {
                Image(
                    painter = image,
                    contentDescription ="Account type image",
                    modifier= Modifier
                        .width(60.dp)
                        .height(60.dp)
                )
            }
            Column(modifier = Modifier
                .fillMaxSize(),
                verticalArrangement = Arrangement.Top,
                horizontalAlignment = Alignment.Start

            ) {

                TitleText(value = title)
                NormalText(value = description)
            }

        }
    }

}


@Composable
fun FarmerHomeCarouselCard(){
    Card(modifier = Modifier
        .fillMaxWidth()
        .height(150.dp),
        backgroundColor = green700,
        shape = RoundedCornerShape(10.dp)
    ) {
         Row(modifier = Modifier
             .fillMaxSize()
             .padding(4.dp),
             horizontalArrangement = Arrangement.Center,
             verticalAlignment = Alignment.CenterVertically
         ) {

             Image(

                 painter = painterResource(id = R.drawable.cashew_pack), contentDescription ="cashew image",
                 modifier = Modifier
                     .width(100.dp)
                     .height(100.dp)
             )
             Text(
                 text = "Empowering Farmers through extension services and value addition",
                 color =  white,
                 fontSize = 14.sp,
                 textAlign = TextAlign.Center,
                 fontWeight = FontWeight.SemiBold
             )
         }
    }
}


@Composable
fun FarmerHomeActionCard(
    title: String = "Manage Cashew Plants",
    description: String = "You are doing great, keep planting\n" +
            "make sure to finish your daily \n" +
            "task list",
    totalItems:Int = 50,
    itemName:String = "Plants"
){
    Card(modifier = Modifier
        .fillMaxWidth()
        .height(180.dp)
        .padding(vertical = 6.dp)
        ,
        backgroundColor = white,
        shape = RoundedCornerShape(10.dp)
    ) {
        
        Column(modifier = Modifier
            .fillMaxSize()
            .padding(2.dp),
            verticalArrangement = Arrangement.Top,
            horizontalAlignment = Alignment.CenterHorizontally
            
        ) {

            
            TitleText(value =title)
            Row(modifier = Modifier
                .fillMaxWidth()
                .padding(top = 10.dp),
                horizontalArrangement = Arrangement.Center,
                verticalAlignment = Alignment.Top
            ) {

               Column(modifier = Modifier
                   .width(100.dp)
                   .fillMaxHeight(),
                   verticalArrangement = Arrangement.Top,
                   horizontalAlignment = Alignment.CenterHorizontally
               ) {

                   Text(
                       text = totalItems.toString(),
                       fontSize = 20.sp,
                       fontWeight = FontWeight.Bold,
                       textAlign = TextAlign.Center,
                       color= green700
                   )
                   Text(
                       text = itemName,
                       fontSize = 16.sp,
                       fontWeight = FontWeight.Bold,
                       textAlign = TextAlign.Center,
                       color= green700
                   )

               }
               NormalText(value = description)
            }
        }
    }
}




