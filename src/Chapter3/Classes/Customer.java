package Chapter3.Classes;


public class Customer {

    private static long counter;
    private long id;
    private String secondName;
    private String firstName;
    private String sername;
    private String address;
    private long creditCardNumber;
    private long bankNumber;

    public Customer() {}
    public Customer(String firstName, String secondName, String sername, String address, long creditCardNumber, long bankNumber) {
        ++counter;
        this.id = counter;
        this.firstName = firstName;
        this.secondName = secondName;
        this.sername = sername;
        this.address = address;
        this.creditCardNumber = creditCardNumber;
        this.bankNumber = bankNumber;
    }

    public String getSerame() {
        return sername;
    }

    public void setSerame(String serame) {
        this.sername = serame;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public long getBankNumber() {
        return bankNumber;
    }

    public void setBankNumber(long bankNumber) {
        this.bankNumber = bankNumber;
    }

    public long getCreditCardNumber() {
        return creditCardNumber;
    }

    public void setCreditCardNumber(long creditCardNumber) {
        this.creditCardNumber = creditCardNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Name is: " + firstName + " " + "\n"
                + "Address is: " + address + "\n"
                + "Bank number: " + bankNumber + "    " + "Cad Number: " + creditCardNumber;


    }
    public static void test(){
        System.out.println("bla bla adfadff adsf asd asd f");
    }



}

