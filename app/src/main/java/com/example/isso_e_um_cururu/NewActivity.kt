package com.example.isso_e_um_cururu

import android.content.Intent
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.CalendarContract.Colors
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import java.lang.Exception

class NewActivity : AppCompatActivity() {
    private lateinit var welcomeText: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_opened_family)

        val index = intent.getIntExtra("FAMILY_TO_LOAD", 0)
        loadCard(index);
        loadFamilies(index);
    }

    fun loadCard(index: Int) {
        val imgs = arrayOf(
            R.drawable.button_card_0,
            R.drawable.button_card_1,
            R.drawable.button_card_2,
        );

        val img = findViewById(R.id.imageView) as ImageView
        img.setImageResource(imgs[index])
    }

    fun loadFamilies(index: Int) {

        val btns = arrayOf(
            findViewById(R.id.button_0) as Button,
            findViewById(R.id.button_1) as Button,
            findViewById(R.id.button_2) as Button,

            findViewById(R.id.button_3) as Button,
            findViewById(R.id.button_4) as Button,
            findViewById(R.id.button_5) as Button,

            findViewById(R.id.button_6) as Button,
            findViewById(R.id.button_7) as Button,
            findViewById(R.id.button_8) as Button,
        );

        for(i in arrayOf(0,1,2)) {
            val id = (i + index*3);

            //btns[i].setTextColor(Color.parseColor("#0000FF"))
            //btns[i].backgroundTintList = getColorStateList(android.R.color.holo_orange_light);
            //btns[i].setBackgroundColor (Color.parseColor("#FF0000"));

            //btns[i].visibility = View.INVISIBLE;
            btns[id].visibility = View.VISIBLE;
            btns[id].setOnClickListener {
                Toast.makeText(applicationContext, "AAA", Toast.LENGTH_SHORT);

                /*val intent = Intent(this, NewActivity::class.java);
                intent.putExtra("FAMILY_TO_LOAD", 0);
                startActivity(intent);*/
            }
        }
    }
}