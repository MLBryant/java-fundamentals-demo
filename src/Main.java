public class Main {

    public static void main(String[] args) {

        Model r2Model = ModelFactory.getModel("Astromech");
        Droid arToo = new Droid("R2D2", r2Model);

        arToo.speak();
    }
}
