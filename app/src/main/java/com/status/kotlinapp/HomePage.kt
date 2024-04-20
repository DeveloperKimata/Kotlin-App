package com.status.kotlinapp

import android.os.Bundle
import android.view.Menu
import android.view.MenuInflater
import android.view.MenuItem
import android.view.View
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar
import androidx.core.view.GravityCompat
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.drawerlayout.widget.DrawerLayout
import com.google.android.material.navigation.NavigationView
import com.status.kotlinapp.adapters.ListviewAdapter
import com.status.kotlinapp.databinding.ActivityHomePageBinding
import com.status.kotlinapp.models.ListviewData

class HomePage : AppCompatActivity(), NavigationView.OnNavigationItemSelectedListener {

    private lateinit var binding: ActivityHomePageBinding
    private lateinit var listviewAdapter: ListviewAdapter
    private lateinit var listviewData: ListviewData
    var dataArrayList = ArrayList<ListviewData?>()

    private lateinit var drawerLayout: DrawerLayout
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityHomePageBinding.inflate(layoutInflater)
        
        enableEdgeToEdge()
        setContentView(binding.root)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main2)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        setSupportActionBar(findViewById(R.id.toolbar))

        drawerLayout = findViewById(R.id.main2)
        val toolbar = findViewById<Toolbar>(R.id.toolbar)

        val navigationView = findViewById<NavigationView>(R.id.nav_bar)
        navigationView.setNavigationItemSelectedListener (this)

        val toggle = ActionBarDrawerToggle(this, drawerLayout, toolbar, R.string.open_nav, R.string.close_nav)
        drawerLayout.addDrawerListener(toggle)
        toggle.syncState()

        if (savedInstanceState == null){
            supportFragmentManager.beginTransaction().replace(R.id.fragment_container, HomeFragment()).commit()
            navigationView.setCheckedItem(R.id.main2)
        }

        val nameList = arrayOf("Joyce", "Jose", "John", "Josephine", "Martha", "Joram")
        val timeList = arrayOf("30 min", "45 min", "20 min", "15 min", "60 min", "45 min")
        val imageList = intArrayOf(R.drawable.coder2, R.drawable.coder3, R.drawable.coder6, R.drawable.coder7, R.drawable.coder2, R.drawable.coder6)

        for (i in imageList.indices){
            listviewData = ListviewData(nameList[i], timeList[i], imageList[i])
            dataArrayList.add(listviewData)
        }
        listviewAdapter = ListviewAdapter(this, dataArrayList )
        listviewAdapter
        binding.main2.isClickable = true
    }

    override fun onNavigationItemSelected(item: MenuItem): Boolean {
        when(item.itemId){
            R.id.nav_home -> supportFragmentManager.beginTransaction().replace(R.id.fragment_container, HomeFragment()).commit()
            R.id.nav_logout -> Toast.makeText(this, "Logout", Toast.LENGTH_SHORT).show()
        }
        drawerLayout.closeDrawer(GravityCompat.START)
        return true
    }

    override fun onBackPressed() {
        super.onBackPressed()
        if (drawerLayout.isDrawerOpen(GravityCompat.START)){
            drawerLayout.closeDrawer(GravityCompat.START)
        }else{
            onBackPressedDispatcher.onBackPressed()
        }
    }
}