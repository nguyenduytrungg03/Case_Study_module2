package models.facility;

public class Room extends Facility {
//    Dịch vụ miễn phí đi kèm.
    private String freeService;

    public Room() {
    }



    public Room(String idFacility, String nameServices, double usableArea, int rentalCosts, int maximumPeople, String rentalType, String freeService) {
        super(idFacility,
              nameServices,
              usableArea,
              rentalCosts,
              maximumPeople,
              rentalType);
        this.freeService = freeService;
    }

    public String getFreeService() {
        return freeService;
    }

    public void setFreeService(String freeService) {
        this.freeService = freeService;
    }

    @Override
    public String toString() {
        return "Room: " + super.toString() +
                ", freeService= " + freeService ;
    }
}
