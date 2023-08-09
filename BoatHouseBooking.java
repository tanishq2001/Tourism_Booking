public class BoatHouseBooking extends Booking {
    protected int noOfDays;
    protected String foodType; 
    
    public BoatHouseBooking (String customerName, String cityName, String phoneNumber, int noOfPeople, int noOfDays, String foodType){
        super(customerName, cityName, phoneNumber, noOfPeople);
        this.noOfDays = noOfDays;
        this.foodType = foodType;
    }

    public void setNoOfDays(int noOfDays){
        this.noOfDays = noOfDays;
    }
    
    public int getNoOfDays(){
        return this.noOfDays;
    }

    public void setFoodType(String foodType){
        this.foodType = foodType;
    }
    
    public String getFoodType(){
        return this.foodType;
    }

    public double calculateTotalAmount(){
        if(foodType.equalsIgnoreCase("veg")){
            return noOfDays * 3000 + noOfPeople * 800 + 250;
        }
        else if(foodType.equalsIgnoreCase("nonveg")){
            // System.out.println(noOfDays + " " + noOfPeople);
            return noOfDays * 3000 + noOfPeople * 800 + 500;
        }
        return noOfDays * 3000 + noOfPeople * 800;
    }
}
