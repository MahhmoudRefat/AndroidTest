package ui

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.cobra.philipfirsttest.R

class SecondActivity: AppCompatActivity()  {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    setContentView(R.layout.second_activity)
        var btnBack = findViewById<Button>(R.id.btnBack)
        btnBack.setOnClickListener {
           val intent =  Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
    }
}