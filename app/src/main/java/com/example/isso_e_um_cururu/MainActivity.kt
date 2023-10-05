package com.example.isso_e_um_cururu

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import android.widget.Toast


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        val btns = arrayOf(
            findViewById(R.id.imgButton0) as ImageButton,
            findViewById(R.id.imgButton1) as ImageButton,
            findViewById(R.id.imgButton2) as ImageButton
        );

        for (index in arrayOf(0,1,2)) {
            btns[index].setOnClickListener {
                val intent = Intent(this, NewActivity::class.java)
                intent.putExtra("FAMILY_TO_LOAD", index)
                startActivity(intent)
            }
        }


    }
}