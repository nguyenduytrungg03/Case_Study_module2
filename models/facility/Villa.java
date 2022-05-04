package models.facility;

public class Villa extends Facility {
    //    Tiêu chuẩn phòng, Diện tích hồ bơi, Số tầng.
    private String standardVilla;
    private double areaPool;
    private int floor;

    public Villa() {
    }
//idFacility,nameServices,usableArea,rentalCosts,maximumPeople,rentalType,standardVilla
    public Villa(String idFacility,
                 String nameServices,
                 double usableArea,
                 int rentalCosts,
                 int maximumPeople,
                 String rentalType,
                 String standardVilla,
                 double areaPool,
                 int floor) {
        super(idFacility, nameServices, usableArea, rentalCosts, maximumPeople, rentalType);
        this.standardVilla = standardVilla;
        this.areaPool = areaPool;
        this.floor = floor;
    }

    public String getStandardVilla() {
        return standardVilla;
    }

    public void setStandardVilla(String standardVilla) {
        this.standardVilla = standardVilla;
    }

    public double getAreaPool() {
        return areaPool;
    }

    public void setAreaPool(double areaPool) {
        this.areaPool = areaPool;
    }

    public int getFloor() {
        return floor;
    }

    public void setFloor(int floor) {
        this.floor = floor;
    }

    @Override
    public String toString() {
        return "Villa: " + super.toString() +
                "standardVilla= " + standardVilla +
                ", areaPool= " + areaPool +
                ", floor= " + floor;
    }
    public String writeToFile(){
        return super.writeToFile() + "," +
                standardVilla +
                "," + areaPool +
                "," + floor;
    }
}
