class ManicureService extends SalonServiceBase {
    public static final double BASE_PRICE = 30.0;

    public ManicureService() {
        super("Manicure");
    }

    public void provideService(String technician) {
        System.out.println("Menggunakan layanan: " + getServiceName() + " dengan technician: " + technician);
    }

    public void infoHarga() {
        super.infoHarga();
        System.out.println("Layanan Manicure");
    }

    public double getPrice(String serviceName) {
        return BASE_PRICE;
    }
}
