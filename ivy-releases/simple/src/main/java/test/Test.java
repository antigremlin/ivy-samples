package test;

import org.apache.commons.lang.math.NumberUtils;

public class Test {

    public long dup(long arg) {
        return NumberUtils.max(arg, arg*2, arg*3);
    }

}
