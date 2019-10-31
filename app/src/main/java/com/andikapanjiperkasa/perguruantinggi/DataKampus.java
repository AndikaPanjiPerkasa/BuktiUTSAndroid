package com.andikapanjiperkasa.perguruantinggi;

import java.util.ArrayList;

public class DataKampus {

    private static String[] KampusNames = {
            "Politeknik Elektronika Negeri Surabaya (PENS)",
            "Politeknik Negeri Sriwijaya (Polsri)",
            "Politeknik Negeri Semarang (Polines)",
            "Politeknik Negeri Malang (Polinema)",
            "Politeknik Negeri Jakarta (PNJ)",
            "Politeknik Negeri Jember",
            "Politeknik Negeri Bandung (Polban)",
            "Politeknik Negeri Lampung (Polinela)",
            "Politeknik Negeri Medan (Polmed)",
            "Politeknik Negeri Pontianak (Polnep)"
    };

    private static String[] KampusDetails = {
            "PENS terdapat di Surabaya, Provinsi Jawa Timur. PENS berakreditasi A. PENS adalah satu-satunya politeknik yang mengkhususkan diri dalam bidang teknik elektro. PENS terkenal karena keunggulannya di bidang robotika terbukti dengan prestasinya dalam Kontes Robot Indonesia yang berhasil memenangkannya  berturut-turut hingga 12 kali.",
            "Politeknik Negeri Sriwijaya, adalah politeknik negeri yang terdapat di kota Palembang,Sumatera Selatan,Indonesia. Politeknik ini adalah Perguruan Tinggi yang termasuk dalam kategori bagus karena masuk dalam rank 56 versi webomatric.  Politeknik Negeri Sriwijaya saat ini berkerjasama dengan Departemen Kimpraswil membuka kelas kerjasama Program Diploma III dan Diploma IV Konsentrasi Perancangan jalan dan Jembatan (PJJ), dengan Pemerintah Provinsi Sumatra Selatan membuka kelas kerjasama Jurusan Teknik Elektro Program Studi Teknik Listrik Konsentrasi Pembangkit Tenaga Listrik",
            "POLINES terdapat di Semarang, Jawa Tengah. POLINES berakreditasi A. Tersedia banyak pilihan jurusan di Polines yang dapat disesuaikan passion serta minat. Salah satu nilai plus Polines adalah pengadaan jalur kerjasama antara Polines dengan MSU (Management Science University) di Malaysia pada program studi teknik informatika dan program studi manajemen pemasaran.",
            "Polinema terdapat di Malang. Terdapat 7 pilihan jurusan dengan 19 program studi (untuk jenjang D3 dan D4) yang ditawarkan Politeknik Negeri Malang. Selain itu, Politeknik Negeri Malang juga menawarkan jalur masuk kerjasama dengan PT PLN Persero yang akan membantu kamu menjadi karyawan PT PLN langsung setelah lulus.",
            "Politeknik Negeri Jakarta telah tumbuh dan berkembang seiring dengan pesatnya perkembangan ilmu pengetahuan dan teknologi. Dengan selalu melakukan evaluasi diri dan pengembangan kemitraan dengan berbagai lembaga, merupakan suatu komitmen kelembagaan sehingga setiap perubahan baik di sisi internal maupun eksternal. Politeknik Negeri Jakarta merupakan politeknik negeri yang menyelenggarakan program vokasi yang didirikan untuk memenuhi kebutuhan SDM profesional di industri, baik industri jasa maupun industri manufaktur.",
            "Politeknik Negeri Jember menyelenggarakan pendidikan vokasional, yakni pendidikan yang mengarahkan kegiatan belajar mengajar pada pembentukan keahlian, keterampilan dan standar kompetensi yang spesifik, sesuai dengan kebutuhan pasar kerja, serta mempunyai kemandirian dalam berkarya dan berwirausaha dengan berdasar pada ilmu yang diperolehnya. Saat ini, Politeknik Negeri Jember memfokuskan diri terhadap pendidikan vokasional di bidang agribisnis / agroindustri.",
            "Politeknik Negeri Bandung sudah dipegang dosen berkualifikasi S1 hingga S3, sehingga Anda tidak perlu khawatir dengan kualitas pendidikan yang dihasilkan, apalagi Politeknik Negeri Bandung menjadi salah satu dari top 10 politeknik di Indonesia.  Politeknik Negeri Bandung juga membuka jurusan yang diperuntukkan bagi alumni D3 dengan pengalaman kerja minimal satu tahun untuk meneruskan studi pada program D4 PPL. Perkuliahan yang terdiri dari kuliah tatap muka dan pembelajaran berbasis elektronik tersebut akan membantu Anda mencapai gelar yang lebih tinggi.",
            "Sejak 2 Agustus 2004 Politeknik Pertanian Negeri Lampung resmi berubah nama menjadi Politeknik Negeri Lampung, hal ini di karenakan rencana pengembangan Politeknik yang di masa datang dimana bidang studi yang di selenggarakan tidak lagi hanya di bidang pertanian namun juga dibidang lain seperti jurusan akuntasi, manajemen informatika, dan lain-lain.",
            "Politeknik Negeri Medan atau yang dahulu dikenal sebagai Politeknik Universitas Sumatera Utara (Politeknik USU) adalah sebuah perguruan tinggi negeri yang terdapat di Kota Medan, Sumatera Utara, Indonesia. Politeknik Negeri Medan ini memiliki kampus yang bersebelahan dengan Universitas Sumatera Utara.  Politeknik ini menawarkan jalur masuk kerjasama dengan PT PLN Persero dan GMF Aeroasia yang akan membantu kamu menjadi karyawan di perusahaan tersebut langsung setelah lulus.",
            "Politeknik Negeri Pontianak atau biasa disingkat Polnep adalah sebuah perguruan tinggi negeri yang terdapat di Kota Pontianak, Kalimantan Barat, Indonesia. Politeknik Negeri Pontianak merupakan sistem Pendidikan tinggi jalur profesional yang menekankan penguasaan dan pengembangan Ilmu Pengetahuan dan Teknologi untuk mendukung era industrialisasi. Beberapa jurusan yang ditawarkan seperti teknik elektro, arsitektur, teknik mesin, akuntansi dan lain-lain."
    };

