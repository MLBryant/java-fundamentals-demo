import java.util.HashMap;
import java.util.Map;

public class ModelFactory {

    private static Map<String, Model> models = Map.of("Astromech", new Model("Astromech", "Starship repair/support"), "Seeker", new Model("Seeker", "Catches the golden snitch to win the game"), "Battle", new Model("Battle", "Engage in 1 on 1 arena battles for robot enthusiasts everywhere"));

    public static Model getModel(String modelType) {
        return models.get(modelType);
    }

}
