package ir.huma.tvrecyclerview.lib.interfaces

interface ItemSelectable {
    fun changeSelected(isSelected: Boolean, focus: Boolean, pos: Int, obj: Any?)
    fun isSelectable(pos: Int, obj: Any?) = true
}