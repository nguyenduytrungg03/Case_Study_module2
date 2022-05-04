package models.facility;

public class House extends Facility {
//    Tiêu chuẩn phòng, Số tầng.
    private String standardRoom;
    private int floor;

    public House() {
    }



    public House(String idFacility,
                 String nameServices,
                 double usableArea,
                 int rentalCosts,
                 int maximumPeople,
                 String rentalType,
                 String standardRoom,
                 int floor) {
        super(idFacility, nameServices, usableArea, rentalCosts, maximumPeople, rentalType);
        this.standardRoom = standardRoom;
        this.floor = floor;
    }

    public String getStandardRoom() {
        return standardRoom;
    }

    public void setStandardRoom(String standardRoom) {
        this.standardRoom = standardRoom;
    }

    public int getFloor() {
        return floor;
    }

    public void setFloor(int floor) {
        this.floor = floor;
    }

    @Override
    public String toString() {
        return "House: " + super.toString() +
                "standardRoom= " + standardRoom +
                ", floor= " + floor ;
    }
    public String writeToFile(){
        return super.writeToFile() + ","
                + standardRoom
                + "," + floor ;
    }
}
