package racingcar;

import camp.nextstep.edu.missionutils.test.NsTest;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import racingcar.racing.Entry;
import racingcar.racing.Lap;
import racingcar.racing.Racing;

import static camp.nextstep.edu.missionutils.test.Assertions.assertRandomNumberInRangeTest;
import static org.assertj.core.api.Assertions.assertThat;

public class RacingTest extends NsTest {
    Racing racing;
    Entry entry =  new Entry(RacingUtils.splitCarName("ray,k3,niro"));
    private static final int LAP_COUNT = 3;

    @BeforeEach
    void setup() {
        racing = new Racing(entry, new Lap(LAP_COUNT));
    }

    @Test
    void 레이싱_경기_진행_검증() {
        assertRandomNumberInRangeTest(
                () -> {
                    racing.start();
                    assertThat(entry.getEntryList().get(0).getLocation().toNumber()).isEqualTo(3);
                    assertThat(entry.getEntryList().get(1).getLocation().toNumber()).isEqualTo(1);
                    assertThat(entry.getEntryList().get(2).getLocation().toNumber()).isEqualTo(2);
                },
                4, 3, 3, 5, 2, 9, 6, 4, 9
        );
    }

    @Override
    public void runMain() {
        Application.main(new String[]{});
    }
}
