public class Droid {

    private String serialNumber;
    private  Model model;

    public Droid(String serialNumber, Model model) {
        this.serialNumber = serialNumber;
        this.model = model;
    }

    public String toString() {
        return "Droid{" +
                "Serial Number = " + serialNumber + "," +
                "Model = " + model +
                "}";
    }

    public String getSerialNumber() {
        return serialNumber;
    }
    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public Model getModel() {
        return model;
    }
    public void setModel(Model model) {
        this.model = model;
    }

    public void speak() {
        System.out.println("Beeeuweeep!");
    }
}
