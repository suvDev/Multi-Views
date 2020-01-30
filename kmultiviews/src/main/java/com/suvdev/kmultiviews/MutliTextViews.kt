package com.suvdev.kmultiviews


import android.content.Context
import android.graphics.Color
import android.util.AttributeSet
import android.util.Log
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView
import androidx.appcompat.widget.LinearLayoutCompat
import androidx.core.view.setPadding


class MutliTextViews @JvmOverloads constructor(context: Context? = null, val attrs: AttributeSet? = null, val defstyle: Int =0) :
    LinearLayout(context, attrs, defstyle) {

    init {
        val typedArray = context!!.obtainStyledAttributes(attrs, R.styleable.MutliTextViews,defstyle ,0)
        var count = typedArray.getInteger(R.styleable.MutliTextViews_count, 0)

        var textToSet = typedArray.getString(R.styleable.MutliTextViews_tv_text)
        var paddingLeft = typedArray.getDimensionPixelSize(R.styleable.MutliTextViews_tv_padding_left,0)
        var paddingRight = typedArray.getDimensionPixelSize(R.styleable.MutliTextViews_tv_padding_right,0)
        var paddingTop = typedArray.getDimensionPixelSize(R.styleable.MutliTextViews_tv_padding_top,0)
        var paddingBottom = typedArray.getDimensionPixelSize(R.styleable.MutliTextViews_tv_padding_bottom,0)
        var tvWeight = typedArray.getFloat(R.styleable.MutliTextViews_tv_common_weight,0f)

        val textviews = ArrayList<TextView>(count)

        if(count >0){
            while(count>0){
                textviews.add(TextView(context))
                count= count-1
            }
        }
        if(textviews.size>0) {
            for(item in textviews.indices){
                val layoutParams = LinearLayout.LayoutParams(
                    ViewGroup.LayoutParams.WRAP_CONTENT,
                    ViewGroup.LayoutParams.WRAP_CONTENT
                )

                layoutParams.weight = tvWeight
                textviews[item].layoutParams = layoutParams
                textviews[item].setPadding(paddingLeft,paddingTop,paddingRight,paddingBottom)
                textviews[item].setText(textToSet)
                addView(textviews[item])
            }
        }
    }
}