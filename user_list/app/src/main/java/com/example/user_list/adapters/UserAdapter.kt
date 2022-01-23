package com.example.user_list.adapters

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.FragmentActivity
import androidx.recyclerview.widget.RecyclerView
import com.example.user_list.R
import com.example.user_list.fragments.AddNew
import com.example.user_list.models.User

class UserAdapter(private var array: ArrayList<User>,
                  var context: FragmentActivity
) :
    RecyclerView.Adapter<UserAdapter.ViewHolder>() {
    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        // обьекты наших элементов(для ячеек)
        val title: TextView = view.findViewById<TextView>(R.id.getName)
        val cat: TextView = view.findViewById<TextView>(R.id.getMiniDesc)
        val btn: TextView = view.findViewById(R.id.addUser)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val viewNameCat = LayoutInflater.from(parent.context)
            .inflate(R.layout.activity_get_info, parent, false )
        return ViewHolder(viewNameCat)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item = array[position]

        holder.title.text = item.name
        holder.cat.text = item.miniDesc

        holder.btn.setOnClickListener() {
            val bundle = Bundle()
            context.supportFragmentManager.beginTransaction()
                .replace(R.id.container, AddNew::class.java, bundle)
                .addToBackStack(null)
                .commit()
        }
    }

    override fun getItemCount(): Int {
        return array.size
    }
}