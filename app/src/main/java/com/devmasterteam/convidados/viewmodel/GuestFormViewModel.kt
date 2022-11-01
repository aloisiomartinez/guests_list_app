package com.devmasterteam.convidados.viewmodel

import androidx.lifecycle.ViewModel
import com.devmasterteam.convidados.repository.GuestRepository

class GuestFormViewModel: ViewModel() {

    private val repository = GuestRepository.getInstance()

}