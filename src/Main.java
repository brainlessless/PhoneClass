import java.sql.SQLOutput;

class Phone {

    public Phone(int number, String model, int weight) {
        this(number, model);
        this.weight = weight;
    }

    public Phone(int number, String model) {
        this.number = number;
        this.model = model;
    }

    public Phone() {
    }

    public static void sendMessage(int... numbers) {
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
    }

    public static String receiveCall(String name) {
        return name;
    }
    public static int receiveCall (int number) {
        return number;
    }

    public int getNumber() {
        return number;
    }

    int number;
    String model;
    int weight;




}

class Phone1 {
    public Phone1(int number, String model, int weight) {
        this.number = number;
        this.model = model;
    }

    public static String receiveCall(String name) {
        return name;
    }

    public int getNumber() {
        return number;
    }

    int number;
    String model;
    int weight;


}

class Phone2 {
    public Phone2(int number, String model, int weight) {

    }

    public static String receiveCall(String name) {
        return name;
    }

    public int getNumber() {
        return number;
    }

    int number;
    String model;
    int weight;



}




public class Main {



    public static void main(String[] args) {
        Phone phone = new Phone(7999555,"Google Pixel", 42 );
        Phone1 phone1 = new Phone1(7800553, "Iphone 12", 56);
        Phone2 phone2 = new Phone2(66767, "Samsung S23", 56);



        System.out.println("Incoming call from " + Phone.receiveCall("Ivan") + " " + Phone.receiveCall(778787));
        System.out.println("Incoming call from " + Phone1.receiveCall("Petya") + " " + phone1.getNumber());
        System.out.println("Incoming call from " + Phone2.receiveCall("Anton") + " " + phone2.getNumber());

        Phone.sendMessage(123,123,123213,123,123);


        System.out.println("Phone number of "+ phone.model + " is " + phone.number + " and this weight is " + phone.weight + "g");
        System.out.println("Phone number of "+ phone1.model + " is " + phone1.number + " and this weight is " + phone1.weight + "g");
        System.out.println("Phone number of "+ phone.model + " is " + phone.number + " and this weight is " + phone.weight + "g");

    }

}