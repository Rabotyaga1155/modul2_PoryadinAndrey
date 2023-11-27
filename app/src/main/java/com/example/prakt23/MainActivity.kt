/* While this template provides a good starting point for using Wear Compose, you can always
 * take a look at https://github.com/android/wear-os-samples/tree/main/ComposeStarter and
 * https://github.com/android/wear-os-samples/tree/main/ComposeAdvanced to find the most up to date
 * changes to the libraries and their usages.
 */

package com.example.prakt23

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.ComponentActivity


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }



    fun obs_click(view: View) {
        val intent = Intent(this,ChatListScreen::class.java)
        startActivity(intent)
    }

    fun izbr_click(view: View) {
        val intent = Intent(this,ResultActivity::class.java)
        startActivity(intent)
    }
}

