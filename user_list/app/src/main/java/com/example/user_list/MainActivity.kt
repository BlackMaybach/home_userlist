package com.example.user_list

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.user_list.fragments.MainFragment

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        supportFragmentManager
            .beginTransaction()
            //add -   что надо добавить и куда надо добавить
            .add(R.id.container, MainFragment())
            // commit - то что закончили
            .commit()
    }
}