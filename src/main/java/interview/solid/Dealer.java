package interview.solid;

import lombok.Data;

import java.math.BigDecimal;
import java.util.Objects;

public class Dealer{

    Car car;
    public Dealer(Car car){
    }

    public BigDecimal getPrice(){
        return car.price();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Dealer dealer)) return false;
        return Objects.equals(car, dealer.car);
    }

    @Override
    public int hashCode() {
        return Objects.hash(car);
    }
}
