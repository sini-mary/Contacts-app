package com.sini.contactsapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.ContactsContract.Contacts
import androidx.recyclerview.widget.LinearLayoutManager
import com.sini.contactsapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }

    override fun onResume() {
        super.onResume()
        displaycontacts()
    }
    fun displaycontacts() {
        var contact1 = Contacts("", "Mary"," 0701499964","marysnaidaa@gmail.com")
        var contact2 = Contacts("", "Angela","07123456", "adisaambenge@gmail.com")
        var contact3 = Contacts("", "Karis", "0113668094","mosesbaraka@gmail.com")
        var contact4 = Contacts("", "Simiyu", "0113668094","marya@gmail.com")
        var contact5 = Contacts("", "Seneca", "0113668094","simiyumorgan@gmail.com")
        var contact6 = Contacts("", "Saldice", "0713030706","chemutailynn@gmail.com")
        var c = listOf(contact2, contact1, contact3, contact4, contact6, contact5)

        binding.rvcontacts.layoutManager = LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false)

        val namesAdapter=ContactrvAdapter(c)
        binding.rvcontacts.adapter=namesAdapter
    }}
