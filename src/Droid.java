import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public abstract class Droid {

    private final String serialNumber;
    private  final Model model;
    protected final List<Tool> tools;


    public Droid(String serialNumber, Model model, List<Tool> tools) {
        this.serialNumber = serialNumber;
        this.model = model;
        this.tools = new ArrayList<>(tools);
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

    public Model getModel() {
        return model;
    }

    public List<Tool> getTools() {
        return tools;
    }

    protected void speak() {
        System.out.println("Beeeuweeep!");
    }

}
