package 스터디1_2장;

public class 령빈 implements 커피구매자
{
    기분제어자 기분제어자;

    int 얼탱이;
    int 구매가능최소치;
    
    @Override
    public boolean 커피사주세요() {

        // 얼탱이가 증가한다.
        this.얼탱이증가(얼탱이증가수치);

        return 커피를사줄수있는지판단한다(this.얼탱이, this.구매가능최소치);
    }

    @Override
    public boolean 커피를사줄수있는지판단한다(int 얼탱이, int 구매가능최소치){
        if(얼탱이 < 구매가능최소치){
            return true;
        }

        return false;
    }
    
    public void 얼탱이증가(int 얼탱이증가수치) {
        this.얼탱이 += 얼탱이증가수치;
    }

    public void 얼탱이초기화(){
        this.얼탱이 = 0;
    }

    public void 얼탱이수치를판단한다(){
        기분제어자.현재기분을판단한다()
    }
}