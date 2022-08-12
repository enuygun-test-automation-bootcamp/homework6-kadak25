# Stream nedir

Javada veri akışları için Stream’ler kullanılmaktadır.Paket olarak java.io paketinde yer almaktadırlar.Bir veri okumak için InputStream ve bir veri yazmak için de OutputStream kullanılır. Stream’ler her türlü aygıta bağlanıp veri alabilme ve aktarabilme özelliğine sahiptir.Bunu açıklama nedenim genel bir kanı olarak Streamler  sadece dosyadan yazı okumak dosyaya yazı yazmak amacıyla kullanır gibi yanlıs bir izlenim var.Stream genel bir veri akışı saglayıcı sınıftır diyebiliriz.Stream kullanma amacımız giriş çıkış işlemlerinin cihazlardan ve veri türlerinden bağımsızlığını sağlamaktır.(Bunun birinci avantajı cihazın mekaniksel özelliklerini bilmeniz gerekmez.İkinci avantajı ise yazdığınız kodu değiştirmeden çeşitli araçlarda kullanabilmenizdir.).Stream’ler binary ve character olarak ikiye ayrılmakta.Binary Streamler verileri 2li sistemde(1-0) olarak character Streamler ise bildiğimiz karakterle okumakta ve yazmakta.

## Map nedir

Map komutu  Hashmap nedir ne için kullanılır.
HashMap komutu bir siteden veri çekerken url çekern ve bu çektiğimiz urlyi kendi databaseimize kaydetmede vs işe yarayan bir koddur.Özellikle çift string  döndürmesi sebebiyle işe yarar.
bir örnekle göstermek istersek

HashMap<String,String> mymap=new HashMap<String,String>();

şeklinde dedikten sonra ;

mymap.put("name","Sinan");
mymap.put("Surname","Cabbar");

eklediğimiz iki tane kişisel veriy çağrırıken

System.out.println(mymap.get("Surname"));

