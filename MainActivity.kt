package com.example.odev1_android_bootcamp

import android.os.Bundle
import android.util.Log
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        // Bilgileri yazdır
        bilgiYazdir()
    }
    fun main() {
        val sehir = "İzmir"
        val ulke = "Türkiye"
        val telefon = "05551234567"
        val postaKodu = "35000"
        val email = "emre@example.com"
        val meslek = "Yazılımcı"
        val stokMiktari = 250
        val musteriAdi = "Ahmet Yılmaz"
        val bakiye = 1245.75
        val dogumGunu = "2000-05-12"
        val maas = 18000
        val medeniDurum = "Bekar"
        val urunYorum = "Çok memnun kaldım."

        val odemeTarihi = "2025-04-25"
        val odeme = 399.99
        val siparisAdeti = 3
        val arabaModeli = "Toyota Corolla"
        val kitapAdi = "Kotlin ile Programlama"
        val yayinlamaTarihi = "2023-06-10"
        val indirimMiktari = 15
        val odaSayisi = 2
        val enlem = 38.4192
        val boylam = 27.1287
        val urunAdi = "Kablosuz Kulaklık"
        val yemekFiyati = 95.50

        val marka = "Samsung"
        val muzikAdi = "Sezen Aksu - Gülümse"
        val videoSuresi = "2:45"
        val urunPuani = 4.8
        val resimAdi = "tatil_fotografi.jpg"
        val dosyaFormati = "JPEG"
        val renk = "Mavi"
        val renkKodu = "#0000FF"
        val telefonModeli = "iPhone 14"
        val ekranBoyutu = "6.1 inç"
        val agirlik = "174g"

        val ulusalGun = "29 Ekim"
        val tatilGunu = "1 Ocak"
        val rezervasyonTarihi = "2025-07-15"
        val sokakAdi = "Atatürk Caddesi"
        val otobusHatti = "501"
        val kalanDakika = 12
        val takipKodu = "TR123456789"
        val kuponSuresi = "30 gün"
        val kuponKodu = "INDIRIM20"
        val faturaAdresi = "Cumhuriyet Mah. No:5 İzmir"

        println("Şehir: $sehir")
        println("Ülke: $ulke")
        println("Telefon: $telefon")
        println("Posta Kodu: $postaKodu")
        println("Email: $email")
        println("Meslek: $meslek")
        println("Stok Miktarı: $stokMiktari")
        println("Müşteri Adı: $musteriAdi")
        println("Bakiye: $bakiye")
        println("Doğum Günü: $dogumGunu")
        println("Maaş: $maas")
        println("Medeni Durum: $medeniDurum")
        println("Ürün Yorum: $urunYorum")

        println("Ödeme Tarihi: $odemeTarihi")
        println("Ödeme: $odeme")
        println("Sipariş Adeti: $siparisAdeti")
        println("Araba Modeli: $arabaModeli")
        println("Kitap Adı: $kitapAdi")
        println("Yayınlama Tarihi: $yayinlamaTarihi")
        println("İndirim Miktarı: $indirimMiktari")
        println("Oda Sayısı: $odaSayisi")
        println("Enlem: $enlem")
        println("Boylam: $boylam")
        println("Ürün Adı: $urunAdi")
        println("Yemek Fiyatı: $yemekFiyati")

        println("Marka: $marka")
        println("Müzik Adı: $muzikAdi")
        println("Video Süresi: $videoSuresi")
        println("Ürün Puanı: $urunPuani")
        println("Resim Adı: $resimAdi")
        println("Dosya Formatı: $dosyaFormati")
        println("Renk: $renk")
        println("Renk Kodu: $renkKodu")
        println("Telefon Modeli: $telefonModeli")
        println("Ekran Boyutu: $ekranBoyutu")
        println("Ağırlık: $agirlik")

        println("Ulusal Gün: $ulusalGun")
        println("Tatil Günü: $tatilGunu")
        println("Rezervasyon Tarihi: $rezervasyonTarihi")
        println("Sokak Adı: $sokakAdi")
        println("Otobüs Hattı: $otobusHatti")
        println("Kalan Dakika: $kalanDakika")
        println("Takip Kodu: $takipKodu")
        println("Kupon Süresi: $kuponSuresi")
        println("Kupon Kodu: $kuponKodu")
        println("Fatura Adresi: $faturaAdresi")

}

