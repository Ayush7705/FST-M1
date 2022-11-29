package Activity;

public class Avtivity3 {
    public static void main(String args[]) {
        double seconds = 1000000000;

        double EarthSeconds = 31557600;
        double MercurySeconds = 0.2408467;
        double VenusSeconds = 0.61519726;
        double MarsSeconds = 1.8808158;
        double JupiterSeconds = 11.862615;
        double SaturnSeconds = 29.447498;
        double UranusSeconds = 84.016846;
        double NeptuneSeconds = 164.79132;
        double Comman = seconds / EarthSeconds ;
        System.out.println("Age on Mercury: " + Comman / MercurySeconds);
        System.out.println("Age on Venus: " + Comman / VenusSeconds);
        System.out.println("Age on Earth: " + seconds / EarthSeconds);
        System.out.println("Age on Mars: " + Comman / MarsSeconds);
        System.out.println("Age on Jupiter: " + Comman / JupiterSeconds);
        System.out.println("Age on Saturn: " + Comman/ SaturnSeconds);
        System.out.println("Age on Uranus: " + Comman / UranusSeconds);
        System.out.println("Age on Neptune: " + Comman / NeptuneSeconds);
    }
}