    private static int[] KampusImages = {
            R.drawable.pens,
            R.drawable.polsri,
            R.drawable.polines,
            R.drawable.polinema,
            R.drawable.pnj,
            R.drawable.jember,
            R.drawable.polban,
            R.drawable.polinela,
            R.drawable.polmed,
            R.drawable.polnep
    };

    private static String[] KampusAlamat={
            "Kampus ITS, Jl. Raya ITS, Keputih, Kec. Sukolilo, Kota SBY, Jawa Timur",
            "Jl. Srijaya Negara, Bukit Besar, Kec. Ilir Bar. I, Kota Palembang, Sumatera Selatan",
            "Jl. Prof. Soedarto, Tembalang, Kec. Tembalang, Kota Semarang, Jawa Tengah",
            "Jl. Soekarno Hatta No.9, Jatimulyo, Kec. Lowokwaru, Kota Malang, Jawa Timur",
            "Jl. Prof. DR. G.A. Siwabessy, Kukusan, Kecamatan Beji, Kota Depok, Jawa Barat",
            "Lingkungan Panji, Tegalgede, Kec. Sumbersari, Kabupaten Jember, Jawa Timur",
            "Jl. Gegerkalong Hilir, Ciwaruga, Kec. Parongpong, Kabupaten Bandung Barat, Jawa Barat",
            "Jl. Soekarno Hatta No.10, Rajabasa Raya, Kec. Rajabasa, Kota Bandar Lampung, Lampung",
            "Universitas Sumatera Utara Kampus USU, Jl. Almamater No.1, Padang Bulan, Kec. Medan Baru, Kota Medan, Sumatera Utara",
            "Jl. Cipto Mangun Kusumo, Sungai Keledang, Kec. Samarinda Seberang, Kota Samarinda, Kalimantan Timur"
    };

    static ArrayList<Kampus> getListData() {
        ArrayList<Kampus> list = new ArrayList<>();
        for (int position = 0; position < KampusNames.length; position++) {
            Kampus kampus = new Kampus();
            kampus.setName(KampusNames[position]);
            kampus.setDetail(KampusDetails[position]);
            kampus.setPhoto(KampusImages[position]);
            kampus.setAlamat(KampusAlamat[position]);
            list.add(kampus);
        }
        return list;
    }
}
