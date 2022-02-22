package hello.summerBlog.app.v1;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController //@Controller + @ResponseBody
@RequiredArgsConstructor
public class OrderControllerV1 {

    private final OrderServiceV1 orderService; //의존관계 주입

    @GetMapping("/v1/request")
    public String request(String itemId){
        orderService.orderItem(itemId);
        return "ok";
    }
}
