import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.R
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.karamathaproperties.myapplication.navigation.ROUTE_ADD_PRODUCT
import com.karamathaproperties.myapplication.navigation.ROUTE_UPDATE_PRODUCT
import com.karamathaproperties.myapplication.navigation.ROUTE_VIEW_PRODUCT
import com.karamathaproperties.myapplication.navigation.ROUTE_VIEW_UPLOAD

@Composable
fun AdminScreen(navController: NavHostController) {
    Column(horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Top,
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White)) {

        Text(text = "Admin Screen",
            fontSize = 50.sp,
            fontFamily = FontFamily.Monospace,
            color = Color.Black
        )
        Spacer(modifier = Modifier.height(30.dp))

        Button(onClick = {
            navController.navigate(ROUTE_ADD_PRODUCT)
        },modifier = Modifier
            .fillMaxWidth()
            .height(60.dp)
        ) {
            Text(text = "Add Product")
        }

        Spacer(modifier = Modifier.height(30.dp))

        Button(onClick = {
            navController.navigate(ROUTE_VIEW_UPLOAD)
        },modifier = Modifier
            .fillMaxWidth()
            .height(60.dp)) {
            Text(text = "View Uploaded Products")
        }


    }


}

@Preview
@Composable
fun AdminScreePre() {

    AdminScreen(rememberNavController())

}