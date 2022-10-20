package com.amigasdopeito.adapter

import android.content.Context
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.amigasdopeito.fragment.CadastroFragment
import com.amigasdopeito.fragment.LoginFragment

internal class CadastroLoginAdapter (
    var context: Context,
    fm: FragmentManager,
    var totalTabs: Int) : FragmentPagerAdapter(fm) {

    override fun getItem(position: Int): Fragment {
        return when(position) {
            0 -> {
                LoginFragment()
            }
            1 -> {
                CadastroFragment()
            }
            else -> getItem(position)
        }
    }

    override fun getCount(): Int {
        return totalTabs
    }

}