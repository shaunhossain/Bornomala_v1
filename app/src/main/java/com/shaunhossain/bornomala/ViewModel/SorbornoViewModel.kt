package com.shaunhossain.bornomala.ViewModel

import androidx.lifecycle.MutableLiveData
import com.shaunhossain.bornomala.Model.Model
import com.shaunhossain.bornomala.R
import androidx.lifecycle.ViewModel

class SorbornoViewModel : ViewModel {
    var bornoImage: Int? = null
    var relatedImage: Int? = null
    var description: String = ""

    constructor() : super()

    constructor(model: Model):super() {
        this.bornoImage = model.bornoImage
        this.relatedImage = model.relatedImage
        this.description = model.description
    }
    var mutablelivedata = MutableLiveData<ArrayList<SorbornoViewModel>>()
    var SorbornoDataList = ArrayList<SorbornoViewModel>()

    fun getArrayList(): MutableLiveData<ArrayList<SorbornoViewModel>>{

        val modelOne = Model(
            R.drawable.b_1,
            R.drawable.b_r_1,
            "অজগর")
        val modelTwo = Model(
            R.drawable.b_2,
            R.drawable.b_r_2,
            "আম")
        val modelThree = Model(
            R.drawable.b_3,
            R.drawable.b_r_3,
            "ইঁদুর")
        val modelFour = Model(
            R.drawable.b_4,
            R.drawable.b_r_4,
            "ঈগল")
        val modelFive = Model(
            R.drawable.b_5,
            R.drawable.b_r_5,
            "উট")
        val modelSix = Model(
            R.drawable.b_6,
            R.drawable.b_r_6,
            "ঊষা")
        val modelSeven = Model(
            R.drawable.b_7,
            R.drawable.b_r_7,
            "ঋষি")
        val modelEight = Model(
            R.drawable.b_8,
            R.drawable.b_r_8,
            "একতারা")
        val modelNine = Model(
            R.drawable.b_9,
            R.drawable.b_r_9,
            "ঐরাবত")
        val modelTen = Model(
            R.drawable.b_10,
            R.drawable.b_r_10,
            "ওলকচু")
        val modelEleven = Model(
            R.drawable.b_11,
            R.drawable.b_r_11,
            "ঔষধ")

        val ViewModelOne: SorbornoViewModel = SorbornoViewModel(modelOne)
        val ViewModelTwo: SorbornoViewModel = SorbornoViewModel(modelTwo)
        val ViewModelThree: SorbornoViewModel = SorbornoViewModel(modelThree)
        val ViewModelFour: SorbornoViewModel = SorbornoViewModel(modelFour)
        val ViewModelFive: SorbornoViewModel = SorbornoViewModel(modelFive)
        val ViewModelSix: SorbornoViewModel = SorbornoViewModel(modelSix)
        val ViewModelSeven: SorbornoViewModel = SorbornoViewModel(modelSeven)
        val ViewModelEight: SorbornoViewModel = SorbornoViewModel(modelEight)
        val ViewModelNine: SorbornoViewModel = SorbornoViewModel(modelNine)
        val ViewModelTen: SorbornoViewModel = SorbornoViewModel(modelTen)
        val ViewModelEleven: SorbornoViewModel = SorbornoViewModel(modelEleven)



        SorbornoDataList!!.add(ViewModelOne)
        SorbornoDataList!!.add(ViewModelTwo)
        SorbornoDataList!!.add(ViewModelThree)
        SorbornoDataList!!.add(ViewModelFour)
        SorbornoDataList!!.add(ViewModelFive)
        SorbornoDataList!!.add(ViewModelSix)
        SorbornoDataList!!.add(ViewModelSeven)
        SorbornoDataList!!.add(ViewModelEight)
        SorbornoDataList!!.add(ViewModelNine)
        SorbornoDataList!!.add(ViewModelTen)
        SorbornoDataList!!.add(ViewModelEleven)

        mutablelivedata.value = SorbornoDataList

        return mutablelivedata
    }
}
