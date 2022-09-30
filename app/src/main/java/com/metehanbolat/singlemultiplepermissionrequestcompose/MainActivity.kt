package com.metehanbolat.singlemultiplepermissionrequestcompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.google.accompanist.permissions.ExperimentalPermissionsApi
import com.metehanbolat.singlemultiplepermissionrequestcompose.ui.theme.SingleMultiplePermissionRequestComposeTheme

@ExperimentalPermissionsApi
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            SingleMultiplePermissionRequestComposeTheme {
                //RequestPermission(permission = Manifest.permission.READ_CONTACTS)
                /*
                RequestMultiplePermissions(
                    permissions = listOf(
                        Manifest.permission.READ_CONTACTS,
                        Manifest.permission.CAMERA
                    )
                )
                 */
                RequestPermission(context = this)
            }
        }
    }
}
