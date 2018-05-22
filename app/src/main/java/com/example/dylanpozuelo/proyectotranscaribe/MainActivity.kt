package com.example.dylanpozuelo.proyectotranscaribe

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.google.android.gms.common.GoogleApiAvailability

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    public fun googleServicesAvaible(){
        var GoogleApiAvailability = GoogleApiAvailability.getInstance()
    }
}
