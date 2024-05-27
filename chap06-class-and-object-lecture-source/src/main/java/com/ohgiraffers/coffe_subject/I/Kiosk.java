package I;

import java.util.Scanner;

public class Kiosk {


    private Scanner sc = new Scanner(System.in);
//    private String coffeeMenu;
//    private String coffeOption;
//    private int coffeeNumber;

    public void menu() {

        String menu = """
                ===================
                  커피주문 프로그램
                ===================
                1. 아메리카노
                2. 카페라떼
                3. 카페모카
                0. 종료
                ===================
                선택 : """;
    }

    public String setCoffeeMenu() {
        while (true) {
            System.out.println("어느 커피를 선택하시겠습니까?");

            System.out.println("1. 아메리카노 2. 카페라떼 3. 카페모카 4.종료");
            String choice = sc.nextLine();
            switch (choice) {
                case "아메리카노":
                    System.out.println("아메리카노를 선택하셨습니다.");
                    break;
                case "카페라떼":
                    System.out.println("카페라떼를 선택하셨습니다.");
                    break;
                case "카페모카":
                    System.out.println("카페모카를 선택하셨습니다.");
                    break;
                case "종료":
                    return choice;
                default:
                    System.out.println("잘못 입력하셨습니다.");
            }

        }
    }

    private String setCoffeOption(String coffeOption) {
        System.out.println("옵션을 선택해 주세요. ICE/HOT");
        String input = sc.nextLine();
        String result = "";
        if (input.equals("HOT")) {
            System.out.println("HOT을 선택하셨습니다.");
        } else if (input.equals("ICE")) {
            System.out.println("ICE를 선택하셨습니다.");
        } else {
            System.out.println("잘못 입력하셨습니다. 옵션 선택으로 돌아갑니다.");
        }
        return input;
    }

    private int setCoffeeNumber () {
        System.out.println("수량을 정해주세요.");
        return sc.nextInt();
    }
}