package com.example.assignment3

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.findNavController
import com.example.assignment3.databinding.FragmentMainBinding

class MainFragment : Fragment()
{
    lateinit var textInput: EditText
    private var _binding: FragmentMainBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View?
    {
        // Inflate the layout for this fragment
        _binding = FragmentMainBinding.inflate(inflater, container, false)


        //val buttonUrl = view.findViewById<Button>(R.id.buttonUrl)
        //val buttonText = view.findViewById<Button>(R.id.buttonText)
        //textInput = view.findViewById(R.id.textInput)

        _binding!!.buttonUrl.setOnClickListener{
            val action = MainFragmentDirections.actionMainFragmentToDetailFragment(_binding!!.textInput.text.toString())
            binding.root.findNavController().navigate(action)
        }

        _binding!!.buttonText.setOnClickListener {
            val action = MainFragmentDirections.actionMainFragmentToDetailFragment(binding!!.textInput.text.toString())
            binding.root.findNavController().navigate(action)
        }

        return binding.root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

}