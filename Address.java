public class Address {
    private int houseNumber;
    private int apartmentNumber = 0;
    private int postalCode;
    private String street;
    private String city;
    private String state;
    public Address(int hNum, String strt, String ct, String st, int pCode){
        this.houseNumber = hNum;
        this.street = strt;
        this.city = ct;
        this.state = st;
        this.postalCode = pCode;
    }
    public Address(int hNum,int aptNum, String strt, String ct, String st, int pCode){
        this.houseNumber = hNum;
        this.apartmentNumber = aptNum;
        this.street = strt;
        this.city = ct;
        this.state = st;
        this.postalCode = pCode;
    }
    public void print(){
        if(this.apartmentNumber != 0){
            System.out.println("Appartment# "+this.apartmentNumber + ", House#" + this.houseNumber + ", " + this.street);
        }else{
            System.out.println("House# " + this.houseNumber + ", " + this.street);
        }
        System.out.println(this.city + ", " + this.state + ", " + this.postalCode);
    }

    public void compareTo(Address a1){
        if(this.postalCode < a1.postalCode){
            this.print();
            System.out.println("This address comes before");
            a1.print();
        }else{
            a1.print();
            System.out.println("This address comes before");
            this.print();
        }
    }

    public static void main(String[] args) {
        Address a = new Address(03, 1, "Gobindapur Road", "Dinajpur", "Rangpur", 5230);
        a.print();
        Address b = new Address(52, "Fakir Para Road", "Dinajpur", "Rangpur", 5200);
        a.compareTo(b);
    }
}