package com.globomantics.globomanticslogin

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.globomantics.globomanticslogin.databinding.FragmentLoginBinding

class LoginFragment: Fragment() {

    private var binding: FragmentLoginBinding? = null

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentLoginBinding.inflate(inflater, container, false)

        binding!!.buttonLogin.setOnClickListener {
            if(binding!!.loginDataView.email == "test@globomantics.com" &&
                binding!!.loginDataView.password == "test123") {
                Toast.makeText(
                    requireContext(), "Login Successful",
                    Toast.LENGTH_SHORT
                ).show()
            } else {
                Toast.makeText(
                    requireContext(), "Login Failed",
                    Toast.LENGTH_SHORT
                ).show()
            }
        }

        return binding!!.root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        binding = null
    }
}