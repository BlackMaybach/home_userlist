package com.example.user_list.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import com.example.user_list.Constants
import com.example.user_list.R
import com.example.user_list.models.User

class AddNew : Fragment() {


    lateinit var name : EditText
    lateinit var miniDesc : EditText
    lateinit var allDesc : EditText
    lateinit var dateStart : EditText
    lateinit var dateEnd : EditText
    lateinit var text : EditText
    lateinit var btn : Button

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val viewSecondFragment = inflater.inflate(R.layout.fragment_add_new, container, false)

        name = viewSecondFragment.findViewById(R.id.addName)
        miniDesc = viewSecondFragment.findViewById(R.id.addMiniDesc)
        allDesc = viewSecondFragment.findViewById(R.id.addAllDesc)
        dateStart = viewSecondFragment.findViewById(R.id.addDateStart)
        dateEnd = viewSecondFragment.findViewById(R.id.addDateEnd)
        text = viewSecondFragment.findViewById(R.id.addText)
        btn = viewSecondFragment.findViewById(R.id.addButton)

        val name = name.text.toString()
        val miniD = miniDesc.text.toString()
        val allD = allDesc.text.toString()
        val dateS = dateStart.text.toString()
        val dateE = dateEnd.text.toString()
        val txt = text.text.toString()

        btn.setOnClickListener() {
            Constants.usersArr.add(
                User("$name","$miniD","$allD","$dateS",
                    "$dateE", "$txt")
            )

            activity
                ?.supportFragmentManager
                ?.popBackStack()
            // переход назад
        }

        return viewSecondFragment

    }
}