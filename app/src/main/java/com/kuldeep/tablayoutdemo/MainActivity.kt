package com.kuldeep.tablayoutdemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.kuldeep.tablayoutdemo.adapters.ViewPagerAdapter
import com.kuldeep.tablayoutdemo.fragments.FavouritesFragment
import com.kuldeep.tablayoutdemo.fragments.HomeFragment
import com.kuldeep.tablayoutdemo.fragments.SettingFragment
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setUpTabs()
    }

    private fun setUpTabs(){
        val pagerAdapter= ViewPagerAdapter(supportFragmentManager)
        pagerAdapter.addFragment(HomeFragment(),"Home")
        pagerAdapter.addFragment(FavouritesFragment(),"Favourites")
        pagerAdapter.addFragment(SettingFragment(),"Settings")
        viewPager.adapter=pagerAdapter
        tabLayout.setupWithViewPager(viewPager)
        tabLayout.getTabAt(0)!!.setIcon(R.drawable.ic_baseline_home_24)
        tabLayout.getTabAt(1)!!.setIcon(R.drawable.ic_baseline_favorite_24)
        tabLayout.getTabAt(2)!!.setIcon(R.drawable.ic_baseline_settings_24)
    }
}