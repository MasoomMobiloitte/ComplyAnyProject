package com.example.complyanyproject.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.complyanyproject.R
import com.example.complyanyproject.model.SubDepartmentModelClass

class SubDepartmentAdapter(val context : Context, val itemList : ArrayList<SubDepartmentModelClass>) : RecyclerView.Adapter<SubDepartmentAdapter.SubDepartmentViewHolder>() {

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): SubDepartmentAdapter.SubDepartmentViewHolder{
        val view = LayoutInflater.from(context).inflate(R.layout.sub_department_recycler_layout, parent , false)
        return SubDepartmentViewHolder(view)
    }

    override fun onBindViewHolder(holder: SubDepartmentAdapter.SubDepartmentViewHolder, position: Int) {
        val userData = itemList[position]

        holder.departmentName.text = userData.departmentName
        holder.subDepartmentName.text = userData.subDepartmentName
    }

    override fun getItemCount(): Int {
        return itemList.size
    }

    class SubDepartmentViewHolder(val view : View) : RecyclerView.ViewHolder(view) {
        val departmentName : TextView = view.findViewById(R.id.departmentName)
        val subDepartmentName : TextView = view.findViewById(R.id.subDepartmentName)
    }
}