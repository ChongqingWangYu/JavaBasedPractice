package BusyBankStaff;

/**
 * @ClassName BusyBankStaff
 * @Description 某银行业务柜员类
 * @Author ChongqingWangYu
 * @DateTime 2019/9/18 9:05
 * @GitHub https://github.com/ChongqingWangYu
 */
class BusyBankStaff implements IBankStaff {

    @Override
    public boolean deposit(int sum, String id) {
        //进行存款，如出现异常则返回false
        return true;
    }

    @Override
    public boolean drawMoney(int sum, String id) {
        //进行取款，如出现异常则返回false
        return true;
    }

    @Override
    public boolean transfer(int sum, String Transfer, String target) {
        //开启事务，进行转账，如出现异常则回滚事务，并返回false
        return true;
    }
}
