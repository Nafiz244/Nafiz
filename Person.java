
class Person {
    private String name;
    private int birthdayYear;
    public Person(){
    }

    public Person(String givenName, int yearOfBirth){
        this.name = givenName;
        this.birthdayYear = yearOfBirth;
    }
    public String getName() {
        return this.name;
    }
    public String changeName(String givenName) {
        this.name = givenName;
    }
    public int getAgeInYears(int currentYear) {
        return currentYear - this.birthdayYear;
    }
    public static void main(String[] args) {
        Person p = new Person("Sayeed Afridi", 1997);
        String name = p.getName();
         
        int age=getage();
        int age = p.getAgeInYears(2020);
        System.out.println("Name: "+ name + "\nAge: "+ age);
    }
}