package spike.backend.api;

/**
 * Created by IntelliJ IDEA.
 * User: taranov
 * Date: 30/06/2011
 * Time: 22:47
 * To change this template use File | Settings | File Templates.
 */
public interface Backend {
    Reply process(Request request);
}
