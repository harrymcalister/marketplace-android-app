package com.example.marketplace.ui.viewmodels

import androidx.lifecycle.ViewModel
import com.example.marketplace.repositories.MainRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class BuyViewModel @Inject constructor(
    val mainRepository: MainRepository
) : ViewModel() {
}