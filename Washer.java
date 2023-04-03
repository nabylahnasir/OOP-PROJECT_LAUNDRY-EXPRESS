import java.util.Timer;
import java.util.TimerTask;

//What are the inputs? -Allow to get customerID for each washer.
//What are the outputs? -Show that washer is occupied/not (status). Also show timeLeft for each washer.
//What is the goal, the procedures and attributes?
public class Washer { //extend Customer (to get customerID)

    int capacity;
    String waterUsage;
    boolean status;
    float timeLeft;
    Timer timer;
    public Washer(int id, String waterUsage, int capacity) {
        //this.id = id;
        //this.customer = customer;
        this.status = false; // washer is initially unoccupied
        this.waterUsage = waterUsage;
        this.capacity = capacity;
    }

   /* public int getId() {
        return id;
    } */

    /* public Customer getCustomer() {
        return customer;
    } */

    public boolean getStatus() {
        return status;
    }

    public String getWaterUsage() {
        return waterUsage;
    }
    public int getCapacity() {
        return capacity;
    }

    public void start(int minutes) {
        if (status) {
            throw new IllegalStateException("Washer is already occupied.");
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

    public float getTimeLeft() {
        return timeLeft;
    }
}