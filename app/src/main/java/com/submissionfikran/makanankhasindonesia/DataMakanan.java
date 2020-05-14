package com.submissionfikran.makanankhasindonesia;

import java.util.ArrayList;

public class DataMakanan {
    private static String[] namaMakanan = {
            "Mie Aceh",
            "Mie Bangka",
            "Bika Ambon",
            "Gado-Gado",
            "Gudeg",
            "Pempek",
            "Nasi Rawon",
            "Rendang",
            "Sate",
            "Seruit"
    };

    private static String[] lokasiMakanan = {
            "Aceh",
            "Bangka",
            "Ambon",
            "Seluruh Indonesia",
            "Yogyakarta",
            "Palembang",
            "Jawa Timur",
            "Padang",
            "Seluruh Indonesia",
            "Lampung"
    };

    private static String[] komposisiMakanan = {
            "1. Tumis bawang merah iris, bawang putih \n    iris dan bumbu halus hingga harum. \n    Masukkan daging, aduk dan masak \n    hingga daging berubah warna. \n    Lalu tambahkan udang dan tomat, \n    aduk rata.\n" +
                    "2. Masukkan kaldu, seledri, daun bawang, \n    garam dan cuka. Masak hingga daging \n    matang dan air berkurang sambil \n    sesekali diaduk.\n" +
                    "3. Masukkan kol dan tauge, aduk rata. \n    Kemudian tambahkan mi dan kecap \n    manis. Aduk hingga semua bahan \n    tercampur rata dan matang. \n    Angkat.\n" +
                    "4. Sajikan panas-panas dengan acar \n    mentimun dan emping goreng.",
            "1. Langkah awal adalah rebus air \n    secukupnya, kemudian masak mie hingga\n    mengapung, angkat dan \n    tiriskan\n" +
                    "2. Masukkan minyak sedikit dalam mangkok, \n    kecap asin, kalau ada lebih \n    baik lagi minyak ayam\n" +
                    "3. Masukkan mie panas, dan aduk merata\n" +
                    "4. Beri tauge, sawi, ayam tumis, dan \n    taburi bawang goreng dan bawang \n    iris. Siap dihidangkan",
            "1. Untuk biang : campur semua bahan biang \n    hingga rata. Diamkan sepuluh menit.\n" +
                    "2. Rebus santan dengan serai, daun pandan, \n    daun jeruk hingga mendidih. Dinginkan \n    hingga hangat-hangat kuku.\n" +
                    "3. Kocok kuning telur dan gula hingga halus,\n    kemudian masukkan sagu, biang, dan \n    santan. Aduk sampai rata, saring, \n    lalu diamkan selama 3 jam.\n" +
                    "4. Masukkan dalam cetakan, panggang \n    dengan api bawah sampai kering, \n    kemudian nyalakan api atas hingga\n    matang.",
            "1. Campurkan Semua sayuran dan telur \n    direbus matang\n." +
                    "2. Bumbu dihaluskan dan ditumis dengan \n    sedikit minyak sampai harum, \n    ditambahkan daun jeruk dan serai lalu air \n    dimasukkan dan terakhir santan.\n" +
                    "3. sayuran yang sudah matang ditata di \n    atas piring dan ditambahkan potongan \n    telur, rupuk dan emping, lalu disirami\n    bumbu.",
            "1. Cuci nangka yang tadi sudah Anda \n    siapkan, lalu dipotong dadu\n" +
                    "2. Rebus nangka tersebut beberapa \n    menit kemudian tiriskan\n" +
                    "3. Masukkan telur rebus, gula aren, \n    dan nangka yang sudah dipotong tadi \n    ke panci. Sebelumnya, Anda perlu memberi\n    alas pada panci dengan beberapa lembar \n    daun salam yang tadi disiapkan, \n    sedangkan diatasnya \n    diletakkan irisan lengkuas.\n" +
                    "4. Haluskan bumbu-bumbu kemudian \n    campurkan dengan setengah air kelapa. \n    Lalu aduk merata dan tuangkan \n    pada panci.\n" +
                    "5. Tuangkan air kelapa yang tidak dicampur \n    sampai telur dan nangka semuanya \n    terendam kemudian tutup pancinya.\n" +
                    "6. Masak selama kurang lebih 2 jam dengan \n    api sedang tanpa membuka tutup panci\n" +
                    "7. Jika air sudah menyusut, sisihkan, dan \n    angkat telur\n" +
                    "8. Tuangkan santan dan aduk sambil \n    menghancurkan potongan nangka. Telur \n    dimasukkan lagi hingga sedikit terendam \n    dengan nangka.\n" +
                    "9. Masak kembali kurang lebih 3 sampai 4 \n    jam dengan api kecil sambil diaduk \n    perlahan.\n" +
                    "10.Jika santan sudah habis dan gudeg \n    dirasa sudah berwarna coklat kemerahan \n   itu berarti gudeg yang Anda buat sudah \n    matang.",
            "1. Campur ikan giling dengan air dan garam \n    hingga benar-benar larut dan cukup \n    asinnya.\n" +
                    "2. Tambahkan tepung kanji secukupnya \n    sampai adonan bisa diuleni (banyak \n    sedikit tepung kanji tergantung pada \n    kekenyalan yang diinginkan). \n    Jika suka yang kenyal bisa dipakai \n    lebih banyak.\n" +
                    "3. Adonan pempek siap dibentuk sesuai \n    selera. Untuk pempek kapal selam, ambil \n    adonan secukupnya, bentuk seperti \n    mangkuk, isi dengan telur \n    ayam mentah lalu rekatkan agar \n    tidak bocor.\n" +
                    "4. Rebus dalam air mendidih dengan api \n    sedang hingga mengapung.\n" +
                    "5. Angkat, tiriskan.\n" +
                    "6. Masukkan dalam air dingin.\n" +
                    "7. Untuk pempek lenjer, bentuk adonan \n    seperti silinder dan rebus sampai \n    mengambang kemudian angkat dan \n    masukkian dalam air dingin.\n" +
                    "8. Untuk andaan, ambil adonan secukupnya, \n    tambahkan sedikit bawang goreng atau daun \n    bawang iris seta telur, aduk rata.\n" +
                    "9. Bentuk adonan menjadi bola-bola dan \n    goreng dalam minyak panas dengan api \n    kecil hingga mengapung dan matang.",
            "1. Masak daging bersama daun salam, serai, \n    lengkuas, dan daun jeruk sampai empuk \n    dan matang. Angkat daging, lalu potong \n    kecil-kecil. Saring rebusan, \n    didihkan lagi bersama irisan daging.\n" +
                    "2. Panaskan minyak, tumis bumbu halus \n    bersama irisan daun bawang sampai \n    harum dan  matang. Angkat, lalu \n    masukkan ke dalam kaldu \n    daging. Masak dengan api kecil sampai \n    mendidih kembali.\n" +
                    "3. Tuang rawon ke dalam mangkuk, taburkan \n    tauge pendek di atasnya. Sajikan bersama \n    telur asin dan sambal terasi serta emping.",
            "1. Potong-potong daging kira-kira 1 kg jadi \n    20 potong.\n" +
                    "2. Masukkan santan ke dalam wajan, \n    tambahkan serai, daun kunyit ( daun jeruk),\n     daun salam dan bumbu halus. Masak \n    di atas api sambil timba-timba santan \n    hingga mendidih kira-kira 15 menit.\n" +
                    "3. Masukkan daging, aduk-aduk hingga \n    mendidih, kecilkan api. Beri garam, \n    gula secukupnya. Masak sampai \n    santan mengental, aduk agar tidak \n   gosong.\n" +
                    "4. Teruskan memasak dengan api kecil \n sampai rendang mengering dan berminyak\n    (Resep Khsusus daging Sapi).",
            "1. Tusuk 3 potong daging ayam dan 1 \n    potong lemak per tusuk sate\n" +
                    "2. Tumis bumbu halus dengan minyak sayur \n    hingga harum\n" +
                    "3. Tuangi air dan masak hingga kental.Lalu\n    angkat\n" +
                    "4. Aduk bumbu yang sudah ditumis dengan\n     minyak lemak ayam, minyak kacang \n    dan kecap\n " +
                    "5. Bumbu dibagi dua. Satu bagian untuk \n    bumbu  pencelup sate sebelum dibakar dan \n    satu bagian lagi dipanaskan kembali\n" +
                    "6. Bila sate akan disajikan tuangi bumbu dan \n    sajikan bersama pelengkapnya.",
            "1. Lumuri ikan tongkol menggunakan air jeruk \n    nipis, garam dan bawang putih yang \n    sudah dihaluskan, lalu biarkan selama \n    kurang lebih 20 menit. Selanjutnya \n    bakar ikan tongkol hingga matang, lalu \n    angkat dan suwir-suwir ikan tongkol \n    tersebut.\n" +
                    "2. Campurkan potongan mangga \n    kweni/kueni, tomat dan suwiran \n    ikan tongkol bakar, lalu \n    aduk-aduk hingga rata. Campurkan \n    bumbu yang  sudah dihaluskan\n    bersama dengan air panas. \n    Selanjutnya siramkan campuran air \n    dan bumbu ke dalam suwiran ikan tongkol,\n    aduk hingga rata dan seruit \n    siap disajikan.\n"
    };

