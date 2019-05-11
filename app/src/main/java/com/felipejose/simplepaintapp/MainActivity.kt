package com.felipejose.simplepaintapp

import android.graphics.Canvas
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.felipejose.simplepaintapp.demopaint.CanvasView

class MainActivity : AppCompatActivity() {

    lateinit var canvasView: CanvasView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        canvasView = findViewById(R.id.canvas)
    }
    fun ClearCanvas ( view: View ){
        canvasView.ClearCanvas()
    }
}
