abstract class SalonServiceBase implements SalonService {
    protected final String serviceName;

    public SalonServiceBase(String serviceName) {
        this.serviceName = serviceName;
    }

    public void provideService() {
        System.out.println("Menggunakan layanan: " + getServiceName());
    }

    public String getServiceName() {
        return serviceName;
    }

    public void infoHarga() {
        System.out.println("Harga: " + getPrice(getServiceName()));
    }

    public abstract double getPrice(String serviceName);
}