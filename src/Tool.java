public class Tool {

    private final ToolType toolType;
    private int durability;
    public enum ToolType {
        STARSHIP_REPAIR, RIFLE
    }

    public Tool(ToolType toolType) {
        this.toolType = toolType;
        this.durability = 3;
    }

    public ToolType getToolType() {
        return toolType;
    }

    public int getDurability() {
        return durability;
    }

    public void useTool() {
        this.durability = durability - 1;
    }
}
