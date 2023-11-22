package 스터디1_2장;

public class 수면관리자 {
    int 수면시간;
    int 수면만족도;

    public int 수면만족도를조회한다() {
        this.수면시간을저장한다();

        if(this.수면시간 >= 7) {
            수면만족도 = 5;
        } else if(this.수면시간 >= 5) {
            수면만족도 = 3;
        } else {
            수면만족도 = 1;
        }

        return 수면만족도;
    }

    public void 수면시간을저장한다() {
        // 4 ~ 8 사이의 랜덤한 수를 반환한다.
        this.수면시간 = (int)(Math.random() * 3) + 4;
    }
}
