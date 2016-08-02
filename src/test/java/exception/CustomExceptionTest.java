package exception;

import org.apache.log4j.Logger;
import org.junit.Test;

/**
 * 自定义异常测试类
 *
 * @author WU.Tao
 * @create 2016-08-02 0:56
 */

public class CustomExceptionTest {
    private Logger logger = Logger.getLogger(CustomExceptionTest.class);
    @Test
    public void testCustomException(){

        try {
            throw new CustomException("9999","异常测试");
        }catch (CustomException e){
            logger.error("错误码："+e.getReturnCode()+"&错误信息："+e.getReturnMsg());
        }
    }
}
