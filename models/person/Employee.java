package models.person;

public class Employee extends Person {

    private String gender;
    private String idCard;
    private String phoneNumber;
    private String email;
    private String academyLevel;
    private String position;
    private int salary;

    public Employee() {

    }

    public Employee(int id, String name,
                    String dateOfBirth, String address,
                    String gender, String idCard,
                    String phoneNumber, String email,
                    String academyLevel, String position,
                    int salary) {
        super(id, name, dateOfBirth, address);

        this.gender = gender;
        this.idCard = idCard;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.academyLevel = academyLevel;
        this.position = position;
        this.salary = salary;
    }





    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getIdCard() {
        return idCard;
    }

    public void setIdCard(String idCard) {
        this.idCard = idCard;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAcademyLevel() {
        return academyLevel;
    }

    public void setAcademyLevel(String academyLevel) {
        this.academyLevel = academyLevel;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public int getId() {
        return super.getId();
    }

    @Override
    public void setId(int id) {
        super.setId(id);
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public void setName(String name) {
        super.setName(name);
    }

    @Override
    public String getDateOfBirth() {
        return super.getDateOfBirth();
    }

    @Override
    public void setDateOfBirth(String dateOfBirth) {
        super.setDateOfBirth(dateOfBirth);
    }

    @Override
    public String getAddress() {
        return super.getAddress();
    }

    @Override
    public void setAddress(String address) {
        super.setAddress(address);
    }

    @Override
    public String toString() {
        return "Employee: " + super.toString() +
                ", gender= " + gender  +
                ", idCard= " + idCard  +
                ", phoneNumber= " + phoneNumber  +
                ", email= " + email +
                ", academyLevel= " + academyLevel +
                ", position= " + position +
                ", salary= " + salary;
    }
    public String writeToFile(){
        return super.writeToFile()+","+
                gender + ","
                + idCard + ","
                + phoneNumber + ","
                + email + ","
                + academyLevel + ","
                + position + ","
                + salary;

    }
}
