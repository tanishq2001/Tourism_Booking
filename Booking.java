/**
 * Booking your ride 
 */
public abstract class Booking {
    protected String customerName;
    protected String cityName;
    protected String phoneNumber;
    protected int noOfPeople;

    public Booking(String customerName, String cityName, String phoneNumber, int noOfPeople){
        this.customerName = customerName;
        this.cityName = cityName;
        this.phoneNumber = phoneNumber;
        this.noOfPeople = noOfPeople;
    }

    public void setCustomerName(String customerName){
        this.customerName = customerName;
    }
    
    public String getCustomerName(){
        return this.customerName;
    }

    public void setCityName(String cityName){
        this.cityName = cityName;
    }
    
    public String getCityName(){
        return this.cityName;
    }

    
     public void setPhoneNumber(String phoneNumber){
        this.phoneNumber = phoneNumber;
    }
    
    public String getPhoneNumber(){
        return this.phoneNumber;
    }

     public void setNoOfPeople(int noOfPeople){
        this.noOfPeople = noOfPeople;
    }
    
    public int getNoOfPeople(){
        return this.noOfPeople;
    }
    
    public abstract double calculateTotalAmount();
}