package uk.co.agilekatas.berlinclock.test;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class MockCalendar extends GregorianCalendar {

  private Calendar calendar;

  public MockCalendar(String time) {
    String[] split = time.split(":");
    calendar = Calendar.getInstance();
    calendar.set(0, Calendar.JANUARY, 0, Integer.valueOf(split[0]), Integer.valueOf(split[1]), Integer.valueOf(split[2]));
  }

  @Override
  public int get(int field) {
    return calendar.get(field);
  }

  @Override
  public long getTimeInMillis() {
    return calendar.getTimeInMillis();
  }
}
