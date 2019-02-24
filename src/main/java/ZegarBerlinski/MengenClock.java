package ZegarBerlinski;

/**
 * @author nieckarz
 */
public class MengenClock {
    private int HourLine1 = 0;
    private int HourLine2 = 0;
    private int MinutesLine1 = 0;
    private int MinutesLine2 = 0;

    public MengenClock() {
    }

    public MengenClock(int Hours, int Minutes ) {
        parseTime(Hours,Minutes);
    }

    public MengenClock(String time) {
        String[] linia = time.split(":");
        int hour = Integer.valueOf(linia[0]);
        int minutes = Integer.valueOf(linia[1]);
        parseTime(hour,minutes);
    }

    public int getHourLine1() {
        return HourLine1;
    }

    public int getHourLine2() {
        return HourLine2;
    }

    public int getMinutesLine1() {
        return MinutesLine1;
    }

    public int getMinutesLine2() {
        return MinutesLine2;
    }

    public void parseTimeHours(long hour) {
        this.HourLine1 = (int)(hour/5);
        this.HourLine2 = (int)(hour - HourLine1*5);
        if (this.HourLine2<0) this.HourLine2 = this.HourLine2*(-1);
    }

    public void parseTimeMinutes(int minutes) {
        this.MinutesLine1 = (int)(minutes/5);
        this.MinutesLine2 = (int)(minutes - MinutesLine1*5);
        if (this.MinutesLine2<0) this.MinutesLine2 = this.MinutesLine2*(-1);
    }


    public void parseTime(int hours, int minutes) {
        parseTimeHours(hours);
        parseTimeMinutes(minutes);
    }
}