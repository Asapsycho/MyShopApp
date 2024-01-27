package com.karamathaproperties.myapplication.ui.theme.screens.home

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.FavoriteBorder
import androidx.compose.material.icons.outlined.Notifications
import androidx.compose.material.icons.outlined.ShoppingCart
import androidx.compose.material.icons.rounded.Search
import androidx.compose.material3.Button
import androidx.compose.material3.Divider
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.karamathaproperties.myapplication.R
import com.karamathaproperties.myapplication.navigation.ROUTE_PRODUCT


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HomeScreen(navController: NavHostController) {
    Box{
        Image(
            modifier = Modifier
                .fillMaxWidth()
                .offset(0.dp, (-30).dp),
            painter = painterResource(id = R.drawable.bg_main),
            contentDescription = "Header Background",
            contentScale = ContentScale.FillWidth
        )
        Scaffold(
            topBar = {AppBar(rememberNavController())},
//            contentColor = MaterialTheme.colorScheme.background
        ) {paddingValues ->
            Content(paddingValues, rememberNavController())

        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun AppBar(navController:NavHostController) {
    Row (
        Modifier
            .height(60.dp)
            .padding(16.dp),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.SpaceAround
    ) {
        TextField(value = "",
            onValueChange = {},
            label = { Text(text = "Search Food, Vegetable, etc.", fontSize = 13.sp) },
            singleLine = true,
            leadingIcon = { Icon(imageVector = Icons.Rounded.Search, contentDescription = "Search") },
            colors = TextFieldDefaults.textFieldColors(
                focusedIndicatorColor = Color.Transparent,
                unfocusedIndicatorColor = Color.Transparent
            ),
            shape = RoundedCornerShape(8.dp),
            modifier = Modifier
                .weight(1f)
                .fillMaxHeight()
        )
        Spacer(modifier = Modifier.width(8.dp))
        IconButton(onClick = {  }) {
            Icon(imageVector = Icons.Outlined.FavoriteBorder, contentDescription = "")
        }
        IconButton(onClick = {
            navController.navigate("pdctdetail_chocopage"){
                popUpTo(navController.graph.startDestinationId)
                launchSingleTop = true
            }
        }) {
            Icon(imageVector = Icons.Outlined.ShoppingCart, contentDescription = "", tint = Color.Green)
        }
    }
}

@Composable
fun Content(paddingValues: PaddingValues,navController:NavHostController) {
    Column(Modifier.padding(paddingValues)) {
        Header()
        Spacer(modifier = Modifier.height(16.dp))
        Promotions()
        Spacer(modifier = Modifier.height(16.dp))
        CategorySection(rememberNavController())
        Spacer(modifier = Modifier.height(16.dp))
        BestSellerSection(rememberNavController())

    }
}


@Composable
fun Header() {
    androidx.compose.material3.Card(
        Modifier
            .height(64.dp)
            .padding(horizontal = 16.dp),
        shape = RoundedCornerShape(0.dp),
    ) {
        Row(
            modifier = Modifier.fillMaxSize(),
            verticalAlignment = Alignment.CenterVertically,
        ) {
            QrButton(rememberNavController())

            verticalDivider()
            Row(Modifier
                .fillMaxSize()
                .weight(1f)
                .clickable { }
                .padding(horizontal = 8.dp),
                verticalAlignment = Alignment.CenterVertically
            ) {
                Icon(
                    painter = painterResource(id = R.drawable.ic_money),
                    contentDescription = "",
                    tint = Color(0xFF6FCF97)
                )
                Column(Modifier.padding(8.dp)) {
                    Text(text = "Ksh.5550", fontWeight = FontWeight.Bold, fontSize = 16.sp)
                    Text(
                        text = "Top Up",
                        color = MaterialTheme.colorScheme.primary,
                        fontSize = 12.sp
                    )
                }
            }

            verticalDivider()
            Row(Modifier
                .fillMaxSize()
                .weight(1f)
                .clickable { }
                .padding(horizontal = 8.dp),
                verticalAlignment = Alignment.CenterVertically
            ) {
                Icon(
                    painter = painterResource(id = R.drawable.ic_coin),
                    contentDescription = "",
                    tint = MaterialTheme.colorScheme.primary
                )
                Column(Modifier.padding(8.dp)) {
                    Text(text = "Ksh.550", fontWeight = FontWeight.Bold, fontSize = 16.sp)
                    Text(text = "Points", color = Color.Black, fontSize = 12.sp)
                }
            }

        }
    }
}

fun Card(padding: Modifier, elevation: Dp, shape: RoundedCornerShape, function: () -> Unit) {
    TODO("Not yet implemented")
}

@Composable
fun QrButton(navController:NavHostController) {
    IconButton(
        onClick = {
        },
        modifier = Modifier
            .fillMaxHeight()
            .aspectRatio(1f)
    ) {
        Icon(painter = painterResource(id = R.drawable.ic_scan),
            contentDescription = "",
            modifier = Modifier
                .fillMaxSize()
                .padding(16.dp)
        )
    }
}

@Composable
fun verticalDivider() {
    Divider(
        color = Color(0xFFF1F1F1),
        modifier = Modifier
            .width(1.dp)
            .height(32.dp)
    )
}

@Composable
fun Promotions() {
    LazyRow(
        Modifier.height(160.dp),
        contentPadding = PaddingValues(horizontal = 16.dp),
        horizontalArrangement = Arrangement.spacedBy(16.dp)
    ) {
        item {
            PromotionItem(imagePainter = painterResource(id = R.drawable.fruitspromo),
                title = "Fruit",
                subtitle = "Start @",
                header = "Ksh.50",
                backgroundColor = MaterialTheme.colorScheme.primary
            )
        }
        item {
            PromotionItem(imagePainter = painterResource(id = R.drawable.meatnpoultrypromo),
                title = "Meat",
                subtitle = "&",
                header = "Poultry",
                backgroundColor = Color(0xFFF2994A)
            )
        }
        item {
            PromotionItem(imagePainter = painterResource(id = R.drawable.vegetablespromo),
                title = "Vegetables",
                subtitle = "Fresh From",
                header = "the Farm",
                backgroundColor = MaterialTheme.colorScheme.primary
            )
        }
        item {
            PromotionItem(imagePainter = painterResource(id = R.drawable.dairyneggspromo),
                title = "Fresh",
                subtitle = "Dairy",
                header = "Products",
                backgroundColor = MaterialTheme.colorScheme.primary
            )
        }
        item {
            PromotionItem(imagePainter = painterResource(id = R.drawable.chilledfoodpromo),
                title = "Fruit",
                subtitle = "Start @",
                header = "Ksh.50",
                backgroundColor = MaterialTheme.colorScheme.primary
            )
        }
    }
}

@Composable
fun PromotionItem(
    title: String = "",
    subtitle: String = "",
    header: String = "",
    backgroundColor: Color = Color.Transparent,
    imagePainter: Painter
) {
    androidx.compose.material3.Card(
        Modifier.width(300.dp),
        shape = RoundedCornerShape(8.dp),
//        elevation = 8.dp,
    ) {
        Row {
            Column(
                Modifier
                    .padding(horizontal = 16.dp)
                    .fillMaxHeight(),
                verticalArrangement = Arrangement.Center
            ) {
                Text(text = title, fontSize = 14.sp, color = Color.Black)
                Text(
                    text = subtitle,
                    fontSize = 16.sp,
                    color = Color(0xFFF2994A),
                    fontWeight = FontWeight.Bold
                )
                Text(
                    text = header,
                    fontSize = 28.sp,
                    color = Color.Black,
                    fontWeight = FontWeight.Bold
                )
            }
            Image(
                painter = imagePainter, contentDescription = "",
                modifier = Modifier
                    .fillMaxHeight()
                    .weight(1f),
                alignment = Alignment.CenterEnd,
                contentScale = ContentScale.Crop
            )
        }
    }
}

@Composable
fun CategorySection(navController:NavHostController) {
    Column(Modifier.padding(horizontal = 16.dp)) {
        Row(
            Modifier.fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Text(text = "Category", style = MaterialTheme.typography.bodyLarge)
            OutlinedButton(onClick = {
                navController.navigate("pdctdetail_chocopage"){
                    popUpTo(navController.graph.startDestinationId)
                    launchSingleTop = true
                }
            },
                ) {
                Text(text = "More", color = Color.Black)
            }
        }
        Row(
            Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            CategoryButton(
                icon = painterResource(id = R.drawable.ic_orange),
                backgroundColor = Color(0xFFF1F1F1),
                text = "Fruits"
            )
            CategoryButton(
                icon = painterResource(id = R.drawable.ic_veg),
                backgroundColor = Color(0xFFF1F1F1),
                text = "Vegetables"
            )
            CategoryButton(
                icon = painterResource(id = R.drawable.ic_meat),
                backgroundColor = Color(0xFFF1F1F1),
                text = "Meat"
            )
            CategoryButton(
                icon = painterResource(id = R.drawable.ic_cheese),
                backgroundColor = Color(0xFFF1F1F1),
                text = "Dairy"
            )


        }
    }
}

@Composable
fun CategoryButton(
    text: String = "",
    icon: Painter,
    backgroundColor: Color
) {
    Column(
        Modifier
            .width(64.dp)
            .clickable { }
    ) {
        Box(
            Modifier
                .size(64.dp)
                .background(
                    color = backgroundColor,
                    shape = RoundedCornerShape(12.dp)
                )
                .padding(18.dp)
        ) {
            Image(painter = icon, contentDescription = "", modifier = Modifier.fillMaxSize() )
        }
        Text(text = text, modifier = Modifier.fillMaxWidth(), textAlign = TextAlign.Center, fontSize = 12.sp)
    }
}

@Composable
fun BestSellerSection(navController: NavHostController) {
    Column() {
        Row(
            Modifier
                .fillMaxWidth()
                .padding(9.dp),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Text(text = "Angusha Kwa Trolley", style = MaterialTheme.typography.bodyLarge)
            OutlinedButton(onClick = {
                navController.navigate("register_page"){
                    popUpTo(navController.graph.startDestinationId)
                    launchSingleTop = true
                }
            }) {
                Text(text = "More", color = Color.Black)
            }
        }

        BestSellerItems()
    }
}

@Composable
fun BestSellerItems() {
    LazyRow(
        contentPadding = PaddingValues(horizontal = 16.dp),
        horizontalArrangement = Arrangement.spacedBy(16.dp)
    ) {
        item {
            BestSellerItems(imagePainter = painterResource(id = R.drawable.item_fruitsvegetables),
                title = "Fruits &  Vegetables",
                price = "Discount",
                discountPercent = 10
            )
            BestSellerItems(imagePainter = painterResource(id = R.drawable.item_ricenpasta),
                title = "Rice & Pasta",
                price = "Discount",
                discountPercent = 5
            )
            BestSellerItems(imagePainter = painterResource(id = R.drawable.item_meatnpoultry),
                title = "Meat & Poultry",
                price = "Discount",
                discountPercent = 1
            )
            BestSellerItems(imagePainter = painterResource(id = R.drawable.item_bakery),
                title = "Bakery",
                price = "Discount",
                discountPercent = 1
            )
            BestSellerItems(imagePainter = painterResource(id = R.drawable.item_cleaningnhousehold),
                title = "Cleaning & Household",
                price = "Discount",
                discountPercent = 3

            )
        }
    }
}

@Composable
fun BestSellerItems(
    title: String = "",
    price: String = "",
    discountPercent: Int = 0,
    imagePainter: Painter
) {
    androidx.compose.material3.Card(
        Modifier
            .width(160.dp)

    ) {
        Column(
            Modifier.padding(bottom = 32.dp)
        ) {
            Image(
                painter = imagePainter, contentDescription = "",
                modifier = Modifier
                    .fillMaxWidth()
                    .aspectRatio(1f),
                contentScale = ContentScale.Fit
            )
            Column(
                Modifier.padding(0.dp)
            ) {
                Text(text = title, fontWeight = FontWeight.Bold)
                Row {
                    Text(
                        "$${price}",
                        textDecoration = if (discountPercent > 0) {
                            TextDecoration.LineThrough

                        } else
                            TextDecoration.None,
                        color = if (discountPercent > 0) Color.Black else Color.Gray
                    )
                    if (discountPercent > 0) {
                        Text(
                            text = "[$discountPercent%]",
                            color = MaterialTheme.colorScheme.primary
                        )
                    }
                }
            }
        }
    }
}

@Preview
@Composable
fun HomePrev() {
    HomeScreen(rememberNavController())
}
