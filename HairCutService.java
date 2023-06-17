class HairCutService extends SalonServiceBase {
    public static final double BASE_PRICE = 50.0;

    public HairCutService() {
        super("Pemotongan Rambut");
    }

    public void provideService(String stylist) {
        System.out.println("Menggunakan layanan: " + getServiceName() + " dengan stylist: " + stylist);
    }

    public void infoHarga() {
        super.infoHarga();
        System.out.println("Layanan Pemotongan Rambut");
    }

    public double getPrice(String serviceName) {
        return BASE_PRICE;
    }
}
