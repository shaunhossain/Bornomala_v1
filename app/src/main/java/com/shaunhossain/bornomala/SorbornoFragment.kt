package com.shaunhossain.bornomala

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import androidx.recyclerview.widget.RecyclerView
import androidx.viewpager2.widget.MarginPageTransformer
import androidx.viewpager2.widget.ViewPager2
import com.airbnb.lottie.LottieAnimationView
import com.shaunhossain.bornomala.Adapter.SorbornoCustomAdapter
import com.shaunhossain.bornomala.ViewModel.SorbornoViewModel
import kotlinx.android.synthetic.main.sorborno_fragment.*


class SorbornoFragment : Fragment() {


    private lateinit var viewModel: SorbornoViewModel
    private var sorbornoCustomAdapter: SorbornoCustomAdapter? = null

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
            sorbornoCustomAdapter = SorbornoCustomAdapter(SorbornoViewModels!!)
            view_pager_sorborno.adapter = sorbornoCustomAdapter
            var next: LottieAnimationView = view!!.findViewById<LottieAnimationView>(R.id.next)
            next.setOnClickListener(View.OnClickListener {
                view_pager_sorborno.setCurrentItem(
                    view_pager_sorborno.getCurrentItem() + 1,
                    true
                )
            })

            var previous: LottieAnimationView = view!!.findViewById<LottieAnimationView>(R.id.previous)
            previous.setOnClickListener(View.OnClickListener {
                view_pager_sorborno.setCurrentItem(
                    view_pager_sorborno.getCurrentItem() - 1,
                    true
                )
            })




            //transformation animation test implementation
            view_pager_sorborno.apply {
                clipToPadding = false   // allow full width shown with padding
                clipChildren = false    // allow left/right item is not clipped
                offscreenPageLimit = 3  // make sure left/right item is rendered
            }
            view_pager_sorborno.getChildAt(0).apply {
                overScrollMode = RecyclerView.OVER_SCROLL_NEVER
            }
            val marginTransformer = MarginPageTransformer(40)
            view_pager_sorborno.setPageTransformer(marginTransformer)

            val transformer = ViewPager2.PageTransformer { page, position ->
                page.apply {
                    val r = 1 - Math.abs(position)
                   // page.alpha = 0.25f + r
                    page.scaleY = 0.85f + r * 0.15f
                }
            }

            view_pager_sorborno.setPageTransformer(transformer)
        })
    }

}
