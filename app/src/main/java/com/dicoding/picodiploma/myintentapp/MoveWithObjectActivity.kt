package com.dicoding.picodiploma.myintentapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.dicoding.picodiploma.myintentapp.R.layout
import kotlinx.android.synthetic.main.activity_move_with_object.view.*
import org.w3c.dom.Text

class MoveWithObjectActivity : AppCompatActivity() {
    companion object{
        const val EXTRA_PERSON = "extra-person"
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_move_with_object)

        val tvObject:TextView = findViewById(R.id.tv_object_received)

        val person = intent.getParcelableExtra(EXTRA_PERSON) as Person
        val text = "Nama : ${person.name.toString()},\nEmail : ${person.email},\nAge : ${person.age},\nLocation : ${person.city}"
        tvObject.text = text
    }
}
