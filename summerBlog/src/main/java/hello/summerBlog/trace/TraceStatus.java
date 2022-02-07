package hello.summerBlog.trace;

//로그의 상태정보를 나타내는 클래스
public class TraceStatus {
    private TraceId traceId;
    private Long StartTimeMs;
    private String Message;

    public TraceStatus(TraceId traceId, Long startTimeMs, String message) {
        this.traceId = traceId;
        StartTimeMs = startTimeMs;
        Message = message;
    }

    public TraceId getTraceId() {
        return traceId;
    }

    public Long getStartTimeMs() {
        return StartTimeMs;
    }

    public String getMessage() {
        return Message;
    }
}
