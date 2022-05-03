package models.facility;

public abstract class Facility {
//    id ,Tên dịch vụ, Diện tích sử dụng, Chi phí thuê, Số lượng người tối đa, Kiểu thuê
    private String idFacility;
    private String nameServices;
    private double usableArea;
    private int rentalCosts;
    private int maximumPeople;
    private String rentalType;

    public Facility() {
    }

    public Facility(String idFacility,
                    String nameServices,
                    double usableArea,
                    int rentalCosts,
                    int maximumPeople,
                    String rentalType) {
        this.idFacility = idFacility;
        this.nameServices = nameServices;
        this.usableArea = usableArea;
        this.rentalCosts = rentalCosts;
        this.maximumPeople = maximumPeople;
        this.rentalType = rentalType;
    }

    public String getIdFacility() {
        return idFacility;
    }

    public void setIdFacility(String idFacility) {
        this.idFacility = idFacility;
    }

    public String getNameServices() {
        return nameServices;
    }

    public void setNameServices(String nameServices) {
        this.nameServices = nameServices;
    }

    public double getUsableArea() {
        return  usableArea;
    }

    public void setUsableArea(double usableArea) {
        this.usableArea = usableArea;
    }

    public double getRentalCosts() {
        return rentalCosts;
    }

    public void setRentalCosts(int rentalCosts) {
        this.rentalCosts = rentalCosts;
    }

    public int getMaximumPeople() {
        return maximumPeople;
    }

    public void setMaximumPeople(int maximumPeople) {
        this.maximumPeople = maximumPeople;
    }

    public String getRentalType() {
        return rentalType;
    }

    public void setRentalType(String rentalType) {
        this.rentalType = rentalType;
    }

    @Override
    public String toString() {
        return "Facility: " +
                " idFacility= " + idFacility +
                ", nameServices= " + nameServices  +
                ", usableArea= " + usableArea +
                ", rentalCosts= " + rentalCosts +
                ", maximumPeople= " + maximumPeople +
                ", rentalType= " + rentalType;
    }
}
