package com.karamathaproperties.myapplication.ui.theme.screens.product

data class Product(
    val title: String,
    val explanation: String,
    val price: String,
    val description: String,
    val name : String
) {
    val quantity: String
        get() {
            TODO()
        }
}

val aProduct =
    Product(
        "Special Offer Tailored for You !",
        "Rice % Pasta",
        "\$2530.00kes",
        "Lorem Ipsum is simply dumy text of" +
                "the printing and typesetting industry."+
                "Lorem Upsum has been the industry's standard dumy text ever since." +
                "When an unknown printer took a gallery."
    )

fun Product(title: String, explanation: String, price: String, description: String) {

}
