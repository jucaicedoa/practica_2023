package com.jucaicedoa.appsbasicas1.apps.app4

import android.app.DownloadManager.Query
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.app.ActionBar
import androidx.appcompat.widget.SearchView
import com.jucaicedoa.appsbasicas1.R
import com.jucaicedoa.appsbasicas1.databinding.ActivityApp1Binding
import com.jucaicedoa.appsbasicas1.databinding.ActivityApp4ListadoBinding

class App4ListadoActivity : AppCompatActivity() {
    private lateinit var binding: ActivityApp4ListadoBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityApp4ListadoBinding.inflate(layoutInflater)
        setContentView(binding.root)
        initUI()
    }

    private fun initUI() {
       binding.svApp4.setOnQueryTextListener(object : SearchView.OnQueryTextListener{
           override fun onQueryTextSubmit(query: String?): Boolean {
               searchByName(query.orEmpty())
               return false
           }

           override fun onQueryTextChange(newText: String?) = false
       })
    }

    private fun searchByName(query: String) {

    }
}