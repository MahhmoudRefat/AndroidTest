package ui

import android.app.Activity
import android.content.Intent
import android.content.pm.PackageManager
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.Menu
import android.view.MenuItem
import android.widget.*
import androidx.core.app.ActivityCompat
import com.cobra.philipfirsttest.R

//import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }


    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.app_bar_mnue, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            R.id.miAddContact -> Toast.makeText(
                this,
                "You clicked add contact ",
                Toast.LENGTH_SHORT
            ).show()
            R.id.miFavourite -> Toast.makeText(this, "You clicked Favourite ", Toast.LENGTH_SHORT)
                .show()
            R.id.miSettign -> Toast.makeText(this, "You clicked Settign ", Toast.LENGTH_SHORT)
                .show()
            R.id.miFeedback -> Toast.makeText(this, "You clicked Feedback ", Toast.LENGTH_SHORT)
                .show()
            R.id.miClose -> finish()

        }
        return true
    }
/*
********** Recycler View *******
*  var rvTodo = findViewById<RecyclerView>(R.id.rvTodo)
        var btntodo = findViewById<Button>(R.id.btnTodo)
        var ettodo = findViewById<EditText>(R.id.etTodo)
        var todolist = mutableListOf(
            Todo("follow the course ", false),
            Todo("Learn how to speak Parseltongue ", false),
            Todo("Discover a new planet and name it after yourself ", false),
            Todo("Learn how to breathe underwater and explore the depths  ", false),
            Todo("Find a leprechaun and ask for a pot of gold ", true),
            Todo("Learn how to speak Parseltongue ", false),
            Todo("Bake a cake that can grant wishes ", true),

            )
        var adapter = todoAdapter(todolist)
        rvTodo.adapter = adapter
        rvTodo.layoutManager = LinearLayoutManager(this)

        btntodo.setOnClickListener {
            val title = ettodo.text.toString()
            val todo = Todo(title, false)
            todolist.add(todo)
            adapter.notifyItemInserted(todolist.size-1)
        }
        * */
    /*
    ******* spinner and custom one
    *   var spMonth = findViewById<Spinner>(R.id.spMonth)
        var customlist = listOf("First","second","third","Fourth")
        var adapter = ArrayAdapter<String>(this, com.google.android.material.R.layout.support_simple_spinner_dropdown_item,customlist)
        spMonth.adapter = adapter
        spMonth.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onItemSelected(
                adapterview: AdapterView<*>?,
                view: View?,
                position: Int,
                id: Long
            ) {
                Toast.makeText(
                    this@MainActivity,
                    "You selected ${adapterview?.getItemAtPosition(position).toString()}",
                    Toast.LENGTH_LONG
                ).show()
            }

            override fun onNothingSelected(p0: AdapterView<*>?) {
                TODO("Not yet implemented")
            }

        }
    * */
    /*
    * Alert dialog
        var btnDialog1 = findViewById<Button>(R.id.btnDialog1)
        var btnDialog2 = findViewById<Button>(R.id.btnDialog2)
        var btnDialog3 = findViewById<Button>(R.id.btnDialog3)

        var startFirstDialog = AlertDialog.Builder(this)
            .setTitle("add Contact ").setMessage("You added Mr Poob ! ")
            .setIcon(R.drawable.ic_add_contact)
            .setPositiveButton("yes") { _, _ ->
                Toast.makeText(this, "u added Mr poob ! ", Toast.LENGTH_LONG).show()
            }.setNegativeButton("No") { _, _ ->
                Toast.makeText(this, "u didn't added Mr poob ! ", Toast.LENGTH_LONG).show()
            }.create()

        btnDialog1.setOnClickListener {
            startFirstDialog.show()
        }
        val option = arrayOf("First item ", "second item ", "third item ")
        val singleChoice = AlertDialog.Builder(this).setTitle("choose one of this option ")
            .setSingleChoiceItems(option, 0) { dialogInterface, i ->
                Toast.makeText(this, "You choosed ${option[i]} ", Toast.LENGTH_LONG).show()
            }.setPositiveButton("accepted") { _, _ ->
                Toast.makeText(this, "u accepted the single choice ! ", Toast.LENGTH_LONG).show()
            }.setNegativeButton("rejected") { _, _ ->
                Toast.makeText(this, "u decliend the single choice ! ", Toast.LENGTH_LONG).show()
            }.create()
        btnDialog2.setOnClickListener {
            singleChoice.show()
        }
        val multiChoice = AlertDialog.Builder(this).setTitle("choose one of this option ")
            .setMultiChoiceItems(option, booleanArrayOf(false, false, false)) { _, i, isChecked ->
                if (isChecked) {
                    Toast.makeText(this, "You choosed ${option[i]} ", Toast.LENGTH_LONG).show()
                } else {
                    Toast.makeText(this, "You unchoosed ${option[i]} ", Toast.LENGTH_LONG).show()
                }
            }.setPositiveButton("accepted") { _, _ ->
                Toast.makeText(this, "u accepted the multi choice ! ", Toast.LENGTH_LONG).show()
            }.setNegativeButton("rejected") { _, _ ->
                Toast.makeText(this, "u decliend the multi choice ! ", Toast.LENGTH_LONG).show()
            }.create()
        btnDialog3.setOnClickListener {
            multiChoice.show()
        }
    * */
    /*
     var button = findViewById<Button>(R.id.btnChoose)
            var imPhoto = findViewById<ImageView>(R.id.imPhoto)
            button.setOnClickListener {
                Intent(Intent.ACTION_GET_CONTENT).also {
                    it.type = "image/*"
                    startActivityForResult(it,0)
                }
    */

     */
    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        if (resultCode == Activity.RESULT_OK && requestCode == 0) {
            val uri = data?.data
            //      imPhoto.setimageuri(uri)
        }
    }

    /*
    *   button.setOnClickListener {
                requestpermission()
            }
            * */
    private fun haswriteexternal() =
        ActivityCompat.checkSelfPermission(
            this,
            android.Manifest.permission.WRITE_EXTERNAL_STORAGE
        ) == PackageManager.PERMISSION_GRANTED

    private fun location() =
        ActivityCompat.checkSelfPermission(
            this,
            android.Manifest.permission.ACCESS_BACKGROUND_LOCATION
        ) == PackageManager.PERMISSION_GRANTED

    private fun loctionbackground() =
        ActivityCompat.checkSelfPermission(
            this,
            android.Manifest.permission.ACCESS_COARSE_LOCATION
        ) == PackageManager.PERMISSION_GRANTED

    private fun requestpermission() {
        var Permissiontorequest = mutableListOf<String>()
        if (!haswriteexternal()) {
            Permissiontorequest.add(android.Manifest.permission.WRITE_EXTERNAL_STORAGE)
        }
        if (!location()) {
            Permissiontorequest.add(android.Manifest.permission.ACCESS_BACKGROUND_LOCATION)
        }
        if (!loctionbackground()) {
            Permissiontorequest.add(android.Manifest.permission.ACCESS_COARSE_LOCATION)
        }
        if (Permissiontorequest.isNotEmpty()) {
            ActivityCompat.requestPermissions(this, Permissiontorequest.toTypedArray(), 0)
        }
    }

    override fun onRequestPermissionsResult(
        requestCode: Int,
        permissions: Array<out String>,
        grantResults: IntArray
    ) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults)
        if (requestCode == 0 && grantResults.isNotEmpty()) {
            for (i in grantResults.indices) {
                if (grantResults[i] == PackageManager.PERMISSION_GRANTED) {
                    Log.d("permissionRequest", "${permissions[i]} granted.")
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

/*
 fun sortList(list: List<Int>) {
            for (i in 0..list.size - 1) {
                for (j in 0..list.size-2) {
                    if (list[j] > list[j + 1]) {
                        Collections.swap(list, j, j + 1)
                    }
                }
            }
        }
 */