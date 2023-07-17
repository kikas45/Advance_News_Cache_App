package com.example.advancenetworkcahing

import android.os.Bundle
import android.view.MenuItem
import android.widget.ImageView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.core.view.GravityCompat
import androidx.drawerlayout.widget.DrawerLayout
import androidx.navigation.NavController
import androidx.navigation.findNavController
import androidx.navigation.fragment.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.google.android.material.navigation.NavigationView


class MainActivity : AppCompatActivity() {

    private lateinit var drawerLayout: DrawerLayout
    private lateinit var toolbar: ConstraintLayout


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        supportActionBar?.hide()//Ocultar ActivityBar anterior


        val bottomNavigationView = findViewById<BottomNavigationView>(R.id.bottomNavigationView)
        val navController: NavController = findNavController(R.id.fragmentContainerView)
        val appBarConfiguration = AppBarConfiguration(setOf(R.id.homeFragment, R.id.savedFragment))
        setupActionBarWithNavController(navController, appBarConfiguration)
        bottomNavigationView.setupWithNavController(navController)



        drawerLayout = findViewById(R.id.drawer_layout)
        toolbar = findViewById(R.id.myToolbar)

        // Set up the hamburger icon click listener
        val hamburgerIcon = toolbar.findViewById<ImageView>(R.id.backArrowPre)
        hamburgerIcon.setOnClickListener { drawerLayout.openDrawer(GravityCompat.START) }


        // Find the NavigationView
        val navigationView: NavigationView = findViewById(R.id.navigation_view)


        navigationView.setNavigationItemSelectedListener { menuItem ->
            when (menuItem.itemId) {
                R.id.nav_item1 -> {

                    Toast.makeText(applicationContext, "Yes ", Toast.LENGTH_SHORT).show()
                    drawerLayout.closeDrawer(GravityCompat.START)

                    if (navController.currentDestination?.id != R.id.savedFragment) {
                        navController.navigate(R.id.action_homeFragment_to_savedFragment)
                    }

                    true
                }

                R.id.nav_item2 -> {
                    // Handle item 2 click
                    Toast.makeText(applicationContext, "Yes ", Toast.LENGTH_SHORT).show()
                    drawerLayout.closeDrawer(GravityCompat.START)
                    true
                }

                R.id.nav_item3 -> {
                    Toast.makeText(applicationContext, "Yes ", Toast.LENGTH_SHORT).show()
                    drawerLayout.closeDrawer(GravityCompat.START)
                    true
                }

                else -> false
            }
        }


    }

    @Deprecated("Deprecated in Java")
    override fun onBackPressed() {
        if (drawerLayout.isDrawerOpen(GravityCompat.START)) {
            drawerLayout.closeDrawer(GravityCompat.START)
        } else {
            super.onBackPressed()
        }
    }


}