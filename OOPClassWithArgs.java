class OOPClassWithArgs{
    public static void main(String args[]){
        // construct complete vehicles
        Vehicle_ConstructionMethode minivan
                = new Vehicle_ConstructionMethode(7, 16, 21);
        Vehicle_ConstructionMethode sportCar
                = new Vehicle_ConstructionMethode(2, 14, 12);

        double gallons;
        int dist = 252;

        gallons = minivan.fuelneeded(dist);
        System.out.println("To go "+ dist+ " miles minivan needs "+
                gallons+" gallons of fuel.");

        gallons = sportCar.fuelneeded(dist);
        System.out.println("To go "+ dist+ " miles minivan needs "+
                gallons+" gallons of fuel.");

    }
}

class Vehicle_ConstructionMethode{

    int passengers; // number of passengers
    int fuelcap;    // fuel capacity in gallons
    int mpg;        // fuel consumption per gallon
    Vehicle_ConstructionMethode(int p, int f, int m){

        passengers = p;
        fuelcap = f;
        mpg = m;

    }

    // Return the range.
    int range(){
        return mpg*fuelcap;
    }

    // Compute fuel needed for a given distance.
    double fuelneeded(int miles){
        return (double) miles/mpg;
    }
}