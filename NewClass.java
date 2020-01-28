package pbo3;

public class NewClass {

    public static void main(String[] args) {
        Kalkulator dea = new Kalkulator();
        dea.setAngka(25);
        dea.setAngka2(5);

        int penjumlahan = dea.getAngka() + dea.getAngka2();
        int pengurangan = dea.getAngka() - dea.getAngka2();
        int perkalian = dea.getAngka() * dea.getAngka2();
        int pembagian = dea.getAngka() / dea.getAngka2();

        System.out.println("Angka 1 :" + dea.getAngka());
        System.out.println("Angka 2 :" + dea.getAngka2());

        System.out.println("Hasil Penjumlahan :" + penjumlahan);
        System.out.println("Hasil Pengurangan :" + pengurangan);
        System.out.println("Hasil Perkalian   :" + perkalian);
        System.out.println("Hasil Pembagian   :" + pembagian);

    }

}
