package com.example.instagramfeature

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.instagramfeature.adapter.PersonAdapter
import com.example.instagramfeature.model.Person
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var personArray=ArrayList<Person>()
        personArray.add(
            Person(
                R.drawable.image,
                "Emily",
                "Posted",
                R.drawable.image,
                R.drawable.ic_favorite_black_24dp,
                "21.3k likes",
                R.drawable.comment_box,
                "456 comments",
                R.drawable.ic_share,
                "101shares"
            )
        )
        personArray.add(
            Person(
                R.drawable.secondprofile,
                "David",
                "Posted",
                R.drawable.second,
                R.drawable.ic_favorite_black_24dp,
                "2.3k likes",
                R.drawable.comment_box,
                "101 comments",
                R.drawable.ic_share,
                "506shares"
            )
        )
        personArray.add(
            Person(
                R.drawable.thirdprofile,
                "Dybala",
                "Posted",
                R.drawable.third,
                R.drawable.ic_favorite_black_24dp,
                "1M likes",
                R.drawable.comment_box,
                "29k comments",
                R.drawable.ic_share,
                "256k shares"
            )
        )
        var personAdapter=PersonAdapter(personArray)
        recyclerView.layoutManager=LinearLayoutManager(this)
        recyclerView.adapter=personAdapter
    }
}
