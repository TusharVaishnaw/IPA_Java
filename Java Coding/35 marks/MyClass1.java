public class TravelAgencies {
    private int regNo;
    private String agencyName;
    private String pakageType;
    private int price;
    private boolean flightFacility;

    // Constructor
    public TravelAgencies(int regNo, String agencyName, String pakageType, int price, boolean flightFacility) {
        this.regNo = regNo;
        this.agencyName = agencyName;
        this.pakageType = pakageType;
        this.price = price;
        this.flightFacility = flightFacility;
    }

    // Getters
    public int getRegNo() {
        return regNo;
    }

    public String getAgencyName() {
        return agencyName;
    }

    public String getPakageType() {
        return pakageType;
    }

    public int getPrice() {
        return price;
    }

    public boolean isFlightFacility() {
        return flightFacility;
    }

    // Setters
    public void setRegNo(int regNo) {
        this.regNo = regNo;
    }

    public void setAgencyName(String agencyName) {
        this.agencyName = agencyName;
    }

    public void setPakageType(String pakageType) {
        this.pakageType = pakageType;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setFlightFacility(boolean flightFacility) {
        this.flightFacility = flightFacility;
    }
}

public class MyClass1{
    public static int findAgencyWithHighestPackagePrice(TravelAgencies[] arr){
        int maxi=0;
        for(TravelAgencies a:arr){
            int p=a.getPrice();
            if(p>maxi){
                maxi=p;
            }
        }
        return maxi;
    }
    public static TravelAgencies agencyDetailsforGivenIdAndType(TravelAgencies[] arr,int regNo, String packageType){

        for(TravelAgencies ta:arr){
            if(!ta.isFlightFacility()) continue;
            if(ta.getRegNo()==regNo && ta.getPakageType().equalsIgnoreCase(packageType)) return ta;
        }
        return null;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        TravelAgencies[] arr=new TravelAgencies[4];
        for(int i=0;i<4;i++){
            int regNo=Integer.parseInt(sc.nextLine().trim());
            String agencyName=sc.nextLine().trim();
            String packageType=sc.nextLine().trim();
            int price=Integer.parseInt(sc.nextLine().trim());
            boolean flightFacility=Boolean.parseBoolean(sc.nextLine().trim());
            arr[i] = new TravelAgencies(regNo, agencyName, packageType, price, flightFacility);
        }

        int rn=Integer.parseInt(sc.nextLine().trim());
        String pt=sc.nextLine().trim();

        System.out.println(findAgencyWithHighestPackagePrice(arr));
        TravelAgencies ans=agencyDetailsforGivenIdAndType(arr, rn, pt);
        if(ans!=null) System.out.print(ans.getAgencyName()+":"+ans.getPrice());
        else System.out.print("null");
        sc.close();
    }
}



/*
Question: 1
Create a class TravelAgencies with below attributes:

regNo – int
agencyName – String
pakageType – String
price – int
flightFacility – boolean

Write getters, setters for the above attributes . Create constructor which takes parameter in the above sequence.

Create class Solution with main method. Implement two static methods – findAgencyWithHighestPackagePrice and 
agencyDetailsforGivenIdAndType in Solution class.

findAgencyWithHighestPackagePrice method:

This method will take array of TravelAgencies objects as an input parameter and return the highest package 
price from the given array of objects.

agencyDetailsForGivenldAndType method:

This method will take three input parameters -array of TravelAgencies objects, int parameter regNo and String
parameter packageType. The method will return the TravelAgencies object based on below conditions.

FlightFacility should be available.
The input parameters(regNo and packageType) should matched with the regNo and packageType of TravelAgencies object.
If any of the above conditions are not met, then the method should return null. Note : Same Travel agency can 
have more than one package type. Travel agency and package type combination is unique. All the searches should 
be case insensitive.

The above mentioned static methods should be called from the main method.


For findAgencyWithHighestPackagePrice method – The main method should print the highestPackagePrice as it is. 
For agencyDetailsForGivenldAndType method -The main method should print the AgencyName and price of the returned 
object.The AgencyName and price should be concatinated with : while printing.
---------
Input
---------
123
A2Z Agency
Platinum
50000
true
345
SSS Agency
Gold
30000
false
987
Cox and Kings
Diamond
40000
true
888
Global Tours
Silver
20000
false
987
Diamond
-------------------------------
Output
-------------------------------
50000
Cox and Kings:40000
*/