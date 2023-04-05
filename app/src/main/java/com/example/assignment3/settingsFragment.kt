package com.example.assignment3

import android.annotation.SuppressLint
import android.graphics.Color
import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.assignment3.databinding.FragmentSettingsBinding

class settingsFragment : Fragment() {

    private var _binding: FragmentSettingsBinding? = null
    private val binding get() = _binding!!


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        _binding = FragmentSettingsBinding.inflate(inflater, container, false)

        return binding.root
    }

    @SuppressLint("ResourceAsColor")
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        _binding!!.whiteButton.setOnClickListener {
            val fragmentManager = requireActivity().supportFragmentManager
            val fragments = fragmentManager.fragments

            for (fragment in fragments) {
                binding.root.setBackgroundColor(Color.WHITE) // Change the color to any desired color
            }
        }

        _binding!!.blueButton.setOnClickListener {
            val fragmentManager = requireActivity().supportFragmentManager
            val fragments = fragmentManager.fragments

            for (fragment in fragments) {
                binding.root.setBackgroundColor(Color.BLUE) // Change the color to any desired color
            }
        }

    }
    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}