package com.test.differentlibrary

import android.content.Context
import android.widget.ImageView
import com.test.glideimagegenerationlibrary.GlideImageLoader

object ImageLoader {

    fun loadImage(context: Context, url: String, view: ImageView) {
        GlideImageLoader.loadImage(context, url, view)
    }
}