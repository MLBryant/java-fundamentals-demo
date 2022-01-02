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
        AstromechDroid arToo = new AstromechDroid("R2D2", r2Model, tools);

        for (int i = 0; i < 11; i++) {
            arToo.repairStarship();
        }

        Model c3Model = ModelFactory.getModel("Seeker");
        ProtocolDroid threePio = new ProtocolDroid("C3PO", c3Model, new ArrayList<>());

        Model battleModel = ModelFactory.getModel("Battle");
        List<Tool> rifles = new ArrayList<>();
        rifles.add(new Tool(Tool.ToolType.RIFLE));
        BattleDroid OOM9 = new BattleDroid("OOM-9", battleModel, rifles);

        List<Droid> droids = new ArrayList<>();
        droids.add(arToo);
        droids.add(threePio);
        droids.add(OOM9);

        for(Droid droid: droids) {
            droid.speak();
        }

        AstromechDroid R2D5 = new AstromechDroid("R2D5", r2Model, tools);

        BattleDroid OOM7 = new BattleDroid("OOM-7", battleModel, rifles);

        List<Defender> defenders = new ArrayList<>();
        defenders.add(R2D5);
        defenders.add(OOM7);

        for(Defender defender: defenders) {
            defender.defend();
        }
    }
}
