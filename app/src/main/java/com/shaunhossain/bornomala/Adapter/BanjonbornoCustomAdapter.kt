package com.shaunhossain.bornomala.Adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.shaunhossain.bornomala.R
import com.shaunhossain.bornomala.ViewModel.BanjonbornoViewModel
import com.shaunhossain.bornomala.ViewModel.SorbornoViewModel

class BanjonbornoCustomAdapter (private val model: ArrayList<BanjonbornoViewModel>): RecyclerView.Adapter<BanjonbornoCustomAdapter.ViewPagerHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewPagerHolder {
        return ViewPagerHolder(
            LayoutInflater.from(parent.context).inflate(
                R.layout.item_banjonborno,parent,false
            )
        )
    }

    override fun getItemCount(): Int {
        return model.size
    }

    override fun onBindViewHolder(holder: ViewPagerHolder, position: Int) {
        holder.bind(model[position])
    }

    inner class ViewPagerHolder( view: View): RecyclerView.ViewHolder(view){
        private val bornoView = view.findViewById<ImageView>(R.id.banjonborno_view)
        private val photoView = view.findViewById<ImageView>(R.id.photo_view)
        private val photoName = view.findViewById<TextView>(R.id.photo_name)

        fun bind (model: BanjonbornoViewModel){
            bornoView.setImageResource(model.bornoImage!!)
            photoView.setImageResource(model.relatedImage!!)
            photoName.text = model.description
        }

    }

}