package interview.solid;

import java.math.BigDecimal;
import java.util.Objects;

public class Ford implements Car {

    public BigDecimal price;
    public String type;
    @Override
    public BigDecimal price() {
        return BigDecimal.valueOf(100000L);
    }

    public boolean equals(Object f){
        if(this == f) return true;
        if(f == null) return false;
        if(!(f instanceof Ford ford)) return false;
        return Objects.equals(this, f);
    }

    public int hashCode(){
        return Objects.hash(price, type);
    }

}
