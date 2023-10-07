import java.util.Scanner;

public class segitigask {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        double alas, tinggi, luas, sisiMiring, keliling;
        var nama = "ARDYA PUSAKA";
        var nim = "V3423017";
        var kelas = "TEKNIK INFORMATIKA A";
        System.out.println("NAMA = "+nama);
        System.out.println("NIM = "+nim);
        System.out.println("KELAS = "+kelas);
        System.out.println("Program Luas Segitiga Sama Kaki");
        System.out.print("Masukan Alas = ");
        alas = userInput.nextDouble();
        System.out.print("Masukan Tinggi = ");
        tinggi = userInput.nextDouble();
        luas = 0.5*alas*tinggi;
        System.out.println("Luas Segitika Sama Kaki =" + luas);
        sisiMiring = Math.sqrt(tinggi*tinggi+0.5*alas*0.5*alas);
        System.out.println("Sisi Miring = " + sisiMiring);
        keliling = 2*sisiMiring+alas;
        System.out.println("Keliling Segitiga =" + keliling);
        System.out.printf("Keliling Segitiga :%,.2f %n", keliling);
        System.out.printf("Keliling Segitiga :%.2f %n",keliling);
    }
}
