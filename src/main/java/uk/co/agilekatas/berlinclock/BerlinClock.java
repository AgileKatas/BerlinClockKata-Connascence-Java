package uk.co.agilekatas.berlinclock;

import java.util.Calendar;

public class BerlinClock {

  public static final String OFF_LAMP = "O";
  public static final String YELLOW_LAMP = "Y";
  public static final String RED_LAMP = "R";

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
    String row = "";
    if (calendar.get(Calendar.HOUR_OF_DAY) > 9) {
      row += RED_LAMP;
    }
    if (calendar.get(Calendar.HOUR_OF_DAY) > 4) {
      row += RED_LAMP;
    } else {
      row += OFF_LAMP;
    }
    return row + OFF_LAMP + OFF_LAMP + OFF_LAMP;
  }
}
