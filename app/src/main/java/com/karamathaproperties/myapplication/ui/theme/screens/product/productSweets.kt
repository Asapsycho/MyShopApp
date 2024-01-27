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
fun productsweetScreen(navController:NavHostController) {
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
                    Image(painter = painterResource(id = R.drawable.prdctdetail_sweets1), contentDescription = null)
                    Text(
                        text = "Haribo Happy Cola 160g",
                        textAlign = TextAlign.Center,
                        fontSize = 13.sp,
                        fontFamily = FontFamily.Monospace
                    )

                    Text(
                        text = "360.00kes",
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
                    Image(painter = painterResource(id = R.drawable.prdctdetail_sweets2), contentDescription = null)
                    Text(
                        text = "Skittles Coated Fruits Candy 160g",
                        textAlign = TextAlign.Center,
                        fontSize = 13.sp,
                        fontFamily = FontFamily.Monospace
                    )
                    Spacer(modifier = Modifier.padding(3.dp))
                    Text(
                        text = "350.00kes",
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
                    Image(painter = painterResource(id = R.drawable.prdctdetail_sweets3), contentDescription = null)
                    Spacer(modifier = Modifier.padding(5.dp))
                    Text(
                        text = "Skittles Coated Fruits Candy 38g",
                        textAlign = TextAlign.Center,
                        fontSize = 13.sp,
                        fontFamily = FontFamily.Monospace
                    )
                    Spacer(modifier = Modifier.padding(5.dp))
                    Text(
                        text = "109.00kes",
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
                    Image(painter = painterResource(id = R.drawable.prdctdetail_sweets4), contentDescription = null)
                    Spacer(modifier = Modifier.padding(3.dp))
                    Text(
                        text = "Peach Acid Sweets 250g",
                        textAlign = TextAlign.Center,
                        fontSize = 13.sp,
                        fontFamily = FontFamily.Monospace
                    )
                    Spacer(modifier = Modifier.padding(5.dp))
                    Text(
                        text = "444.00kes",
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
                    Image(painter = painterResource(id = R.drawable.prdctdetail_sweets5), contentDescription = null)
                    Spacer(modifier = Modifier.padding(5.dp))
                    Text(
                        text = "Clown Chocobar Toffee 80Pcs",
                        textAlign = TextAlign.Center,
                        fontSize = 13.sp,
                        fontFamily = FontFamily.Monospace
                    )
                    Spacer(modifier = Modifier.padding(5.dp))
                    Text(
                        text = "160.00kes",
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
                    Image(painter = painterResource(id = R.drawable.prdctdetail_sweets6), contentDescription = null)
                    Spacer(modifier = Modifier.padding(5.dp))
                    Text(
                        text = "Alpenliebe Caramel Original Candy 32g",
                        textAlign = TextAlign.Center,
                        fontSize = 13.sp,
                        fontFamily = FontFamily.Monospace
                    )
                    Spacer(modifier = Modifier.padding(5.dp))
                    Text(
                        text = "86.00kes",
                        fontFamily = FontFamily.Serif,
                        fontSize = 12.sp
                    )
                    OutlinedButton(
                        modifier = Modifier
                            .padding(5.dp),
                        onClick = {
                            navController.navigate("pdctdetail_speadablespage"){
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
                    Image(painter = painterResource(id = R.drawable.prdctdetail_sweets7), contentDescription = null)
                    Text(
                        text = "Eclairs Lollipops XXL 50Pcs",
                        textAlign = TextAlign.Center,
                        fontSize = 13.sp,
                        fontFamily = FontFamily.Monospace
                    )
                    Text(
                        text = "555.00kes",
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
                    Image(painter = painterResource(id = R.drawable.prdctdetail_sweets8), contentDescription = null)
                    Text(
                        text = "Fini Jolly Jamboree Candy 180g",
                        textAlign = TextAlign.Center,
                        fontSize = 13.sp,
                        fontFamily = FontFamily.Monospace
                    )
                    Text(
                        text = "475.00kes",
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
                    Image(painter = painterResource(id = R.drawable.prdctdetail_sweets9), contentDescription = null)
                    Spacer(modifier = Modifier.padding(6.dp))
                    Text(
                        text = "Emoti Sweet Jawbreaker 60g",
                        textAlign = TextAlign.Center,
                        fontSize = 13.sp,
                        fontFamily = FontFamily.Monospace
                    )
                    Spacer(modifier = Modifier.padding(5.dp))
                    Text(
                        text = "150.00kes",
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
                    Image(painter = painterResource(id = R.drawable.prdctdetail_sweetsten), contentDescription = null)
                    Text(
                        text = "Jake Teeth Candy 100g",
                        textAlign = TextAlign.Center,
                        fontSize = 13.sp,
                        fontFamily = FontFamily.Monospace
                    )
                    Text(
                        text = "205.00kes",
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
                    Image(painter = painterResource(id = R.drawable.prdctdetail_sweetseleven), contentDescription = null)
                    Text(
                        text = "CKL Orange Twist Candy 80Pcs",
                        textAlign = TextAlign.Center,
                        fontSize = 13.sp,
                        fontFamily = FontFamily.Monospace
                    )
                    Text(
                        text = "165.00kes",
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
                    Image(painter = painterResource(id = R.drawable.prdctdetail_sweets12), contentDescription = null)
                    Spacer(modifier = Modifier.padding(5.dp))
                    Text(
                        text = "Butter Scotch Candy 80Pcs",
                        textAlign = TextAlign.Center,
                        fontSize = 13.sp,
                        fontFamily = FontFamily.Monospace
                    )
                    Spacer(modifier = Modifier.padding(5.dp))
                    Text(
                        text = "160.00kes",
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
                    Image(painter = painterResource(id = R.drawable.prdctdetail_sweets13), contentDescription = null)
                    Text(
                        text = "Alpenliebe Smooth Candy 150g",
                        textAlign = TextAlign.Center,
                        fontSize = 13.sp,
                        fontFamily = FontFamily.Monospace
                    )
                    Text(
                        text = "304.00kes",
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
                    Image(painter = painterResource(id = R.drawable.prdctdetail_sweets14), contentDescription = null)
                    Text(
                        text = "Candy Cookies 80Pcs",
                        textAlign = TextAlign.Center,
                        fontSize = 13.sp,
                        fontFamily = FontFamily.Monospace
                    )
                    Spacer(modifier = Modifier.padding(5.dp))
                    Text(
                        text = "175.00kes",
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

                    Image(painter = painterResource(id = R.drawable.prdctdetail_sweets15), contentDescription = null)
                    Text(
                        text = "JELLY TOTS Original 41g",
                        textAlign = TextAlign.Center,
                        fontSize = 13.sp,
                        fontFamily = FontFamily.Monospace
                    )
                    Text(
                        text = "115.00kes",
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

                    Image(painter = painterResource(id = R.drawable.prdctdetail_sweets16), contentDescription = null)
                    Text(
                        text = "Mr.Berry Pinapple Toofrooty Chew Bar 11g ",
                        textAlign = TextAlign.Center,
                        fontSize = 13.sp,
                        fontFamily = FontFamily.Monospace
                    )
                    Text(
                        text = "105.00kes",
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
                        .aspectRatio(0.3f)
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
                        .aspectRatio(0.3f)
                        .clip(RoundedCornerShape(9.dp)),
                ) {

                    Image(painter = painterResource(id = R.drawable.prdctdetail_sweets17), contentDescription = null)
                    Text(
                        text = "Jake Carrots\n Candy 100g ",
                        textAlign = TextAlign.Center,
                        fontSize = 13.sp,
                        fontFamily = FontFamily.Monospace
                    )
                    Text(
                        text = "204.00kes",
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
                        .aspectRatio(0.3f)
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
                        .aspectRatio(0.3f)
                        .clip(RoundedCornerShape(9.dp)),
                ) {

                    Image(painter = painterResource(id = R.drawable.prdctdetail_sweets18), contentDescription = null)
                    Text(
                        text = "Candy Toffee MilkYorghut ",
                        textAlign = TextAlign.Center,
                        fontSize = 13.sp,
                        fontFamily = FontFamily.Monospace
                    )
                    Text(
                        text = "160.00kes",
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
fun sweetsprdctprev() {
    productsweetScreen(rememberNavController())
}