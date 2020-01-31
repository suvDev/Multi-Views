package com.suvdev.kmultiviews


import android.content.Context
import android.content.res.TypedArray
import android.graphics.Color
import android.util.AttributeSet
import android.util.Log
import android.util.TypedValue
import android.view.View
import android.view.ViewGroup
import android.widget.*
import androidx.appcompat.widget.LinearLayoutCompat
import androidx.appcompat.widget.TintTypedArray
import androidx.core.view.setPadding
import java.util.*
import kotlin.collections.ArrayList


class MutliViews @JvmOverloads constructor(context: Context? = null, val attrs: AttributeSet? = null, val defstyle: Int =0) :
    LinearLayout(context, attrs, defstyle) {


    init {
        val typedArray = context!!.obtainStyledAttributes(attrs, R.styleable.MutliViews,defstyle ,0)
        var count = typedArray.getInteger(R.styleable.MutliViews_count, 0)

        var viewToCreate = typedArray.getString(R.styleable.MutliViews_viewName)

        when(viewToCreate){
            "textview" -> {
                val views = ArrayList<TextView>(count)
                if(count >0){
                    while(count>0){
                        views.add(TextView(context))
                        count= count-1
                    }
                    showViews(views as ArrayList<Any>, viewToCreate,typedArray)
                }
            }
            "button" ->{
                val views = ArrayList<Button>(count)
                if(count >0){
                    while(count>0){
                        views.add(Button(context))
                        count= count-1
                    }
                    showViews(views as ArrayList<Any>, viewToCreate,typedArray)
                }
            }
            "imageview" -> {
                val views = ArrayList<ImageView>(count)
                if(count >0){
                    while(count>0){
                        views.add(ImageView(context))
                        count= count-1
                    }
                    showViews(views as ArrayList<Any>, viewToCreate,typedArray)
                }
            }
            "edittext" -> {
                val views = ArrayList<EditText>(count)
                if(count >0){
                    while(count>0){
                        views.add(EditText(context))
                        count= count-1
                    }
                    showViews(views as ArrayList<Any>, viewToCreate,typedArray)
                }
            }
        }
    }

    private fun showViews(views: ArrayList<Any>, type: String, typedArray: TypedArray){

        val paddingLeft = typedArray.getDimensionPixelSize(R.styleable.MutliViews_tv_padding_left,0)
        val paddingRight = typedArray.getDimensionPixelSize(R.styleable.MutliViews_tv_padding_right,0)
        val paddingTop = typedArray.getDimensionPixelSize(R.styleable.MutliViews_tv_padding_top,0)
        val paddingBottom = typedArray.getDimensionPixelSize(R.styleable.MutliViews_tv_padding_bottom,0)
        val tvWeight = typedArray.getFloat(R.styleable.MutliViews_tv_common_weight,0f)

//        val viewHeight = typedArray.getString(R.styleable.MutliViews_view_height)

        when(type){
            "textview" -> {

                var textToSet = typedArray.getString(R.styleable.MutliViews_tv_text)
                val textviews = views as ArrayList<TextView>
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
            "button" ->{
                var textToSet = typedArray.getString(R.styleable.MutliViews_tv_text)
                val buttonViews = views as ArrayList<Button>
                for(item in buttonViews.indices){
                    val layoutParams = LinearLayout.LayoutParams(
                        ViewGroup.LayoutParams.WRAP_CONTENT,
                        ViewGroup.LayoutParams.WRAP_CONTENT
                    )
                    layoutParams.weight = tvWeight
                    buttonViews[item].layoutParams = layoutParams
                    buttonViews[item].setPadding(paddingLeft,paddingTop,paddingRight,paddingBottom)
                    buttonViews[item].setText(textToSet)
                    addView(buttonViews[item])
                }
            }
            "imageview" -> {
                val imageViews = views as ArrayList<ImageView>
                for(item in imageViews.indices){
                    val layoutParams = LinearLayout.LayoutParams(
                        ViewGroup.LayoutParams.WRAP_CONTENT,
                        ViewGroup.LayoutParams.WRAP_CONTENT
                    )
                    layoutParams.weight = tvWeight
                    imageViews[item].layoutParams = layoutParams
                    imageViews[item].setPadding(paddingLeft,paddingTop,paddingRight,paddingBottom)

                    addView(imageViews[item])
                }
            }
            "edittext" -> {
                var hintToSet = typedArray.getString(R.styleable.MutliViews_ed_hint)
                val edtextViews = views as ArrayList<EditText>
                for(item in edtextViews.indices){
                    val layoutParams = LinearLayout.LayoutParams(
                        ViewGroup.LayoutParams.WRAP_CONTENT,
                        ViewGroup.LayoutParams.WRAP_CONTENT
                    )
                    layoutParams.weight = tvWeight
                    edtextViews[item].layoutParams = layoutParams
                    edtextViews[item].setPadding(paddingLeft,paddingTop,paddingRight,paddingBottom)
                    edtextViews[item].setHint(hintToSet)
                    addView(edtextViews[item])
                }
            }
        }
    }

}