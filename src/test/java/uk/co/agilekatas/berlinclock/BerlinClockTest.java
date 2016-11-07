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

      assertThat(secondsRow(time)).isEqualTo(BerlinClock.YELLOW_LAMP);
    }

  }

  private static String secondsRow(String time) {
    return time.substring(0, 1);
  }

}
