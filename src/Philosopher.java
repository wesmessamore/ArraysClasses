/**
 * Created by Wesley on 1/30/17.
 * This is for a Day 1 Homework Assignment at The Iron Yard Nashville
 * It's a comprehensive research tool for a history dept to find patterns.
 *
 */

public class Philosopher {
    String name;
    int yearborn;
    String vocation;


    public Philosopher(String name, int yearborn, String vocation) {
        this.name = name;
        this.yearborn = yearborn;
        this.vocation = vocation;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYearborn() {
        return yearborn;
    }

    public void setYearborn(int yearborn) {
        this.yearborn = yearborn;
    }

    public String getVocation() {
        return vocation;
    }

    public void setVocation(String vocation) {
        this.vocation = vocation;
    }
}