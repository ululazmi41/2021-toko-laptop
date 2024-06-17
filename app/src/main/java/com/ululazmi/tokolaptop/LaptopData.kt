package com.ululazmi.tokolaptop

object LaptopData {
    private val laptopNames = arrayOf(
            "LAPTOP ASUS VIVOBOOK F415EA i5 1135G7 8GB/16GB 256GB/512GB SSD FHD WINDOWS 10 SLATE GREY",
            "Laptop Paling Murah Dell Latitude E6400 & 6500 Terbaik Bergaransi ThinkPad Jakarta betet89",
            "LAPTOP DELL LATITUDE E6320 Ci5 GEN2 4GB/320GB HDD MULUS GARANSI",
            "laptop Lenovo T400 Cpu 2,4Ghz Ram 4GB HDD 320GB windows 10 mulus",
            "LAPTOP ASUS BR1100FKA-BP0410T N4500 4GB 128GB EMMC W10 11,6 TOUCH 360",
            "HP VICTUS 16-e0084ax/85ax/86ax RYZEN 7 5800H RTX3060 512GB SSD 16GB",
            "LAPTOP SEKEN SEJUTAAN CORE 2 DUO MURAH BISA BUAT LAPTOP ONLINE SHOP WHF WFO Dell d620 d630 d820",
            "LAPTOP murah second - laptop lenovo core i5 thinkpad RAM 8GB bekas second SSD",
            "LAPTOP HP I5 7200U 4GB 500GB 15INC DVDRW",
            "Lenovo V14 ADA AMD Athlon 3020 8GB RAM 256SSD Windows 10 + OHS 14.0 HD Grey Laptop Office Home Student"
    )

    private val laptopPrices = arrayOf(
        "Rp9.199.000 - Rp10.599.000",
        "Rp1.595.000 - Rp1.650.000",
        "Rp3.450.000 - Rp4.600.000",
        "Rp1.799.000 - Rp2.199.000",
        "Rp5.500.000",
        "Rp20.199.000",
        "Rp1.499.000 - Rp2.129.000",
        "Rp1.899.000 - Rp3.820.000",
            "Rp5.599.000",
            "Rp5.449.000 - Rp5.949.000"
    )

