package oops;
class Participant {
    private int pid;
    private String pname;
    private double regFee;
    private int eventCount;
    private double chargePerEvent;
    public void setPid(int id) {
        pid = id;
    }
    public void setPname(String name) {
        pname = name;
    }
    public void setRegFee(double fee) {
        regFee = fee;
    }
    public void setEventCount(int count) {
        eventCount = count;
    }
    public void setChargePerEvent(double charge) {
        chargePerEvent = charge;
    }
    public int getPid() {
        return pid;
    }
    public String getPname() {
        return pname;
    }
    public double getRegFee() {
        return regFee;
    }
    public int getEventCount() {
        return eventCount;
    }
    public double getChargePerEvent() {
        return chargePerEvent;
    }
    public double calculateTotal() {
        return regFee + (eventCount * chargePerEvent);
    }
    public void showDetails() {
        System.out.println("Participant Record");
        System.out.println("ID: " + pid);
        System.out.println("Name: " + pname);
        System.out.println("Base Registration Fee: " + regFee);
        System.out.println("Event Charges: " + eventCount + " events @ " + chargePerEvent + "/event");
        System.out.println("Total Fee: " + calculateTotal());
    }
}
public class MainClass {
    public static void main(String[] args) {
        Participant p = new Participant();
        p.setPid(501);
        p.setPname("Rahul");
        p.setRegFee(200.0);
        p.setEventCount(3);
        p.setChargePerEvent(100.0);
        p.showDetails();
    }
}



