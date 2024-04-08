package com.test.glideimagegenerationlibrary

import android.content.Context
import android.widget.ImageView
import com.bumptech.glide.Glide

object GlideImageLoader {

    fun loadImage(context: Context, url: String, view: ImageView) {
        Glide.with(context)
            .load(url)
            .into(view)
    }
}