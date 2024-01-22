public enum Color {
    RED(255, 0, 0),
    BLUE(0, 0, 255),
    GREEN(0, 255, 0);

    private final int red;
    private final int green;
    private final int blue;

    Color(int red, int green, int blue) {
        this.red = red;
        this.green = green;
        this.blue = blue;
    }

    public int getRed() {
        return red;
    }

    public int getGreen() {
        return green;
    }

    public int getBlue() {
        return blue;
    }

    public String getRGBCode() {
        return String.format("rgb (%d %d %d) ", red, green, blue);
    }
}
