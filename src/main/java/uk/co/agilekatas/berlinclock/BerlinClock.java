package uk.co.agilekatas.berlinclock;

import java.util.Calendar;

public class BerlinClock {

  public static final String OFF_LAMP = "O";
  public static final String YELLOW_LAMP = "Y";

  private final Calendar calendar;

  public BerlinClock(Calendar calendar) {
    this.calendar = calendar;
  }

  public String getTime() {
    String clock = "";
    if (calendar.get(Calendar.SECOND) % 2 == 0) {
      clock += YELLOW_LAMP;
    }
    clock += OFF_LAMP;
    return clock + getFiveHourRow();
  }

  private String getFiveHourRow() {
    return OFF_LAMP + OFF_LAMP + OFF_LAMP + OFF_LAMP;
  }
}
