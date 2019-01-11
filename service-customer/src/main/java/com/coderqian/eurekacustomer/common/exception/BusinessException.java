package com.coderqian.eurekacustomer.common.exception;

import com.coderqian.eurekacustomer.common.BaseResult;
import com.coderqian.eurekacustomer.common.constant.Code;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

/**
 * @author qianliqing
 * @date 2018-09-28 下午9:09
 * mail: qianlq0824@gmail.com
 * <p>
 * 业务异常类
 */

@NoArgsConstructor
@AllArgsConstructor
public final class BusinessException extends BaseException {

    public BusinessException(Code code) {
        super(code.getCode(), code.getMsg());
    }

    public BusinessException(int codeInt, String errorMsg) {
        super(codeInt, errorMsg);
    }

    public BusinessException(BaseResult baseResult) {
        super();
        this.setBaseResult(baseResult);
    }
}
