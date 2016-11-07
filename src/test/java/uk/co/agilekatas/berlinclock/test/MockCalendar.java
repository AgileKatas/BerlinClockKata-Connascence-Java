package uk.co.agilekatas.berlinclock.test;

import java.util.Calendar;

public class MockCalendar extends Calendar {

  private Calendar calendar;

  public MockCalendar(String time) {
    String[] split = time.split(":");
    calendar = Calendar.getInstance();
    calendar.set(0, Calendar.JANUARY, 0, Integer.valueOf(split[0]), Integer.valueOf(split[1]), Integer.valueOf(split[2]));
  }

  @Override
  protected void computeTime() {

  }

  @Override
  protected void computeFields() {

  }

  @Override
  public void add(int field, int amount) {

  }

  @Override
  public void roll(int field, boolean up) {

  }

  @Override
  public int getMinimum(int field) {
    return 0;
  }

  @Override
  public int getMaximum(int field) {
    return 0;
  }

  @Override
  public int getGreatestMinimum(int field) {
    return 0;
  }

  @Override
  public int getLeastMaximum(int field) {
    return 0;
  }

  @Override
  public long getTimeInMillis() {
    return calendar.getTimeInMillis();
  }
}
