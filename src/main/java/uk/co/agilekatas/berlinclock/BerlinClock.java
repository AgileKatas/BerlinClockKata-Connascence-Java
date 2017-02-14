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
    int hour = calendar.get(Calendar.HOUR_OF_DAY);
    for (int i = 0; i < 4; i++) {
      if (hour > 4) {
        row += RED_LAMP;
        hour -= 5;
      } else {
        row += OFF_LAMP;
      }
    }
    return row;
  }
}