    private val laptopDetails = arrayOf(
        "Selamat datang di Lapak Terminal Laptop\n" +
                "\n" +
                "Kami menyediakan produk laptop yang sangat cocok menemani aktivitas harian dan kebutuhan anda Kami hadirkan produk :\n" +
                "\n" +
                "ASUS BR1100KA-BP0410T INTEL N4500\n" +
                "Dengan spesifikasi sebagai berikut :\n" +
                "- Procc INTEL N4500\n" +
                "- Memory 4GB DDR\n" +
                "- EMMC 128GB\n" +
                "- VGA INTEL\n" +
                "- Windows 10 Home Original\n" +
                "- MS Office TRIAL\n" +
                "- non DVD-RW\n" +
                "- 11,6 inch TOUCHSCREEN FLIP 360\n" +
                "- Dual-band 802.11ac Wi-Fi with advanced Wi-Fi Master technology & Bluetooth V4.2\n" +
                "- 2 X HD Webcam, Card Reader, HDMI x 1\n" +
                "- 1x Combo audio jack,1x Type-C USB 3.1 Gen 1, 1x Type-A USB 3.1 Gen 1, 2x USB 2.0\n" +
                "- Weight: 1.4kg included 3 cells battery\n" +
                "- FREE SOFT CASE ASUS Original\n" +
                "- Garansi Resmi ASUS 12 Bulan\n" +
                "- Color : Grey\n" +
                "\n" +
                "( tidak include stylus pen )",

        "SELAMAT DATANG di - KliknKlik STORE PGC Cilitan\n" +
                "Tempatnya Notebook, Netbook dan Aksesoris Terpercaya." +
                "#SPESIFIKASI PRODUK :\n" +
                "\n" +
                "Prosesor : Intel® Core™ i5-1135G7 Cache 8 MB, hingga 4,20 GHz, dengan IPU\n" +
                "Ram : 8GB DDR4 Upgradible\n" +
                "Storage : 256GB SSD Super Fast Bisa Diupgrade\n" +
                "VGA : INTEL IRIS XE GRAPHICS\n" +
                "Battery : 3 cells battery 42Whrs\n" +
                "Display : 14.0\"FHD (1920 x 1080) 16:9 Anti-glare display NTSC: 45%\n" +
                "Camera : 0.3MP\n" +
                "Sound : ASUS SonicMaster Technology\n" +
                "\n" +
                "FREE:MOUSE WIRELESS DAN TAS KEREN\n" +
                "\n" +
                "#KELENGKAPAN :\n" +
                "- Unit\n" +
                "- Charger\n" +
                "- Tas standar\n" +
                "\n" +
                "#GARANSI UNIT :\n" +
                "Garansi Produk (tidak termasuk software) : 1 TAHUN DISTRIBUTOR Service Dan SpartPart\n" +
                "\n" +
                "#CATATAN :\n" +
                "- VIDEOKAN saat terima paket agar jika ada kerusakan saat pengiriman bisa kita bantu klaim asuransi.",

        "LAPTOP DELL LATITUDE E6320 Ci5 GEN2 4GB/250GB HDD SECOND MULUS GARANSI\n" +
                "\n" +
                "SPESIFIKASI :\n" +
                "Procesor corei5/Core i7\n" +
                "Ram 4 gb ddr3\n" +
                "Hdd 250 gb\n" +
                "Intel HD Graphics\n" +
                "DVD\n" +
                "Wifi\n" +
                "Camera Eksternal\n" +
                "Layar: 13.3″\n" +
                "USB 3.0; Card Reader; ExpressCard; eSATA/USB 2.0 Combo\n" +
                "\n" +
                "Kelengkapan :\n" +
                "-UNIT\n" +
                "-CHARGER\n" +
                "\n" +
                "BONUS :\n" +
                "-MOUSE\n" +
                "-TAS\n" +
                "-MOUSEPAD",

        "Laptop Lenovo T400\n" +
                "\n" +
                "Prosesor Intel C2D 2,4GHz\n" +
                "Ram 4GBGB\n" +
                "storage 250/ 320GB/128GB SSD\n" +
                "VGA intel HD Grafis\n" +
                "Layar 14 inch\n" +
                "Windows 10 pro\n" +
                "\n" +
                "> Laptop mulus, no kendala !!! \n" +
                "\n" +
                ">Fitur2.                     \n" +
                ">Port USB       \n" +
                ">HDMI/VGA             \n" +
                ">Wf\n" +
                ">Camera\n" +
                ">DVD\n" +
                "> LAN.                      \n" +
                ">BLUETOOTH.         \n" +
                ">Headset\n" +
                "\n" +
                "     >Kelengkapan :Tas, Mouse , Flashdisk ,charger,aplikasi, office,dll(siap pake) \n" +
                "\n" +
                "FREE BONUS \n" +
                "TAS + MOUSE \n" +
                "( HANYA YANG HARDISK 320GB Dan SSD 128GB )\n" +
                "\n" +
                "\n" +
                "  > Laptop tinggal siap pake semua sudah disetingkan dan di instal  untuk aplikasi kebutuhan sehari-hari\n" +
                " \n" +
                " Garansi 2 Minggu sperpat",

        "Selamat datang di Lapak Terminal Laptop\n" +
                "\n" +
                "Kami menyediakan produk laptop yang sangat cocok menemani aktivitas harian dan kebutuhan anda Kami hadirkan produk :\n" +
                "\n" +
                "ASUS BR1100KA-BP0410T INTEL N4500\n" +
                "Dengan spesifikasi sebagai berikut :\n" +
                "- Procc INTEL N4500\n" +
                "- Memory 4GB DDR\n" +
                "- EMMC 128GB\n" +
                "- VGA INTEL\n" +
                "- Windows 10 Home Original\n" +
                "- MS Office TRIAL\n" +
                "- non DVD-RW\n" +
                "- 11,6 inch TOUCHSCREEN FLIP 360\n" +
                "- Dual-band 802.11ac Wi-Fi with advanced Wi-Fi Master technology & Bluetooth V4.2\n" +
                "- 2 X HD Webcam, Card Reader, HDMI x 1\n" +
                "- 1x Combo audio jack,1x Type-C USB 3.1 Gen 1, 1x Type-A USB 3.1 Gen 1, 2x USB 2.0\n" +
                "- Weight: 1.4kg included 3 cells battery\n" +
                "- FREE SOFT CASE ASUS Original\n" +
                "- Garansi Resmi ASUS 12 Bulan\n" +
                "- Color : Grey\n" +
                "\n" +
                "( tidak include stylus pen )\n" +
                "\n" +
                "AYOooo SEGARA KLIK “BELI” dan miliki produk berkualitas ini Segera… Persediaan terbatas…\n" +
                "Belanja di TERMINAL LAPTOP mempunyai banyak kelebihan.\n" +
                "- Melayani dan Menerima eceran dan Grosir\n" +
                "- Fast respon,Pelayanan Cepat,Pengiriman Tepat\n" +
                "- Harga dan Product kami 100% BARU dan BERGARANSI\n" +
                "- selalu mengutamakan quality control sebelum pengiriman\n" +
                "- Dapatkan Harga KHUSUS untuk pengambilan qty Grosir\n" +
                "- Pengiriman 100% AMAN",

        "HP VICTUS 16-e0084ax/85ax/86ax RYZEN 7 5800H RTX3060 512GB SSD 16GB 144HZ WIN10+OHS\n" +
                "\n" +
                "GARANSI RESMI HP INDONESIA 2 TAHUN + ADP\n" +
                "\n" +
                "CATATAN - PENTING:\n" +
                "\n" +
                "- Mohon VIDEOKAN sebelum & selama UNBOXING untuk klaim asuransi jika ada kerusakan dalam pengiriman.\n" +
                "\n" +
                "BONUS: BACKPACK OMEN + Office Home & Student 2019\n" +
                "\n" +
                "AMD Ryzen 7 5800H (8C / 16T, 3.2 / 4.4GHz, 4MB L2 / 16MB L3)\n" +
                "NVIDIA GeForce RTX 3060 6GB GDDR6\n" +
                "16GB (2x 8GB SO-DIMM DDR4-3200)\n" +
                "512GB SSD M.2 2280 PCIe 3.0x4 NVMe\n" +
                "\n" +
                "16.1 FHD Anti Glare Low Blue Light IPS 300 nits 144Hz,72% NTSC\n" +
                "Ports: 1 SuperSpeed USB Type-C® 5Gbps signaling rate (DisplayPort™ 1.4, HP Sleep and Charge); 1 SuperSpeed USB Type-A 5Gbps signaling rate (HP Sleep and Charge); 2 SuperSpeed USB Type-A 5Gbps signaling rate; 1 Mini DisplayPort™; 1 HDMI 2.0a; 1 RJ-45; 1 AC smart pin; 1 headphone/microphone combo\n" +
                "Expansion slots: 1 multi-format SD media card reader\n" +
                "Audio by Bang & Olufsen; DTS:X® Ultra; OMEN Audio Control Support DTS:X® Ultra; Dual speakers; HP Audio Boost 2.0\n" +
                "Webcam: HP Wide Vision 720p HD camera with integrated dual array digital microphone\n" +
                "Pointing device: Imagepad with multi-touch gesture support; Precision Touchpad Support\n" +
                "Keyboard: Full-size, 4-zone RGB backlit, mica silver keyboard and 26-Key Rollover Anti-Ghosting Key technology\n" +
                "Integrated 10/100/1000 GbE LAN\n" +
                "Intel® Wi-Fi 6 AX200 (2x2) and Bluetooth® 5 combo (Supporting Gigabit file transfer speeds)\n" +
                "200 W Smart AC power adapter\n" +
                "6-cell, 70.9 Wh Li-ion polymer\n" +
                "Dimensions without stand (W x D x H): 35.79 x 23.97 x 2.25 cm\n" +
                "Package dimensions (W x D x H): 6.9 x 52 x 30.5 cm\n" +
                "Berat: Starting at 2.37 kg\n" +
                "4 Zone RGB Backlit Keyboard",

        "ISI PAKET : \n" +
                "UNIT LAPTOP\n" +
                "ADAPTOR BAWAAN \n" +
                "[ BONUS ] MOUSE TARIK USB\n" +
                "[ BONUS ] PACKING KARDUS AMAN \n" +
                "[ BONUS ] BUBLLE WARP TEBAL \n" +
                "\n" +
                "JUMLAH ADA RATUSAN JADI STOCK TIDAK PERLU DITANYA KEMBALI LANGSUNG SAJA DI ORDER KECUALI PENGAMBILAN PULUHAN UNIT SILAHKAN DIKONFIRMASI.\n" +
                "\n" +
                "UNIT INI EX KANTOR LUAR NEGERI YG PEMAKAIANNYA SANGAT APIK JADI KONDISINYA MASIH SANGATT BAIK\n" +
                "\n" +
                "* KESALAHAN DALAM PEMILIHAN TYPE TIDAK DAPAT DI TUKAR *\n" +
                "\n" +
                "====================================================================\n" +
                "\n" +
                "DELL LATITUDE D620 D630 CAMERA SERIES BUILT IN \n" +
                "\n" +
                "CORE 2 DUO \n" +
                "RAM 2 GB / SESUAI VARIAN \n" +
                "HARDDISK 160 GB / SESUAI VARIAN \n" +
                "CAMERA BUILD IN ( SUDAH TERPASANG DALAM LAPTOP ) \n" +
                "WIFI\n" +
                "FREE SOFTCASE \n" +
                "\n" +
                "\n" +
                "FITUR TAMBAHAN :\n" +
                "- VGA PORT\n" +
                "- FIRE WIRE PORT\n" +
                "- CARDREADER PORT\n" +
                "- RJ 45 LAN PORT\n" +
                "- E-SATA COMBO PORT\n" +
                "- 3 X PORT USB 2.0\n" +
                "- AUDIO PORT\n" +
                "- LAYAR 14.0 INCH WIDE ANTIGLARED LCD\n" +
                "- TERINSTAL WINDOWS 7 DENGAN OFFICE,ADOBEREADER,DLL SIAP PAKAI\n" +
                "\n" +
                "====================================================================\n" +
                "DELL LATITUDE E5400 CORE 2 DUO RAM 2GB HD 160GB 14 INCH SPEC TINGGI MURAH\n" +
                "\n" +
                "SPESIFIKASI :\n" +
                "- INTEL CORE 2 DUO P8600 HIGH SPEED 2.4 GHZ\n" +
                "- RAM 2 GB / 4 GB (sesuai varian yg dipilih)\n" +
                "- HDD 160 GB / 320 gb (sesuai varian yg dipilih)\n" +
                "- DVD ROOM\n" +
                "- WIFI\n" +
                "- WEBCAM\n" +
                "\n" +
                "FITUR TAMBAHAN :\n" +
                "- VGA PORT\n" +
                "- FIRE WIRE PORT\n" +
                "- CARDREADER PORT\n" +
                "- RJ 45 LAN PORT\n" +
                "- E-SATA COMBO PORT\n" +
                "- 3 X PORT USB 2.0\n" +
                "- AUDIO PORT\n" +
                "- LAYAR 14.0 INCH WIDE ANTIGLARED LCD\n" +
                "- TERINSTAL WINDOWS 7 DENGAN OFFICE,ADOBEREADER,DLL SIAP PAKAI\n" +
                "\n" +
                "===================================================================================\n" +
                "\n" +
                "LENOVO THINKPAD X200\n" +
                "\n" +
                "LAPTOP INI ADALAH LAPTOP VERSI BISNIS YANG DIJAMANNYA HARGANYA BISA 4 – 5 KALI LIPAT DARI HARGA SECONDNYA, UNIT INI DI JUAL DALAM KEADAAN BAIK DAN SUDH KAMI TEST(DIAKHIR HALAMAN ADA PENJELASANNYA)\n" +
                "HARGA MURAH TAPI TIDAK MURAHAN\n" +
                "\n" +
                "SPESIFIKASI :\n" +
                "- INTEL CORE 2 DUO P8400 HIGH SPEED 2.26 GHZ\n" +
                "- RAM 2 GB\n" +
                "- HARDISK SATA 160 GB\n" +
                "- WIFI\n" +
                "- NONDVD\n" +
                "\n" +
                "FITUR TAMBAHAN :\n" +
                "- VGA PORT\n" +
                "- 3 X PORT USB 2.0 PORT\n" +
                "- 1 X AUDIO PORT\n" +
                "- LAYAR 12.1 INCH WIDE SCREEN\n" +
                "- TERINSTAL WINDOWS 7 DENGAN OFFICE,ADOBEREADER,DLL SIAP PAKAI\n" +
                "\n" +
                "KONDISI FISIK : \n" +
                "\n" +
                "\n" +
                "80-90% TINGKAT KEMULUSAN \n" +
                "Cover ada baret-baret halus\n" +
                "[ OK ] Mesin dan Mainboard \n" +
                "[ OK ] Baterai Normal kondisi GOOD \n" +
                "[ OK ] Keyboard berfungsi NORMAL \n" +
                "[ OK ] No Minus \n" +
                "\n" +
                "Garansi Product : \n" +
                "[ 4 ] Empat Minggu,\n" +
                "tidak termasuk LCD / Body pecah \n" +
                "\n" +
                "Setiap unit yang akan dikirim sudah melewati Quality Control. \n" +
                "\n" +
                "Foto yang di pajang diambil langsung dari unit yang akan di jual.\n" +
                "\n" +
                "====================================================================\n" +
                "JIKA UNIT INGIN DILAKUKAN UPGRADE \n" +
                "KAMI MENYEDIAKAN BEBERAPA PILIHAN UPGRADE \n" +
                "\n" +
                "RAM \n" +
                "2 GB \n" +
                "4 GB \n" +
                "\n" +
                "HARDDISK \n" +
                "160 GB \n" +
                "320 GB \n" +
                "500 GB \n" +
                "\n" +
                "SSD 120 GB\n" +
                "\n" +
                "KHUSUS UNTUK LENOVO X200 \n" +
                "ADA PILIHAN \n" +
                "1. DENGAN CAMERA UNTUK ZOOM \n" +
                "2. TANPA CAMERA",

        "spek i5 anti lelet dan bisa support banyak hal.\n" +
                ".\n" +
                "daripada beli laptop baru paling cuma dapat AMD atau celeron? atau beli laptop murah tapi spek kentang. mending beli laptop second rasa laptop baru dgn spek yg mumpuni. bergaransi pula. (yang pasti bukan garansi abal-abal yang lepas tanggung jawab) plus bisa tukar produk kalo ada kendala.\n" +
                ".\n" +
                "mau nyari di mana lagi yang model begini?\n" +
                ".\n" +
                "langsung sikat aja bro / sist..\n" +
                "\n" +
                "ADA HARGA ADA RUPA, HATI2 BANYAK PRODUK OPLOSAN/REKONDISI YANG DIJUAL DENGAN HARGA MURAH..\n" +
                "\n" +
                "Sudah type yg lebih modern. kualitas lebih baik\n" +
                "\n" +
                "GARANSI 1 BULAN SERVICE & SPERPATE\n" +
                "\n" +
                "(HARGA PROMO, STOK TERBATAS)\n" +
                "\n" +
                "BONUS TAS DAN MOUSE BARU\n" +
                "\n" +
                "Prevnext Computer\n" +
                "( Toko Laptop Terpercaya Dengan Banyak Testimony positif Pelanggan. Lebih Dari 1000 PRODUK LAPTOP  SUDAH TERJUAL )\n" +
                "\n" +
                "JAMINAN BUKAN REPLIKA!!!\n" +
                "KUALITAS ORIGINAL!!!\n" +
                "KAMI MENGUTAMAKAN KUALITAS!!!\n" +
                "SPESIFIKASI SESUAI!!!\n" +
                "\n" +
                "KINI HADIR :\n" +
                "Laptop Lenovo Thinkpad\n" +
                "Mesin 100% Original (Bukan Rekondisi ataupun bekas servisan). \n" +
                "kondisi body 95-98 %\n" +
                "Layar & Suara Normal Jernih\n" +
                "\n" +
                "Spesifikasi sesuai di variasi ketika checkout:\n" +
                "\n" +
                "- PROSESOR Intel Core i5\n" +
                "- RAM 4/8 GB\n" +
                "- Hdd 320HDD/500HDD/120SSD\n" +
                "- Wifi\n" +
                "- DVD Room\n" +
                "- Port USB\n" +
                "- Layar 14 Inc \n" +
                "- Windows 7/10 req di catatan\n" +
                "- request webcam di catatan\n" +
                "\n" +
                "Keuntungan Belanja Disini:\n" +
                "#aftermarket apabila terjadi kerusakan dan masih dalam masa garansi, dapat klaim garansi dengan mengirimkan produk atau datang langsung ke toko kami\n" +
                "#Original Unit, Jaminan Bukan Replika\n" +
                "#CheckUp - Sebelum Dikirim Kami Cek Dahulu Kondisi Barang\n" +
                "#Bonus - Windows dan Aplikasi\n" +
                "#Asuransi - Apabila Terjadi Kehilangan, Uang Akan Diganti Sepenuhnya Oleh Pihak  Pengiriman\n" +
                "#Packing - 100% Aman dan Telah Lulus Dari System Check-In Oleh  Pengiriman\n" +
                "#Kesulitan - Dapat Kami Pandu Cara Penggunaannya\n" +
                "#Bisa - Satuan, Grosiran, Dropship\n" +
                "\n" +
                "GARANSI 1 BULAN SERVICE & SPERPATE\n" +
                "\n" +
                "BONUS APLIKASI SIAP PAKAI :\n" +
                "- Ms Office\n" +
                "- Mozilla/Chrome\n" +
                "- Winamp/Media Player\n" +
                "- Games House ( Jika Request )\n" +
                "- Aplikasi Design Photoshop & Corel Draw ( Jika Request )\n" +
                "\n" +
                "Kondisi Mesin 100% prima / bagus, layar jernih kontras terang, batre bagus, fungsi bagus semua, belum pernah bongkar service, baut masih segel sudah terinstal Windows 7/10 dan aplikasi umum, tinggal pakai.\n" +
                "\n" +
                "-Bisa untuk gaming\n" +
                "-Bisa untuk design graphic\n" +
                "-Bisa untuk editing video\n" +
                "-Bisa untuk flashing smartphone\n" +
                "-Bisa untuk remixer DJ\n" +
                "\n" +
                "Selamat Berbelanja\n" +
                "Salam Hangat\n" +
                "Prevnext Computer\n" +
                "\n" +
                "GARANSI SERVICE DAN PENUKARAN PRODUK\n" +
                "\n" +
                "#laptop #laptopmurah #laptopsecondmurah #laptopcorei5 #lenovo #laptoplenovo #lenovothinkpad",

            "Deskripsi :\n" +
                    "HP 250-G6 INTEL CORE I5-7200 4GB/500GB/WINDOWS 10\n" +
                    "Spesifikasi :\n" +
                    "Prosesor Intel® Core ™ i5-7200U (Cache 3M, 2,5 GHz), 15,6 WLED SVA FHD Anti-silau Slim (1920 x 1080), 4GB DDR4-2133 1DIMM - 2 SLOT / MAX 16GB, 500GB 5400RPM, DVD + / -RW SuperMulti DL, Intel® HD Graphics 620, Windows® 10 Home x64, Intel® Dual Band Wireless-AC 3168 802.11ac (1x1) Wi-Fi dan Bluetooth® 4.2 Combo, Tanpa Modul HSPA, (1) VGA, ( 1) HDMI, (1) USB 2.0, (2) USB 3.1, (1) RJ45, (1) Soket kombo headphone / Mic-in.\n" +
                    "1tahun garansi service\n" +
                    " Ex-display ",

            "No. MTM : 82C600ERID\n" +
                    "\n" +
                    "Spesifikasi unit :\n" +
                    "\n" +
                    "☑ Processor : AMD 3020e (2C / 2T, 1.2 / 2.6GHz, 1MB L2 / 4MB L3)\n" +
                    "☑ RAM : 8GB SO-DIMM DDR4-2400\n" +
                    "☑ Storage : 256GB SSD M.2 2242 PCIe 3.0x2 NVMe\n" +
                    "☑ VGA : AMD Radeon Graphics\n" +
                    "☑ Display : 14\" HD (1366x768) TN 220nits Anti-glare\n" +
                    "☑ Sistem Operasi : Windows 10 Home 64bit + Office Home and Student 2019\n" +
                    "☑ Warna : Iron Grey\n" +
                    "☑ Kamera : 0.3MP\n" +
                    "☑ Audio : Stereo speakers, 1.5W x2, Dolby Audio\n" +
                    "\n" +
                    "Antarmuka :\n" +
                    "- 1x HDMI 1.4b\n" +
                    "- 1x Power connector\n" +
                    "- 1x USB 2.0\n" +
                    "- 1x Headphone / microphone combo jack (3.5mm)\n" +
                    "- 1x Card reader\n" +
                    "- 2x USB 3.1 Gen 1"
    )

