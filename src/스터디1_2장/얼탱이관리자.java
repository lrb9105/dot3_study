package 스터디1_2장;

public class 얼탱이관리자 {
    int 얼탱이;

    public int 얼탱이수치를반환한다() {
        // 0 ~ 5 사이의 랜덤한 수를 반환한다.
        this.얼탱이 = (int)(Math.random() * 5);

        return this.얼탱이;
    }
}
