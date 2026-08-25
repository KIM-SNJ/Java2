package ai0825;

import java.util.Random;

public class LABRandomWiseSaying {
    public static void main(String[] args) {
        String[] wiseSay = {
                "삶이 있는 한 희망은 있다. – 키케로",
                "산을 옮기는 사람은 작은 돌 하나를 옮기는 것으로 시작한다. – 공자",
                "미래를 예측하는 가장 좋은 방법은 미래를 창조하는 것이다. – 피터 드러커",
                "당신이 할 수 있다고 믿든 할 수 없다고 믿든, 당신이 옳다. – 헨리 포드",
                "어제와 똑같은 삶을 살면서 다른 내일을 기대하는 것은 정신병 초기 증세이다. – 알베르트 아인슈타인",
                "가장 위대한 영광은 한 번도 떨어지지 않는 것이 아니라, 떨어질 때마다 다시 일어서는 것이다. – 넬슨 만델라",
                "행복은 이미 만들어져 있는 것이 아니다. 그것은 당신 자신의 행동에서 나온다. – 달라이 라마",
                "당신이 세상에서 보고 싶은 변화가 되어라. – 마하트마 간디",
                "시계를 보지 마라. 시계가 하는 것처럼 계속 나아가라. – 샘 레빈슨",
                "성공은 열정을 잃지 않고 실패에서 실패로 거듭 나아가는 능력이다. – 윈스턴 처칠"
        };

        Random random = new Random();
        int randomIndex = random.nextInt(wiseSay.length);
        System.out.println("오늘의 명언: " + wiseSay[randomIndex]);
    }
}
