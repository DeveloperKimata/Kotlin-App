package com.status.kotlinapp.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ImageView
import android.widget.TextView
import com.status.kotlinapp.R
import com.status.kotlinapp.models.ListviewData

class ListviewAdapter(context: Context, dataArrayList: ArrayList<ListviewData?>?):
ArrayAdapter<ListviewData?>(context, R.layout.list_view, dataArrayList!!){
    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        var view = convertView
        val listviewData = getItem(position)

        if(view == null){
            view = LayoutInflater.from(context).inflate(R.layout.list_view, parent,false)
        }
        val listImage = view!!.findViewById<ImageView>(R.id.image)
        val listName = view.findViewById<TextView>(R.id.listName)
        val listTime = view.findViewById<TextView>(R.id.time)

        listImage.setImageResource(listviewData !!.image)
        listName.text = listviewData.name
        listTime.text = listviewData.time
        return view
    }
}