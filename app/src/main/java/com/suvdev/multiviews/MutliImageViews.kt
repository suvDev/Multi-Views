package com.suvdev.multiviews
//
//import android.content.Context
//import android.graphics.Color
//import android.util.AttributeSet
//import android.util.Log
//import android.view.View
//import android.view.ViewGroup
//import android.widget.ImageView
//import android.widget.LinearLayout
//import android.widget.TextView
//import androidx.appcompat.widget.LinearLayoutCompat
//
////class MutliImageViews @JvmOverloads constructor(context: Context, attrs: AttributeSet, defstyle: Int, unknown: Int): ImageView(context, attrs, defstyle, unknown) {
////
////
////
////}
//
//class MutliImageViews @JvmOverloads constructor(context: Context? = null, attrs: AttributeSet? = null, defstyle: Int =0) :
//    LinearLayout(context, attrs, defstyle) {
//
//    init {
//        val typedArray = context!!.obtainStyledAttributes(attrs, R.styleable.MutliImageViews,defstyle ,0)
//        var count = typedArray.getInteger(R.styleable.MutliImageViews_count, -1)
//        val textviews = ArrayList<TextView>(count)
//        Log.e("Multi","Array Size: "+count)
//        if(count >0){
//            while(count>0){
//                textviews.add(TextView(context))
//                count= count-1
//            }
//        }
//        if(textviews.size>0) {
//            for(item in textviews){
//                item.layoutParams = LayoutParams(
//                    ViewGroup.LayoutParams.WRAP_CONTENT,
//                    ViewGroup.LayoutParams.WRAP_CONTENT
//                )
//                item.setText("dbcdbc")
//                addView(item)
//            }
//        }
//    }
//
//}