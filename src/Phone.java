public class Phone {
    private String number;
    private String model;
    private double weight;

    public Phone(String number, String model, double weight) {
        this.number = number;
        this.model = model;
        this.weight = weight;
    }

    public Phone(String number, String model) {
        this.number = number;
        this.model = model;
        // Default weight
        this.weight = 0.0;
    }

    public Phone() {
        // Default values
        this.number = "Undefined";
        this.model = "Undefined";
        this.weight = 0.0;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void receiveCall(String callerName) {
        System.out.println(callerName + " is ringing");
    }

    public void receiveCall(String callerName, String callerNumber) {
        System.out.println(callerName + " is calling from " + callerNumber);
    }


    public void sendMessage(String... phoneNumbers) {
        System.out.println("Sending message to:");
        for (String number : phoneNumbers) {
            System.out.println(number);
        }
    }

    public static void main(String[] args) {

        Phone phone1 = new Phone("123456789", "iPhone", 0.4);
        Phone phone2 = new Phone("565324651", "Samsung Galaxy", 0.5);
        Phone phone3 = new Phone();

        System.out.println("Phone 1: Number - " + phone1.getNumber() + ", Model - " + phone1.getModel() + ", Weight - " + phone1.getWeight());
        System.out.println("Phone 2: Number - " + phone2.getNumber() + ", Model - " + phone2.getModel() + ", Weight - " + phone2.getWeight());
        System.out.println("Phone 3: Number - " + phone3.getNumber() + ", Model - " + phone3.getModel() + ", Weight - " + phone3.getWeight());

        phone1.receiveCall("Saya");
        phone2.receiveCall("Saya", "87779758606");
        phone3.receiveCall("Unknown");


        phone1.sendMessage("101", "102", "103");
    }
}

