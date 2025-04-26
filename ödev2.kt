package com.example.odev1_android_bootcamp
//1. Soru: Kenar sayısına göre iç açılar toplamı hesaplama
fun icAcilarToplami(kenarSayisi: Int): Int {
    return (kenarSayisi - 2) * 180
}
//2. Soru: Gün sayısına göre maaş hesabı yapma
fun maasHesapla(gunSayisi: Int): Int {
    val saatlikUcret = 10
    val mesaiSaatlikUcret = 20
    val saatlikCalisma = 8
    val toplamSaat = gunSayisi * saatlikCalisma

    return if (toplamSaat <= 160) {
        toplamSaat * saatlikUcret
    } else {
        val normalSaatler = 160
        val mesaiSaatleri = toplamSaat - 160
        (normalSaatler * saatlikUcret) + (mesaiSaatleri * mesaiSaatlikUcret)
    }
}
//2. Soru: Gün sayısına göre maaş hesabı yapma
fun kotaUcretiHesapla(kullanilanGB: Int): Int {
    val sabitKotaGB = 50
    val sabitKotaUcreti = 100
    val asimUcretiPerGB = 4

    return if (kullanilanGB <= sabitKotaGB) {
        sabitKotaUcreti
    } else {
        val asimMiktari = kullanilanGB - sabitKotaGB
        sabitKotaUcreti + (asimMiktari * asimUcretiPerGB)
    }
}
//Hepsini Birlikte Kullanabileceğimiz Mini Bir main Fonksiyonu:
fun main() {
    println("İç açılar toplamı: ${icAcilarToplami(5)} derece") // Örnek: 5 kenar
    println("Maaş: ${maasHesapla(25)} ₺") // Örnek: 25 gün çalışıldı
    println("Kota ücreti: ${kotaUcretiHesapla(60)} ₺") // Örnek: 60 GB kullanım
}
//