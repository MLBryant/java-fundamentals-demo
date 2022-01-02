public interface Defender {

    default void defend() {
        System.out.println("Shocks the enemy.");
    }
}
