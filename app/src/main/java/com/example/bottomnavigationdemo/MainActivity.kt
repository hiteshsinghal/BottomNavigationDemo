package com.example.bottomnavigationdemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.findNavController
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController
import com.example.bottomnavigationdemo.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding:ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        //Getting Nav Controller
        val navHostFragmentHome = supportFragmentManager.findFragmentById(R.id.fragmentContainerView) as NavHostFragment
        val navController = navHostFragmentHome.navController

        //Setting Nav Controller to bottom Navigation
        binding.bottomnavigation.setupWithNavController(navController)

        //Setting up Fragment Labels on App Bar
        val appBarConfiguration = AppBarConfiguration(setOf(R.id.fragmentHome, R.id.fragmentPerson, R.id.fragmentSetting))
        setupActionBarWithNavController(navController,appBarConfiguration)
    }
}