package com.cobra.philipfirsttest

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*
import androidx.constraintlayout.widget.ConstraintLayout
import java.util.*

//import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


         fun sortList(list: List<Int>) {
            for (i in 0..list.size - 1) {
                for (j in 0..list.size-2) {
                    if (list[j] > list[j + 1]) {
                        Collections.swap(list, j, j + 1)
                    }
                }
            }
        }
    }


}
/* var btnshowtoast = findViewById<Button>(R.id.btnShowToast)
       btnshowtoast.setOnClickListener {
            Intent(this, SecondActivity::class.java).also {
               startActivity(it)
           }
       }*/
/*
 var cltoast = findViewById<ConstraintLayout>(R.id.clToast)
        var btnshowtoast = findViewById<Button>(R.id.btnShowToast)
         btnshowtoast.setOnClickListener {
       //   Toast.makeText(applicationContext,"help",Toast.LENGTH_LONG).show()
          Toast(this).apply {
              duration = Toast.LENGTH_LONG
              view = layoutInflater.inflate(R.layout.custom_toast,cltoast)
              show()
          }*/
/*


    var rgMeet = findViewById<RadioGroup>(R.id.rgMeet)
        var rbBeef = findViewById<RadioButton>(R.id.rbBeef)
        var rbChiken = findViewById<RadioButton>(R.id.rbChiken)
        var rbPork = findViewById<RadioButton>(R.id.rbPork)
        var cbCheese = findViewById<CheckBox>(R.id.cbCheese)
        var cbOnions = findViewById<CheckBox>(R.id.cbOnions)
        var cbSalad = findViewById<CheckBox>(R.id.cbSalad)
        var btnOrder = findViewById<Button>(R.id.btnOrder)
        var tvOrder = findViewById<TextView>(R.id.tvOrder)
btnOrder.setOnClickListener {
        val checkradiobuttonid = rgMeet.checkedRadioButtonId
        val meat = findViewById<RadioButton>(checkradiobuttonid)
        val cheese = cbCheese.isChecked
        val onion = cbOnions.isChecked
        val salad = cbSalad.isChecked
        val orderString =
            "You orderd a burger with \n " + "${meat.text}" +
                    (if (cheese) "\ncheese" else "") +
                    (if (onion) "\nonion" else "") +
                    (if (salad) "\nsalad" else "")
        tvOrder.text = orderString

    }*/


/*  var btnAddImage = findViewById<Button>(R.id.btnAddImage)
  var ivGraps = findViewById<ImageView>(R.id.ivGraps)
  btnAddImage.setOnClickListener {
      ivGraps.setImageResource(R.drawable.grapes)
  }
*/
/*
 summtion of two number
 var etFirstNumer = findViewById<EditText>(R.id.etFirstNumber)
        var etSecondNumber = findViewById<EditText>(R.id.etSecondNumber)
        var btnAdd = findViewById<Button>(R.id.btnAdd)
        var tvResult = findViewById<TextView>(R.id.tvResult)

        var sum = 0
        btnAdd.setOnClickListener {
        sum = ( etFirstNumer.text.toString().toInt() +  etSecondNumber.text.toString().toInt() )
        tvResult.text = ("Result = $sum")
        }*/
/*

 val list = listOf(5, 3, 6, 7, 9, 1)
  sortList(list)
  Log.d("MainActivityMahmoud", "this is my error ")
  println(list)*/

/* this is iteration app
 var btnCount = findViewById<Button>(R.id.btnCount)
        var tvCoun = findViewById<TextView>(R.id.tvCunt)
        var count = 0
        btnCount.setOnClickListener {
            count++
            tvCoun.text = ("lets coutn togther : $count")
        }*/
/*
    private fun sortList(list: List<Int>) {
        for (i in 0..list.size - 1) {
            for (j in 0..list.size-2) {
                if (list[j] > list[j + 1]) {
                    Collections.swap(list, j, j + 1)
                }
            }
        }
    }
}*/
/*// old way
        var btnApply = findViewById<Button>(R.id.btnApply)
        var etFirstName = findViewById<EditText>(R.id.etFirstName)
        var etLastName = findViewById<EditText>(R.id.etLastName)
        var etDate = findViewById<EditText>(R.id.etDate)
        var etCountry = findViewById<EditText>(R.id.etCountry)

        btnApply.setOnClickListener {
            var firstname = etFirstName.text.toString()
            var lastname = etLastName.text.toString()
            var birthday = etDate.text.toString()
            var country = etCountry.text.toString()
            Log.d("MainActivity","$firstname $lastname , born in $birthday")
        }
    }*/