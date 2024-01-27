package com.karamathaproperties.myapplication.ui.theme.screens.product

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.karamathaproperties.myapplication.R

@Composable
fun productSpeadableScreen(navController:NavHostController) {
    LazyVerticalGrid(
        columns = GridCells.Adaptive(100.dp),

        content = {
            items(1) { i ->
                Box(
                    modifier = Modifier
                        .padding(5.dp)
                        .aspectRatio(0.4f)
                        .clip(RoundedCornerShape(9.dp))
                        .background(Color.White),
                    //contentAlignment = Alignment.TopCenter,
                ) {
                    Text(
                        text = "Good 1",
                        textAlign = TextAlign.Center,
                        fontSize = 15.sp
                    )
                }
                Column(
                    modifier = Modifier
                        .padding(5.dp)
                        .aspectRatio(0.4f)
                        .clip(RoundedCornerShape(9.dp)),
                ) {
                    Image(painter = painterResource(id = R.drawable.prdctdetail_spreadable1), contentDescription = null)
                    Text(
                        text = "Skippy Peanut Butter Creamy 340g",
                        textAlign = TextAlign.Center,
                        fontSize = 13.sp,
                        fontFamily = FontFamily.Monospace
                    )

                    Text(
                        text = "845.00kes",
                        fontFamily = FontFamily.Serif,
                        fontSize = 12.sp
                    )
                    OutlinedButton(onClick = { /*TODO*/ }) {
                        Image(
                            painter = painterResource(id = R.drawable.add_to_cart),
                            contentDescription = "AddToCart",
                            modifier = Modifier.size(25.dp),
                        )

                    }
                }
            }
            items(1) { i ->
                Box(
                    modifier = Modifier
                        .padding(5.dp)
                        .aspectRatio(0.4f)
                        .clip(RoundedCornerShape(9.dp))
                        .background(Color.White),
                    //contentAlignment = Alignment.TopCenter,
                ) {
                    Text(
                        text = "Good 2",
                        textAlign = TextAlign.Center,
                        fontSize = 15.sp
                    )
                }
                Column(
                    modifier = Modifier
                        .padding(5.dp)
                        .aspectRatio(0.4f)
                        .clip(RoundedCornerShape(9.dp)),
                ) {
                    Image(painter = painterResource(id = R.drawable.prdctdetail_spreadable2), contentDescription = null)
                    Text(
                        text = "Nutella Cocoa & Hazelnut Spread 750g",
                        textAlign = TextAlign.Center,
                        fontSize = 13.sp,
                        fontFamily = FontFamily.Monospace
                    )
                    Text(
                        text = "1815.00kes",
                        fontFamily = FontFamily.Serif,
                        fontSize = 12.sp
                    )
                    OutlinedButton(onClick = {
                        navController.navigate("pdctdetail_cerealspage"){
                            popUpTo(navController.graph.startDestinationId)
                            launchSingleTop = true
                        }
                    }) {
                        Image(
                            painter = painterResource(id = R.drawable.add_to_cart),
                            contentDescription = "AddToCart",
                            modifier = Modifier.size(25.dp)
                        )

                    }
                }
            }
            items(1) { i ->
                Box(
                    modifier = Modifier
                        .padding(5.dp)
                        .aspectRatio(0.4f)
                        .clip(RoundedCornerShape(9.dp))
                        .background(Color.White),
                    //contentAlignment = Alignment.TopCenter,
                ) {
                    Text(
                        text = "",
                        textAlign = TextAlign.Center,
                        fontSize = 15.sp
                    )
                }
                Column(
                    modifier = Modifier
                        .padding(5.dp)
                        .aspectRatio(0.4f)
                        .clip(RoundedCornerShape(9.dp)),
                ) {
                    Spacer(modifier = Modifier.padding(9.dp))
                    Image(painter = painterResource(id = R.drawable.prdctdetail_spreadable3), contentDescription = null)
                    Spacer(modifier = Modifier.padding(5.dp))
                    Text(
                        text = "Prestige Original Margarine 500g",
                        textAlign = TextAlign.Center,
                        fontSize = 13.sp,
                        fontFamily = FontFamily.Monospace
                    )
                    Spacer(modifier = Modifier.padding(5.dp))
                    Text(
                        text = "235.00kes",
                        fontFamily = FontFamily.Serif,
                        fontSize = 12.sp
                    )
                    OutlinedButton(onClick = { /*TODO*/ }) {
                        Image(
                            painter = painterResource(id = R.drawable.add_to_cart),
                            contentDescription = "AddToCart",
                            modifier = Modifier.size(25.dp)
                        )

                    }
                }
            }
            items(1) { i ->
                Box(
                    modifier = Modifier
                        .padding(5.dp)
                        .aspectRatio(0.4f)
                        .clip(RoundedCornerShape(9.dp))
                        .background(Color.White),
                    //contentAlignment = Alignment.TopCenter,
                ) {
                    Text(
                        text = "Good 4",
                        textAlign = TextAlign.Center,
                        fontSize = 15.sp
                    )
                }
                Column(
                    modifier = Modifier
                        .padding(5.dp)
                        .aspectRatio(0.4f)
                        .clip(RoundedCornerShape(9.dp)),
                ) {
                    Image(painter = painterResource(id = R.drawable.prdctdetail_spreadable4), contentDescription = null)
                    Text(
                        text = "Zesta Smooth Peanut Butter 800g",
                        textAlign = TextAlign.Center,
                        fontSize = 13.sp,
                        fontFamily = FontFamily.Monospace
                    )
                    Spacer(modifier = Modifier.padding(3.dp))
                    Text(
                        text = "520.00kes",
                        fontFamily = FontFamily.Serif,
                        fontSize = 12.sp
                    )

                    OutlinedButton(
                        modifier = Modifier
                            .padding(5.dp),
                        onClick = { /*TODO*/ }) {
                        Image(
                            painter = painterResource(id = R.drawable.add_to_cart),
                            contentDescription = "AddToCart",
                            modifier = Modifier.size(25.dp)
                        )
                    }
                }
            }
            items(1) { i ->
                Box(
                    modifier = Modifier
                        .padding(5.dp)
                        .aspectRatio(0.4f)
                        .clip(RoundedCornerShape(9.dp))
                        .background(Color.White),
                    //contentAlignment = Alignment.TopCenter,
                ) {
                    Text(
                        text = "Good 5",
                        textAlign = TextAlign.Center,
                        fontSize = 15.sp
                    )
                }
                Column(
                    modifier = Modifier
                        .padding(5.dp)
                        .aspectRatio(0.4f)
                        .clip(RoundedCornerShape(9.dp)),
                ) {
                    Image(painter = painterResource(id = R.drawable.prdctdetail_spreadable5), contentDescription = null)
                    Text(
                        text = "GreenForest Peanut Butter 400g",
                        textAlign = TextAlign.Center,
                        fontSize = 13.sp,
                        fontFamily = FontFamily.Monospace
                    )
                    Spacer(modifier = Modifier.padding(3.dp))
                    Text(
                        text = "309.00kes",
                        fontFamily = FontFamily.Serif,
                        fontSize = 12.sp
                    )
                    OutlinedButton(onClick = { /*TODO*/ }) {
                        Image(
                            painter = painterResource(id = R.drawable.add_to_cart),
                            contentDescription = "AddToCart",
                            modifier = Modifier.size(25.dp)
                        )
                    }
                }
            }
            items(1) { i ->
                Box(
                    modifier = Modifier
                        .padding(5.dp)
                        .aspectRatio(0.4f)
                        .clip(RoundedCornerShape(9.dp))
                        .background(Color.White),
                    //contentAlignment = Alignment.TopCenter,
                ) {
                    Text(
                        text = "",
                        textAlign = TextAlign.Center,
                        fontSize = 15.sp
                    )
                }
                Column(
                    modifier = Modifier
                        .padding(5.dp)
                        .aspectRatio(0.4f)
                        .clip(RoundedCornerShape(9.dp)),
                ) {
                    Spacer(modifier = Modifier.padding(9.dp))
                    Image(painter = painterResource(id = R.drawable.prdctdetail_spreadable6), contentDescription = null)
                    Spacer(modifier = Modifier.padding(5.dp))
                    Text(
                        text = "Blue Band Choco Margarine\n 500g",
                        textAlign = TextAlign.Center,
                        fontSize = 13.sp,
                        fontFamily = FontFamily.Monospace
                    )
                    Spacer(modifier = Modifier.padding(5.dp))
                    Text(
                        text = "308.00kes",
                        fontFamily = FontFamily.Serif,
                        fontSize = 12.sp
                    )
                    OutlinedButton(
                        modifier = Modifier
                            .padding(5.dp),
                        onClick = { /*TODO*/ }) {
                        Image(
                            painter = painterResource(id = R.drawable.add_to_cart),
                            contentDescription = "AddToCart",
                            modifier = Modifier.size(25.dp)
                        )
                    }
                }
            }
            items(1) { i ->
                Box(
                    modifier = Modifier
                        .padding(5.dp)
                        .aspectRatio(0.4f)
                        .clip(RoundedCornerShape(9.dp))
                        .background(Color.White),
                    //contentAlignment = Alignment.TopCenter,
                ) {
                    Text(
                        text = "Good 7",
                        textAlign = TextAlign.Center,
                        fontSize = 15.sp
                    )
                }
                Column(
                    modifier = Modifier
                        .padding(5.dp)
                        .aspectRatio(0.4f)
                        .clip(RoundedCornerShape(9.dp)),
                ) {
                    Image(painter = painterResource(id = R.drawable.prdctdetail_spreadable7), contentDescription = null)
                    Text(
                        text = "Zesta Smooth Peanut Butter 250g",
                        textAlign = TextAlign.Center,
                        fontSize = 13.sp,
                        fontFamily = FontFamily.Monospace
                    )
                    Text(
                        text = "170.00kes",
                        fontFamily = FontFamily.Serif,
                        fontSize = 12.sp
                    )
                    OutlinedButton(
                        modifier = Modifier
                            .padding(5.dp),
                        onClick = { /*TODO*/ }) {
                        Image(
                            painter = painterResource(id = R.drawable.add_to_cart),
                            contentDescription = "AddToCart",
                            modifier = Modifier.size(25.dp)
                        )
                    }
                }
            }
            items(1) { i ->
                Box(
                    modifier = Modifier
                        .padding(5.dp)
                        .aspectRatio(0.4f)
                        .clip(RoundedCornerShape(9.dp))
                        .background(Color.White),
                    //contentAlignment = Alignment.TopCenter,
                ) {
                    Text(
                        text = "Good 8",
                        textAlign = TextAlign.Center,
                        fontSize = 15.sp
                    )
                }
                Column(
                    modifier = Modifier
                        .padding(5.dp)
                        .aspectRatio(0.4f)
                        .clip(RoundedCornerShape(9.dp)),
                ) {
                    Image(painter = painterResource(id = R.drawable.prdctdetail_spreadable8), contentDescription = null)
                    Text(
                        text = "Peptang Crunchy Peanut Butter 400g",
                        textAlign = TextAlign.Center,
                        fontSize = 13.sp,
                        fontFamily = FontFamily.Monospace
                    )
                    Text(
                        text = "325.00kes",
                        fontFamily = FontFamily.Serif,
                        fontSize = 12.sp
                    )
                    OutlinedButton(modifier = Modifier
                        .padding(5.dp),
                        onClick = { /*TODO*/ }) {
                        Image(
                            painter = painterResource(id = R.drawable.add_to_cart),
                            contentDescription = "AddToCart",
                            modifier = Modifier.size(25.dp)
                        )
                    }
                }
            }
            items(1) { i ->
                Box(
                    modifier = Modifier
                        .padding(5.dp)
                        .aspectRatio(0.4f)
                        .clip(RoundedCornerShape(9.dp))
                        .background(Color.White),
                    //contentAlignment = Alignment.TopCenter,
                ) {
                    Text(
                        text = "Good 9",
                        textAlign = TextAlign.Center,
                        fontSize = 15.sp
                    )
                }
                Column(
                    modifier = Modifier
                        .padding(5.dp)
                        .aspectRatio(0.4f)
                        .clip(RoundedCornerShape(9.dp)),
                ) {
                    Image(painter = painterResource(id = R.drawable.prdctdetail_spreadable9), contentDescription = null)
                    Text(
                        text = "Peptang Creamy Peanut Butter 250g",
                        textAlign = TextAlign.Center,
                        fontSize = 13.sp,
                        fontFamily = FontFamily.Monospace
                    )
                    Text(
                        text = "215.00kes",
                        fontFamily = FontFamily.Serif,
                        fontSize = 12.sp
                    )
                    OutlinedButton(modifier = Modifier
                        .padding(5.dp),
                        onClick = {/*TODO*/}) {
                        Image(
                            painter = painterResource(id = R.drawable.add_to_cart),
                            contentDescription = "AddToCart",
                            modifier = Modifier.size(25.dp)
                        )
                    }
                }
            }
            items(1) { i ->
                Box(
                    modifier = Modifier
                        .padding(5.dp)
                        .aspectRatio(0.4f)
                        .clip(RoundedCornerShape(9.dp))
                        .background(Color.White),
                    //contentAlignment = Alignment.TopCenter,
                ) {
                    Text(
                        text = "",
                        textAlign = TextAlign.Center,
                        fontSize = 15.sp
                    )
                }
                Column(
                    modifier = Modifier
                        .padding(5.dp)
                        .aspectRatio(0.4f)
                        .clip(RoundedCornerShape(9.dp)),
                ) {
                    Image(painter = painterResource(id = R.drawable.prdctdetail_spreadableten), contentDescription = null)
                    Text(
                        text = "Zesta Crunchy Peanut Butter 400g",
                        textAlign = TextAlign.Center,
                        fontSize = 13.sp,
                        fontFamily = FontFamily.Monospace
                    )
                    Text(
                        text = "270.00kes",
                        fontFamily = FontFamily.Serif,
                        fontSize = 12.sp
                    )
                    OutlinedButton(modifier = Modifier
                        .padding(6.dp),
                        onClick = { /*TODO*/ }) {
                        Image(
                            painter = painterResource(id = R.drawable.add_to_cart),
                            contentDescription = "AddToCart",
                            modifier = Modifier.size(25.dp)
                        )
                    }
                }
            }
            items(1) { i ->
                Box(
                    modifier = Modifier
                        .padding(5.dp)
                        .aspectRatio(0.4f)
                        .clip(RoundedCornerShape(9.dp))
                        .background(Color.White),
                    //contentAlignment = Alignment.TopCenter,
                ) {
                    Text(
                        text = "Good 11",
                        textAlign = TextAlign.Center,
                        fontSize = 15.sp
                    )
                }
                Column(
                    modifier = Modifier
                        .padding(5.dp)
                        .aspectRatio(0.4f)
                        .clip(RoundedCornerShape(9.dp)),
                ) {
                    Image(painter = painterResource(id = R.drawable.prdctdetail_spreadableeleven), contentDescription = null)
                    Text(
                        text = "GreenForest Peanut Butter 250g",
                        textAlign = TextAlign.Center,
                        fontSize = 13.sp,
                        fontFamily = FontFamily.Monospace
                    )
                    Spacer(modifier = Modifier.padding(3.dp))
                    Text(
                        text = "206.00kes",
                        fontFamily = FontFamily.Serif,
                        fontSize = 12.sp
                    )
                    OutlinedButton(
                        onClick = { /*TODO*/ }) {
                        Image(
                            painter = painterResource(id = R.drawable.add_to_cart),
                            contentDescription = "AddToCart",
                            modifier = Modifier.size(25.dp)
                        )
                    }
                }
            }
            items(1) { i ->
                Box(
                    modifier = Modifier
                        .padding(5.dp)
                        .aspectRatio(0.4f)
                        .clip(RoundedCornerShape(9.dp))
                        .background(Color.White),
                    //contentAlignment = Alignment.TopCenter,
                ) {
                    Text(
                        text = "Good 12",
                        textAlign = TextAlign.Center,
                        fontSize = 15.sp
                    )
                }
                Column(
                    modifier = Modifier
                        .padding(5.dp)
                        .aspectRatio(0.4f)
                        .clip(RoundedCornerShape(9.dp)),
                ) {
                    Image(painter = painterResource(id = R.drawable.prdctdetail_spreadable12), contentDescription = null)
                    Text(
                        text = "Dairyland Chocolate Spead 650g",
                        textAlign = TextAlign.Center,
                        fontSize = 13.sp,
                        fontFamily = FontFamily.Monospace
                    )
                    Text(
                        text = "790.00kes",
                        fontFamily = FontFamily.Serif,
                        fontSize = 12.sp
                    )
                    OutlinedButton(modifier = Modifier
                        .padding(5.dp),
                        onClick = { /*TODO*/ }) {
                        Image(
                            painter = painterResource(id = R.drawable.add_to_cart),
                            contentDescription = "AddToCart",
                            modifier = Modifier.size(25.dp)
                        )
                    }
                }
            }
            items(1) { i ->
                Box(
                    modifier = Modifier
                        .padding(5.dp)
                        .aspectRatio(0.4f)
                        .clip(RoundedCornerShape(9.dp))
                        .background(Color.White),
                    //contentAlignment = Alignment.TopCenter,
                ) {
                    Text(
                        text = "Good 13",
                        textAlign = TextAlign.Center,
                        fontSize = 15.sp
                    )
                }
                Column(
                    modifier = Modifier
                        .padding(5.dp)
                        .aspectRatio(0.4f)
                        .clip(RoundedCornerShape(9.dp)),
                ) {
                    Image(painter = painterResource(id = R.drawable.prdctdetail_spreadable13), contentDescription = null)
                    Text(
                        text = "Amazon Crunchy Peanut Butter 340g",
                        textAlign = TextAlign.Center,
                        fontSize = 13.sp,
                        fontFamily = FontFamily.Monospace
                    )
                    Text(
                        text = "350.00kes",
                        fontFamily = FontFamily.Serif,
                        fontSize = 12.sp
                    )
                    OutlinedButton(modifier = Modifier
                        .padding(5.dp),
                        onClick = { /*TODO*/ }) {
                        Image(
                            painter = painterResource(id = R.drawable.add_to_cart),
                            contentDescription = "AddToCart",
                            modifier = Modifier.size(25.dp)
                        )
                    }
                }
            }
            items(1) { i ->
                Box(
                    modifier = Modifier
                        .padding(5.dp)
                        .aspectRatio(0.4f)
                        .clip(RoundedCornerShape(9.dp))
                        .background(Color.White),
                    //contentAlignment = Alignment.TopCenter,
                ) {
                    Text(
                        text = "Good 14",
                        textAlign = TextAlign.Center,
                        fontSize = 15.sp
                    )
                }
                Column(
                    modifier = Modifier
                        .padding(5.dp)
                        .aspectRatio(0.4f)
                        .clip(RoundedCornerShape(9.dp)),
                ) {
                    Image(painter = painterResource(id = R.drawable.prdctdetail_spreadable14), contentDescription = null)
                    Text(
                        text = "Peptang No Sugar Peanut Butter",
                        textAlign = TextAlign.Center,
                        fontSize = 13.sp,
                        fontFamily = FontFamily.Monospace
                    )
                    Spacer(modifier = Modifier.padding(5.dp))
                    Text(
                        text = "230.00kes",
                        fontFamily = FontFamily.Serif,
                        fontSize = 12.sp
                    )
                    OutlinedButton(modifier = Modifier
                        .padding(5.dp),
                        onClick = { /*TODO*/ }) {
                        Image(
                            painter = painterResource(id = R.drawable.add_to_cart),
                            contentDescription = "AddToCart",
                            modifier = Modifier.size(25.dp)
                        )
                    }
                }
            }
            items(1) { i ->
                Box(
                    modifier = Modifier
                        .padding(5.dp)
                        .aspectRatio(0.4f)
                        .clip(RoundedCornerShape(9.dp))
                        .background(Color.White),
                    //contentAlignment = Alignment.TopCenter,
                ) {
                    Text(
                        text = "",
                        textAlign = TextAlign.Center,
                        fontSize = 15.sp
                    )
                }
                Column(
                    modifier = Modifier
                        .padding(5.dp)
                        .aspectRatio(0.4f)
                        .clip(RoundedCornerShape(9.dp)),
                ) {

                    Image(painter = painterResource(id = R.drawable.prdctdetail_spreadable15), contentDescription = null)
                    Text(
                        text = "Nut Gold Creamy Peanut Butter 250g",
                        textAlign = TextAlign.Center,
                        fontSize = 13.sp,
                        fontFamily = FontFamily.Monospace
                    )
                    Text(
                        text = "215.00kes",
                        fontFamily = FontFamily.Serif,
                        fontSize = 12.sp
                    )
                    OutlinedButton(modifier = Modifier
                        .padding(5.dp),
                        onClick = { /*TODO*/ }) {
                        Image(
                            painter = painterResource(id = R.drawable.add_to_cart),
                            contentDescription = "AddToCart",
                            modifier = Modifier.size(25.dp)
                        )
                    }
                }
            }
        }
    )
}

@Preview
@Composable
fun pdctSpeadblesprev() {
    productSpeadableScreen(rememberNavController())
}