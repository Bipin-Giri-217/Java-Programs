public class vehicle {
    int no_of_seats;
    int no_of_wheels;
    vehicle(int no_of_seats,int no_of_wheels){
        this.no_of_seats=no_of_seats;
        this.no_of_wheels=no_of_wheels;
    }
    void description(){
        System.out.println("no. of seats : "+no_of_seats+"\nno. of wheels : "+no_of_wheels);
    }
    public static void main(String[] args) {
        vehicle car=new vehicle(8, 4);
        vehicle bike=new vehicle(3,2);
        System.out.println("Displaying car details : ");
        car.description();
        System.out.println("Displaying bike details : ");
        bike.description();

    }
}
