package com.shaunhossain.bornomala

import android.media.MediaPlayer
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.navigation.Navigation
import com.shaunhossain.bornomala.ViewModel.NumberViewModel


class NumberFragment : Fragment(), View.OnClickListener {

    private lateinit var viewModel: NumberViewModel

    lateinit var soundZero: MediaPlayer
    lateinit var soundOne: MediaPlayer
    lateinit var soundTwo: MediaPlayer
    lateinit var soundThree: MediaPlayer
    lateinit var soundFour: MediaPlayer
    lateinit var soundFive: MediaPlayer
    lateinit var soundSix: MediaPlayer
    lateinit var soundSeven: MediaPlayer
    lateinit var soundEight: MediaPlayer
    lateinit var soundNine: MediaPlayer

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.number_fragment, container, false)

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        view.findViewById<ImageView>(R.id.one_view).setOnClickListener(this)
        view.findViewById<ImageView>(R.id.two_view).setOnClickListener(this)
        view.findViewById<ImageView>(R.id.three_view).setOnClickListener(this)
        view.findViewById<ImageView>(R.id.four_view).setOnClickListener(this)
        view.findViewById<ImageView>(R.id.five_view).setOnClickListener(this)
        view.findViewById<ImageView>(R.id.six_view).setOnClickListener(this)
        view.findViewById<ImageView>(R.id.seven_view).setOnClickListener(this)
        view.findViewById<ImageView>(R.id.eight_view).setOnClickListener(this)
        view.findViewById<ImageView>(R.id.nine_view).setOnClickListener(this)
        view.findViewById<ImageView>(R.id.zero_view).setOnClickListener(this)

    }


    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        //viewModel = ViewModelProviders.of(this).get(NumberViewModel::class.java)
        soundOne = MediaPlayer.create(context, R.raw.one)
        soundTwo = MediaPlayer.create(context, R.raw.two)
        soundThree = MediaPlayer.create(context, R.raw.three)
        soundFour = MediaPlayer.create(context, R.raw.four)
        soundFive = MediaPlayer.create(context, R.raw.five)
        soundSix = MediaPlayer.create(context, R.raw.six)
        soundSeven = MediaPlayer.create(context, R.raw.seven)
        soundEight = MediaPlayer.create(context, R.raw.eight)
        soundNine = MediaPlayer.create(context, R.raw.nine)
        soundZero = MediaPlayer.create(context, R.raw.shunno)
    }

    override fun onClick(view: View?) {

        when(view!!.id){
            R.id.one_view -> soundOne.start()
            R.id.two_view -> soundTwo.start()
            R.id.three_view -> soundThree.start()
            R.id.four_view -> soundFour.start()
            R.id.five_view -> soundFive.start()
            R.id.six_view -> soundSix.start()
            R.id.seven_view -> soundSeven.start()
            R.id.eight_view -> soundEight.start()
            R.id.nine_view -> soundNine.start()
            R.id.zero_view -> soundZero.start()
        }
    }

}
