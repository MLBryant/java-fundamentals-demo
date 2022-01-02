import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Model r2Model = ModelFactory.getModel("Astromech");
        List<Tool> tools = new ArrayList<>();
        tools.add(new Tool(Tool.ToolType.STARSHIP_REPAIR));
        tools.add(new Tool(Tool.ToolType.STARSHIP_REPAIR));
        tools.add(new Tool(Tool.ToolType.STARSHIP_REPAIR));
        Droid arToo = new Droid("R2D2", r2Model, tools);


        arToo.speak();
        for (int i = 0; i < 11; i++) {
            arToo.repairStarship();
        }
    }
}
