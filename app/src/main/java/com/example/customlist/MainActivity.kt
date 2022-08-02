package com.example.customlist

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var listview=findViewById<ListView>(R.id.listview)
        var list= mutableListOf<Model>()
//        adding images

        list.add(Model("Ready to die","Notorious BIG",R.drawable.al1))
        list.add(Model("East mpaka London","Buruklyn Boyz",R.drawable.bboyz))
        list.add(Model("Flower Boy","Tyler",R.drawable.al3))
        list.add(Model("Ready to die","Lil Durk",R.drawable.k5))
        list.add(Model("Astroworld","Travis Scott",R.drawable.al5))
        list.add(Model("I am I was","Mr.Draco",R.drawable.al6))
        list.add(Model("Wasteland","Brent Faiyaz",R.drawable.brent))
        list.add(Model("Love,Damini","Burna Boy",R.drawable.burna))
        list.add(Model("Asap","ASap Rocky",R.drawable.k4))
        list.add(Model("Mr.Morale and the Big steppers","Kendrick",R.drawable.morale))

        listview.adapter=CustomAdapter(this,R.layout.row,list)
    }




}