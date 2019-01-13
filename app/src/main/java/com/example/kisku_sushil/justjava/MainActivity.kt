/**
 * IMPORTANT: Make sure you are using the correct package name.
 * This example uses the package name:
 * package com.example.android.justjava
 * If you get an error when copying this code into Android studio, update it to match teh package name found
 * in the project's AndroidManifest.xml file.
 */

package com.example.kisku_sushil.justjava

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import android.widget.TextView
import java.text.NumberFormat


/**
 * This app displays an order form to order coffee.
 */
class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    var numberOfCoffees=0
    /**
     * This method is called when the order button is clicked.
     */
    fun submitOrder(view: View) {

        display(numberOfCoffees)
        displayPrice(numberOfCoffees*5)
    }
    fun increment(view: View){
        ++numberOfCoffees
        display(numberOfCoffees)
        displayPrice(numberOfCoffees*5)
    }

    fun decrement(view: View){
        --numberOfCoffees
        display(numberOfCoffees)
        displayPrice(numberOfCoffees*5)
    }

    /**
     * This method displays the given quantity value on the screen.
     */
    private fun display(number: Int) {
        val quantityTextView = findViewById<View>(R.id.quantity_text_view) as TextView
        quantityTextView.text = "" + number
    }

    /**
     * This method displays the given price on the screen.
     */
    private fun displayPrice(number: Int) {
        val priceTextView = findViewById<View>(R.id.price_text_view) as TextView
        priceTextView.setText(NumberFormat.getCurrencyInstance().format(number))
    }
}
