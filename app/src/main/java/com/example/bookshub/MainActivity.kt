package com.example.bookshub

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.FrameLayout
//import androidx.appCompat.widget.Toolbar
import androidx.appcompat.widget.Toolbar
import androidx.coordinatorlayout.widget.CoordinatorLayout
import androidx.drawerlayout.widget.DrawerLayout
import com.google.android.material.navigation.NavigationView

class MainActivity : AppCompatActivity() {
    private lateinit var coordinatorLayout:CoordinatorLayout
    private lateinit var frameLayout:FrameLayout
  private  lateinit var toolbar: Toolbar
    private lateinit var navigationView:NavigationView
    private lateinit var drawerLayout: DrawerLayout

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        coordinatorLayout=findViewById(R.id.coordinatorLayout)
        frameLayout=findViewById(R.id.frameLayout)
        toolbar=findViewById(R.id.toolbar)
        navigationView=findViewById(R.id.navigationView)
        drawerLayout=findViewById(R.id.drawerLayout)

        setUpToolbar()

    }

   private fun setUpToolbar(){
       setSupportActionBar(toolbar)
       supportActionBar?.title="Toolbar Title"
    }


}