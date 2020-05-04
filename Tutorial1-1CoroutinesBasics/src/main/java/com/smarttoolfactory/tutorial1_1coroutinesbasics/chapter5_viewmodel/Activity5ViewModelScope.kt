package com.smarttoolfactory.tutorial1_1coroutinesbasics.chapter5_viewmodel

import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import com.smarttoolfactory.tutorial1_1basics.databinding.Activity5ViewmodelBinding

class Activity5ViewModelScope : AppCompatActivity() {

    private val viewModel: CoroutinesViewModel by viewModels()

    private val dataBinding by lazy {
        Activity5ViewmodelBinding.inflate(layoutInflater)
    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(dataBinding.root)

        dataBinding.apply {
            lifecycleOwner = this@Activity5ViewModelScope
            viewModel = this@Activity5ViewModelScope.viewModel
        }

    }

}