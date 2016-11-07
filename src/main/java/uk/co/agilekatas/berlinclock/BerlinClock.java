package uk.co.agilekatas.berlinclock;

import java.util.Calendar;

public class BerlinClock {

  private final Calendar calendar;

  public BerlinClock(Calendar calendar) {
    this.calendar = calendar;
    System.out.println(calendar.getTime());
  }

  public String getTime() {
    return null;
  }
}
