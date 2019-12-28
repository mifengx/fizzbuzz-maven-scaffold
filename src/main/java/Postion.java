public class Postion {
    private int longitude;
    private int latide;
    private String direct;

    public Postion(int longitude, int latide, String direct) {
        this.longitude = longitude;
        this.latide = latide;
        this.direct = direct;
    }

    public int getLongitude() {
        return longitude;
    }

    public void setLongitude(int longitude) {
        this.longitude = longitude;
    }

    public int getLatide() {
        return latide;
    }

    public void setLatide(int latide) {
        this.latide = latide;
    }

    public String getDirect() {
        return direct;
    }

    public void setDirect(String direct) {
        this.direct = direct;
    }

    @Override
    public String toString() {
        return String.valueOf(longitude) + String.valueOf(latide) + direct;
    }
}
