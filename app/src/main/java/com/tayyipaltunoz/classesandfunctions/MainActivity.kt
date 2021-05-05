package com.tayyipaltunoz.classesandfunctions

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var i = 1

        if (i == 0) {
            ilkFonksiyon()
        } else {
            ikinciFonksiyon()
        }

        cikarma(6, 2)
        var x = toplama(5, 45)
        textView.text = "Sonuç : ${x}"

        button.setOnClickListener {
            val toplamaSonucu = toplama(43, 32)
            textView.text = "Sonuç : ${toplamaSonucu}"
        }

        sinifCalismasi()
        nullGuvenligi()
    }

    fun ilkFonksiyon() {
        println("ilk fonksiyon çalıştırıldı")
    }

    fun ikinciFonksiyon() {
        println("ikinci fonksiyon çalıştı")
    }

    //Girdi almak

    fun cikarma(x: Int, y: Int) {
        textView.text = "Sonuç: ${x - y}"
    }

    //Çıktı vermek -> Döndürmek(Return)

    fun toplama(a: Int, b: Int): Int {

        return a + b
    }

    /* buton onclick özelligine degistir adında fonksiyon yazıldığında çalışacak örnek
    fun degistir(view : View){
        val toplamaSonucu = toplama(10,50)
        textView.text = "Sonuç : ${toplamaSonucu}"
    }
     */

    fun sinifCalismasi() {
        var superman = SuperKahraman("Superman", 45, "Gazeteci")
        textView.text = "Meslek : ${superman.meslek}"
        superman.testFonksiyonu()
    }

    fun nullGuvenligi() {
        //Null, Nullability, Null Safety

        //Tanımlama, Definening
        var benimString: String?

        //Initialization
        benimString = "tayyip"

        var benimYasim: Int? = null

        //1
        if (benimYasim != null) {
            println(benimYasim * 2)
        } else {
            println("null geldi")
        }

        //2
        // !! -> null olmayacak,  ? -> null olabilir

        println(benimYasim?.minus(2))

        //3
        //elvis operatörü

        val sonuc = benimYasim?.minus(2) ?: 10
        println(sonuc)

        //4
        //let
        benimYasim = 6
        benimYasim?.let {
            println(it * 5)
        }
    }
}