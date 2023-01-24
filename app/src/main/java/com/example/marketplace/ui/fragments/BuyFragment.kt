package com.example.marketplace.ui.fragments

import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import com.example.marketplace.R
import com.example.marketplace.ui.viewmodels.BuyViewModel
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class BuyFragment : Fragment(R.layout.fragment_buy) {

    private val viewModel: BuyViewModel by viewModels()
}