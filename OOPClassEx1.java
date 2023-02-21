class OOPClassEx1{
    public static void main(String args[]){
        int range;

        Vehicle minivan = new Vehicle(); // create a Vehicle object called minivan
        minivan.fuelcap = 16;
        minivan.mpg = 21;
        minivan.passengers = 7;

        // compute the range assuming a full tank of gas
        range = minivan.fuelcap * minivan.mpg;
        System.out.println("Minivan can carry " + minivan.passengers+" with a range of "+ range);

    }
}

class Vehicle {
    int passengers;
    int fuelcap;
    int mpg;
    
}