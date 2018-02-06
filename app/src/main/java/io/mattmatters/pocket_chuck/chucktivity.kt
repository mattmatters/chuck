package io.mattmatters.pocket_chuck

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View

const val EXTRA_MESSAGE = "io.mattmatters.pocket_chuck.MESSAGE"

class chucktivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_chucktivity)
}

    /** Called when the user taps the Send button */
    fun sendMessage(view: View) {
        val intent = Intent(this, DisplayMessageActivity::class.java)
        startActivity(intent)
    }
}
