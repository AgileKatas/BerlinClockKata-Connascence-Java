package uk.co.agilekatas.berlinclock;

import java.util.Calendar;

public class BerlinClock {

  public static final String YELLOW_LAMP = "Y";

  private final Calendar calendar;

  public BerlinClock(Calendar calendar) {
    this.calendar = calendar;
  }

  public String getTime() {
    if (calendar.get(Calendar.SECOND) == 59) {
      return "O";
    }
    return YELLOW_LAMP;
  }
}
