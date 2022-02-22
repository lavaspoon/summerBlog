package hello.summerBlog.app.v1;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

@Repository //컴포넌트 스캔의 대상이 됨
@RequiredArgsConstructor
public class OrderRepositoryV1 {
    public void save(String itemId){
        //저장 로직
        if(itemId.equals("ex")){
            throw new IllegalStateException("예외발생");
        }
        sleep(1000);
    }

    private void sleep(int millis) {
        try{
            Thread.sleep(millis);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
