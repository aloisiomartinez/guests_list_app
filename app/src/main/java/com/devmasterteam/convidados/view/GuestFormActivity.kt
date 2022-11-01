package com.devmasterteam.convidados.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.lifecycle.ViewModelProvider
import com.devmasterteam.convidados.R
import com.devmasterteam.convidados.databinding.ActivityGuestFormBinding
import com.devmasterteam.convidados.viewmodel.GuestFormViewModel

class GuestFormActivity : AppCompatActivity(), View.OnClickListener {

    private lateinit var binding: ActivityGuestFormBinding
    private lateinit var viewModel: GuestFormViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityGuestFormBinding.inflate(layoutInflater)
        setContentView(binding.root)

        viewModel = ViewModelProvider(this).get(GuestFormViewModel::class.java)


        binding.buttonSave.setOnClickListener(this)
        binding.radioPresent.isChecked = true

        setContentView(R.layout.activity_guest_form)
    }

    override fun onClick(v: View) {
        if (v.id == R.id.button_save) {

        }
    }
}