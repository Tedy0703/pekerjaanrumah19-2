Feature: semua test

  #login hingga memilih barang ke cart dengan berhasil
  Scenario: positive test
    Given masuk berada halaman login
    And mengisikan user"coba13"
    And mengisikan password"coba23"
    Then login
    Then memilih barang untuk ke cart
    Then pilih

  #bisa melakukan pembayaran tanpa ada barang yang dipilih
  Scenario: negativ test
    Given logout akun
    And input informasi nama"Tedy"
    And input informasi daerah"indonesia"
    And input informasi kota"solo"
    And input nomor kartu"070399"
    And input bulan"maret"
    And input tahun"2024"
    Then pilih purchase





