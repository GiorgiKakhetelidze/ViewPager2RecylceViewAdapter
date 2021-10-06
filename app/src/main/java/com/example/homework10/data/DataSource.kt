package com.example.homework10.data

import com.example.homework10.R
import com.example.homework10.models.Photo

object DataSource {

    val photos: MutableList<Photo> = mutableListOf(
        Photo(R.drawable.image1, "Image 1", "Description 1"),
        Photo(R.drawable.image2, "Image 2", "Description 2"),
        Photo(R.drawable.image3, "Image 3", "Description 3"),
        Photo(R.drawable.image4, "Image 4", "Description 4"),
        Photo(R.drawable.image5, "Image 5", "Description 5"),
        Photo(R.drawable.image6, "Image 6", "Description 6"),
        Photo(R.drawable.image7, "Image 7", "Description 7"),
        Photo(R.drawable.image8, "Image 8", "Description 8"),
        Photo(R.drawable.image9, "Image 9", "Description 9"),
    )
}