import java.util.List;
import java.util.Optional;

public class BattleDroid extends Droid implements Defender{

    public BattleDroid(String serialNumber, Model model, List<Tool> tools) {super(serialNumber, model, tools);}

    @Override
    protected void speak() {
        System.out.println("Roger, roger.");
    }

    public void defend() { shootEnemy();}

    public void shootEnemy() {
        Optional<Tool> combatToolOptional = tools.stream().filter(tool -> tool.getToolType().equals(Tool.ToolType.RIFLE) && tool.getDurability() > 0).findFirst();
        if(combatToolOptional.isPresent()){
            Tool combatTool = combatToolOptional.get();
            combatTool.useTool();
            System.out.println("Enemy hit.");
            if(combatTool.getDurability() == 0){
                tools.remove(combatTool);
                System.out.println("Rifle is out of ammo.");
            }
        } else {
            System.out.println("No rifle in inventory.");
        }
    }
}
