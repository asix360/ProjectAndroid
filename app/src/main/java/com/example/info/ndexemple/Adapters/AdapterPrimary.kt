package com.example.info.ndexemple.Adapters

import com.example.info.ndexemple.Model.UnidadeModel

class MyAdapter constructor(val context: Context, private val undades: ArrayList<UnidadeModel>?,
                            val clickListener:(UnidadeModel)->Unit) :
        RecyclerView.Adapter<MyAdapter.ViewHolder>() {
    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {}

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val v = LayoutInflater.from(parent.context).inflate(R.layout.itenlist_unidades, parent, false)
        val vh = ViewHolder(v)
        return vh
    }
}