package com.example.assignment3

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.assignment3.databinding.FragmentSettingsBinding

class settingsFragment : Fragment() {

    private var _binding: FragmentSettingsBinding? = null
    private val binding get() = _binding!!

    @SuppressLint("ResourceAsColor")
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment

        _binding = FragmentSettingsBinding.inflate(inflater, container, false)

        _binding!!.whiteButton.setOnClickListener {
            binding.root.setBackgroundColor(R.color.white)
        }

        _binding!!.blueButton.setOnClickListener {
            binding.root.setBackgroundColor(R.color.teal_200)
        }

        return binding.root
    }
    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}