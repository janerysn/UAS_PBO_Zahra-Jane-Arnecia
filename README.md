<h1><b>Media Player</b></h1>

# 1. Topik
Pengaruh Teknologi dalam Pembuatan Media Player

# 2. Masalah
Pengaruh teknologi dalam kehidupan sehari-hari sangat terlihat, hal ini juga dapat berdampak pada lingkungan sekitar. Teknologi dapat memicu keinginan yang beragam terhadap tiap individu ataupun kelompok. Contohnya keinginan seperti melihat video/streaming sehingga memerlukan suatu “tempat/wadah” untuk implementasi nya, Media Player dapat menjadi salah satu solusi dalam masalah ini. 

# 3. Siapa yang terlibat ?
User (Pengguna)

# 4. Data yang tersimpan dan diolah
Video/Media

# 5. Model Class
- class ZahraMediaPlayerController.java
- class ZahraMediaPlayerBase.java
- class MediaPlayerControl.java
- class Main.java

# - Inheritance/Turunan
<img src="https://github.com/janerysn/UAS_PBO_Zahra-Jane-Arnecia/blob/main/screenshot/diagram.png" alt="diagram" align="bottom">

Terdapat penggunaan Inheritance/turunan pada class ‘ZahraMediaPlayerController.java’ dan ‘ZahraMediaPlayerBase. java.’ class ‘ZahraMediaPlayerController.java’ menjadi subclass dari class ‘ZahraMediaPlayerBase.java’ , maka class ‘ZahraMediaPlayerController.java’ dapat mewarisi semua method, property, dan perilaku dari class ‘ZahraMediaPlayerBase.java’.

# - Abstrak
Terdapat penggunaan abstrack pada deklarasi class ‘ZahraMediaPlayerBase.java’. Class abstrak dapat digunakan dalam menyediakan implementasi dasar yang akan digunakan oleh class inheritance/turunan. ‘ZahraMediaPlayerBase.java’ merupakan class dasar untuk class yang akan melakukan implementasi metode-metode dari antarmuka (interface) class ‘MediaPlayerControl.java’.

# - Relasi
1) Class ‘ZahraMediaPlayerController.java’ menjadi subclass dari class ‘ZahraMediaPlayerBase.java’, dalam hal ini dapat menciptakan relasi antar dua kelas. ‘ZahraMediaPlayerController.java’ mewarisi semua method dan property dari ‘ZahraMediaPlayerBase.java’
2) Interface ‘MediaPlayerControl’ diimplentasikan oleh ‘ZahraMediaPlayerBase’
Penggunaan relasi dapat merancang struktur kelas yang hierarki.

# - Interface
Pada Interface ‘MediaPlayerControl’ terdefinisikan 5 method, yaitu ‘playButtonClicked’, ‘stopButtonClicked’, ‘sliderPressed’, ‘selectMedia’ dan ‘initializeMediaPlayer’. Class ‘ZahraMediaPlayerController’ dan ‘ZahraMediaPlayerBase’ melakukan implementasi interface. Implementasi dilakukan untuk semua method yang didefinisikan dalam interface tersebut.

# 6. Fitur
- Select Media
- Play
- Pause
- Stop
- Duration

# 7. Skenario
1) Pada saat user membuka aplikasi maka tampilan awal akan seperti ini. Terdapat beberapa button yang tersedia, yaitu button Select Media, Play, Stop. Terdapat juga fitur Duration yang dapat menunjukan durasi video yang akan ditampilkan.
<img src="https://github.com/janerysn/UAS_PBO_Zahra-Jane-Arnecia/blob/main/screenshot/1.png" alt="1" align="bottom">

2) User dapat klik button Select Media untuk memilih video yang akan ditampilkan (Select Media dan video dapat di klik beberapa kali jika dalam 1x percobaan, video tidak tampil), setelah itu fitur Duration akan menunjukan durasi dari video tersebut.
<img src="https://github.com/janerysn/UAS_PBO_Zahra-Jane-Arnecia/blob/main/screenshot/2.png" alt="2" align="bottom">

3) Ketika user klik button “Play” maka video, duration dan slider akan berjalan dan button “Play” akan berubah menjadi “Pause”. Ketika user klik button “Pause” maka video akan terhenti pada saat video sedang dijalankan.
<img src="https://github.com/janerysn/UAS_PBO_Zahra-Jane-Arnecia/blob/main/screenshot/3.png" alt="3" align="bottom">

4) Pada saat user klik Stop maka video akan terulang lagi dari awal dan user dapat mengulang scenario yang sama untuk menampilkan video lainnya.
<img src="https://github.com/janerysn/UAS_PBO_Zahra-Jane-Arnecia/blob/main/screenshot/4.png" alt="4" align="bottom">

- Referensi <br>
The Assembly.(2020, June 20). “ Build Your Own Media Player Using JavaFX ”. https://youtu.be/ceXHH9sYIkk?si=eW0qBBsgYf-x6PwJ<br>
Tutus Funny.(2022, February 16). " JavaFx Mysql Crud Step by Step ". https://youtu.be/fML0QS9t_Po?si=k5eLmRkHVJX1qvW5<br>
Bro Code.(2020, Oktober 7). " Java Interface ". https://youtu.be/GhslBwrRsnw?si=ONtOQ-Lx-yDE7-ij<br>
Kensoft PH.(2023, September 20). “ JavaFX Media Player Tutorial | 100% For Beginners ”. https://youtu.be/nA3Ee2Ckf6o?si=8v399rHcIYhFJSIC<br>
Coding with John.(2021, August 20). " Abstract Classes and Methods in Java Explained in 7 Minutes ". https://youtu.be/HvPlEJ3LHgE?si=O5OyHUF85_Kib2ny<br>
Bro Code.(2020, September 30). " Java Inheritance". https://youtu.be/Zs342ePFvRI?si=A89he_zft4rLvOCu<br>
CodeOpsTech.(2020, December 20). " IntelliJ IDEA Tips & Tricks #51: Automatically Implement Abstract Classes" https://youtu.be/vCXbkHYM_rU?si=UwPcEHPO3T5M16Uf










