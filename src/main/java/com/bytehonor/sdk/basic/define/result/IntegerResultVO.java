package com.bytehonor.sdk.basic.define.result;

/**
 * @author lijianqiang
 *
 */
public class IntegerResultVO {

    private Integer result;

    public IntegerResultVO(Integer result) {
        this.result = result;
    }

    public IntegerResultVO() {
        this(null);
    }

    public Integer getResult() {
        return result;
    }

    public void setResult(Integer result) {
        this.result = result;
    }

}
