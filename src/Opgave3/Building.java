package Opgave3;

import java.util.ArrayList;

public class Building {

    private ArrayList<Room> listOfRooms = new ArrayList<Room>();
    private int numberOfBathrooms;
    private int numberOfFloors;
    private boolean isOfficeBuilding;

    public Building(ArrayList<Room> listOfRooms, int numberOfBathrooms, int numberOfFloors, boolean isOfficeBuilding){
        this.listOfRooms = listOfRooms;
        this.numberOfBathrooms= numberOfBathrooms;
        this.numberOfFloors= numberOfFloors;
        this.isOfficeBuilding = isOfficeBuilding;
    }

    public ArrayList<Room> getRooms() {
        return listOfRooms;
    }


    public int getNumberOfBathrooms(){
        return numberOfBathrooms;
    }

    public int getNumberOfFloors(){
        return numberOfFloors;

    }

    public boolean getIsOfficeBuilding(){
        return isOfficeBuilding;
    }

}
