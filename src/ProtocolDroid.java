import java.util.List;

public class ProtocolDroid extends Droid {

    public ProtocolDroid(String serialNumber, Model model, List<Tool> tools) {super (serialNumber, model, tools);}

    protected void speak() {
        System.out.println(String.format("Hello, I am %s, human-cyborg relations.", getSerialNumber()));
    }
}
