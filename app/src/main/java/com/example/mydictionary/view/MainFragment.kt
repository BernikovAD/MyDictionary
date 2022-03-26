package com.example.mydictionary.view

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.mydictionary.R
import com.example.mydictionary.databinding.FragmentMainBinding


class MainFragment : BaseViewBindingFragment<FragmentMainBinding>(FragmentMainBinding::inflate)  {
    companion object {
        fun newInstance() = MainFragment()
    }
}