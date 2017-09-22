package com.floreschalco.android_list_example

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import com.floreschalco.android_list_example.adapter.PersonAdapter
import com.floreschalco.android_list_example.entity.Person

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var recyclerViewPerson = findViewById<RecyclerView>(R.id.recyclerViewPerson)

        recyclerViewPerson.setHasFixedSize(true)
        var linearLayoutManager =LinearLayoutManager(this)
        linearLayoutManager.orientation=LinearLayoutManager.VERTICAL
        recyclerViewPerson.layoutManager=linearLayoutManager

        var personList = ArrayList<Person>()
        personList.add(Person("bill flores",2921490))
        personList.add(Person("Carlos vargas",296560))
        personList.add(Person("David Tenorio",25590))
        var personAdapter=PersonAdapter(personList)
        recyclerViewPerson.adapter= personAdapter

    }
}
