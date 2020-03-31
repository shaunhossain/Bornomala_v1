package com.shaunhossain.bornomala

import androidx.lifecycle.ViewModelProviders
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.Observer
import com.shaunhossain.bornomala.Adapter.CustomAdapter
import com.shaunhossain.bornomala.ViewModel.SorbornoViewModel
import kotlinx.android.synthetic.main.sorborno_fragment.*


class SorbornoFragment : Fragment() {


    private lateinit var viewModel: SorbornoViewModel
    private var customAdapter: CustomAdapter? = null

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.sorborno_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProviders.of(this).get(SorbornoViewModel::class.java)
        viewModel.getArrayList().observe(viewLifecycleOwner, Observer { SorbornoViewModels ->
            customAdapter = CustomAdapter(SorbornoViewModels!!)
            view_pager_sorborno.adapter = customAdapter
        })
    }

}
