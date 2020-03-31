package com.shaunhossain.bornomala.ViewModel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.shaunhossain.bornomala.Model.ModelBanjonborno
import com.shaunhossain.bornomala.R

class BanjonbornoViewModel : ViewModel {
    var bornoImage: Int? = null
    var relatedImage: Int? = null
    var description: String = ""

    constructor() : super()

    constructor(modelBanjonborno: ModelBanjonborno):super() {
        this.bornoImage = modelBanjonborno.bornoImage
        this.relatedImage = modelBanjonborno.relatedImage
        this.description = modelBanjonborno.description
    }
    var mutablelivedata = MutableLiveData<ArrayList<BanjonbornoViewModel>>()
    var BanjonbornoDataList = ArrayList<BanjonbornoViewModel>()

    fun getArrayList(): MutableLiveData<ArrayList<BanjonbornoViewModel>>{

        val modelTwelve = ModelBanjonborno(
            R.drawable.b_12,
            R.drawable.b_r_12,
            "কলা")
        val modelThirteen = ModelBanjonborno(
            R.drawable.b_13,
            R.drawable.b_r_13,
            "খরগোশ")
        val modelForteen = ModelBanjonborno(
            R.drawable.b_14,
            R.drawable.b_r_14,
            "গরু")
        val modelFifteen = ModelBanjonborno(
            R.drawable.b_15,
            R.drawable.b_r_15,
            "ঘোড়া")
        val modelSixteen = ModelBanjonborno(
            R.drawable.b_16,
            R.drawable.b_r_16,
            "ব্যাঙ")
        val modelSeventeen = ModelBanjonborno(
            R.drawable.b_17,
            R.drawable.b_r_17,
            "চাবি")
        val modelEightteen = ModelBanjonborno(
            R.drawable.b_18,
            R.drawable.b_r_18,
            "ছাতা")
        val modelNineteen = ModelBanjonborno(
            R.drawable.b_19,
            R.drawable.b_r_19,
            "জুতা")
        val modelTwenty = ModelBanjonborno(
            R.drawable.b_20,
            R.drawable.b_r_20,
            "ঝিনুক")
        val modelTwentyOne = ModelBanjonborno(
            R.drawable.b_21,
            R.drawable.b_r_21,
            "মিঞু")
        val modelTwentyTwo = ModelBanjonborno(
            R.drawable.b_22,
            R.drawable.b_r_22,
            "টমেটো")
        val modelTwentyThree = ModelBanjonborno(
            R.drawable.b_23,
            R.drawable.b_r_23,
            "ঠোঁট")
        val modelTwentyFour = ModelBanjonborno(
            R.drawable.b_24,
            R.drawable.b_r_24,
            "ডাব")
        val modelTwentyFive = ModelBanjonborno(
            R.drawable.b_25,
            R.drawable.b_r_25,
            "ঢোল")
        val modelTwentySix = ModelBanjonborno(
            R.drawable.b_26,
            R.drawable.b_r_26,
            "হরিণ")
        val modelTwentySeven = ModelBanjonborno(
            R.drawable.b_27,
            R.drawable.b_r_27,
            "তাল")
        val modelTwentyEight = ModelBanjonborno(
            R.drawable.b_28,
            R.drawable.b_r_28,
            "থালা")
        val modelTwentyNine = ModelBanjonborno(
            R.drawable.b_29,
            R.drawable.b_r_29,
            "দরজা")
        val modelThirty = ModelBanjonborno(
            R.drawable.b_30,
            R.drawable.b_r_30,
            "ধনুক")
        val modelThirtyOne = ModelBanjonborno(
            R.drawable.b_31,
            R.drawable.b_r_31,
            "নৌকা")
        val modelThirtyTwo = ModelBanjonborno(
            R.drawable.b_32,
            R.drawable.b_r_32,
            "পতাকা")
        val modelThirtyThree = ModelBanjonborno(
            R.drawable.b_33,
            R.drawable.b_r_33,
            "ফড়িং")
        val modelThirtyFour = ModelBanjonborno(
            R.drawable.b_34,
            R.drawable.b_r_34,
            "বানর")
        val modelThirtyFive = ModelBanjonborno(
            R.drawable.b_35,
            R.drawable.b_r_35,
            "ভালুক")
        val modelThirtySix = ModelBanjonborno(
            R.drawable.b_36,
            R.drawable.b_r_36,
            "মৌমাছি")
        val modelThirtySeven = ModelBanjonborno(
            R.drawable.b_37,
            R.drawable.b_r_37,
            "যানবাহন")
        val modelThirtyEight = ModelBanjonborno(
            R.drawable.b_38,
            R.drawable.b_r_38,
            "রংধনু")
        val modelThirtyNine = ModelBanjonborno(
            R.drawable.b_39,
            R.drawable.b_r_39,
            "লেবু")
        val modelForty = ModelBanjonborno(
            R.drawable.b_40,
            R.drawable.b_r_40,
            "শালিক")
        val modelFortyOne = ModelBanjonborno(
            R.drawable.b_41,
            R.drawable.b_r_41,
            "ষাঁড়")
        val modelFortyTwo = ModelBanjonborno(
            R.drawable.b_42,
            R.drawable.b_r_42,
            "সিংহ")
        val modelFortyThree = ModelBanjonborno(
            R.drawable.b_43,
            R.drawable.b_r_43,
            "হাঁস")
        val modelFortyFour = ModelBanjonborno(
            R.drawable.b_44,
            R.drawable.b_r_44,
            "ঘড়ি")
        val modelFortyFive = ModelBanjonborno(
            R.drawable.b_45,
            R.drawable.b_r_45,
            "আষাঢ়")
        val modelFortySix = ModelBanjonborno(
            R.drawable.b_46,
            R.drawable.b_r_46,
            "ময়ুর")
        val modelFortySeven = ModelBanjonborno(
            R.drawable.b_47,
            R.drawable.b_r_47,
            "মৎস")
        val modelFortyEight = ModelBanjonborno(
            R.drawable.b_48,
            R.drawable.b_r_48,
            "চিংড়ি")
        val modelFortyNine = ModelBanjonborno(
            R.drawable.b_49,
            R.drawable.b_r_49,
            "দুঃখ")
        val modelFifty = ModelBanjonborno(
            R.drawable.b_50,
            R.drawable.b_r_50,
            "চাঁদ")


        val viewModelTwelve: BanjonbornoViewModel = BanjonbornoViewModel(modelTwelve)
        val viewModelThirteen: BanjonbornoViewModel = BanjonbornoViewModel(modelThirteen)
        val viewModelForteen: BanjonbornoViewModel = BanjonbornoViewModel(modelForteen)
        val viewModelFifteen: BanjonbornoViewModel = BanjonbornoViewModel(modelFifteen)
        val viewModelSixteen: BanjonbornoViewModel = BanjonbornoViewModel(modelSixteen)
        val viewModelSeventeen: BanjonbornoViewModel = BanjonbornoViewModel(modelSeventeen)
        val viewModelEightteen: BanjonbornoViewModel = BanjonbornoViewModel(modelEightteen)
        val viewModelNineteen: BanjonbornoViewModel = BanjonbornoViewModel(modelNineteen)
        val viewModelTwenty: BanjonbornoViewModel = BanjonbornoViewModel(modelTwenty)

        val viewModelTwentyOne: BanjonbornoViewModel = BanjonbornoViewModel(modelTwentyOne)
        val viewModelTwentyTwo: BanjonbornoViewModel = BanjonbornoViewModel(modelTwentyTwo)
        val viewModelTwentyThree: BanjonbornoViewModel = BanjonbornoViewModel(modelTwentyThree)
        val viewModelTwentyFour: BanjonbornoViewModel = BanjonbornoViewModel(modelTwentyFour)
        val viewModelTwentyFive: BanjonbornoViewModel = BanjonbornoViewModel(modelTwentyFive)
        val viewModelTwentySix: BanjonbornoViewModel = BanjonbornoViewModel(modelTwentySix)
        val viewModelTwentySeven: BanjonbornoViewModel = BanjonbornoViewModel(modelTwentySeven)
        val viewModelTwentyEight: BanjonbornoViewModel = BanjonbornoViewModel(modelTwentyEight)
        val viewModelTwentyNine: BanjonbornoViewModel = BanjonbornoViewModel(modelTwentyNine)
        val viewModelThirty: BanjonbornoViewModel = BanjonbornoViewModel(modelThirty)

        val viewModelThirtyOne: BanjonbornoViewModel = BanjonbornoViewModel(modelThirtyOne)
        val viewModelThirtyTwo: BanjonbornoViewModel = BanjonbornoViewModel(modelThirtyTwo)
        val viewModelThirtyThree: BanjonbornoViewModel = BanjonbornoViewModel(modelThirtyThree)
        val viewModelThirtyFour: BanjonbornoViewModel = BanjonbornoViewModel(modelThirtyFour)
        val viewModelThirtyFive: BanjonbornoViewModel = BanjonbornoViewModel(modelThirtyFive)
        val viewModelThirtySix: BanjonbornoViewModel = BanjonbornoViewModel(modelThirtySix)
        val viewModelThirtySeven: BanjonbornoViewModel = BanjonbornoViewModel(modelThirtySeven)
        val viewModelThirtyEight: BanjonbornoViewModel = BanjonbornoViewModel(modelThirtyEight)
        val viewModelThirtyNine: BanjonbornoViewModel = BanjonbornoViewModel(modelThirtyNine)
        val viewModelForty: BanjonbornoViewModel = BanjonbornoViewModel(modelForty)

        val viewModelFortyOne: BanjonbornoViewModel = BanjonbornoViewModel(modelFortyOne)
        val viewModelFortyTwo: BanjonbornoViewModel = BanjonbornoViewModel(modelFortyTwo)
        val viewModelFortyThree: BanjonbornoViewModel = BanjonbornoViewModel(modelFortyThree)
        val viewModelFortyFour: BanjonbornoViewModel = BanjonbornoViewModel(modelFortyFour)
        val viewModelFortyFive: BanjonbornoViewModel = BanjonbornoViewModel(modelFortyFive)
        val viewModelFortySix: BanjonbornoViewModel = BanjonbornoViewModel(modelFortySix)
        val viewModelFortySeven: BanjonbornoViewModel = BanjonbornoViewModel(modelFortySeven)
        val viewModelFortyEight: BanjonbornoViewModel = BanjonbornoViewModel(modelFortyEight)
        val viewModelFortyNine: BanjonbornoViewModel = BanjonbornoViewModel(modelFortyNine)
        val viewModelFifty: BanjonbornoViewModel = BanjonbornoViewModel(modelFifty)



        BanjonbornoDataList!!.add(viewModelTwelve)
        BanjonbornoDataList!!.add(viewModelThirteen)
        BanjonbornoDataList!!.add(viewModelForteen)
        BanjonbornoDataList!!.add(viewModelFifteen)
        BanjonbornoDataList!!.add(viewModelSixteen)
        BanjonbornoDataList!!.add(viewModelSeventeen)
        BanjonbornoDataList!!.add(viewModelEightteen)
        BanjonbornoDataList!!.add(viewModelNineteen)
        BanjonbornoDataList!!.add(viewModelTwenty)

        BanjonbornoDataList!!.add(viewModelTwentyOne)
        BanjonbornoDataList!!.add(viewModelTwentyTwo)
        BanjonbornoDataList!!.add(viewModelTwentyThree)
        BanjonbornoDataList!!.add(viewModelTwentyFour)
        BanjonbornoDataList!!.add(viewModelTwentyFive)
        BanjonbornoDataList!!.add(viewModelTwentySix)
        BanjonbornoDataList!!.add(viewModelTwentySeven)
        BanjonbornoDataList!!.add(viewModelTwentyEight)
        BanjonbornoDataList!!.add(viewModelTwentyNine)
        BanjonbornoDataList!!.add(viewModelThirty)

        BanjonbornoDataList!!.add(viewModelThirtyOne)
        BanjonbornoDataList!!.add(viewModelThirtyTwo)
        BanjonbornoDataList!!.add(viewModelThirtyThree)
        BanjonbornoDataList!!.add(viewModelThirtyFour)
        BanjonbornoDataList!!.add(viewModelThirtyFive)
        BanjonbornoDataList!!.add(viewModelThirtySix)
        BanjonbornoDataList!!.add(viewModelThirtySeven)
        BanjonbornoDataList!!.add(viewModelThirtyEight)
        BanjonbornoDataList!!.add(viewModelThirtyNine)
        BanjonbornoDataList!!.add(viewModelForty)

        BanjonbornoDataList!!.add(viewModelFortyOne)
        BanjonbornoDataList!!.add(viewModelFortyTwo)
        BanjonbornoDataList!!.add(viewModelFortyThree)
        BanjonbornoDataList!!.add(viewModelFortyFour)
        BanjonbornoDataList!!.add(viewModelFortyFive)
        BanjonbornoDataList!!.add(viewModelFortySix)
        BanjonbornoDataList!!.add(viewModelFortySeven)
        BanjonbornoDataList!!.add(viewModelFortyEight)
        BanjonbornoDataList!!.add(viewModelFortyNine)
        BanjonbornoDataList!!.add(viewModelFifty)

        mutablelivedata.value = BanjonbornoDataList

        return mutablelivedata
    }

}
