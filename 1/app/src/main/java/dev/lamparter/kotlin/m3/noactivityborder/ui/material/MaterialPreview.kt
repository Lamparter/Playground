package dev.lamparter.kotlin.m3.noactivityborder.ui.material

import androidx.fragment.app.viewModels
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import dev.lamparter.kotlin.m3.noactivityborder.R

class MaterialPreview : Fragment() {

    companion object {
        fun newInstance() = MaterialPreview()
    }

    private val viewModel: MaterialPreviewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // TODO: Use the ViewModel
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        return inflater.inflate(R.layout.material_preview, container, false)
    }

}