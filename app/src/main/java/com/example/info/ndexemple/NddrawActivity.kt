package com.example.info.ndexemple

import android.os.Bundle
import android.support.design.widget.FloatingActionButton
import android.support.design.widget.Snackbar
import android.view.View
import android.support.design.widget.NavigationView
import android.support.v4.view.GravityCompat
import android.support.v4.widget.DrawerLayout
import android.support.v7.app.ActionBarDrawerToggle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.Toolbar
import android.view.Menu
import android.view.MenuItem

 class NddrawActivity:AppCompatActivity(), NavigationView.OnNavigationItemSelectedListener {

protected override fun onCreate(savedInstanceState:Bundle?) {
super.onCreate(savedInstanceState)
setContentView(R.layout.activity_nddraw)
val toolbar = findViewById(R.id.toolbar) as Toolbar
setSupportActionBar(toolbar)

val fab = findViewById(R.id.fab) as FloatingActionButton
fab.setOnClickListener(object:View.OnClickListener {
public override fun onClick(view:View) {
Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
.setAction("Action", null).show()
}
})

val drawer = findViewById(R.id.drawer_layout) as DrawerLayout
val toggle = ActionBarDrawerToggle(
this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close)
drawer.setDrawerListener(toggle)
toggle.syncState()

val navigationView = findViewById(R.id.nav_view) as NavigationView
navigationView.setNavigationItemSelectedListener(this)
}

public override fun onBackPressed() {
val drawer = findViewById(R.id.drawer_layout) as DrawerLayout
if (drawer.isDrawerOpen(GravityCompat.START))
{
drawer.closeDrawer(GravityCompat.START)
}
else
{
super.onBackPressed()
}
}

public override fun onCreateOptionsMenu(menu:Menu):Boolean {
 // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.nddraw, menu)
return true
}

public override fun onOptionsItemSelected(item:MenuItem):Boolean {
 // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        val id = item.getItemId()


        if (id == R.id.action_settings)
{
return true
}

return super.onOptionsItemSelected(item)
}

public override fun onNavigationItemSelected(item:MenuItem):Boolean {
 // Handle navigation view item clicks here.
        val id = item.getItemId()

if (id == R.id.nav_camera)
{
 // Handle the camera action
        }
else if (id == R.id.nav_gallery)
{

}
else if (id == R.id.nav_slideshow)
{

}
else if (id == R.id.nav_manage)
{

}
else if (id == R.id.nav_share)
{

}
else if (id == R.id.nav_send)
{

}

val drawer = findViewById(R.id.drawer_layout) as DrawerLayout
drawer.closeDrawer(GravityCompat.START)
return true
}

}
