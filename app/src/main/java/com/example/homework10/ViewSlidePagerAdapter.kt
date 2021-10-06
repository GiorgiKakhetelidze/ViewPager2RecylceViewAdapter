package com.example.homework10

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.homework10.databinding.PhotoItemBinding
import com.example.homework10.models.Photo

class ViewSlidePagerAdapter : RecyclerView.Adapter<ViewSlidePagerAdapter.PhotoViewHolder>() {


    var listPhoto: MutableList<Photo> = mutableListOf()


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) =
        PhotoViewHolder(PhotoItemBinding.inflate(LayoutInflater.from(parent.context),parent,false))


    override fun onBindViewHolder(holder: PhotoViewHolder, position: Int) {
        holder.bind()
    }

    override fun getItemCount() = listPhoto.size


    inner class PhotoViewHolder(private val binding: PhotoItemBinding) :
        RecyclerView.ViewHolder(binding.root) {
        lateinit var curPhoto : Photo

        fun bind(){
            curPhoto = listPhoto[adapterPosition]
            binding.imgView.setImageResource(curPhoto.img)
            binding.descriptionTxtView.text = curPhoto.description
        }
    }

}