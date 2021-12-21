public class Model {

    private String modelType;
    private String purpose;

    public Model(String modelType, String purpose) {
        this.modelType = modelType;
        this.purpose = purpose;
    }

    public String getModelType() {
        return modelType;
    }
    public void setModelType(String modelType) {
        this.modelType = modelType;
    }

    public String getPurpose() {
        return purpose;
    }
    public void setPurpose(String purpose) {
        this.purpose = purpose;
    }

    public String toString() {
        return "Model{" +
                "Model Name = " + modelType + "," +
                "Purpose = " + purpose +
                "}";
    }
}
