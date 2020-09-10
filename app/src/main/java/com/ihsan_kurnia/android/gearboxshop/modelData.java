package com.ihsan_kurnia.android.gearboxshop;

import java.util.ArrayList;

public class modelData {
    /*Data Nama Kendaraan*/
    private static String[] namesCars = {
            "Aston Martin D11",
            "Mazda MX-5",
            "Jaguar F Type 2013",
            "Volkswegen Typ R",
            "BMW 6 Series",
            "Mitsubishi OutLander",
            "Mercy CLA Gen-2",
            "Mazda CX-9 Gen-2",
            "Supra Generasi 5",
            "Lamborgini Huracan"
    };
    /*End Data Nama Kendaraan*/

    private static String[] years = {
            "Tahun: 2016", "Tahun: 2016 ", "Tahun: 2013", "Tahun: 2013", "Tahun: 2013", "Tahun: 2019", "Tahun: 2019", "Tahun: 2017", "Tahun: 2019", "Tahun: 2014"
    };

    /*Data Merk Kendaraan*/
    private static String[] manufacture = {
            "Pabrikan: Aston Martin", "Pabrikan: Mazda", "Pabrikan: Jaguar", "Pabrikan: Volkswegen", "Pabrikan: BMW", "Pabrikan: Mitsubishi", "Pabrikan: Mercedes Benz", "Pabrikan: Mazda", "Pabrikan: Toyota",
            "Pabrikan: Lamborgini"

    };
    /*End Data Merk Kendaraan*/

    /*Data Gambar Kendaraan*/
    private static int[] photo = {
            R.drawable.ls_01,
            R.drawable.ls_02,
            R.drawable.ls_03,
            R.drawable.ls_04,
            R.drawable.ls_05,
            R.drawable.ls_06,
            R.drawable.ls_07,
            R.drawable.ls_08,
            R.drawable.ls_09,
            R.drawable.ls_10,
    };
    /*End Data Gambar Kendaraan*/


