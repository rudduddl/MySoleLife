package com.example.mysolelife.contentsList

import android.content.Context
import android.content.Intent
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.mysolelife.R
import com.example.mysolelife.utils.FBAuth
import com.example.mysolelife.utils.FBRef

class BookmarkRVAdapter (val context : Context,
                         val items : ArrayList<ContentsModel>,
                         val keyList : ArrayList<String>,
                         val bookmarkIdList : MutableList<String>)
    : RecyclerView.Adapter<BookmarkRVAdapter.ViewHolder>() {



    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BookmarkRVAdapter.ViewHolder {
        val v = LayoutInflater.from(parent.context).inflate(R.layout.contents_rv_item, parent, false)

        Log.d("BookmarkRVAdapter", keyList.toString())
        Log.d("BookmarkRVAdapter", bookmarkIdList.toString())

        return ViewHolder(v)
    }

    override fun onBindViewHolder(holder: BookmarkRVAdapter.ViewHolder, position: Int) {

        holder.bindItems(items[position], keyList[position])
    }

    override fun getItemCount(): Int {
        return items.size
    }

    inner class ViewHolder(itemView : View) : RecyclerView.ViewHolder(itemView){

        fun bindItems(item : ContentsModel, key : String) {

            itemView.setOnClickListener{
                Toast.makeText(context, item.title, Toast.LENGTH_SHORT).show()
                val intent = Intent(context, ContentsShowActivity::class.java)
                intent.putExtra("url", item.webUrl)
                itemView.context.startActivity(Intent(context, ContentsShowActivity::class.java))
            }
            val contentsTitle = itemView.findViewById<TextView>(R.id.textArea)
            val imageViewArea = itemView.findViewById<ImageView>(R.id.imageArea)
            val bookmarkArea = itemView.findViewById<ImageView>(R.id.bookmarkArea)

            if(bookmarkIdList.contains(key)) {
                bookmarkArea.setImageResource(R.drawable.bookmark_color)
            } else {
                bookmarkArea.setImageResource(R.drawable.bookmark_white)
            }



            contentsTitle.text = item.title
            Glide.with(context)
                .load(item.imageUrl)
                .into(imageViewArea)
        }
    }
}