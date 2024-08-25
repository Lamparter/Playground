package dev.lamparter.kotlin.m3.noactivityborder

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import dev.lamparter.kotlin.m3.noactivityborder.ui.material.MaterialPreview

class Material : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.material)
        if (savedInstanceState == null) {
            supportFragmentManager.beginTransaction()
                .replace(R.id.container, MaterialPreview.newInstance())
                .commitNow()
        }
    }
}