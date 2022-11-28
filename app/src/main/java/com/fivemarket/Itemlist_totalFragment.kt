package com.fivemarket

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.activityViewModels
import androidx.fragment.app.findFragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.LayoutManager
import androidx.recyclerview.widget.RecyclerView.inflate
import com.fivemarket.databinding.FragmentItemlistTotalBinding

/**
 * A simple [Fragment] subclass.
 * Use the [Itemlist_totalFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class Itemlist_totalFragment : Fragment() {

    var binding : FragmentItemlistTotalBinding? = null

    private val itemViewModel by activityViewModels<ItemViewModel>()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val items: ArrayList<Items> = itemViewModel.items

        binding = FragmentItemlistTotalBinding.inflate(layoutInflater)
        binding?.recItems?.layoutManager = LinearLayoutManager(context)
        binding?.recItems?.adapter = ItemsAdapter(items)

        return binding?.root

    }

}