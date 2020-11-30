package com.globomantics.globomanticslogin

import android.content.Context
import android.util.AttributeSet
import android.view.LayoutInflater
import android.widget.LinearLayout
import com.globomantics.globomanticslogin.databinding.ViewLoginDataBinding

class LoginDataView : LinearLayout {

    private lateinit var binding: ViewLoginDataBinding

    constructor(context: Context, attrs: AttributeSet, defStyleAttr: Int, defStyleRes: Int) : super(
        context,
        attrs,
        defStyleAttr,
        defStyleRes
    ) {
        initView()
    }

    constructor(context: Context, attrs: AttributeSet, defStyleAttr: Int) : super(
        context,
        attrs,
        defStyleAttr
    ) {
        initView()
    }

    constructor(context: Context, attrs: AttributeSet) : super(context, attrs) {
        initView()
    }

    constructor(context: Context) : super(context) {
        initView()
    }

    private fun initView() {
        binding = ViewLoginDataBinding.inflate(
            LayoutInflater.from(context),
            this,
            true
        )
    }

    val email get() = binding.editTextEmail.text.toString()
    val password get() = binding.editTextPassword.text.toString()
}