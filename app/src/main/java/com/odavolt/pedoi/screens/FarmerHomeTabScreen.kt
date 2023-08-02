package com.odavolt.pedoi.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.odavolt.pedoi.components.FarmerHomeActionCard
import com.odavolt.pedoi.components.FarmerHomeCarouselCard
import com.odavolt.pedoi.ui.theme.gray500

@Composable
fun FarmerHomeTabScreen(){
    Surface(modifier = Modifier
        .fillMaxSize(),
        color = gray500

    ) {


        Column (modifier = Modifier
            .fillMaxSize()
            .padding(20.dp),
            verticalArrangement = Arrangement.Top,
            horizontalAlignment = Alignment.CenterHorizontally


        ){

           FarmerHomeCarouselCard()

            LazyColumn(){
                items(count = 1){
                    FarmerHomeActionCard(
                        title = "Apply for Products",
                        description = "You can apply for products such as seedlings,chicks,pesticides etc and it will be delivered to your farm",
                        itemName = "Products",
                        totalItems = 10
                    )

                    FarmerHomeActionCard(
                        title = "Manage Cashew Plants",
                        description = "You are doing great, keep planting\n" +
                                "make sure to finish your daily \n" +
                                "task list",
                        itemName = "Plants",
                        totalItems = 50
                    )

                    FarmerHomeActionCard(
                        title = "Manage Your Chicken",
                        description = "You are doing wonderful.\n" +
                                "Make sure to finish your daily \n" +
                                "task list",
                        itemName = "Chicken",
                        totalItems = 150
                    )
                }
            }


        }

    }
}


@Composable
@Preview(showBackground = true)
fun FmTab(){
    FarmerHomeTabScreen()
}