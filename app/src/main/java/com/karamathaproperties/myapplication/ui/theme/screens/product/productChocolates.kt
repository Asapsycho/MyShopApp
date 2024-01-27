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
fun productchocolateScreen(navController:NavHostController) {
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
                    Image(painter = painterResource(id = R.drawable.prdctdetail_chocolate1), contentDescription = null)
                    Text(
                        text = "Chocolate Bar 80g",
                        textAlign = TextAlign.Center,
                        fontSize = 13.sp,
                        fontFamily = FontFamily.Monospace
                    )

                    Text(
                        text = "135.00kes",
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
                    Image(painter = painterResource(id = R.drawable.prdctdetail_chocolate2), contentDescription = null)
                    Spacer(modifier = Modifier.padding(5.dp))
                    Text(
                        text = "Dairyland White\n Milk Chocolate\nBar 80g",
                        textAlign = TextAlign.Center,
                        fontSize = 13.sp,
                        fontFamily = FontFamily.Monospace
                    )
                    Spacer(modifier = Modifier.padding(5.dp))
                    Text(
                        text = "135.00kes",
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
                        text = "Good 3",
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
                    Image(painter = painterResource(id = R.drawable.prdctdetail_chocolate3), contentDescription = null)
                    Spacer(modifier = Modifier.padding(5.dp))
                    Text(
                        text = "Nestle MilkyBar\n Chocolate 90g",
                        textAlign = TextAlign.Center,
                        fontSize = 13.sp,
                        fontFamily = FontFamily.Monospace
                    )
                    Spacer(modifier = Modifier.padding(5.dp))
                    Text(
                        text = "400.00kes",
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
                    Image(painter = painterResource(id = R.drawable.prdctdetail_chocolate4), contentDescription = null)
                    Spacer(modifier = Modifier.padding(6.dp))
                    Text(
                        text = "Nestle Kitkat 1\n Finger Milk\nChoccolate Bar 10.7g",
                        textAlign = TextAlign.Center,
                        fontSize = 13.sp,
                        fontFamily = FontFamily.Monospace
                    )
                    Spacer(modifier = Modifier.padding(15.dp))
                    Text(
                        text = "50.00kes",
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
                    Image(painter = painterResource(id = R.drawable.prdctdetail_chocolate5), contentDescription = null)
                    Spacer(modifier = Modifier.padding(5.dp))
                    Text(
                        text = "Dairy Milk\n Chocolate 80g",
                        textAlign = TextAlign.Center,
                        fontSize = 13.sp,
                        fontFamily = FontFamily.Monospace
                    )
                    Spacer(modifier = Modifier.padding(5.dp))
                    Text(
                        text = "380.00kes",
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
                        text = "Good 6",
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
                    Image(painter = painterResource(id = R.drawable.prdctdetail_chocolate6), contentDescription = null)
                    Spacer(modifier = Modifier.padding(5.dp))
                    Text(
                        text = "Ferrero Kinder\nBueno Chocolate 43g",
                        textAlign = TextAlign.Center,
                        fontSize = 13.sp,
                        fontFamily = FontFamily.Monospace
                    )
                    Spacer(modifier = Modifier.padding(5.dp))
                    Text(
                        text = "208.00kes",
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
                    Image(painter = painterResource(id = R.drawable.prdctdetail_chocolate7), contentDescription = null)
                    Spacer(modifier = Modifier.padding(5.dp))
                    Text(
                        text = "Nestle Kitkat 4\n Milk and cocoa\nChocolate",
                        textAlign = TextAlign.Center,
                        fontSize = 13.sp,
                        fontFamily = FontFamily.Monospace
                    )
                    Spacer(modifier = Modifier.padding(5.dp))
                    Text(
                        text = "179.00kes",
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
                    Image(painter = painterResource(id = R.drawable.prdctdetail_chocolate8), contentDescription = null)
                    Spacer(modifier = Modifier.padding(5.dp))
                    Text(
                        text = "Nestle Kitkat 2\n Finger Milk\nChoccolate Bar 20.7g",
                        textAlign = TextAlign.Center,
                        fontSize = 13.sp,
                        fontFamily = FontFamily.Monospace
                    )
                    Spacer(modifier = Modifier.padding(5.dp))
                    Text(
                        text = "80.00kes",
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
                    Image(painter = painterResource(id = R.drawable.prdctdetail_chocolate9), contentDescription = null)
                    Spacer(modifier = Modifier.padding(6.dp))
                    Text(
                        text = "Cadbury Bubbly \nOreo Chocolte",
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
                    OutlinedButton(modifier = Modifier
                        .padding(5.dp),
                        onClick = {
                            navController.navigate("pdctdetail_sweetspage"){
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
                    Image(painter = painterResource(id = R.drawable.prdctdetail_chocolate10), contentDescription = null)
                    Text(
                        text = "White Chocolate\n Dates",
                        textAlign = TextAlign.Center,
                        fontSize = 13.sp,
                        fontFamily = FontFamily.Monospace
                    )
                    Text(
                        text = "695.00kes",
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
                    Image(painter = painterResource(id = R.drawable.teeka_choco), contentDescription = null)
                    Spacer(modifier = Modifier.padding(5.dp))
                    Text(
                        text = "Teeka Fun \nBig Chocolate",
                        textAlign = TextAlign.Center,
                        fontSize = 13.sp,
                        fontFamily = FontFamily.Monospace
                    )
                    Spacer(modifier = Modifier.padding(5.dp))
                    Text(
                        text = "489.00kes",
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
                    Image(painter = painterResource(id = R.drawable.prdctdetail_chocolate12), contentDescription = null)
                    Spacer(modifier = Modifier.padding(5.dp))
                    Text(
                        text = "Cadbury P.s\nCaramilk Chocolate Bar 48g",
                        textAlign = TextAlign.Center,
                        fontSize = 13.sp,
                        fontFamily = FontFamily.Monospace
                    )
                    Spacer(modifier = Modifier.padding(5.dp))
                    Text(
                        text = "99.00kes",
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
                    Image(painter = painterResource(id = R.drawable.prdctdetail_chocolate13), contentDescription = null)
                    Spacer(modifier = Modifier.padding(5.dp))
                    Text(
                        text = "Quattro Hazelnut\nChocolate\n Bar 33g",
                        textAlign = TextAlign.Center,
                        fontSize = 13.sp,
                        fontFamily = FontFamily.Monospace
                    )
                    Spacer(modifier = Modifier.padding(5.dp))
                    Text(
                        text = "80.00kes",
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
                    Image(painter = painterResource(id = R.drawable.prdctdetail_chocolate14), contentDescription = null)
                    Text(
                        text = "Cadbury Oreo\n Enrobed Biscuit 32g",
                        textAlign = TextAlign.Center,
                        fontSize = 13.sp,
                        fontFamily = FontFamily.Monospace
                    )
                    Spacer(modifier = Modifier.padding(5.dp))
                    Text(
                        text = "59.00kes",
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

                    Image(painter = painterResource(id = R.drawable.boxchocolate), contentDescription = null)
                    Text(
                        text = "Bag Of Crunchy\n Milk Chocolate ",
                        textAlign = TextAlign.Center,
                        fontSize = 13.sp,
                        fontFamily = FontFamily.Monospace
                    )
                    Text(
                        text = "4158.00kes",
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
fun chocopdtprev() {
    productchocolateScreen(rememberNavController())
}