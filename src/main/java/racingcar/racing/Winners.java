package racingcar.racing;

import racingcar.car.Car;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.TreeMap;

public class Winners {
    private final List<String> winners;
    private static final String DELIMITER = ",";
    private static final String JOIN_DELIMITER = ", ";


    public Winners(Entry entry) {
        this.winners = decisionWinner(entry);
    }

    private List<String> decisionWinner(Entry entry) {
        TreeMap<Integer, String> resultMap = new TreeMap<>(Comparator.reverseOrder());
        for (Car car : entry.getEntryList()) {
            classifyRacingResult(car, resultMap);
        }
        return Arrays.asList(resultMap.firstEntry().getValue().split(DELIMITER));
    }

    private void classifyRacingResult(Car car, TreeMap<Integer, String> resultMap) {
        if (resultMap.containsKey(car.getPosition().toNumber())) {
            resultMap.put(car.getPosition().toNumber(),
                    String.join(DELIMITER, resultMap.get(car.getPosition().toNumber()), car.getName().toText()));
        } else if (!resultMap.containsKey(car.getPosition().toNumber())) {
            resultMap.put(car.getPosition().toNumber(), car.getName().toText());
        }
    }

    public String toText() {
        return String.join(JOIN_DELIMITER, winners);
    }

    public List<String> getWinners() {
        return winners;
    }
}
