package com.metehanbolat.singlemultiplepermissionrequestcompose

import android.Manifest
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.ui.Modifier
import com.google.accompanist.permissions.ExperimentalPermissionsApi
import com.metehanbolat.singlemultiplepermissionrequestcompose.ui.theme.SingleMultiplePermissionRequestComposeTheme

@ExperimentalPermissionsApi
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            SingleMultiplePermissionRequestComposeTheme {
                RequestPermission(permission = Manifest.permission.READ_CONTACTS)
            }
        }
    }
}
