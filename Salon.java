import java.util.ArrayList;
import java.util.HashMap;
class Salon {
    private ArrayList<SalonService> services;
    private HashMap<String, Double> priceList;

    public Salon() {
        services = new ArrayList<>();
        priceList = new HashMap<>();
    }

    public void addService(SalonService service, double price) {
        services.add(service);
        priceList.put(service.getServiceName(), price);
    }

    public void provideServices() {
        for (SalonService service : services) {
            service.provideService();
        }
    }

    public void infoHargaLayanan() {
        for (SalonService service : services) {
            service.infoHarga();
        }
    }

    public double getPrice(String serviceName) {
        return priceList.get(serviceName);
    }
}
