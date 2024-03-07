package Opgave3;

import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {

        ArrayList<Room> rooms = new ArrayList<Room>();

        Room r1 = new Room(2, 3, 2);
        Room r2 = new Room(3, 5, 3);
        Room r3 = new Room(1, 2, 4);

//        rooms.add(r1);
//        rooms.add(r2);
//        rooms.add(r3);

        Collections.addAll(rooms, r1, r2, r3);

        r1.setNumberOfDoors(3);

        Building home = new Building(rooms, 2, 2, false);

        System.out.println("This building has " + countLampsInBuilding(home) + " a total of lamps in it.");

        if(isNormal(home) == true){
            System.out.println("This home is 'normal'");
        }else{
            System.out.println("This home is a freakshow!");
        }
    }

    static int countLampsInBuilding(Building home) {
        int sum = 0;
        for (Room listOfRooms : home.getRooms()) {
            sum += listOfRooms.getNumberOfLamps();
        }
        return sum;
    }
    //3.j doesnt work for me, Rolf and Casper tried to help but for some reason it does not work.

    static boolean isNormal(Building home) {

        if (home.getRooms().size() > home.getNumberOfFloors()) {
            return true;
        } else {
            return false;
        }

    }
}

