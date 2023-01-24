package com.example.marketplace.ui.fragments

import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import com.example.marketplace.R
import com.example.marketplace.ui.viewmodels.SellViewModel
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class SellFragment : Fragment(R.layout.fragment_sell) {

    private val viewModel: SellViewModel by viewModels()
}