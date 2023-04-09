
public class MovieManager {
    private int movieCounter;
    // private Movie movie;
    private Movie[] movies = new Movie[100];
        /*{
            new Movie(1L, "Get Out", "Lee Boucher", "Daniel Kaluuya, Allison Williams, Catherine Keener", "2017", "Chris sıradan bir siyahi gençtir ve sevgilisi Rose ile birlikte çok mutlu bir ilişkisi vardır. Rose, bir gün ailesini evine davet eder. Chris, Avrupalı Amerikalı sevgilisinin ailesinde bir gariplik olduğunu fark eder ve evdeki siyahi kişilerden birini kaybolduğunu öğrenir. Bunun üzerine başka bir siyahi adam, kendisinden iş işten geçmeden gitmesini ister. Chris, bir şeylerin ters gittiğini anlamaya başlar fakat bu durumdan kurtulması bir hayli zor olacaktır.", "thriller"),
            new Movie(2L, "Sessiz Bir Yer", "John Krasinski", "John Krasinski,Emily Blunt,Millicent Simmonds", "2018", "2 çocuklu bir aile, izole bir kırsalda sakin bir yaşam sürmektedir. Henüz büyüme çağlarında olan çocuklar da, ebeveynleri de hiçbir şekilde konuşmamakta, işaret diliyle anlaşmaktadır. Ancak bunun sebebi konuşamıyor olmaları değildir. Aile gıcırtı çıkaracak her türlü adımdan, ses yapacak her türlü hareketten uzak durmaktadır. Ancak günün birinde bu sakin hayat, küçük çocukların oyun oynarken bir lambayı devirmeleri ile tepetaklak olur. Durgun sessizliğin içinde çıkan bu ses, ailenin peşindeki varlığın dikkatini hemen çekecek ve aile sessizliklerini bozmanın bedelini ağır ödeyecektir...", "horror"),
            new Movie(3L, "Platform", "Galder Gaztelu-Urrutia", "Alexandra Masangkay,Iván Massagué,Zorion Eguileor", "2019", "The Platform, dikey şekilde konumlandırılmış bir hapishanede geçiyor. Her hücrede iki mahkumun kaldığı hapishanede, yemek günde sadece bir kere üst kattan aşağıya doğru gönderilmektedir. Üst kattaki mahkumlar yiyeceğe ulaşmak için çabalarken, alt katta bulunan mahkumlar, her gün biraz daha vahşileşerek açlıkla baş etmeye çalışır. Bir gün gözünü hapishanenin 33. katında açan Goreng, hapishanenin kurallarını iyi bilen Trimagasi ile birlikte yiyeceğe ulaşabilmek için zorlu bir mücadeleye girişir.", "thriller"),
            new Movie(4L, "Nefesini Tut", "Fede Alvarez", "Stephen Lang, Jane Levy, Dylan Minnette", "2016", "Nefesini Tut, kör bir adamın evine girip hırsızlık yaparak yakalanmadan kurtulabileceklerini düşünen bir grup genci temel alıyor. İstismarcı annesinden kurtulup, kız kardeşini her ikisi için de sonu yokmuş gibi görünen bu hayattan kurtarmaya kararlı olan Rocky ve arkadaşları Alex ile Money'nin planları oldukça basittir. Kör bir adamın evinde kilitli tuttuğu odaya girmek, onun engelli oluşundan yararlanarak evini soymak. Ancak işler tam olarak planlandığı gibi gitmez. Zira hafife aldıkları ev sahibi aslında oldukça tehlikeli bir adamdır. Planda yanıldıklarını anladıklarında kusursuz bir suç yerine ölümcül bir hata işlediklerini görürler.", "thriller"),
            new Movie(5L, "Ritüel", "Ari Aster", "Florence Pugh,Will Poulter,Jack Reynor", "2019", "Ritüel, genç bir kadının ve onun erkek arkadaşının İsveç'te yerel bir pagan kültürünün avı haline gelene kadar geçirdikleri yolculuğu anlatıyor. Geleneksel Midsommar festivaline katılmak isteyen Dani ve Christian, üniversiteden arkadaşları ile birlikte İsveç’e doğru yola koyulur. İlişkilerinin üzerinde kara bulutlar dolaşan çift, İsveç’in köyünde gerçekleştirecekleri bu tatili ilişkilerini kurtarmak için son şans olarak görür. Çılgın tatillerini geçirecekleri mekanı gören gençler, yemyeşil cennete benzeyen mekanı fazlasıyla sever. Ancak bir süre sonra yerel kutlamaların ve pagan ritüellerinin yapıldığı bu yerin pek de düşündükleri kadar masum olmadığını anlarlar. 90 yılda bir düzenlenen gizli bir ayine katılan gençler, kendilerini korku labirentinin içinde bulur.", "thriller")
         };*/

    public void createMovieList(Movie movie) {
        movies[movieCounter++] = movie;
    }

    public void removeMovie(Long id) {
        int index = -1;
        for (int i = 0; i < movieCounter; i++) {
            if (movies[i].getMovieId() == id) {
                index = i;
                break;
            }
        }
        if (index != -1) {
            for (int i = index; i < movieCounter; i++) {
                movies[i] = movies[i + 1];
            }
            movieCounter--;
            // users[userCounter - 1] = null;

        } else {
            System.out.println("Film Bulunamadı...");
        }
    }

    public void findMovie(Long id) {
        for (int i = 0; i < movieCounter; i++) {
            if (movies[i].getMovieId().equals(id)) {
                System.out.println(movies[i]);
                break;
            } else
                System.out.println("Film Bulunamadı!!");
        }
    }
}
