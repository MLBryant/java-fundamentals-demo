import java.util.List;
import java.util.Optional;

public class AstromechDroid extends Droid {

    public AstromechDroid(String serialNumber, Model model, List<Tool> tools) {super (serialNumber, model, tools);}

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
