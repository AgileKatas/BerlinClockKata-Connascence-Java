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
      BerlinClock berlinClock = new BerlinClock(new MockCalendar("00:00:00"));

      String time = berlinClock.getTime();

      assertThat(secondsRowFor(time)).isEqualTo(BerlinClock.YELLOW_LAMP);
    }

    @Test
    public void isOffOnOddSeconds() {
      BerlinClock berlinClock = new BerlinClock(new MockCalendar("23:59:59"));

      String time = berlinClock.getTime();

      assertThat(secondsRowFor(time)).isEqualTo("O");
    }

  }

  private static String secondsRowFor(String time) {
    return time.substring(0, 1);
  }

}
