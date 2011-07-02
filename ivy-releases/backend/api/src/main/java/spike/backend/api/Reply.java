package spike.backend.api;

public class Reply {
    private final Request request;

    public Reply(Request request) {
        this.request = request;
    }

    public Request getRequest() {
        return request;
    }
}
