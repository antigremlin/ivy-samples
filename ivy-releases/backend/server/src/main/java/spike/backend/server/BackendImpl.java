package spike.backend.server;

import spike.backend.api.Backend;
import spike.backend.api.Reply;
import spike.backend.api.Request;

public class BackendImpl implements Backend {
    public Reply process(Request request) {
        return new Reply(request);
    }
}
