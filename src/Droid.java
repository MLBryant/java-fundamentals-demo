import java.util.List;
import java.util.Optional;

public class Droid {

    private String serialNumber;
    private  Model model;
    private List<Tool> tools;


    public Droid(String serialNumber, Model model, List<Tool> tools) {
        this.serialNumber = serialNumber;
        this.model = model;
        this.tools = tools;
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

    public void setTools(List<Tool> tools) {
        this.tools = tools;
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
            repairTool.setDurability(repairTool.getDurability() - 1);
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
