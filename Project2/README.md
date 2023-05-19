## Ödeme işlemleri uygulaması

Kullanıcıdan kredi kartı bilgilerini kullanarak ödeme yapmasına izin veren bir uygulama yaptım. Kullanıcı ödeme yaparken ödeme tutarını, kart numarasını, son kullanma tarihini ve güvenlik kodunu giriyor. Kullanıcıdan bilgiler alındıktan sonra bir doğrulama işlemi yapılıyor, kısıtlamalar aşağıdadır (Kısıtlamalar için özel exception sınıfları oluşturdum, örn. InvalidPaymentAmountException, InvalidCardNumberException ). Kısıtlamaları geçtikten sonra **pay** isimli bir metod çağırdım. Bu metod içerisinde 0-100 arasında bir random sayı ürettim, eğer sayı 75'den yüksek ise ***SystemNotWorkingException*** fırlattım ve işlemi bir kez daha denettim.

- Ödeme tutarının formatı doğru olmalıdır, negatif bir değer veya virgüllü bir değer girilemez.
- Kullanıcının girdiği kart numarası doğru olmalıdır (16 haneli, rakamlardan oluşan)
- Son kullanma tarihi (12/2013) gibi geçmiş bir yıl yada 13 gibi bir ay girilemez.
- Güvenlik kodu formatı doğru olmalı (3 karakter, rakamlardan oluşan)
- Ödeme işlemi sırasında bir hata oluştuğunda özel olarak oluşturacağınız SystemNotWorkingException fırlatılmalı, ve 1 defa tekrar işlem denenmeli.


