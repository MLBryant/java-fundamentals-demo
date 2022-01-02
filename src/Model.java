public class Model {

    private final String modelType;
    private final String purpose;

    public Model(String modelType, String purpose) {
        this.modelType = modelType;
        this.purpose = purpose;
    }

    public String getModelType() {
        return modelType;
    }

    public String getPurpose() {
        return purpose;
    }

    public String toString() {
        return "Model{" +
                "Model Name = " + modelType + "," +
                "Purpose = " + purpose +
                "}";
    }
}