    private val laptopShortDetails = arrayOf(
            "Selamat datang di Lapak Terminal Laptop",
            "SELAMAT DATANG di - KliknKlik STORE PGC Cilitan",
            "Laptop Lenovo T400",
            "Kami menyediakan produk laptop yang sangat cocok",
            "ASUS BR1100KA-BP0410T INTEL N4500",
            "HP VICTUS 16-e0084ax/85ax/86ax RYZEN 7 5800H RTX3060 512GB SSD 16GB 144HZ WIN10+OHS",
            "JUMLAH ADA RATUSAN JADI STOCK TIDAK PERLU DITANYA KEMBALI",
            "spek i5 anti lelet dan bisa support banyak hal.",
            "Processor AMD 3020e (2C / 2T, 1.2 / 2.6GHz, 1MB L2 / 4MB",
            "Prosesor Intel® Core ™ i5-7200U (Cache 3M, 2,5 GHz)"
    )

    val laptopImages = intArrayOf(
            R.drawable.foto_1,
            R.drawable.foto_2,
            R.drawable.foto_3,
            R.drawable.foto_4,
            R.drawable.foto_5,
            R.drawable.foto_6,
            R.drawable.foto_7,
            R.drawable.foto_8,
            R.drawable.foto_9,
            R.drawable.foto_10
    )

    val laptopImagesNames = arrayOf(
        "foto_1",
        "foto_2",
        "foto_3",
        "foto_4",
        "foto_5",
        "foto_6",
        "foto_7",
        "foto_8",
            "foto_9",
            "foto_10"
    )

    val listData: ArrayList<Laptop>
        get() {
            val list = arrayListOf<Laptop>()
            for (position in laptopNames.indices) {
                val laptop = Laptop()
                laptop.name = laptopNames[position]
                laptop.price = laptopPrices[position]
                laptop.shortdetail = laptopShortDetails[position]
                laptop.detail = laptopDetails[position]
                laptop.photo = laptopImages[position]
                laptop.photoName = laptopImagesNames[position]
                list.add(laptop)
            }
            return list
        }
}