package hello.summerBlog.app.V2;

import hello.summerBlog.trace.hellotrace.HelloTraceV2;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController //@Controller + @ResponseBody
@RequiredArgsConstructor
public class OrderControllerV2 {

    private final OrderServiceV2 orderService; //의존관계 주입
    private final HelloTraceV2 trace;

    @GetMapping("/v2/request")
    public String request(String itemId){
        orderService.orderItem(itemId);
        return "ok";
    }
}
