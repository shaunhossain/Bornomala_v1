package com.shaunhossain.bornomala.Model

class ModelSorborno {
    var bornoImage: Int
    var bornoAudio: Int
    var relatedImage: Int
    var description: String = ""

    constructor(bornoImage: Int,bornoAudio: Int, relatedImage: Int, description: String) {
        this.bornoImage = bornoImage
        this.bornoAudio = bornoAudio
        this.relatedImage = relatedImage
        this.description = description
    }

}