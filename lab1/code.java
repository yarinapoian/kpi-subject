import java.time.LocalDateTime;
import java.util.List;

class Client {
    int id;
    String fullName;
    String phoneNumber;
    String email;
    String note;

    List<Appointment> appointments;
}

class Worker {
    int id;
    String fullName;
    String phoneNumber;
    String position;
    int experience;

    Studio studio;
    List<Appointment> appointments;
}

class Studio {
    int id;
    String address;
    String workingHours;
    String phoneNumber;

    List<Worker> workers;
    List<Appointment> appointments;
}

class Appointment {
    int id;
    LocalDateTime datetime;
    String response;

    Client client;
    Worker worker;
    Studio studio;
    Service service;
}

class Service {
    int id;
    String name;
    double cost;
    double costOfMaterial;
    double netProfit;
    int workTimeInMinutes;

    List<Appointment> appointments;
    List<MaterialService> materialServices;
}

class Material {
    int id;
    String name;
    String unit;
    double pricePerUnit;
    int availableCount;

    List<MaterialService> materialServices;
}

class MaterialService {
    Material material;
    Service service;
}
