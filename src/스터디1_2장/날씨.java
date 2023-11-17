package 스터디1_2장;

public class 날씨 {
    private String[] 날씨종류 = new String[]{"맑음", "흐림", "비", "눈"};
    private String 오늘의날씨;

    public 날씨(String 오늘의날씨) {
        this.오늘의날씨 = 오늘의날씨;
    }

    public String[] 날씨종류를반환한다(){
        return this.날씨종류;
    }
}
