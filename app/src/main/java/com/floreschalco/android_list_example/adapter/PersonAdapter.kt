package com.floreschalco.android_list_example.adapter

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import com.floreschalco.android_list_example.R
import com.floreschalco.android_list_example.entity.Person
import kotlinx.android.synthetic.main.person_row.view.*
/**
 * Created by Bill on 20/09/2017.
 */
class PersonAdapter(var personList:ArrayList<Person>): RecyclerView.Adapter<PersonAdapter.MyViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int):MyViewHolder{
      return MyViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.person_row,parent,false))
    }


    override fun onBindViewHolder(holder: MyViewHolder, position: Int){
        holder.bindItems(personList.get(position))
    }

    override fun getItemCount():Int{
        return personList.size
    }



    class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        fun bindItems(person: Person) {
            var textViewName= itemView.findViewById<TextView>(R.id.textViewName)
            var textViewDni= itemView.findViewById<TextView>(R.id.textViewDni)
            textViewName.text=person.name
            textViewDni.text=person.dni.toString()
        }

    }


}

