package hello.summerBlog.app.V2;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service //컴포넌트 스캔의 대상이 됨
@RequiredArgsConstructor
public class OrderServiceV2 {

    private final OrderRepositoryV2 orderRepository; //의존관계 주입

    public void orderItem(String itemId){
        orderRepository.save(itemId);
    }
}
