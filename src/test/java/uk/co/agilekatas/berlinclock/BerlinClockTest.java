package uk.co.agilekatas.berlinclock;

import org.junit.Test;
import org.junit.experimental.runners.Enclosed;
import org.junit.runner.RunWith;

import uk.co.agilekatas.berlinclock.test.MockCalendar;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(Enclosed.class)
public class BerlinClockTest {

  public static class SecondsRow {

    @Test
    public void isYellowOnEvenSeconds() {
      BerlinClock berlinClock = createBerlinClockSetToTime("00:00:00");

      String time = berlinClock.getTime();

      assertThat(secondsRowFor(time)).isEqualTo(BerlinClock.YELLOW_LAMP);
    }

    @Test
    public void isOffOnOddSeconds() {
      BerlinClock berlinClock = createBerlinClockSetToTime("23:59:59");

      String time = berlinClock.getTime();

      assertThat(secondsRowFor(time)).isEqualTo(BerlinClock.OFF_LAMP);
    }

  }

  public static class FiveHoursRow {

    @Test
    public void hasNoRedLampsForHoursUnderFive() {
      BerlinClock berlinClock = createBerlinClockSetToTime("00:00:00");

      String time = berlinClock.getTime();

      assertThat(fiveHoursRowFor(time)).isEqualTo(offLamps(4));
    }

    @Test
    public void hasOneRedLampForHoursBetweenFiveAndTen() {
      BerlinClock berlinClock = createBerlinClockSetToTime("05:00:00");

      String time = berlinClock.getTime();

      assertThat(fiveHoursRowFor(time)).isEqualTo(redLamps(1) + offLamps(3));
    }

    @Test
    public void hasTwoRedLampsForHoursBetweenTenAndFifteen() {
      BerlinClock berlinClock = createBerlinClockSetToTime("10:00:00");

      String time = berlinClock.getTime();

      assertThat(fiveHoursRowFor(time)).isEqualTo(redLamps(2) + offLamps(2));
    }

    @Test
    public void hasThreeRedLampsForHoursBetweenFifteenAndTwenty() {
      BerlinClock berlinClock = createBerlinClockSetToTime("15:00:00");

      String time = berlinClock.getTime();

      assertThat(fiveHoursRowFor(time)).isEqualTo(redLamps(3) + offLamps(1));
    }

    @Test
    public void hasFourRedLampsForHoursBetweenTwentyAndTwentyFour() {
      BerlinClock berlinClock = createBerlinClockSetToTime("20:00:00");

      String time = berlinClock.getTime();

      assertThat(fiveHoursRowFor(time)).isEqualTo(redLamps(4));
    }

  }

  private static BerlinClock createBerlinClockSetToTime(String time) {
    return new BerlinClock(new MockCalendar(time));
  }

  private static String secondsRowFor(String time) {
    return time.substring(0, 1);
  }

  private static String fiveHoursRowFor(String time) {
    return time.substring(1, 5);
  }

  private static String offLamps(int number) {
    String row = "";
    for (int i = 0; i < number; i++) {
      row += BerlinClock.OFF_LAMP;
    }
    return row;
  }

  private static String redLamps(int number) {
    String row = "";
    for (int i = 0; i < number; i++) {
      row += BerlinClock.RED_LAMP;
    }
    return row;
  }

}
