package com.example.mycontacts

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.widget.Toolbar
import androidx.appcompat.app.AppCompatActivity

class DetailActivity :AppCompatActivity(){
    companion object{
        const val EXTRA_CONTACT: String = "EXTRA_CONTACT"
    }

    private var contact: Contact? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.contact_detail)

        initToolbar()
        getExtras()
        bindViews()
    }

    private fun initToolbar(){
        val toolbar = findViewById<Toolbar>(R.id.toolbar)
        setSupportActionBar(toolbar)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
    }

    private fun getExtras(){
        contact = intent.getParcelableExtra(EXTRA_CONTACT)

    }

    private fun bindViews(){
        findViewById<TextView>(R.id.tv_name).text = contact?.name
        findViewById<TextView>(R.id.tv_phone).text = contact?.phone
    }

    override fun onSupportNavigateUp(): Boolean {
        finish()
        return true
    }


}