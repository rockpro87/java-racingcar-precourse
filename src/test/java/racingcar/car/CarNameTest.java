package racingcar.car;

import org.junit.jupiter.api.Test;
import racingcar.Config;

import static org.assertj.core.api.Assertions.assertThatThrownBy;

public class CarNameTest {

    @Test
    void 자동차_이름_길이를_벗어날_경우() {
        assertThatThrownBy(() -> new CarName("123456"))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessageContaining(String.format(Config.ERROR_CAR_NAME_LENGTH, Config.CAR_NAME_MAX_LENGTH));
    }

    @Test
    void 자동차_이름이_빈값일_경우() {
        assertThatThrownBy(() -> new CarName(""))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessageContaining(Config.ERROR_CAR_NAME_EMPTY);
    }
}
