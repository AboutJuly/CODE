package exception;

/**
 * 自定义异常类
 *
 * @author WU.Tao
 * @create 2016-08-01 22:46
 */

public class CustomException extends Exception{
    private String returnCode;
    private String returnMsg;

    public CustomException(String returnCode, String returnMsg){
        super();
        this.returnCode=returnCode;
        this.returnMsg=returnMsg;
    }

    public String getReturnCode() {
        return returnCode;
    }

    public void setReturnCode(String returnCode) {
        this.returnCode = returnCode;
    }

    public String getReturnMsg() {
        return returnMsg;
    }

    public void setReturnMsg(String returnMsg) {
        this.returnMsg = returnMsg;
    }
}
