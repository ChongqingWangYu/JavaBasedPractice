package test;

import java.util.Objects;

/**
 * @ClassName Customer
 * @Description 客户实体类
 * @Author ChongqingWangYu
 * @DateTime 2019/6/17 8:39
 * @GitHub https://github.com/ChongqingWangYu
 */
public class Customer {

    private Integer cusId;
    private String cusNo;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Customer customer = (Customer) o;
        return Objects.equals(cusId, customer.cusId) &&
                Objects.equals(cusNo, customer.cusNo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cusId, cusNo);
    }

    public Integer getCusId() {
        return cusId;
    }

    public void setCusId(Integer cusId) {
        this.cusId = cusId;
    }

    public String getCusNo() {
        return cusNo;
    }

    public void setCusNo(String cusNo) {
        this.cusNo = cusNo;
    }
}
