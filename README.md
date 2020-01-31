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
	        implementation 'com.github.suvDev:Multi-Views:2.0'
	}

As stated this library can be used to create many similar static views with equal size. This library support "TextView", "ImageView"
, "Button" and "Edittext" as of now and more will be added in future releases. Here's a sample:

``` <com.suvdev.kmultiviews.MutliViews
        android:id="@+id/group"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:orientation="horizontal"
        app:count="4"
        app:viewName="textview"
        app:ed_hint="Enter data here..."
        app:tv_text="Demo"
        app:tv_padding_top="10dp"
        app:tv_padding_right="10dp"
        app:tv_padding_left="10dp"
        app:tv_padding_bottom="10dp"
        app:tv_common_weight="1"/>```
	
Here **app:viewName** is used to specify the view which needs to be created out of the 4 mentioned above. <br/>
To create, **TextView**  use: **app:viewName = "textview"**<br/>
	   **ImageView** use: **app:viewName = "imageview"**<br/>
	   **Button**    use: **app:viewName = "button"**<br/>
	   **Edittext**  use: **app:viewName = "edittext"**<br/>
	   
and **ed_hint** here is the hint text for edittext, I will try to add as much support for every view's attribute in xml itself.<br/>
    **count**            = number of views<br/>
    **tv_common_weight** = weight assigned to every view<br/>
    
You can use the **orientation** attribute to specify in which direction the views are to be made.    

So for "TextViews" the text values can be changed at runtime by getting the position of each view like:

```
 val tv = group.getChildAt(0) as TextView
 tv.setText("Runtime")
```
<br/>
and similarly the images can be set at runtime using:
```
 val imageView = group.getChildAt(0) as ImageView
 imageView.setImageResource(R.drawable.ic_launcher_background)
```
Here **group** is the id of the MultiTextViews.
