package t1q1;

public class Telephone {
    private String areaCode;  //instance variables
    private int number;         //instance variables

    private static int numberOfObjects = 0;

    Telephone(String areaCode, int number){
        this.areaCode = areaCode;
        this.number = number;
        numberOfObjects++;
    }

    public String getAreaCode() {      //accessor that is used to retrieve the value of the object
        return this.areaCode;
    }

    public int getNumber() {           
        return this.number;
    }

    public void setAreaCode(String areaCode){      //mutator used to set/update the value of a specific variable of current object
        this.areaCode = areaCode;
    }

    public void setNumber(int number){         
        this.number = number;
    }

    public String makeFullNumber(){
        return this.areaCode + "-" + this.number;
    }

    


}
