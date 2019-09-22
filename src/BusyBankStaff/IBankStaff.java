package BusyBankStaff;

public interface IBankStaff {
    /**
     * 存款
     */
    boolean deposit(int sum, String id);

    /**
     * 取款
     */
    boolean drawMoney(int sum, String id);

    /**
     * 转账
     */
    boolean transfer(int sum, String Transfer, String target);

}
