package uk.co.agilekatas.berlinclock;

import java.util.Calendar;

public class BerlinClock {

  public static final String YELLOW_LAMP = "Y";

  private final Calendar calendar;

  public BerlinClock(Calendar calendar) {
    this.calendar = calendar;
  }

  public String getTime() {
    return YELLOW_LAMP;
  }
}
