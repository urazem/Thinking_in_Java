package Polymorphism_8.Exercise17;

class AlertStatus {
    public void alert() {}
}
class NormalAlert extends AlertStatus {
    public void alert() { System.out.println("AlertStatus Normal"); }
}
class HighAlert extends AlertStatus {
    public void alert() { System.out.println("AlertStatus High"); }
}
class MaximumAlert extends AlertStatus {
    public void alert() {
        System.out.println("AlertStatus Maximum"); }
}

class Starship {
    private AlertStatus alertStatus = new NormalAlert();
    public void normalAlert() { alertStatus = new NormalAlert(); }
    public void highAlert() { alertStatus = new HighAlert(); }
    public void maximumAlert() { alertStatus = new MaximumAlert(); }
    public void checkAlertStatus() { alertStatus.alert(); }
}

public class Transmogrify {
    public static void main(String[] args) {
        Starship starship = new Starship();
        starship.checkAlertStatus();
        starship.highAlert();
        starship.checkAlertStatus();
        starship.maximumAlert();
        starship.checkAlertStatus();
        starship.normalAlert();
        starship.checkAlertStatus();
    }
}