    /*Data Detail*/
    private static String[] textView = new String[]{
            //Aston Martin
            "\t\t\tAston Martin DB11 dilengkapi dengan fitur interior, eksterior, dan mesin yang mengesankan. " +
                    "Fitur lain yang perlu Anda ketahui adalah fitur sistem informasi dan hiburan serta keamanannya. " +
                    "Beberapa fitur baru yang dimiliki oleh DB11 adalah body convertible baru yang stylish, mesin V12 dengan 630 tenaga kuda, " +
                    "dan beberapa fitur yang termasuk dalam DB11 generasi pertama yang muncul pada tahun 2017.\n"
                    + "\t\t\tFitur \tentertainment atau hiburan yang dimiliki oleh DB11 adalah Radio w/Seek-Scan, Clock and Radio Data System, " +
                    "9 Performance Speakers, Audio Theft Deterrent, Window Grid Diversity Antenna, 2 LCD Monitors, Radio: DAB AM/FM Infotainment System," +
                    " 400-watt Aston Martin Audio System, integrasi iPod dan iPhone, Wifi Hub5, digital media card, remote audio control dan sistem navigasi.\n" +
                    "\t\t\tBagaimana \tdengan fitur keselamatannya? Fitur safety atau keselamatan yang dimiliki oleh DB11 diantaranya Electronic Stability Control (ESC), " +
                    "ABS and Driveline Traction Control, Side Impact Beams, Camera All Sides, Parking Sensors, dan Airbags (Curtain 1st, 2nd Row, Driver-Passenger, " +
                    "Dual Stage, etc). Semua fitur tersebut sudah berpadu dengan kualitas baik interior, mesin, dan eksterior yang mengesankan",
            /*End Data Aston Martin*/

            //Mazda MX-5
            "\t\t\tAda banyak sekali fasilitas atau fitur yang bisa Anda dapatkan dengan membeli mobil mewah yang satu ini. " +
                    "Anda juga sudah tidak perlu khawatir untuk adanya perubahan suhu selama Anda berkendara, " +
                    "karena mobil telah dilengkapi dengan kontrol suhu otomatis. Hal ini akan dapat mengendalikan secara otomatis AC maupun pemanas yang ada dalam ruangan.\n" +
                    "\t\t\tMengemudi juga akan menjadi muda dengan adanya Power Steering yang memang sudah terpasang pada seri ini. " +
                    "Anda juga akan dapat menyalakan dan mematikan mesin hanya dengan menggunakan tombol. Anda juga akan " +
                    "dapat mengatur ketinggian dari jok kursi dengan melakukan perubahan ketinggian pada pengaturan di jok tersebut.\n" +
                    "\t\t\tHal yang fantastis adalah mobil inni memiliki fasilitas berupa Heated Seats pada barisan depan. " +
                    "Hanya saja hal tersebut tidak berlakku bagi kursi di barisan belakang. Mobil ini juga sudah dipasangi " +
                    "dengan komputer yang mana dapat mengukur kadar tekanan udara pada ban, aliran oksigen dalam mobil, dan juga suhu dalam mobil.\n" +
                    "\t\t\tMobil ini juga memiliki fasilitas Cruise Control yang mana dapat dilakukan mempertahankan kecepatan, sehingga Anda tidak perlu " +
                    "repot-repot menginjal pedal gas terus-menerus. Pasangan Anda juga akan dapat menggunakan vanity mirror untuk dapat ber-make up.\n" +
                    "\t\t\tDalam fitur keselamatan, penumpang baris depan akan mendapatkan perlindungan airbag saat terjadi kecelakaan. " +
                    "Bagian samping penumpang juga akan dilindungi oleh airbag. Penumpang pada barisan belakang juga tidak akan mendapatkan sabuk pengaman. " +
                    "Hanya saja, Anda akan dapat mengajak anak-anak bepergian dengan menggunakan Child Safety Locks.\n" +
                    "\t\t\tPengemudi juga akan bisa mendapatkan kemudahan pada saat melakukan pengereman dengan adanya Anti-Lock Braking System, " +
                    "Brake Assist, dan EBD. Mobil tersebut juga sudah memiliki Vehicle Stability Control System. Fitur keamanan yang ada pada mobil tersebut yaitu Anti-Theft Device, Anti-theft Alarm, dan Engine Immobilizer.",
            /*End Data Mazda MX-5*/

            //Jaguar F Type 2013
            "1. Fitur Berkendara\n" +
                    "\t\tPada fitur berkendara ini, Jaguar memberikan sentuhan Dynamic Mode yang akan mengatur tingkat suspension dengan menggunakan konstruksi alumunium double wishbone. " +
                    "Dynamic mode ini juga digunakan untuk mengatur tingkat akurasi electric power-assted steering dan transmisi mesin. F-Type ini juga dilengkapi dengan sistim exhaust yang " +
                    "menghadirkan suara hening saat mesin dinyalakan.\n" + "\t\tJaguar F-Type 2019 ini juga memiliki berbagai fitur menarik lainnya yang membuat kenyamanan berkendara menjadi lebih optimal. " +
                    "Beberapa fitur yang dimaksimalkan antara lain rear electronic active differential (EAD), Intelligent Driveline Dynamics (IDD), Dynamic Stability Control, Torque Vectoring by Braking System, dan Jaguar Adaptive Dynamics.\n" +
                    "2. Fitur Hiburan\n" +
                    "\t\tPeningkatan yang terjadi dari type Jaguar sebelumnya adalah pada fitur hiburan yang ada di dalam kabin. " +
                    "Jaguar F-Type 2019 ini telah menggunakan Touch Pro 10 inch yang telah disesuaikan agar bisa support untuk Apple CarPlay dan juga Android Auto. " +
                    "Kecanggihan lain yang dihadirkan dalam fitur hiburan ini adalah sistem speaker keluaran Meridian yang sempurna.\n" +
                    "3. Fitur Keselamatan\n" +
                    "\t\tSebagai mobil sport tentunya keselamatan merupakan faktor penting yang harus diperhatikan. " +
                    "Jaguar F-Type ini membekali dengan beberapa fitur seperti Airbag untuk penumpang dan pengemudi di bagian depan, Airbag samping ketika terjadi benturan dari samping, " +
                    "Kantong udara pengemudi, Child Safety Locks, Electronik Brake Distribution, Crash Sensor, pelindung benturan depan dan belakang.\n" +
                    "4. Fitur Mesin\n" +
                    "\t\tJaguar F-Type ditenagai dengan mesin 2999 cc yang dapat menghasilkan kecepatan 375 Hp pada torsi maksimum 460 Nm. " +
                    "Walaupun memiliki mesin yang cukup besar namun penggunaan bahan bakar termasuk efisiesn karena hanya perlu menkonsumsi bbl sekitar 8.3 " +
                    "kmpl untuk perjalana dalam kota dan 15.2 kmpl untuk perjalanan di jalan tol.",
            /*End Data Jaguar F Type 2013*/

            //Volkswegen Typ R
            "\t\tVolkswagen Polo memiliki mesin yang ekonomis dan hemat. Di Indonesia, VW Polo tersedia dalam varian Volkswagen Polo VRS dan Volkswagen Polo TSI. " +
                    "Volkswagen Polo VRS yang meluncur di ajang IIMS 2018 dibesut dengan mesin 1.197 cc (1.2 liter) TSI 4-silinder seperti halnya Volkswagen Polo TSI, " +
                    "namun memiliki tenaga turbo yang lebih dashyat. VW Polo ini mampu mengantarkan daya maksimal 140 HP naik dari angka sebelumnya 105 HP. " +
                    "Demikian juga torsi VW Polo VRS yang menyentuh 230 Nm dari generasi sebelumnya yang mencapai 175 Nm. Hatchback mungil dengan penampilan sporty ini " +
                    "memiliki transmisi otomatis 7-percepatan dual clutch gearbox (DCG) yang disalurkan ke roda depan (FWD).\n" +
                    "\t\tBicara fitur keselamatannya, VW Polo VRS dibesut dengan fitur safety standar seperti child lock door, 4 airbags, dan 3 point seat belts. " +
                    "Pengeremannya juga dimaksimalkan dengan pengereman Anti lock Braking System (ABS) untuk mencegah roda terkunci saat pengereman mendadak. " +
                    "Demikian juga dengan teknologi kestabilan seperti Electronic Stability Control (ESC) dan Anti Slip Regulation (ASR). " +
                    "Juga terdapat Engine Drag Torque Control (EDTC) dan Electronic Differential Lock (EDL). Selain iru juga terdapat sensor parkir untuk parkir mundur dan alarm mobil untuk keamanan.\n" +
                    "\t\tVolkswagen Polo VRS juga memiliki sistem audio baru RCD 340 G dengan fitur slot SD Card dan USB, iPod interface untuk dihubungkan ke smartphone. " +
                    "Panel Head Unit yang terhubung dengan audio canggih ini juga dilengkapi dengan 4 buah speaker untuk membuat audio hiburan berkualitas. " +
                    "Volkswagen Polo juga datang dengan aspek kenyamanan berupa panel Automatic AC Conditioning System dengan konfigurasi Climatronic yang memberikan kesejukan merata untuk penumpang secara otomatis",
            /*End Data Volkswegen Typ R*/

            //BMW 6 Series
            "\t\tGenerasi terbaru BMW 6 Series di tanah air disambut hangat oleh pencinta BMW. Model BMW 6 Series 630i Gran Tourer hadir sebagai varian yang dipasarkan di Indonesia sejak 2018 lalu. " +
                    "BMW 6 Series GT ini menggendong mesin bensin 2.0 liter 4-silinder dengan teknologi Twin Power Turbo yang mampu menghasilkan daya yang besar. Mesinnya di atas kertas diklaim mampu " +
                    "menggelontorkan daya maksimum 258 HP dan torsi 400 Nm. BMW 6 Series GT ini menggunakan sistem transmisi otomatis 8-percepatan steptronic yang dikenal mampu menghasilkan perpindahan mesin yang halus, " +
                    "responsif, dan menghasilkan performa yang tangguh.\n" +
                    "\t\tSebelum masuknya generasi terbaru BMW 6 Series GT di Indonesia, model 6 Series ini juga tersedia dalam beberapa trim, yakni BMW 6 Series 640i Convertible AT, " +
                    "BMW 6 Series 640i Coupe M Sport AT, BMW 6 Series 640i Gran Coupe M Sport AT, BMW 6 Series 650i AT. Semuanya menggendong mesin bensin 2,979 cc, V6 6-silinder, " +
                    "24 katup yang mampu memuntahkan output maksimal 313 HP pada 4,400 rpm dan torsi puncak 630 Nm. Khusus model BMW 6 Series 650i AT menghasilkan kekuatan lebih mumpuni " +
                    "sebesar 450 HP pada putaran 2,000 rpm dan torsi maksimal 650 Nm pada 2,000 rpm. Semuanya menggunakan sistem penggerak Rear Wheel Drive (RWD) dengan sistem transmisi otomatis untuk menyalurkan tenaganya.\n" +
                    "\t\tGenerasi terbaru BMW 6 Series GT memiliki akselerasi yang super kencang dan mencengangkan. Mobil ini mampu melesat dari titik diam hingga 100 km/jam dalam waktu 6.3 detik. Demikian juga dengan top speed model Gran Turismo " +
                    "ini yang bisa menyentuh angka 250 km/jam. Kecepatan yang terbilang luar biasa. Tentu saja hal ini dipengaruhi sistem suspensi Adaptive 2-axle Air Suspension with Automatic Self Levelling Suspension. " +
                    "Untuk menyempurnakan manuvernya, BMW juga memberikan fitur integral real axle untuk menggerak roda belakang dengan angle melawan atau mengikuti arah gerakan roda sesuai kecepatan mobil.\n" +
                    "\t\tBMW juga memberikan fitur terbaiknya pada BMW 6 Series GT ini. Bahkan fitur canggihnya bisa disejajarkan dengan fitur yang dimiliki oleh BMW 7 Series yang memiliki kenyamanan tertinggi untuk mobil BMW. " +
                    "BMW 6 Series 630i Gran Turismo ini dibesut dengan fitur terkini untuk memastikan keamanan dan kenyamanan penggunanya. Beberapa fitur yang diberikan seperti mode berkendara Driving Experience Control, " +
                    "Dynamic Stability Control (DSC), traction mode 9DTC), Automatic Stability Control (ASC), Dynamic Brake Conrol (DBC). Selain itu juga pengereman yang dimaksimalkan dengan fitur Anti lock Braking System (ABS), " +
                    "Cornering Brake Control (CBC), dan Brake Assist. Agar pengemudinya mudah saat memarkirkan kendaraan, BMW juga memberikan teknologi Park Assistant yang berguna untuk manuver " +
                    "parkir paralel dan juga parkir seri dengan hanya menekan tombol di dekat tuas transmisi.\n" +
                    "\t\tJuga fitur hiburan terbaik pada BMW 6 Series teranyar ini. Fitur hiburannya didukung iDrive 6.0 yang dipadukan dengan layar sentuh 10.2 inci. " +
                    "Untuk menggunakan sistem iDrive ini bisa dilakukan dengan mode gesture tangan atau menggunakan iDrive Controller. Penggunanya juga bisa menghubungkan smartphone ke iDrive 6.0 " +
                    "dengan konektivitas USB dan Bluetooth. Selain itu penumpang di bagian belakang juga mendapatkan sistem hiburan Rear-seat entertainment professional dengan menggunakan 2 layar berukuran 10.2 inci " +
                    "untuk menikmati film blu ray dan tayangan TV.",
            /*End Data BMW 6 series*/


            //Mitsubishi Outlander PHEV
            "\t\tMitsubishi Outlander PHEV datang dalam satu varian saja di Indonesia. " +
                    "Embel-embel merupakan singkatan dari Plug-in Hybrid Electric Vehicle. " +
                    "Sebagai mobil yang digadang lebih ramah lingkungan ini, Outlander PHEV memiliki sumber tenaga yang bersumber dari " +
                    "paduan mesin bensin berkapasitas 2.4 liter model Atkinson Cycle, motor listrik, dan baterai. " +
                    "Mobil bertipe SUV ini bisa digunakan tiga opsi mode berkendara, yakni EV Drive Mode, Series Hybrid Mode, dan Parallel Hybrid Mode.\n" +
                    "\t\tMesin 2,4 liter (2,360 cc) Outlander PHEV ini menggunakan mesin bensin MIVEC 4B12 DOHC yang mampu menyemburkan tenaga berkekuatan 94 Kw atau 128 PS pada putaran 4,500 rpm. " +
                    "Torsi puncaknya menyentuh 199 Nm pada 4,500 rpm. Kendati demikian mesin Outlander PHEV ini tidak dihubungkan ke rodan, namun untuk mempertahankan pasokan listrik ke baterai. " +
                    "Sedangkan roda belakang dan depan langsung terhubung dengan dua motor listrik yang berbeda. Dengan motor listrik berpenggerak roda depan bisa menghasilkan kekuatan 60 kW atau 82 PS, " +
                    "serta mampu menempuh jarak 45 km. Sedangkan motor listrik di roda belakang bisa menghasilkan daya lebih besar, 70 kW atau berkisar 95 PS." +
                    "\t\tUntuk mode EV Drive, mobil hybrid ini sepenuhnya dikendalikan oleh listrik dari baterai, sehingga tidak ada gas buang yang dihasilkan. " +
                    "Mode berkendara Series Hybrid Mode akan memadukan mode elektrik dengan mesin bensin, mobil akan menghasilkan listrik saat baterai lemah dan menambah tenaga saat mobil melaju lebih cepat. " +
                    "Sedangkan Parallel Hybrid Mode menjalankan paduan mesin dan motor listrik.\n" +
                    "\t\tMitsubishi Outlander ini dinilai mampu memadukan SUV, teknologi hybrid, dan kendaraan elektrik yang tangguh. " +
                    "Selain itu Outlander PHEV telah dilengkapi dengan fitur keamanan dan kenyamanan papa atas yang membuat penumpang di dalamnya merasa nyaman. " +
                    "Fitur keselamatan seperti Blind Spot Warning, Forward Collision Mitigation System (FCM), Adaptive Cruise Control hingga Multi Around Monitor menunjukkan SUV Mitsubishi ini memiliki fitur keselamatan terbaik.\n" +
                    "\t\tDemikian juga dengan fitur S-AWC atau Super All-Wheel Control dengan sistem terintegrasi Mitsubishi mulai Action Yaw Control (AYC), " +
                    "Anti-lock Braking System (ABS), Active Stability Traction Control (ASTC) yang dioptimalkan. Dilengkapi dengan Multi Information Display yang menampilkan fungsi PHEV, " +
                    "Energy management, Eco Mode Control, Mitsubishi Remote Control, EV Priority Mode untuk mencegah mesin menyala, dan masih banyak lagi." +
                    "\t\tSelain itu Mitsubishi Outlander PHEV dibangun dengan sistem Ultrasonic Misacceleration Mitigation System (UMS) yang berguna saat parkir. " +
                    "Juga Automatic High-Beam untuk keselamatan di malam hari, Rise body yang bisa meredam energi saat terjadi benturan.",
            /*End Data Mitsubishi PHEV*/

            //Mercy CLA Gen-2
            "\t\tMercedes-Benz CLA-Class tidak mendapatkan banyak respons positif dalam kelengkapan dan kecanggihan fitur, terutama di bagian interior. Kendati demikian, bukan berarti CLA miskin inovasi dan fitur canggih. " +
                    "Fitur infotainment utama pada bagian interior adalah 8 Color Screen & Rotary Central Controller, Mercedes Me Connect, Command Navigation, Keyless-Go wih Hands-Free Access, Apple CarPlay dan Android Auto.\n" +
                    "\t\tBagaimana dengan fitur keamanannya? Fitur keamanan CLA juga tidak begitu banyak mendapatkan perhatian. Fitur-fitur safety yang tersedia di CLA, diantaranya Attention Assist, Rearview Camera, Lane Keeping Assist, " +
                    "Hands-free Active Parking Assist, Rain-sensing Windshield Wipers, Mercedes-Benz Emergency Call, Blind Spot Assist, Electronic Stability Program (ESP), 8 Airbags, dan Active Brake Assist.\n" +
                    "\t\tMercedes-Benz menyediakan fitur pembelian optional, baik dalam bentuk paket maupun satuan. Tidak seluruh pembelian tambahan atau upgrade tersebut tersedia untuk seluruh edisi CLA. Paket-paket pembelian opsional tersebut adalah Premium Package, " +
                    "Convenience Package, Multimedia Package, Smartphone Integration Package, Driver Assitance Package, AMG Line Exterior, Night Package, dan AMG Dynamic Plus Package.\n" +
                    "\t\tDiantara ke-3 edisi CLA, AMG CLA 45 merupakan edisi CLA yang paling kaya fitur. Dari mulai fitur performa, keamanan, desain, hingga hiburan dan kenyamanan semuanya tersedia. Fitur dan teknologi memang bukan kekuatan utama CLA. " +
                    "Beberapa bahkan cenderung menganggap fitur yang disediakan kurang mumpuni. Meskipun begiru, Mercedes-Benz masih memberikan sedikit sentuhan kemewahan untuk CLA-Class.",
            /*End Data mercy cla gen-2*/

            //Mazda CX-9 Gen-2
            "\t\tMazda CX-9 memiliki berbagai macam fitur, salah satunya adalah tombol MZD Connect. Tombol ini merupakan sebuah tombol yang dapat digunakan untuk mengatur fitur yang ada di mobil Mazda CX-9 ini. " +
                    "Hampir semua fitur baik yang ada dikabin maupun di luar kendaraan ini dapat diatur melalui tombol ini. Tombol ini akan memberikan kemudahan untuk Anda untuk mengatur fitur yang tersedia.\n" +
                    "\t\tDan juga penempatan tombol MZD Connect ini sangat egronomis dan mudah dijangkau oleh tangan pengemudi. Tentunya penempatan tombol yang baik akan memudahkan Anda untuk mengakses MZD Connect. " +
                    "Dan tombol MZD Connect ini terbuat dari bahan yang sangat solid dan mewah, sehingga menambah kesan yang baik pada interior mobil.\n" +
                    "\t\tPada mobil Mazda CX-9 terdapat 2 mode untuk berkendara, yaitu mode Normal dan juga mode Sport. Untuk mengatur mode ini, " +
                    "Anda dapat mengaksesnya melalui tuas kecil yang beradi dipojok kanan bawah yang berada disamping tuas transmisi otomatis. " +
                    "Uniknya dari mode ini adalah ketika anda men-start ulang mobil, maka mode akan otomatis pindah menjadi Normal.\n" +
                    "\t\tPerbedaan dari kedua mode tersebut tentu saja ada di kecepatan. Seperti namanya, ketika Anda memilih Mode Sport maka mobil akan menghasilkan gas yang tajam dan bobot dari kemudi yang Anda kendalikan menjadi berat. " +
                    "Hal tersebut tentunya akan menambah kepercayaan diri Anda dalam menikung di sebuah belokan.\n" +
                    "\t\tSelain dari fitur tersebut mobil ini juga memiliki fitur keselamatan. Fitur tersebut tentunya akan menambah rasa aman ketika Anda mengendarai mobil ini. " +
                    "Tercatat ada 7 buah fitur keselamatan utama dari mobil Mazda CX-9 ini. Berikut ini adalah fitur keselamatan yang ada di mobil ini.\n" +
                    "1. Adaptive LED Headlamps(ALH)\n" +
                    "\t\tSistem ini merupakan sistem keamanan yang berfungsi untuk mengenali potensi bahaya ketika berkendara di malam hari. " +
                    "Sistem ini akan memberikan jarak pandang yang luas ketika malam hari dengan menggabungkan fungsi dari lampu jauh bebas silau dan juga lampu dekat yang memiliki jangkauan luas.\n" +
                    "2. Lane-Keep Assits System(LAS)\n" +
                    "\t\tSistem ini akan menggunakan sebuah kamera yang menghadap ke depan guna mendeteksi tanda dari jalur yang dilalui dan kemudian akan membantu pengemudi untuk tetap berada di jalur yang aman untuk dilalui. " +
                    "Sistem ini juga akan mengingatkan pengemudi bila ada perpindahan jalur yang tidak disengaja dengan cara menggetarkan roda kemudi atau membunyikan alarm.\n" +
                    "3. Blind Spot Monitoring(BSM)\n" +
                    "\t\tSistem ini akan menggunakan sensor radar quasi-milliwave 24GHz untuk mendeteksi kendaraan atau benda yang ada di posisi blind spot pada belakang " +
                    "dan samping mobil. Akan ada peringatan audio dan visual ketika lampu sen mobil aktif dan kemudian sistem ini akan mendeteksi kendaraan atau benda pada blind spot mobil.\n" +
                    "4. Lane Departure Warning System (LDWS)\n" +
                    "\t\tDengan adanya fitur ini, ketika mobil yang Anda kendarai berjalan di jalur yang kurang baik akan muncul peringatan untuk mengubah jalur dari kendaraan agar lebih aman.\n" +
                    "5. Rear Cross Traffic Alert (RCTA)\n" +
                    "\t\tFitur ini sama fungsinya dengan BSM, hanya fitur ini akan aktif ketika mobil berada dalam kondisi mundur. Dan peringatan yang diberikan yaitu indikator berkedip dan juga melalui bunyi.\n" +
                    "6. Smart City Brake Support [Forward]\n" +
                    "\t\tSistem ini akan mendeteksi kemungkinan terjadi tabrakan dengan menggunakan sensor kamera depan. Ketka terdeteksi kendaraan di depan, sistem ini akan otomatis mengaktifkan rem.\n" +
                    "7. Smart City Brake Support [Reverse]\n" +
                    "\t\tSistem ini akan berfungsi sebagai pendeteksi objek di belakang kendaran. Ketika ada kendaraan lain dibelakang, sistem ini akan otomatis mengaktifkan rem.",
            /*End Data Mazda CX-9 Gen-2*/

            //Supra Generasi 5
            "\t\tMobil - mobil sekarang sudah pasti dilengkapi dengan LCD, begitu juga dengan Toyota Supra. LCD berukuran 7 inci ini sudah bisa dihubungkan dengan smartphone " +
                    "melalui Bluetooth dan juga micro USB, bisa juga menggunakan CD atau HDMI tinggal disesuaikan dengan keinginan Anda. ditambah lagi dengan kehadiran speaker " +
                    "sebanyak 2 buah yang menambah kenyamanan Anda dalam berkendara.\n" +
                    "\t\tPenggunaan Climate Control Air juga hadir untuk mengatur temperatur AC secara otomatis memberikan kejutan sendiri untuk calon konsumennya. " +
                    "Terpasang juga steering dan cruise control untuk mengatur audio tanpa menyentuh LCD yang mampu tidak mengurangi konsentrasi Anda selama mengemudi.\n+" +
                    "\t\tSupaya tidak mudah lelah, Toyota Supra memiliki jok dengan bantalan wrap around yang bisa Anda jadikan juga sandaran bahu dan juga pengaturan kursi secara elektronik. Di dalam Toyota Supra juga Anda akan mendapatkan sebuah heater. " +
                    "Berbeda dengan mobil – mobil kebanyakan, di Toyota Supra Anda hanya mendapatkan 1 buah untuk satu mobil, tapi dirasa cukup jika tinggal di negara iklim tropis.\n" +
                    "\t\tAnda juga bisa melakukan pengaturan kendaraan sendiri untuk di setiap kursinya. Kehadiran fitur ini akan menambah kenyamanan Anda ketika sedang berkendara. Selain itu juga terdapat pengaturan ketinggian pada jok, " +
                    "bisa Anda bayangkan betapa detailnya setiap bagian yang sangat diperhatikan untuk menambah kenyamanan dan juga value yang akan Anda dapat.\n" +
                    "\t\tDi bagian bahan bakar, Anda juga tidak akan dibiarkan tangki bensin dalam keadaan kosong, karena sudah terdapat sebuah indikator berbentuk lampu yang akan mengingatkan jika bahan bakar yang dimiliki sudah melewati batas normal, " +
                    "dengan begitu Anda bisa mencari pom bensin terdekat. Kemudian di bagian keamanan juga terdapat anti-lock braking system jika keadaan sudah cepat\n" +
                    "\t\tTidak ketinggalan juga bagian kamera dan sensor parkir yang akan sangat berfungsi ketika Anda sedang memakirkan kendaraan dan pandangan sangat terbatas.",
            /*End Data Supra Generasi 5*/

            //Lamborgini Huracan
            "1.Tahun Produksi 2014 - Sekarang\n" +
                    "2.Lamborghini Huracan diciptakan untuk menggantikan Lamborghini Gallardo yang merupakan produk yang paling banyak diproduksi oleh Lamborghini.\n" +
                    "3.Lamborghini Huracan adalah sebuah mobil berbentuk mid-rear, yang all-wheel drive nya dipasang dengan mesin dual-clutch dan mesin V10 yang beraspirasi natural sehingga menciptakan 610 hp.\n" +
                    "4.Lamborghini Huracan adalah super mobil yang mampu beraspirasi natural tercepat, yaitu 0-100km/jam membutuhkan waktu 2,8 detik sehingga lebih cepat dari Nissan GT-R. ",
            /*End Data Lamborgini Huracan*/
    };
    /*End Data Detail*/

    /*Fungsi Set*/
    static ArrayList<Mobil> getListData() {
        ArrayList<Mobil> list = new ArrayList<>();
        for (int position = 0; position < namesCars.length; position++) {
            Mobil mobil = new Mobil();
            mobil.setNameCars(namesCars[position]);
            mobil.setYears(years[position]);
            mobil.setManufacture(manufacture[position]);
            mobil.setPhotoCars(photo[position]);
            mobil.setTextDetail(textView[position]);
            list.add(mobil);
        }

        return list;
    }
}
