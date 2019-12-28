import org.omg.SendingContext.RunTime;

public class Rover {
    private int longitude;
    private int latitude;
    private String direct;

    public Rover() {

    }

    public int getLongitude() {
        return longitude;
    }

    public void setLongitude(int longitude) {
        this.longitude = longitude;
    }

    public int getLatitude() {
        return latitude;
    }

    public void setLatitude(int latitude) {
        this.latitude = latitude;
    }

    public String getDirect() {
        return direct;
    }

    public void setDirect(String direct) {
        this.direct = direct;
    }


    public void land(Area area, int longitude, int latitude, String direct) {
        this.latitude = latitude;
        this.longitude = longitude;
        this.direct = direct;
        if (area.getLangitude() < latitude) {
            throw new RuntimeException("error");
        }
    }

    public Postion getPosition() {
        if (null == this.getDirect()) {
            throw new RuntimeException("not land");
        }
        return new Postion(this.getLongitude(), this.getLatitude(), this.getDirect());
    }

    public void move() {
        if (direct.equals("E")) {
            latitude += 1;
        }
        if (direct.equals("W")) {
            latitude -= 1;
        }
        if (direct.equals( "N")) {
            longitude += 1;
        }
        if (direct.equals("S")) {
            longitude -= 1;
        }
    }
}
