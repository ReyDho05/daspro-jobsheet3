import java.util.Scanner;
public class Siakad06 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String nama, nim;
        char kelas;
        byte absen;
        double nilaiKuis, nilaiTugas, nilaiUjian, nilaiAkhir, nilaiUTS;
        System.out.print("Masukkan Nama : ");
        nama = sc.nextLine();
        System.out.print("Masukkan NIM :");
        nim = sc.nextLine();
        System.out.print("Masukkan Kelas : ");
        kelas = sc.nextLine().charAt(0);
        System.out.print("Masukkan Nomor Absen : ");
        absen = sc.nextByte();
        System.out.print("Masukkan Nilai Kuis : ");
        nilaiKuis = sc.nextDouble();
        System.out.print("Masukkan Nilai Tugas : ");
        nilaiTugas = sc.nextDouble();
        System.out.print("Masukkan Nilai UTS: ");
        nilaiUTS = sc.nextDouble();
        System.out.print("Masukkan Nilai UAS : ");
        nilaiUjian = sc.nextDouble();
        nilaiAkhir = (nilaiKuis*0.2)+ (nilaiTugas*0.15)+(nilaiUTS*0.3) + (nilaiUjian*0.35);
        System.out.print("Mahasiswa dengan nama " + nama + " (NIM "+ nim + ") ");
        System.out.println(" Kelas  " + kelas + " Nomor Absen  "+absen );
        System.out.print("Nilai Akhir : " + nilaiAkhir);


    }
}