package com.example.user_list.fragments

import android.os.Bundle
import android.provider.SyncStateContract
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.FragmentActivity
import androidx.recyclerview.widget.RecyclerView
import com.example.user_list.Constants
import com.example.user_list.Constants.Companion.usersArr
import com.example.user_list.R
import com.example.user_list.adapters.UserAdapter

class MainFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val viewFirstFragment = inflater.inflate(R.layout.fragment_main, container, false)
        val recyclerView = viewFirstFragment.findViewById<RecyclerView>(R.id.recyclerUser)

        // adapter - работает с массивом что бы его отрисовать,
        recyclerView.adapter = UserAdapter(usersArr, requireActivity())
        return viewFirstFragment
    }

}

