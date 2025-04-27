package com.yapss.ders1.odev2

class Odev2 {
    fun icAciToplami(kenarSayisi: Int): Int {
        return (kenarSayisi - 2) * 180
    }

    fun maasHesapla(gunSayisi: Int): Int {
        val saatlikUcret = 10
        val mesaiUcreti = 20
        val toplamSaat = gunSayisi * 8

        return if (toplamSaat <= 160) {
            toplamSaat * saatlikUcret
        } else {
            (160 * saatlikUcret) + ((toplamSaat - 160) * mesaiUcreti)
        }
    }

    fun kotaUcreti(kota: Int): Int {
        val temelUcret = 100
        return if (kota <= 50) {
            temelUcret
        } else {
            temelUcret + (kota - 50) * 4
        }
    }

    fun fahrenheitDonustur(celsius: Double): Double {
        return celsius * 1.8 + 32
    }

    fun dikdortgenCevre(uzunKenar: Int, kisaKenar: Int): Int {
        return 2 * (uzunKenar + kisaKenar)
    }

    fun faktoriyel(sayi: Int): Int {
        var sonuc = 1
        for (i in 1..sayi) {
            sonuc *= i
        }
        return sonuc
    }

    fun aHarfSayisi(kelime: String): Int {
        var sayac = 0
        for (harf in kelime) {
            if (harf == 'a' || harf == 'A') {
                sayac++
            }
        }
        return sayac
    }
}