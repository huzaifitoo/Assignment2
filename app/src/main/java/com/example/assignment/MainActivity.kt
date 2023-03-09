package com.example.assignment

import android.app.Dialog
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.assignment.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private lateinit var mDialog: Dialog

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        mDialog = Dialog(this)

        binding.tvTransfer.setOnClickListener {

            mDialog.setContentView(R.layout.transfer_money)
            mDialog.window
            mDialog.show()

        }
        binding.imageview1.setOnClickListener {

            mDialog.setContentView(R.layout.add_money)
            mDialog.window
            mDialog.show()
        }

        binding.imageview2.setOnClickListener {

            Toast.makeText(this, "Processing Please Wait", Toast.LENGTH_SHORT).show()

            mDialog.setContentView(R.layout.redeem_credit)
            mDialog.window
            mDialog.show()
        }

        binding.imageview3.setOnClickListener {

            mDialog.setContentView(R.layout.sendto_bank)
            mDialog.window
            mDialog.show()
        }

    }
}