public class Tool {

    private ToolType toolType;
    private int durability;
    public enum ToolType {
        STARSHIP_REPAIR
    }

    public Tool(ToolType toolType) {
        this.toolType = toolType;
        this.durability = 3;
    }

    public ToolType getToolType() {
        return toolType;
    }
    public void setToolType (ToolType toolType) {
        this.toolType = toolType;
    }

    public int getDurability() {
        return durability;
    }
    public void setDurability(int durability) {
        this.durability = durability;
    }
}
