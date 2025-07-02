<?xml version="1.0" encoding="utf-8"?>
<RelativeLayout xmlns:android="http://schemas.android.com/apk/res/android"
xmlns:map="http://schemas.android.com/apk/res-auto"
android:layout_width="match_parent"
android:layout_height="match_parent">

    <!-- Google Map Fragment -->
    <fragment
android:id="@+id/report_map"
android:name="com.google.android.gms.maps.SupportMapFragment"
android:layout_width="match_parent"
android:layout_height="match_parent" />

    <!-- Save Button (overlayed at the bottom) -->
    <Button
android:id="@+id/btn_save_location"
android:layout_width="wrap_content"
android:layout_height="wrap_content"
android:text="Save Location"
android:layout_alignParentBottom="true"
android:layout_centerHorizontal="true"
android:layout_marginBottom="20dp"
android:backgroundTint="@color/purple_500"
android:textColor="@android:color/white"/>
</RelativeLayout>
