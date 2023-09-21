package com.example.cs388_lab2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    lateinit var emails: ArrayList<email>
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        emails = EmailFetcher.getEmails() as ArrayList<email>
        val emailsRv = findViewById<RecyclerView>(R.id.emailsRv)
        val adapter = EmailAdapter(emails)
        emailsRv.adapter = adapter
        emailsRv.layoutManager = LinearLayoutManager(this)
        findViewById<Button>(R.id.loadMoreButton).setOnClickListener {
            emails.addAll(EmailFetcher.getNext5Emails())
        }
    }
}