package com.yapss.ders1.odev2

fun main() {
    val odev2 = Odev2()

    println("İç açılar toplamı: ${odev2.icAciToplami(5)}") // örnek 5 kenarlı
    println("Maaş hesaplama: ${odev2.maasHesapla(22)}") // örnek 22 gün çalışmış
    println("Kota ücreti: ${odev2.kotaUcreti(60)}") // örnek 60 GB kullanım
    println("Fahrenheit dönüşüm: ${odev2.fahrenheitDonustur(25.0)}") // 25 C
    println("Dikdörtgen çevresi: ${odev2.dikdortgenCevre(10, 5)}") // 10 ve 5 cm
    println("Faktöriyel hesaplama: ${odev2.faktoriyel(5)}") // 5!
    println("Kelimedeki 'a' harfi sayısı: ${odev2.aHarfSayisi("Araba")}") // "Araba"
}