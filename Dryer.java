import java.util.ArrayList;
import java.util.Timer;
import java.util.TimerTask;

class Dryer extends Customer {

    String customerId;
    String phoneNumber;
    int timeLeft;
    int capacity;
    String heatSource;
    boolean status;
    Timer timer;
    private List<Dryer> dryers;

    public Dryer( boolean status,int capacity, String heatSource,int timeLeft) {
        this.timeLeft = 0;
        this.capacity = capacity;
        this.heatSource = heatSource;
        this.status = true;

        if (customerId.equals("dryer1") || customerId.equals("dryer2")) {
            this.capacity = 8; // set capacity as 8 kg for dryer 1 and 2
        }
        else if (customerId.equals("dryer3")) {
            this.capacity = 12; // set capacity as 12 kg for dryer 3
        }
    }

  /*  public String getCustomerId() {
        return customerId;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    } */

    public int getTimeLeft() {
        return timeLeft;
    }

    public void setTimeLeft(int timeLeft) {
        this.timeLeft = timeLeft;
    }

    public String getHeatSource() {
        return heatSource;
    }

    public enum HeatSource {
        Normal, Medium,High
    }


    public void start(int minutes) {
        if (status) {
            throw new IllegalStateException("Dryer is already occupied.");
        }
        status = true;
        timeLeft = minutes;

        timer = new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                if (--timeLeft == 0) {
                    timer.cancel();
                    status = false;
                }
            }
        }, 0, 60 * 1000); // schedule task to run every minute
    }

    public Dryer() {
        dryers = new ArrayList<Dryer>(3);
        for (int i = 0; i < 3; i++) {
            dryers.add(new Dryer());
        }
    }

    // public methods for accessing and modifying the list of dryers
    public Dryer getDryer(int i) {
        return dryers.get(i);
    }

    public void setDryer(int i, Dryer dryer) {
        dryers.set(i, dryer);
    }

    public List<Dryer> getDryers() {
        return dryers;
    }
}

