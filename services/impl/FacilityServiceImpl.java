package services.impl;

import models.facility.Facility;
import models.facility.House;
import models.facility.Room;
import models.facility.Villa;
import services.FacilityService;
import utils.ReadAndWrite;
import utils.regex.RegexFacility;

import java.util.*;

public class FacilityServiceImpl implements FacilityService {
    private static Map<Facility, Integer> facilityIntegerMap = getFacility();
    private static Scanner scanner = new Scanner(System.in);
    static final  String FACILITY_LIST = "src\\data\\facility.csv";

    //villa
    /*
     * them villa se them vao villaFile, them vao facilityFile;
     * facilityFile SVVL-1234,0;
     * booking SVVL-1234,1;
     * contract SVVL-1234,1,true;
     * */

    @Override
    public void display() {
        facilityIntegerMap = getFacility();
        for (Map.Entry<Facility, Integer> element : facilityIntegerMap.entrySet()) {
            System.out.println("Service " + element.getKey() + "Số lần thuê: " + element.getValue());
        }
    }

    public static Map<Facility, Integer> getFacility() {
        Map<Facility, Integer> listFacility = new LinkedHashMap<>();
        List<String[]> stringList = ReadAndWrite.readFile(FACILITY_LIST);
        for (String[] item : stringList) {
            if (item[0].contains("SVVL")) {
                Villa villa = new Villa(item[0], item[1],
                        Double.parseDouble(item[2])
                        , Integer.parseInt(item[3]), Integer.parseInt(item[4])
                        , item[5], item[6]
                        , Double.parseDouble(item[7])
                        , Integer.parseInt(item[8]));
                listFacility.put(villa, Integer.parseInt(item[9]));

            } else if (item[0].contains("SVHO")) {
                House house = new House(item[0], item[1]
                        , Double.parseDouble(item[2])
                        , Integer.parseInt(item[3])
                        , Integer.parseInt(item[4]), item[5]
                        , item[6], Integer.parseInt(item[7]));
                listFacility.put(house, Integer.parseInt(item[8])); //

            } else {
                Room room = new Room(item[0], item[1]
                        , Double.parseDouble(item[2])
                        , Integer.parseInt(item[3])
                        , Integer.parseInt(item[4])
                        , item[5], item[6]);
                listFacility.put(room, Integer.parseInt(item[7]));
            }
        }
        return listFacility;
    }

    @Override
    public void displayMaintain() {

    }

    @Override
    public void addNewVilla() {
        String idFacility = RegexFacility.inputIdVilla();

        String nameServices = RegexFacility.inputName();

        double usableArea = Double.parseDouble(RegexFacility.inputArea());

        int rentalCosts = Integer.parseInt(RegexFacility.inputCosts());

        int maximumPeople = Integer.parseInt(RegexFacility.inputMaximumPeople());

        String rentalType = RegexFacility.inputRentalType();

        String standardVilla = RegexFacility.inputStandardVilla();

        double areaPool = Double.parseDouble(RegexFacility.inputAreaPool());

        int floor = Integer.parseInt(RegexFacility.inputFloor());

        Villa villa = new Villa(idFacility, nameServices,
                                usableArea, rentalCosts,
                                maximumPeople, rentalType,
                                standardVilla, areaPool, floor);

        List<String> stringList = new ArrayList<>();
        stringList.add(villa.writeToFile()+",0");
        ReadAndWrite.writerFile(FACILITY_LIST, stringList);
        System.out.println("Thêm thành công ^^");
    }


    @Override
    public void addNewHouse() {

        String idFacility = RegexFacility.inputIdHouse();

        String nameServices = RegexFacility.inputName();

        double usableArea = Double.parseDouble(RegexFacility.inputArea());

        int rentalCosts = Integer.parseInt(RegexFacility.inputCosts());

        int maximumPeople = Integer.parseInt(RegexFacility.inputMaximumPeople());

        String rentalType = RegexFacility.inputRentalType();

        String standardRoom = RegexFacility.inputStandardVilla();

        int floor = Integer.parseInt(RegexFacility.inputFloor());

        House house = new House(idFacility, nameServices,
                                usableArea, rentalCosts,
                                maximumPeople, rentalType,
                                standardRoom, floor);
        List<String> stringList = new ArrayList<>();
        stringList.add(house.writeToFile()+",0");
        ReadAndWrite.writerFile(FACILITY_LIST, stringList);
        System.out.println("Thêm thành công ^^");
    }

    @Override
    public void addNewRoom() {

        String idFacility = RegexFacility.inputRoom();


        String nameServices = RegexFacility.inputName();


        double usableArea = Double.parseDouble(RegexFacility.inputArea());


        int rentalCosts = Integer.parseInt(RegexFacility.inputCosts());


        int maximumPeople = Integer.parseInt(RegexFacility.inputMaximumPeople());


        String rentalType = RegexFacility.inputRentalType();

        System.out.println("Nhập dịch vụ miễn phí: ");
        String freeService = scanner.nextLine();
        Room room = new Room(idFacility, nameServices,
                             usableArea, rentalCosts,
                             maximumPeople, rentalType,
                             freeService);

        List<String> stringList = new ArrayList<>();
        stringList.add(room.writeToFile()+",0");
        ReadAndWrite.writerFile(FACILITY_LIST,stringList);
        System.out.println("Thêm thành công ^^");
    }

}
