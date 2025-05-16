package com.example.viewbindingproject

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.databinding.DataBindingUtil
import com.example.viewbindingproject.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
//        findViewById
//    private lateinit var editValueNim:EditText
//    private lateinit var editValueNama:EditText
//    private lateinit var btnValueSimpan:Button
//    private lateinit var txtValueNim:TextView
//    private lateinit var txtValueNama:TextView

//    var nim:String = ""
//    var nama:String = ""

//        findViewById
    private lateinit var binding:ActivityMainBinding
    var nim:String = ""
    var nama:String = ""

    var mahasiswa: Mahasiswa = Mahasiswa()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

//        binding = ActivityMainBinding.inflate(layoutInflater)
//        setContentView(binding.root)
        binding = DataBindingUtil.setContentView(this,R.layout.activity_main)
        binding.mahasiswa = mahasiswa
        binding.btnSimpan.setOnClickListener {


            mahasiswa.nim = "NIM: "+binding.editNim.text.toString()
            mahasiswa.nama = "NAMA: "+binding.editNama.text.toString()
            binding.mahasiswa=mahasiswa

            binding.txtNim.text = "Nim:"+nim
            binding.txtNama.text = "Nama:"+nama
            Toast.makeText(this,"Data berhasil disimpan",Toast.LENGTH_SHORT).show()
        }

//        findViewById
//        setContentView(R.layout.activity_main)
//        editValueNim = findViewById(R.id.edit_nim)
//        editValueNama = findViewById(R.id.edit_nama)
//        btnValueSimpan = findViewById(R.id.btn_simpan)
//        txtValueNim = findViewById(R.id.txt_nim)
//        txtValueNama = findViewById(R.id.txt_nama)
//
//        btnValueSimpan.setOnClickListener {
//            nim = editValueNim.text.toString()
//            nama = editValueNama.text.toString()
//            txtValueNim.text = "Nim:"+nim
//            txtValueNama.text = "Nama:"+nama
//            Toast.makeText(this,"Data berhasil disimpan",Toast.LENGTH_SHORT).show()
//        }
 //        findViewById
    }
}