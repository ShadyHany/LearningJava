class OOPClassMethod{
    public static void main(String args[]){
        AnotherVehicle miniVan = new AnotherVehicle();
        AnotherVehicle sportsCar = new AnotherVehicle();

        miniVan.fuelcap = 16;
        miniVan.mpg = 21;
        miniVan.passengers = 7;

        sportsCar.fuelcap = 14;
        sportsCar.mpg = 12;
        sportsCar.passengers = 2;

        System.out.print("Minivan can carry: "+ miniVan.passengers+" ");
        miniVan.range();
        int sportsCarRange = sportsCar.rangeWithReturn();
        System.out.print("Sports car can carry: "+ sportsCar.passengers+" with a range of "+ sportsCarRange);

    }
}

class AnotherVehicle {
    int passengers;
    int fuelcap;
    int mpg;
    int range;

    void range(){
        range = fuelcap * mpg;
        System.out.println(" with a range of "+ range);
    }
    int rangeWithReturn(){
        range = fuelcap * mpg;
        return range;
    }


}