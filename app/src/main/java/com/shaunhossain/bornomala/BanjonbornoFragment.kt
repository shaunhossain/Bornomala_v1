package com.shaunhossain.bornomala

import androidx.lifecycle.ViewModelProviders
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.shaunhossain.bornomala.ViewModel.BanjonbornoViewModel


class BanjonbornoFragment : Fragment() {

    companion object {
        fun newInstance() = BanjonbornoFragment()
    }

    private lateinit var viewModel: BanjonbornoViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.banjonborno_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProviders.of(this).get(BanjonbornoViewModel::class.java)
        // TODO: Use the ViewModel
    }

}
