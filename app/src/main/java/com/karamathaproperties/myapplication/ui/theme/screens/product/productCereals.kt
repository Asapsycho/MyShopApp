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
fun productCerealScreen(navController:NavHostController) {
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
                    Image(painter = painterResource(id = R.drawable.prdctdetail_cereal1), contentDescription = null)
                    Text(
                        text = "Mixed Berries Breakfast Cereal 1kg",
                        textAlign = TextAlign.Center,
                        fontSize = 13.sp,
                        fontFamily = FontFamily.Monospace
                    )

                    Text(
                        text = "795.00kes",
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
                    Image(painter = painterResource(id = R.drawable.prdctdetail_cereal2), contentDescription = null)
                    Spacer(modifier = Modifier.padding(3.dp))
                    Text(
                        text = "Temmy's Choco Rice Cereal 250g",
                        textAlign = TextAlign.Center,
                        fontSize = 13.sp,
                        fontFamily = FontFamily.Monospace
                    )
                    Spacer(modifier = Modifier.padding(2.dp))
                    Text(
                        text = "425.00kes",
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
                    Image(painter = painterResource(id = R.drawable.prdctdetail_cereal3), contentDescription = null)
                    Spacer(modifier = Modifier.padding(5.dp))
                    Text(
                        text = "Weetabix Wholegrain Banana Cereal 250g",
                        textAlign = TextAlign.Center,
                        fontSize = 13.sp,
                        fontFamily = FontFamily.Monospace
                    )
                    Spacer(modifier = Modifier.padding(5.dp))
                    Text(
                        text = "275.00kes",
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
                    Image(painter = painterResource(id = R.drawable.prdctdetail_cereal4), contentDescription = null)
                    Text(
                        text = "Nootri Infant Cereal 400g",
                        textAlign = TextAlign.Center,
                        fontSize = 13.sp,
                        fontFamily = FontFamily.Monospace
                    )
                    Text(
                        text = "420.00kes",
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
                    Image(painter = painterResource(id = R.drawable.prdctdetail_cereal5), contentDescription = null)
                    Text(
                        text = "Vanilla Breakfast Cereal 1kg",
                        textAlign = TextAlign.Center,
                        fontSize = 13.sp,
                        fontFamily = FontFamily.Monospace
                    )
                    Text(
                        text = "795.00kes",
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
                    Image(painter = painterResource(id = R.drawable.prdctdetail_cereal6), contentDescription = null)
                    Text(
                        text = "Strawberry Corn Flakes 250g",
                        textAlign = TextAlign.Center,
                        fontSize = 13.sp,
                        fontFamily = FontFamily.Monospace
                    )
                    Text(
                        text = "299.00kes",
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
                    Image(painter = painterResource(id = R.drawable.prdctdetail_cereal7), contentDescription = null)
                    Text(
                        text = "Tiger Jungle Favourite Oats 1kg",
                        textAlign = TextAlign.Center,
                        fontSize = 13.sp,
                        fontFamily = FontFamily.Monospace
                    )
                    Text(
                        text = "650.00kes",
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
                    Image(painter = painterResource(id = R.drawable.prdctdetail_cereal8), contentDescription = null)
                    Spacer(modifier = Modifier.padding(5.dp))
                    Text(
                        text = "Weetabix Weetaflakes Wholegrown Wheat 112g",
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
                    Image(painter = painterResource(id = R.drawable.prdctdetail_cereal9), contentDescription = null)
                    Spacer(modifier = Modifier.padding(6.dp))
                    Text(
                        text = "Weetabix Weetflakes Wholegrain Wheat 37g",
                        textAlign = TextAlign.Center,
                        fontSize = 13.sp,
                        fontFamily = FontFamily.Monospace
                    )
                    Spacer(modifier = Modifier.padding(5.dp))
                    Text(
                        text = "35.00kes",
                        fontFamily = FontFamily.Serif,
                        fontSize = 12.sp
                    )
                    OutlinedButton(modifier = Modifier
                        .padding(5.dp),
                        onClick = {
                            /*TODO*/
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
                    Image(painter = painterResource(id = R.drawable.prdctdetail_cerealten), contentDescription = null)
                    Text(
                        text = "Weetabix Chocolate Orange 460g",
                        textAlign = TextAlign.Center,
                        fontSize = 13.sp,
                        fontFamily = FontFamily.Monospace
                    )
                    Spacer(modifier = Modifier.padding(2.dp))
                    Text(
                        text = "495.00kes",
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
                    Image(painter = painterResource(id = R.drawable.prdctdetail_cerealeleven), contentDescription = null)
                    Spacer(modifier = Modifier.padding(5.dp))
                    Text(
                        text = "Temmy's Kids Variety Pack Cereal 180g",
                        textAlign = TextAlign.Center,
                        fontSize = 13.sp,
                        fontFamily = FontFamily.Monospace
                    )
                    Spacer(modifier = Modifier.padding(5.dp))
                    Text(
                        text = "445.00kes",
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
                    Image(painter = painterResource(id = R.drawable.prdctdetail_cereal12), contentDescription = null)
                    Text(
                        text = "Fit Cereal Honey Balls 400g",
                        textAlign = TextAlign.Center,
                        fontSize = 13.sp,
                        fontFamily = FontFamily.Monospace
                    )
                    Spacer(modifier = Modifier.padding(1.dp))
                    Text(
                        text = "415.00kes",
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
                    Image(painter = painterResource(id = R.drawable.prdctdetail_cereal13), contentDescription = null)
                    Text(
                        text = "Brown Bran Flakes 500g",
                        textAlign = TextAlign.Center,
                        fontSize = 13.sp,
                        fontFamily = FontFamily.Monospace
                    )
                    Text(
                        text = "549.00kes",
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
                    Image(painter = painterResource(id = R.drawable.prdctdetail_cereal14), contentDescription = null)
                    Text(
                        text = "Frosted Corn Flakes 500g",
                        textAlign = TextAlign.Center,
                        fontSize = 13.sp,
                        fontFamily = FontFamily.Monospace
                    )
                    Text(
                        text = "399.00kes",
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

                    Image(painter = painterResource(id = R.drawable.prdctdetail_cereal15), contentDescription = null)
                    Text(
                        text = "Crunch Cornflakes 500g",
                        textAlign = TextAlign.Center,
                        fontSize = 13.sp,
                        fontFamily = FontFamily.Monospace
                    )
                    Text(
                        text = "590.00kes",
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
fun prdctCerealPrev() {
    productCerealScreen(rememberNavController())
}