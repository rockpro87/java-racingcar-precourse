package racingcar;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class RacingUtilsTest {
    @Test
    void 전진_멈춤_기능_검증() {
        assertThat(RacingUtils.isGo(3)).isEqualTo(Move.STOP);
        assertThat(RacingUtils.isGo(4)).isEqualTo(Move.GO);
    }
}
