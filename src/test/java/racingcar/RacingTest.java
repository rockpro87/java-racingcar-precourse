package racingcar;

import camp.nextstep.edu.missionutils.test.NsTest;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import racingcar.racing.Entry;
import racingcar.racing.Lap;
import racingcar.racing.LapResults;
import racingcar.racing.Racing;

import static camp.nextstep.edu.missionutils.test.Assertions.assertRandomNumberInRangeTest;
import static org.assertj.core.api.Assertions.assertThat;

public class RacingTest extends NsTest {
    Racing racing;
    Lap lap;
    LapResults lapResults;
    Entry entry =  new Entry(RacingUtils.splitCarName("ray,k3,niro"));
    private static final int LAP_COUNT = 3;

    @BeforeEach
    void setup() {
        racing = new Racing(entry);
        lap = new Lap(LAP_COUNT);
    }

    @Test
    void 레이싱_경기_진행_검증() {
        assertRandomNumberInRangeTest(
                () -> {
                    racing.lapResult();
                    racing.lapResult();
                    racing.lapResult();
                    assertThat(entry.getEntryList().get(0).getLocation().toNumber()).isEqualTo(3);
                    assertThat(entry.getEntryList().get(1).getLocation().toNumber()).isEqualTo(1);
                    assertThat(entry.getEntryList().get(2).getLocation().toNumber()).isEqualTo(2);
                },
                4, 3, 3, 5, 2, 9, 6, 4, 9
        );
    }

    @Test
    void 레이싱_경기_LAP별_텍스트_확인() {
        assertRandomNumberInRangeTest(
                () -> {
                    lapResults = racing.lapResult();
                    assertThat(lapResults.getLapResult().get("ray")).isEqualTo("-");
                    assertThat(lapResults.getLapResult().get("k3")).isEqualTo("");
                    lapResults = racing.lapResult();
                    assertThat(lapResults.getLapResult().get("ray")).isEqualTo("--");
                    assertThat(lapResults.getLapResult().get("k3")).isEqualTo("-");
                },
                4, 3, 3, 5, 9, 3
        );
    }

    @Override
    public void runMain() {
        Application.main(new String[]{});
    }
}
