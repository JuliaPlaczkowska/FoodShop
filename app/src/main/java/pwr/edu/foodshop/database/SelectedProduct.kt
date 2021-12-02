package pwr.edu.foodshop.database

import android.content.Context
import pwr.edu.foodshop.database.product.LooseProduct
import pwr.edu.foodshop.database.product.Product

class SelectedProduct {

    var id: Int = 0
    var product: Product = LooseProduct()
    var quantity: Int = 0


    fun calculateCharge(): Double = quantity * product.price / product.quantity()


    constructor(id: Int, product: Product, quantity: Int) {
        this.id = id
        this.product = product
        this.quantity = quantity
    }

    constructor(product: Product, quantity: Int) {
        this.product = product
        this.quantity = quantity
    }

    constructor(product: Product) {
        this.product = product
        this.quantity = product.quantity()
    }

    constructor()

}