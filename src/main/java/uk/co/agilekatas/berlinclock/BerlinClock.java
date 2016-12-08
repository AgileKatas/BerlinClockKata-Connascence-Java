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
    return getSecondsRow() + getFiveHourRow();
  }

  private String getSecondsRow() {
    if (calendar.get(Calendar.SECOND) % 2 == 0) {
      return YELLOW_LAMP;
    }
    return OFF_LAMP;
  }

  private String getFiveHourRow() {
    return OFF_LAMP + OFF_LAMP + OFF_LAMP + OFF_LAMP;
  }
}
