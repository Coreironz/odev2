class ToDoAdapter(private val items: List<Item>,
                  private val onItemClickListener: (Item) -> Unit) : RecyclerView.Adapter<ToDoAdapter.ToDoViewHolder>() {

class ToDoViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val titleTextView: TextView = itemView.findViewById(R.id.titleTextView)
        val checkBox: CheckBox = itemView.findViewById(R.id.checkBox)
        }

        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ToDoViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.item_todo, parent, false)
        return ToDoViewHolder(itemView)
        }

        override fun onBindViewHolder(holder: ToDoViewHolder, position: Int) {
        val item = items[position]
        holder.titleTextView.text = item.title
        holder.checkBox.isChecked = item.isChecked

        holder.itemView.setOnClickListener {
        onItemClickListener(item)
        }

        holder.checkBox.setOnCheckedChangeListener { _, isChecked ->
        val updatedItem = item.copy(isChecked = isChecked)
        val updatedItems = items.toMutableList()
        updatedItems[position] = updatedItem
        notifyItemChanged(position)
        }
        }

        override fun getItemCount(): Int {
        return items.size
        }
        }

