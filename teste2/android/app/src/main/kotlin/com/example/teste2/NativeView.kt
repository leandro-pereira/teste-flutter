package com.example.teste2

import android.Manifest
import android.content.Context
import android.content.ContextWrapper
//import com.example.flutter_native.databinding.ActivityMainBinding
import android.content.pm.PackageManager
import android.os.Build
import android.util.Log
import android.view.LayoutInflater
import androidx.core.app.ActivityCompat
import io.flutter.plugin.platform.PlatformView
import androidx.camera.lifecycle.ProcessCameraProvider
import android.widget.LinearLayout
import androidx.core.content.ContextCompat
import com.google.android.flexbox.FlexboxLayout
//import com.google.android.material.button.MaterialButton
import android.widget.Button

internal class NativeView(context: Context, id: Int, creationParams: Map<String?, Any?>?) : PlatformView {
    //    private var button: LinearLayout
//    private lateinit var viewBinding: ActivityMainBinding
    var containerView : FlexboxLayout

    override fun getView(): FlexboxLayout {
        return containerView
    }

    override fun dispose() {}

    init {
        this.containerView = FlexboxLayout(context)
        LayoutInflater.from(context).inflate(R.layout.activity_main, this.containerView)
    }
}
