package btOnTap;

import java.util.ArrayList;
import java.util.Scanner;

public class Manage {
    ArrayList<People> peoples = new ArrayList<>();
    ArrayList<Hotel> hotels = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);

    public void menu() {
        System.out.println("Menu");
        System.out.println("1. Tạo phòng mới");
        System.out.println("2. Tạo khách hàng mới");
        System.out.println("3.Hiển thị các phòng => Săp xếp phòng theo giá");
        System.out.println("4.Hiển thị khách hàng.=> 1. Săp xếp khách theo id/ 2. Sắp xếp theo năm sinh");
        System.out.println("5.Tìm kiếm khách hàng theo tên");
        int choice = Integer.parseInt(scanner.nextLine());
        switch (choice) {
            case 1:
                createHotel();
                break;
            case 2:
                createPeople();
                break;
            case 3:
                ShowHotel();
                break;
            case 4:
                ShowPeople();
                break;
            case 5:
                break;
        }
    }

    public void createPeople() {
        System.out.println("nhập name:");
        String name = scanner.nextLine();
        System.out.println("nhập age:");
        int age = Integer.parseInt(scanner.nextLine());
        System.out.println("nhập id");
        int id = Integer.parseInt(scanner.nextLine());
        People people = new People(name, age, id);
        peoples.add(people);
    }

    public void  createHotel() {
        System.out.println("nhập roomType:");
        String roomtype = scanner.nextLine();
        System.out.println("nhập roomRate");
        double roomRate = Double.parseDouble(scanner.nextLine());
        System.out.println("nhập adress");
        String address = scanner.nextLine();
        Hotel hotel = new Hotel(roomtype, roomRate, address);
        hotels.add(hotel);

    }

    public void ShowPeople() {
        System.out.println("1. Săp xếp khách theo id");
        System.out.println("2.Sắp xếp theo năm sinh");
        int choice2 = Integer.parseInt(scanner.nextLine());

        switch (choice2) {
            case 1:
               ShowPeopleID();
                break;
            case 2:
              ShowPeopleAge();
                break;
        }


    }

    public void ShowHotel() {
        hotels.sort(new SortByRoomRate());
        for (Hotel ht : hotels
        ) {
            System.out.println(ht);
        }
    }
    public void ShowPeopleID() {
        peoples.sort(new SortByID());
        for (People pp : peoples
        ) {
            System.out.println(pp);
        }
    }
    public void ShowPeopleAge() {
        peoples.sort(new SortByAge());
        for (People ht : peoples
        ) {
            System.out.println(ht);
        }
    }
}
