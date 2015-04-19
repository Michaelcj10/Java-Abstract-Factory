public class PerennialGarden extends Garden {
    public Plant getShade() {
        return new Plant("Anstice");
    }
    public Plant getCenter() {
        return new Plant("Dictum");
    }
    public Plant getBorder() {
        return new Plant("Sebum");
    }

}
