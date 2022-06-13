package com.example.mylibrary

import android.content.Context
import android.widget.Toast

class Toasty {
    companion object {
        fun simpleToast(message: String, context: Context) {
            Toast.makeText(context, message, Toast.LENGTH_SHORT).show()
        }
    }
}