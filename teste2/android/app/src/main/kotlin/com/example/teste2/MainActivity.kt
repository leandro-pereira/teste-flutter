package com.example.teste2

import io.flutter.embedding.android.FlutterActivity
import io.flutter.embedding.engine.FlutterEngine
import androidx.annotation.NonNull
import androidx.core.app.ActivityCompat
import androidx.core.content.ContextCompat
import android.Manifest
import android.content.pm.PackageManager
import android.content.res.Configuration
import android.os.Bundle
import android.util.Log


class MainActivity : FlutterActivity() {

//    var CAMERA_REQUEST = 500;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


//        if (savedInstanceState == null) {
//            checkPermissionsThenSetFragment()
//        }
    }

    override fun configureFlutterEngine(flutterEngine: FlutterEngine) {
        flutterEngine
                .platformViewsController
                .registry
                .registerViewFactory("view1", NativeViewFactory())
    }

//    private fun setFragment() {
//        flutterEngine!!
//            .platformViewsController
//            .registry
//            .registerViewFactory(
//                R.id.streamer, StreamerFragment.newInstance(
//                    "0",
//                    1280, 720,
//                    "rtmp://origin-v2.vewbie.com:1935/origin/2b866520-11c5-4818-9d2a-6cfdebbb8c8a"
//                )
//            ) //"rtmp://192.168.1.77:1937/live/demo"))
//            .commit()
//    }

//    fun checkPermissionsThenSetFragment() {
//        val cameraAllowed = ContextCompat.checkSelfPermission(
//            this,
//            Manifest.permission.CAMERA
//        ) === PackageManager.PERMISSION_GRANTED
//        val audioAllowed = ContextCompat.checkSelfPermission(
//            this,
//            Manifest.permission.RECORD_AUDIO
//        ) === PackageManager.PERMISSION_GRANTED
//        if (cameraAllowed && audioAllowed) {
//            setFragment()
//        } else {
//            val permissions = arrayOfNulls<String>(2)
//            var n = 0
//            if (!cameraAllowed) {
//                permissions[n++] = Manifest.permission.CAMERA
//            }
//            if (!audioAllowed) {
//                permissions[n] = Manifest.permission.RECORD_AUDIO
//            }
//            ActivityCompat.requestPermissions(this, permissions, CAMERA_REQUEST)
//        }
//    }

//    fun onConfigurationChanged(@NonNull newConfig: Configuration) {
//        super.onConfigurationChanged(newConfig)
//        Log.v("SALVE", "bora bora bora")
//        // Checks the orientation of the screen
//        if (newConfig.orientation === Configuration.ORIENTATION_LANDSCAPE) {
//            Log.v("SALVE", "landscape")
//            //Toast.makeText(this, "landscape", Toast.LENGTH_SHORT).show();
//        } else if (newConfig.orientation === Configuration.ORIENTATION_PORTRAIT) {
//            Log.v("SALVE", "portrait")
//            //Toast.makeText(this, "portrait", Toast.LENGTH_SHORT).show();
//        }
//    }

//    fun onRequestPermissionsResult(
//        requestCode: Int,
//        @NonNull permissions: Array<String?>?,
//        @NonNull grantResults: IntArray
//    ) {
//        super.onRequestPermissionsResult(requestCode, permissions, grantResults)
//        if (requestCode == CAMERA_REQUEST) {
//            for (result in grantResults) {
//                if (result == PackageManager.PERMISSION_DENIED) {
//                    return
//                }
//            }
//            setFragment()
//        }
//    }
}

// package com.example.teste2

// import androidx.annotation.NonNull;
// import io.flutter.embedding.android.FlutterActivity;
// import io.flutter.embedding.engine.FlutterEngine;

// public class MainActivity: FlutterActivity {
//     @Override
//     configureFlutterEngine(@NonNull FlutterEngine flutterEngine) {
//         super.configureFlutterEngine(flutterEngine);
//         flutterEngine
//                 .getPlatformViewsController()
//                 .getRegistry()
//                 .registerViewFactory("view1", new NativeViewFactory());
//     }
// }

// class NativeView implements PlatformView {
//     @NonNull private final TextView textView;
 
//      NativeView(@NonNull Context context, int id, @Nullable Map<String, Object> creationParams) {
//          textView = new TextView(context);
//          textView.setTextSize(72);
//          textView.setBackgroundColor(Color.rgb(255, 255, 255));
//          textView.setText("Rendered on a native Android view (id: " + id + ")");
//      }
 
//      @NonNull
//      @Override
//      public View getView() {
//          return textView;
//      }
 
//      @Override
//      public void dispose() {}
// }