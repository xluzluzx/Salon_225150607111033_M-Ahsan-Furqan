
import java.util.Scanner;

public class SalonProgram {
    public static void main(String[] args) {
        Salon salon = new Salon();

        HairCutService hairCutService = new HairCutService();
        ManicureService manicureService = new ManicureService();

        salon.addService(hairCutService, HairCutService.BASE_PRICE);
        salon.addService(manicureService, ManicureService.BASE_PRICE);

        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan nama Anda: ");
        String nama = scanner.nextLine();

        System.out.println("Daftar Layanan:");
        System.out.println("1. Pemotongan Rambut");
        System.out.println("2. Manicure");

        System.out.print("Pilih layanan (1/2): ");
        int pilihanLayanan = scanner.nextInt();
        scanner.nextLine(); 

        double totalHarga = 0.0;

        if (pilihanLayanan == 1) {
            System.out.print("Masukkan nama stylist: ");
            String stylist = scanner.nextLine();
            hairCutService.provideService(stylist);
            totalHarga = HairCutService.BASE_PRICE;

            System.out.println("Harga Pemotongan Rambut: $" + hairCutService.getPrice(hairCutService.getServiceName()));
        } else if (pilihanLayanan == 2) {
            System.out.print("Masukkan nama technician: ");
            String technician = scanner.nextLine();
            manicureService.provideService(technician);
            totalHarga = ManicureService.BASE_PRICE;

            System.out.println("Harga Manicure: $" + manicureService.getPrice(manicureService.getServiceName()));
        }



        System.out.print("Masukkan nominal pembayaran: ");
        double pembayaran = scanner.nextDouble();

        double kembalian = pembayaran - totalHarga;

        System.out.println("\nTerimakasih, " + nama + " sudah datang!");
        System.out.println("Total harga: $" + totalHarga);
        System.out.println("Pembayaran: $" + pembayaran);
        System.out.println("Kembalian: $" + kembalian);

        scanner.close();
    }
}



