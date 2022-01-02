import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Droid {

    private final String serialNumber;
    private  final Model model;
    private final List<Tool> tools;


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

    public void speak() {
        System.out.println("Beeeuweeep!");
    }

    public void repairStarship() {
        Optional<Tool> repairToolOptional = tools.stream().filter(tool -> tool.getToolType().equals(Tool.ToolType.STARSHIP_REPAIR) && tool.getDurability() > 0).findFirst();
        if(repairToolOptional.isPresent()){
            Tool repairTool = repairToolOptional.get();
            repairTool.useTool();
            System.out.println("Starship Repaired");
            if(repairTool.getDurability() == 0){
                tools.remove(repairTool);
                System.out.println("Starship repair tool is broken beyond repair.");
            }
        } else {
            System.out.println("No starship repair tool in inventory.");
        }
    }
}
