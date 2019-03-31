package com.example.myapplication.Adapter

import android.app.Activity
import android.support.v7.widget.RecyclerView
import android.view.View
import com.example.myapplication.Model.Item
import kotlinx.android.synthetic.main.item_layout.view.*
import kotlinx.android.synthetic.main.loading_layout.view.*

internal class loadingViewHolder(itemView:View):RecyclerView.ViewHolder(itemView)
{
    var progressBar = itemView.progress_bar
}

internal  class itemViewHolder(itemView: View):RecyclerView.ViewHolder(itemView)
{
    var txt_Name = itemView.text_Name
    var txt_length = itemView.text_length
}

class  Adapter (recyclerView: RecyclerView ,internal var activity: Activity ,internal var items:MutableList<Item?>){

}