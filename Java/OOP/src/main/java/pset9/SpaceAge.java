package pset9;

public class SpaceAge {
    private long seconds;

    public SpaceAge(long seconds) {
        this.seconds = seconds;
    }

    public long getSeconds() {
        return seconds;
    }

    public void setSeconds(int seconds) {
        this.seconds = seconds;
    }

    // Using getters for getting different answers
    public double onEarth(){
        double yearOnEarth = 31557600;
        return seconds/yearOnEarth;
    }


    public double onMercury(){
        double yearOnMercury = 0.2408467;
        // yearOnMercury / year = ratio above
        return onEarth() * yearOnMercury;
    }

    public double onVenus(){
        double yearOnVenus =  0.61519726;
        return onEarth() * yearOnVenus;
    }

    public double onMars(){
        double yearOnMars = 1.8808158;
        return onEarth() * yearOnMars;
    }

    public double onJupiter(){
        double yearOnJupiter = 11.862615;
        return onEarth() * yearOnJupiter;
    }

    public double onSaturn(){
        double yearOnSaturn = 29.447498;
        return onEarth() * yearOnSaturn;
    }

    public double onUranus(){
        double yearOnUranus = 84.016846;
        return onEarth() * yearOnUranus;
    }

    public double onNeptune(){
        double yearOnNeptune = 164.79132;
        return onEarth() * yearOnNeptune;
    }
}
