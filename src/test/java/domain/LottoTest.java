package domain;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import static org.assertj.core.api.Assertions.assertThat;

public class LottoTest {
    private Lotto lotto = Lotto.of(Arrays.stream(new int[]{1, 2, 3, 4, 5, 6})
            .boxed()
            .collect(Collectors.toList()));

    @Test
    void checkWhetherToWinTest() {
        List<Integer> winningNumbers = Arrays.stream(new int[]{1, 2, 3, 4, 5, 6})
                .boxed()
                .collect(Collectors.toList());

        assertThat(lotto.checkWhetherToWin(winningNumbers)).isEqualTo(LottoPrize.FIRST_PRIZE);
    }
}
