package ir.huma.tvrecyclerview.lib.interfaces

import androidx.recyclerview.widget.RecyclerView

interface OnItemSelectedListener {
    fun onItemSelected(position: Int, obj: Any?, v: RecyclerView.ViewHolder?, adapter: RecyclerView.Adapter<*>?)
}