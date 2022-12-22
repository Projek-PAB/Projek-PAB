package com.si5b.bimbelku;

import java.util.ArrayList;

public class DataBimbel {
    public static String[][] data = new String[][]{
            {"Primagama Palembang Burlian", "Primagama merupakan bimbingan belajar terbaik dan terbesar di Indonesia. Berdiri sejak 10 Maret 1982 di Kota Pelajar Yogyakarta, saat ini Primagama telah lebih dari 400 kantor cabang dimulai dari Aceh hingga Papua.", " Beralamat di Komplek Ruko, Jl. Jend. Sudirman No.KM 4,5, Ario Kemuning, Kec. Kemuning, Kota Palembang, Sumatera Selatan 30151"},
            {"Nurul Fikri Palembang",": Bimble Nurul Fikri menggunakan model pembelajaran Blended Learning, yakni proses belajar terpadu menggunakan pertemuan tatap muka dan online melalui aplikasi NF.","Beralamat di Jl. Jend. Sudirman No.926D, 20 Ilir D. III, Kec. Ilir Tim. I, Kota Palembang, Sumatera Selatan 30129"},
            {"BIMBEL BTA 70 PALEMBANG CABANG PTC","bimbel BTA 70  sudah berpengalaman sejak 1990, dan sudah meluluskan banyak siswa ke universitas, SMA, dan SMP impian mereka.","Beralamat di BCD , Depan PTC MALL, sebelah Mc Donalds, Jl. R. Sukamto No.28, 8 Ilir, Kec. Ilir Tim. II, Kota Palembang, Sumatera Selatan 30164"},
            {"BIMBEL Ganesha Operation (GO) Balayudha","Bimbel Ganesha Operation merupakan lembaga bimbingan belajar terbaik dan terbesar di Indonesia. Berdiri sejak 2 Mei 1984 di Kota Bandung, saat ini Ganesha Operation telah tersebar di 247 kota di Indonesia, mulai dari Aceh hingga Ambon.","Beralamat di Jl. Jend. Sudirman, Ario Kemuning, Kec. Kemuning, Kota Palembang, Sumatera Selatan 30128"},
            {"Bimbel PKN STAN Madani","Bimbel Madani adalah spesialis bimbingan belajar tes Seleksi Penerimaan Mahasiswa Baru Politeknik Keuangan Negara STAN (SPMB PKN STAN) yang pertama dan terbaik di Palembang sejak tahun 2002. Dengan pengalaman, sistem belajar khusus, dan dibimbing langsung oleh alumni PKN STAN yang telah bekerja di Kementerian Keuangan, Bimbel Madani telah terbukti menjadi bimbel yang paling banyak meluluskan siswanya menembus Perguruan Tinggi Kedinasan Kementerian Keuangan PKN STAN.","Beralamat di No.7727B, Jl. Srijaya Negara, Bukit Lama, Kec. Ilir Bar. I, Kota Palembang, Sumatera Selatan 30139"},
            {"Bimbel Matrik", "Bimbel Matrik merupakan tempat usaha yang berada di Palembang. Tempat ini terletak di Jalan Mayor Santoso. Tempat ini menyediakan jasa bimbingan belajar. Bagi Anda yang membutuhkan nya, silahkan datang ke tempat ini.","Beralamat di Jl. Mayor Santoso No.3111, 20 Ilir D. III, Kec. Ilir Tim. I, Kota Palembang, Sumatera Selatan 30121"},
            {"Bimbel Stan Alumni 97","Bimbel ini menyediakan kelas bimbel SD, bimbel SMP, bimbel SMA dan persiapan perguruan tinggi dan universitas bahkan bimbel ujian kerja CPNS / BUMN." +
                    "Materi yang diajarkan lengkap sesuai dengan kebutuhan seperti materi Matematika, bahasa indonesia, bahasa inggris, kimia, biologi, fisika, TPA. Terdapat juga kelas intensif bagi para peserta. Tentor dan pengajar profesional.", "Beralamat di Jl. Let. Simanjuntak No.5 E, Pahlawan, Kec. Kemuning, Kota Palembang, Sumatera Selatan 30151"},
            {"Brain Academy Bimbingan Belajar","Brain Academy adalah bimbingan belajar SD, SMP, SMA, dan persiapan UTBK. Selain dapat diakses melalui aplikasi, Brain Academy mempunyai 36 cabang bimbel offline di seluruh Indonesia.","Beralamat di Jl. Jend. Basuki Rachmat No.78, Ario Kemuning, Kec. Kemuning, Kota Palembang, Sumatera Selatan 30164"},
            {"Queen bimbel","Queen Bimbel berdiri dari tahun 2014, di sini menyediakan jasa bimbingan untuk anak 4 tahun sampai tingkat SMP, di sini ada program Bahasa Inggris SD Dan SMP, Program MIPA dan Program Calistung. Harga terjangkau dan guru-gurunya berasal dari PTN dan swasta.", "Beralamat di Jl. Letnan Murod No.870, 20 Ilir D. IV, Kec. Ilir Tim. I, Kota Palembang, Sumatera Selatan 30128"},
            {"Bimbel Prosus Inten","Prosus Inten dirancang untuk menciptakan peserta didik yang memiliki Keterampilan super dalam belajar, jauh lebih unggul dibandingkan jika mereka dibimbing dalam cara-cara yang konvensional","Beralamat di PTC Mall, Jl. R. Sukamto No.8A, 8 Ilir, Kec. Ilir Tim. II, Kota Palembang, Sumatera Selatan 30164"},
    };

    public static ArrayList<ModelBimbel> ambilDataBimbel(){
        ArrayList<ModelBimbel> dataBimbel = new ArrayList<>();

        for (String[] varData: data){
            ModelBimbel MB = new ModelBimbel();
            MB.setNama(varData[0]);
            MB.setTentang(varData[1]);
            MB.setFoto(varData[2]);

            dataBimbel.add(MB);
        }

        return dataBimbel;
    }
}
