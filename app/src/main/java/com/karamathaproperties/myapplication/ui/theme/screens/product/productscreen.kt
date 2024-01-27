package com.karamathaproperties.myapplication.ui.theme.screens.product

import androidx.compose.foundation.BorderStroke
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
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
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
fun ProductScreen(navController: NavHostController) {
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
                Spacer(modifier = Modifier.padding(15.dp))
                Column(
                    modifier = Modifier
                        .padding(5.dp)
                        .aspectRatio(0.4f)
                        .clip(RoundedCornerShape(9.dp)),
                ) {
                    Image(painter = painterResource(id = R.drawable.item_pdctdtl1), contentDescription = null)
                    Spacer(modifier = Modifier.padding(5.dp))
                    Text(
                        text = "Shell Pasta\n 500g",
                        textAlign = TextAlign.Center,
                        fontSize = 13.sp,
                        fontFamily = FontFamily.Monospace
                    )
                    Spacer(modifier = Modifier.padding(5.dp))
                    Text(
                        text = "349.00kes",
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
                    Image(painter = painterResource(id = R.drawable.item_pdctdtl3), contentDescription = null)
                    Spacer(modifier = Modifier.padding(5.dp))
                    Text(
                        text = "Dawaat Basmati\n Rice 2kg",
                        textAlign = TextAlign.Center,
                        fontSize = 13.sp,
                        fontFamily = FontFamily.Monospace
                    )
                    Spacer(modifier = Modifier.padding(5.dp))
                    Text(
                        text = "720.00kes",
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
                    Image(painter = painterResource(id = R.drawable.item_pdctdtl2), contentDescription = null)
                    Spacer(modifier = Modifier.padding(5.dp))
                    Text(
                        text = "Santa maria\n Pasta 500g",
                        textAlign = TextAlign.Center,
                        fontSize = 13.sp,
                        fontFamily = FontFamily.Monospace
                    )
                    Spacer(modifier = Modifier.padding(5.dp))
                    Text(
                        text = "289.00kes",
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
                    Image(painter = painterResource(id = R.drawable.item_pdctdtl4), contentDescription = null)
                    Spacer(modifier = Modifier.padding(6.dp))
                    Text(
                        text = "QueenCake\n pack of 12",
                        textAlign = TextAlign.Center,
                        fontSize = 13.sp,
                        fontFamily = FontFamily.Monospace
                    )
                    Spacer(modifier = Modifier.padding(15.dp))
                    Text(
                        text = "148.00kes",
                        fontFamily = FontFamily.Serif,
                        fontSize = 12.sp
                    )

                    OutlinedButton(
                        modifier = Modifier
                            .padding(5.dp),
                        onClick = {
                            navController.navigate("pdctdetail_chocopage"){
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
                    Image(painter = painterResource(id = R.drawable.item_pdctdtl5), contentDescription = null)
                    Spacer(modifier = Modifier.padding(5.dp))
                    Text(
                        text = "Butter Toast\n Bread 500g",
                        textAlign = TextAlign.Center,
                        fontSize = 13.sp,
                        fontFamily = FontFamily.Monospace
                    )
                    Spacer(modifier = Modifier.padding(5.dp))
                    Text(
                        text = "69.00kes",
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
                    Image(painter = painterResource(id = R.drawable.item_pdctdtl6), contentDescription = null)
                    Spacer(modifier = Modifier.padding(5.dp))
                    Text(
                        text = "Beans\n 500g",
                        textAlign = TextAlign.Center,
                        fontSize = 13.sp,
                        fontFamily = FontFamily.Monospace
                    )
                    Spacer(modifier = Modifier.padding(5.dp))
                    Text(
                        text = "249.00kes",
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
                    Image(painter = painterResource(id = R.drawable.item_pdctdtl7), contentDescription = null)
                    Spacer(modifier = Modifier.padding(5.dp))
                    Text(
                        text = "Mwea Pishori\n Rice 2kg",
                        textAlign = TextAlign.Center,
                        fontSize = 13.sp,
                        fontFamily = FontFamily.Monospace
                    )
                    Spacer(modifier = Modifier.padding(5.dp))
                    Text(
                        text = "556.00kes",
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
                    Image(painter = painterResource(id = R.drawable.item_pdctdtl8), contentDescription = null)
                    Spacer(modifier = Modifier.padding(5.dp))
                    Text(
                        text = "Ranee Bismati\n Rice 2kg",
                        textAlign = TextAlign.Center,
                        fontSize = 13.sp,
                        fontFamily = FontFamily.Monospace
                    )
                    Spacer(modifier = Modifier.padding(5.dp))
                    Text(
                        text = "527.00kes",
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
                    Image(painter = painterResource(id = R.drawable.item_pdctdtl9), contentDescription = null)
                    Spacer(modifier = Modifier.padding(6.dp))
                    Text(
                        text = "Butterfly Vermicelli\n pasta 1kg",
                        textAlign = TextAlign.Center,
                        fontSize = 13.sp,
                        fontFamily = FontFamily.Monospace
                    )
                    Spacer(modifier = Modifier.padding(15.dp))
                    Text(
                        text = "393.00kes",
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
                    Spacer(modifier = Modifier.padding(6.dp))
                    Image(painter = painterResource(id = R.drawable.item_pdctdtl10), contentDescription = null)
                    Spacer(modifier = Modifier.padding(6.dp))
                    Text(
                        text = "Ranee pasta\n 500g",
                        textAlign = TextAlign.Center,
                        fontSize = 13.sp,
                        fontFamily = FontFamily.Monospace
                    )
                    Spacer(modifier = Modifier.padding(15.dp))
                    Text(
                        text = "248.00kes",
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
                    Image(painter = painterResource(id = R.drawable.item_pdctdtl11), contentDescription = null)
                    Text(
                        text = "Santa Lucia \nShell Pasta\n 500g",
                        textAlign = TextAlign.Center,
                        fontSize = 13.sp,
                        fontFamily = FontFamily.Monospace
                    )
                    Spacer(modifier = Modifier.padding(5.dp))
                    Text(
                        text = "349.00kes",
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
                    Image(painter = painterResource(id = R.drawable.item_pdctdtl12), contentDescription = null)
                    Text(
                        text = "Pastanora Special\nPasta 500g",
                        textAlign = TextAlign.Center,
                        fontSize = 13.sp,
                        fontFamily = FontFamily.Monospace
                    )
                    Spacer(modifier = Modifier.padding(5.dp))
                    Text(
                        text = "349.00kes",
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
                    Image(painter = painterResource(id = R.drawable.item_pdctdtl13), contentDescription = null)
                    Text(
                        text = "Aromatic\nRice 2kg",
                        textAlign = TextAlign.Center,
                        fontSize = 13.sp,
                        fontFamily = FontFamily.Monospace
                    )
                    Spacer(modifier = Modifier.padding(5.dp))
                    Text(
                        text = "720.00kes",
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
                    Image(painter = painterResource(id = R.drawable.item_pdctdtl14), contentDescription = null)
                    Text(
                        text = "Festive\n Bread 500g",
                        textAlign = TextAlign.Center,
                        fontSize = 13.sp,
                        fontFamily = FontFamily.Monospace
                    )
                    Spacer(modifier = Modifier.padding(5.dp))
                    Text(
                        text = "55.00kes",
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
                    Spacer(modifier = Modifier.padding(5.dp))
                    Image(painter = painterResource(id = R.drawable.item_pdctdtl15), contentDescription = null)
                    Spacer(modifier = Modifier.padding(6.dp))
                    Text(
                        text = "Festive Cream\n Roll ",
                        textAlign = TextAlign.Center,
                        fontSize = 13.sp,
                        fontFamily = FontFamily.Monospace
                    )
                    Spacer(modifier = Modifier.padding(15.dp))
                    Text(
                        text = "45.00kes",
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
fun prdctprev() {
    ProductScreen(rememberNavController())
}