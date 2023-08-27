package com.example.mysolelife.auth

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import com.example.mysolelife.R
import com.example.mysolelife.databinding.ActivityJoinBinding
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.ktx.auth
import com.google.firebase.ktx.Firebase

class JoinActivity : AppCompatActivity() {

    private lateinit var auth: FirebaseAuth

    private lateinit var binding : ActivityJoinBinding
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)

        binding = DataBindingUtil.setContentView(this, R.layout.activity_join)

        auth = Firebase.auth

    //코드상에 버튼id를 기입하지도 않았는데 어떻게 버튼을 누르면 회원가입이 되는건지?
//        auth.createUserWithEmailAndPassword("abc@abc.com", "abcabc")
//            .addOnCompleteListener(this) { task ->
//                if (task.isSuccessful) {
//
//                    Toast.makeText(this, "성공", Toast.LENGTH_SHORT).show()
//
//                } else {
//
//                    Toast.makeText(this, "실패", Toast.LENGTH_SHORT).show()
//                }
//            }
    }
}