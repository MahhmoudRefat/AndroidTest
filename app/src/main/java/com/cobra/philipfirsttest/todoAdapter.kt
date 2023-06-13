package com.cobra.philipfirsttest

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.CheckBox
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import pojo.Todo

class todoAdapter(var todos: List<Todo>) : RecyclerView.Adapter<todoAdapter.todoViewHolder>() {
    inner class todoViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): todoViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_todo,parent,false)
        return todoViewHolder(view)
    }

    override fun getItemCount(): Int {
        return todos.size
    }

    override fun onBindViewHolder(holder: todoViewHolder, position: Int) {
        holder.itemView.apply {
            var tvTitle = findViewById<TextView>(R.id.tvTitle)
            var cbchecked = findViewById<CheckBox>(R.id.cbdone)
            tvTitle.text = todos[position].title
            cbchecked.isChecked = todos[position].isChecked

        }
    }
}