    private static String[] detailMakanan = {
            "Seperti namanya, mie ini berasal dari Aceh karena sudah menjadi makanan khas daerah Aceh.Mie ini memiliki tekstur yang tebal dan dicampur dengan irisan daging serta bumbu-bubu rempah yang kuat. Mie aceh ada dua jenis yaitu, digoreng dan direbus atau ditumis. Sajikanlah mie aceh dengan tambahan seafood seperti kepiting, udang, atau cumi.",
            "Makanan khas daerah Bangka ini tentu saja berbahan dasar mie. Dihidangkan dengan mencampurkannya dengan kuah yang terbuat dari bumbu ikan, udang, atau cumi, dan ditaburi dengan kecambah serta mentimun.",
            "Makanan khas Indonesia yang satu ini bernama Bika Ambon. Asalnya berasal dari Sumatera Utara yang banyak dijual di kota Medan sebagai oleh-oleh. Kue bika ambon ini berwarna kuning dan memiliki tekstur lembut dan manis.",
            "Bisa dibilang, gado-gado adalah salad-nya Indonesia. Makanan khas Indonesia ini terdiri dari sayuran seperti kubis, wortel, kangkung, bayam, dan pare. Setelah itu semua sayuran tersebut dihidangkan bersama tahu goreng dan tempe lalu lontong. Kalau kamu seorang vegan pasti suka dengan menu ini.",
            "Selanjutnya, makanan khas Indonesia yang menjadi makanan Internasional yang telah diakui dunia yaitu, gudeg. Makanan khas Yogyakarta ini sedikit anis karena menggunakan buah nangka manis sebagai bahan utamanya. Buah ini direbus dalam campuran santan, gula aren, dan bubu khas Yogyakarta selama beberapa jam. Gudeg akan disajikan dengan beberapa daging ayam atau kulit sapi goreng untuk sedikit tambahan Protein",
            "Makanan khas Indonesia ini konon berasal dari seorang pria Tionghoa yang pertama kali menyajikan makanan di Palembang. Pempek adalah makanan yang terbuat dari ikan dan tepung tapioka. Makanan yang enak dan murah ini tersedia dalam berbagai ukuran dan isi. Variasi yang paling populer dipesan oleh pengunjung adalah jenis pempek kapal selam yang isinya terdapat telur.",
            "Selanjutnya, makanan khas Indonesia lainnya adalah nasi rawon. Nasi rawon adalah hidangan yang terbuat dari daging sapi rebus dari Jawa Timur. Rawon memiliki rasa pedas dan warna hitam pekat dari penggunaan kacang keluak. Hidangan ini akan memberikan rasa pedas yang nikmat tiada dua!",
            "Jika kamu penggemar kari, kamu pasti suka makanan khas Indonesia yang satu ini. Makanan Indonesia ini lebih seperti kari daging sapi, tetapi tanpa kaldu. Rendang terbuat dari daging sapi yang perlahan dimasak dalam saus santan dan rempah-rempah selama beberapa jam. Makanan khas daerah Palembang ini membutuhkan kesabaran dan keterampilan saat membuatnya.",
            "Sate adalah daging tusuk yang dimasak di atas arang. Sate tusuk ini biasanya menggunakan daging ayam, kambing, kelinci, atau bagian lainnya yang disajikan dengan saus kacang pedas. Namun, daging biasanya direndam dalam bumbu rempah sebelum dimasak.",
            "Seruit adalah makanan khas daerah Lampung, Indonesia, yaitu masakan ikan yang digoreng atau dibakar dicampur sambal terasi, tempoyak atau mangga. Jenis ikan adalah besarnya ikan sungai seperti belide, baung, layis dll, ditambah lalapan",

    };

    private static int[] gambarMakanan = {
            R.drawable.aceh1,
            R.drawable.bangka1,
            R.drawable.bik1,
            R.drawable.gado2,
            R.drawable.gudeg1,
            R.drawable.pempek1,
            R.drawable.rawon3,
            R.drawable.rendang3,
            R.drawable.sate2,
            R.drawable.seruit1
    };

    static ArrayList<Makanan> getListData() {
        ArrayList<Makanan> list = new ArrayList<>();
        for (int position = 0; position < namaMakanan.length; position++) {
            Makanan makanan = new Makanan();
            makanan.setNama_makanan(namaMakanan[position]);
            makanan.setLokasi_makanan(lokasiMakanan[position]);
            makanan.setDetail_makanan(detailMakanan[position]);
            makanan.setKomposisi_makanan(komposisiMakanan[position]);
            makanan.setPhoto(gambarMakanan[position]);
            list.add(makanan);
        }
        return list;
    }
}
