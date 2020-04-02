package com.shaunhossain.bornomala

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.navigation.NavController
import androidx.navigation.Navigation
import com.shaunhossain.bornomala.ViewModel.MainViewModel

class MainFragment : Fragment(), View.OnClickListener {

    lateinit var navController: NavController


    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View {
        return inflater.inflate(R.layout.main_fragment, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        navController = Navigation.findNavController(view)
        view.findViewById<ImageView>(R.id.letter_view).setOnClickListener(this)
        view.findViewById<ImageView>(R.id.number_view).setOnClickListener(this)
        view.findViewById<ImageView>(R.id.quiz_view).setOnClickListener(this)
        view.findViewById<ImageView>(R.id.write_view).setOnClickListener(this)
    }


    override fun onClick(view: View?) {
        when(view!!.id){
            R.id.letter_view -> navController.navigate(R.id.action_mainFragment_to_alphabatSelectionFragment)
            R.id.number_view -> navController.navigate(R.id.action_mainFragment_to_numberFragment)
            R.id.quiz_view -> navController.navigate(R.id.action_mainFragment_to_gameFragment)
            R.id.write_view -> navController.navigate(R.id.action_mainFragment_to_writeFragment)
        }

    }


}
