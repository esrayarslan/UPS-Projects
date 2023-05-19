# UPS-Projects

## section1-project

Bir film kütüphanesi projesi yazdım.
1. **Movie sınıfı**: Her bir film için bir Movie sınıfı oluşturdum. Bu sınıf, filmin id'sini, filmin başlığını, yönetmenini, oyuncularını, tarihini, açıklamasını, türünü içeriyor.
2. **Kullanıcı sınıfı**: Her bir kullanıcı için bir Kullanıcı sınıfı oluşturdum. Bu sınıf, kullanıcı id'sini, kullanıcının adını, şifresini, e-posta adresini içeriyor.
3. **Movie yöneticisi**: Movie sınıfını kullanarak film eklemek, film silmek, film aramak vb. işlemler yapabilecek bir Movie Yöneticisi sınıfı oluşturdum.
4. **Kullanıcı yöneticisi**: Kullanıcı sınıfını kullanarak kullanıcı hesapları oluşturmak, kullanıcı hesaplarını silmek, kullanıcıları aramak vb. işlemler yapabilecek bir Kullanıcı Yöneticisi sınıfı oluşturdum.
5. **Ana menü**: Kullanıcıların filmleri arayabilecekleri, filmleri listelebilecekleri ve kullanıcı hesaplarını yönetebilecekleri bir ana menü oluşturdum. Bu menü, kullanıcı girişi ve çıkışı, film ekleme, film silme, film arama, kullanıcı hesapları oluşturma, kullanıcı hesaplarını silme, kullanıcı hesapları arama işlemlerini içeriyor.

---------------------------------------------------------------------------------------------------------------------------------------

## section2-project
Ödeme işlemleri uygulaması
Kullanıcıdan kredi kartı bilgilerini kullanarak ödeme yapmasına izin veren bir uygulama yaptım. Kullanıcı ödeme yaparken ödeme tutarını, kart numarasını, son kullanma tarihini ve güvenlik kodunu giriyor. Kullanıcıdan bilgiler alındıktan sonra bir doğrulama işlemi yapılıyor, kısıtlamalar aşağıdadır (Kısıtlamalar için özel exception sınıfları oluşturdum, örn. InvalidPaymentAmountException, InvalidCardNumberException ). Kısıtlamaları geçtikten sonra pay isimli bir metod çağırdım. Bu metod içerisinde 0-100 arasında bir random sayı ürettim, eğer sayı 75'den yüksek ise SystemNotWorkingException fırlattım ve işlemi bir kez daha denettim.

Ödeme tutarının formatı doğru olmalıdır, negatif bir değer veya virgüllü bir değer girilemez.
Kullanıcının girdiği kart numarası doğru olmalıdır (16 haneli, rakamlardan oluşan)
Son kullanma tarihi (12/2013) gibi geçmiş bir yıl yada 13 gibi bir ay girilemez.
Güvenlik kodu formatı doğru olmalı (3 karakter, rakamlardan oluşan)
Ödeme işlemi sırasında bir hata oluştuğunda özel olarak oluşturacağınız SystemNotWorkingException fırlatılmalı, ve 1 defa tekrar işlem denenmeli.
