# Multi-Views
This library can be used to create many similar static views with equal size.

[![](https://jitpack.io/v/suvDev/Multi-Views.svg)](https://jitpack.io/#suvDev/Multi-Views)

To use this library:
Add it in your root build.gradle at the end of repositories:

	allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
	}
  
Step 2. Add the dependency

	dependencies {
	        implementation 'com.github.suvDev:Multi-Views:1.0.1'
	}

As stated this library can be used to create many similar static views with equal size. At present this library support only textviews but more will be added in future releases. Here's a sample:


    <com.suvdev.kmultiviews.MutliTextViews
        android:id="@+id/group"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        app:count="3"
        app:tv_text="Demo"
        app:tv_padding_top="10dp"
        app:tv_padding_right="10dp"
        app:tv_padding_left="10dp"
        app:tv_padding_bottom="10dp"
        app:tv_common_weight="1"/>


So for "TextViews" the text values can be changed at runtime by getting the position of each view like:

```
 val tv = group.getChildAt(0) as TextView
 tv.setText("Runtime")
```
Here group is the id of the MultiTextViews.
