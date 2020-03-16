package com.example.instagramfeature.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.instagramfeature.R
import com.example.instagramfeature.model.Person
import kotlinx.android.synthetic.main.item_person.view.*

class PersonAdapter(var personList:ArrayList<Person>):
RecyclerView.Adapter<PersonAdapter.PersonViewHolder>(){
    inner class PersonViewHolder(itemView:View):
            RecyclerView.ViewHolder(itemView){
        fun bindPerson(person: Person){
            itemView.image.setImageResource(person.profile)
            itemView.txtName.text=person.name
            itemView.txtPosted.text=person.posted
            itemView.image.setImageResource(person.image)
            itemView.likeBtn.setImageResource(person.likeBtn)
            itemView.likeCount.text=person.likeCount
            itemView.commentBox.setImageResource(person.commentBox)
            itemView.commentCount.text=person.commentCount
            itemView.shareBtn.setImageResource(person.shareBtn)
            itemView.shareCount.text=person.shareCount
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PersonViewHolder {
        var view=LayoutInflater.from(parent.context).inflate(R.layout.item_person,parent,false)
        return PersonViewHolder(view)
    }

    override fun getItemCount(): Int {
        return personList.size
    }

    override fun onBindViewHolder(holder: PersonViewHolder, position: Int) {
        holder.bindPerson(personList[position])

    }
}