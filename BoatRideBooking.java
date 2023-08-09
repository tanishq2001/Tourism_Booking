/**
 * BoatRideBooking
 */
public class BoatRideBooking extends Booking{
    protected float noOfHours;
    protected String guide;   

    public BoatRideBooking (String customerName, String cityName, String phoneNumber, int noOfPeople, float noOfHours, String guide){
        super(customerName, cityName, phoneNumber, noOfPeople);
        this.noOfHours = noOfHours;
        this.guide = guide;
    }
    public void setNoOfHours(float noOfHours){
        this.noOfHours = noOfHours;
    }
    
    public float getNoOfHours(){
        return this.noOfHours;
    }

    public void setGuide(String guide){
        this.guide = guide;
    }
    
    public String getGuide(){
        return this.guide;
    }

    public double calculateTotalAmount(){
        if(guide.equalsIgnoreCase("yes")){
            return noOfPeople * 80 + noOfHours * 300 + 150;
        }
        return noOfPeople * 80 + noOfHours * 300;
    }
    
}