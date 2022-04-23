package racingcar;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class RacingUtilsTest {
    @Test
    void 전진_멈춤_기능_검증() {
        assertThat(RacingUtils.isGo(3)).isEqualTo(Move.STOP);
        assertThat(RacingUtils.isGo(4)).isEqualTo(Move.GO);
    }

    @Test
    void 쉼표_기준_차량_이름_분리_기능_검증() {
        String testInput = "k5,bongo,k3";
        assertThat(RacingUtils.splitCarName(testInput ).size()).isEqualTo(3);
        assertThat(RacingUtils.splitCarName(testInput ).get(0).getCarName()).isEqualTo("k5");
    }
}
