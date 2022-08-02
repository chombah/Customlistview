package com.example.customlist

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ImageView
import android.widget.TextView

class CustomAdapter (var mctx: Context, var resources:Int, var items:List<Model>):
    ArrayAdapter<Model>(mctx,resources,items) {
    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        val layoutInflator: LayoutInflater = LayoutInflater.from(mctx)
        val view: View =layoutInflator.inflate(resources,null)

        val imageview: ImageView =view.findViewById(R.id.image)
        val titletextview: TextView =view.findViewById(R.id.textmain)
        val description: TextView =view.findViewById(R.id.textsub)

        var mItem:Model=items[position]
        imageview.setImageDrawable(mctx.resources.getDrawable(mItem.img))
        titletextview.text=mItem.title
        description.text=mItem.description

        return view

    }


}