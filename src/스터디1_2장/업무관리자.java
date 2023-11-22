package 스터디1_2장;

public class 업무관리자 {
    private int 업무량;
    public int 해야할업무량을수치화한다() {
        // 0 ~ 3 사이의 랜덤한 수를 반환한다.
        this.업무량 = (int)(Math.random() * 3);

        return this.업무량;
    }
}
