package View;

import camp.nextstep.edu.missionutils.Console;

import java.util.ArrayList;
import java.util.List;

public class InputView {

    public static int inputPurchaseAmount() {
        System.out.println("구입금액을 입력해 주세요.");
        return Integer.parseInt(Console.readLine());
    }

    public static List<Integer> inputWinningNumbers() {
        System.out.println("당첨 번호를 입력해 주세요:");
        String[] inputs = Console.readLine().split(",");
        List<Integer> winningNumbers = new ArrayList<>();
        for (String input : inputs) {
            winningNumbers.add(Integer.parseInt(input.trim()));
        }
        return winningNumbers;
    }

    public static int inputBonusNumber() {
        System.out.println("보너스 번호를 입력해 주세요:");
        return Integer.parseInt(Console.readLine().trim());
    }
}