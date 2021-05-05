package com.tayyipaltunoz.classesandfunctions

class SuperKahraman(var isim: String, var yas: Int, var meslek: String) {
    //Primary Constructor

    private var sacininRengi = "Sarı"

    fun testFonksiyonu(){
        println("test")
    }
    //Getter
    fun sacRenginiAl(): String{
        return this.sacininRengi
    }

    //Acces Levels - Erişebilirlik Seviyeleri
    // priavte - protected - internal - public
    /*
    //Property
    var isim = ""
    var yas = 0
    var meslek = ""

    //Constructor

    constructor(isim: String, yas: Int, meslek: String) {
        this.isim = isim
        this.meslek = meslek
        this.yas = yas
        println("Consructor çağrıldı")
    }
    */

}