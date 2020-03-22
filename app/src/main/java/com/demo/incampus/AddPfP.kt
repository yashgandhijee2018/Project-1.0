package com.demo.incampus

import android.Manifest
import android.app.Activity
import android.content.ActivityNotFoundException
import android.content.Intent
import android.content.pm.PackageManager
import android.os.Build
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.addpfp.*

class AddPfP: AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.addpfp)

        addpfpbtn.setOnClickListener {
            if(Build.VERSION.SDK_INT >= Build.VERSION_CODES.M){
                if(checkSelfPermission(Manifest.permission.READ_EXTERNAL_STORAGE) == PackageManager.PERMISSION_DENIED){
                    val permissions = arrayOf(Manifest.permission.READ_EXTERNAL_STORAGE);

                    requestPermissions(permissions, 1001)
                }
                else{
                    pickImagefromGallery()
                }
            }
            else{
                pickImagefromGallery()
            }
        }
    }

    private fun pickImagefromGallery(){
        val int = Intent(Intent.ACTION_PICK)
        int.type = "image/*"
        startActivityForResult(int, 1000)
    }

    override fun onRequestPermissionsResult(
        requestCode: Int,
        permissions: Array<out String>,
        grantResults: IntArray
    ) {
        when(requestCode){
            1001 -> {
                if(grantResults.size>0 && grantResults[0]==PackageManager.PERMISSION_GRANTED){
                    pickImagefromGallery()
                }
                else{
                    Toast.makeText(this,"Permission was denied!",Toast.LENGTH_SHORT).show()
                }
            }
        }
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        if(resultCode == Activity.RESULT_OK && requestCode == 1000){
            imageView.setImageURI(data!!.data)
        }
    }
}
