public class TreeGarden extends Garden {
    public Plant getShade() {
        return new Plant("Ash");
    }
    public Plant getCenter() {
        return new Plant("Oak");
    }
    public Plant getBorder() {
        return new Plant("Laburnum");
    }

}
