package spike.client;

import spike.compute.Task;

import java.math.BigDecimal;

public class Pi implements Task<BigDecimal> {

    public Pi(int precision) {

    }

    public BigDecimal execute() {
        return BigDecimal.valueOf(Math.PI);
    }
}
