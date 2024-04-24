class HomePageFragment : Fragment() {

private var items: List<Item> = emptyList()

        override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
        ): View? {
        val view = inflater.inflate(R.layout.fragment_home_page, container, false)

        val recyclerView: RecyclerView = view.findViewById(R.id.recyclerView)
        val adapter = ToDoAdapter(items) { item ->
        // TODO: Item'a tıklandığında yapılacak işlemleri buraya yazın
        }
        recyclerView.adapter = adapter

        return view
        }

        override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        // TODO: Verileri buradan yükleyin (örneğin, bir API'den veya yerel depolama alanından)
        }
        }

