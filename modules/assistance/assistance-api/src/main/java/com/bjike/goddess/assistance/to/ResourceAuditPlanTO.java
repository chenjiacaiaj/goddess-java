package com.bjike.goddess.assistance.to;

import com.bjike.goddess.common.api.to.BaseTO;
import org.hibernate.validator.constraints.NotBlank;

/**
 * 补助方案
 *
 * @Author: [ tanghaixiang ]
 * @Date: [ 2017-04-13 09:27 ]
 * @Description: [ 补助方案 ]
 * @Version: [ v1.0.0 ]
 * @Copy: [ com.bjike ]
 */
public class ResourceAuditPlanTO extends BaseTO {

    public interface testAudit{}

    /**
     * 综合资源部福利模块意见
     */
    @NotBlank(groups = {ResourceAuditPlanTO.testAudit.class} , message = "综合资源部福利模块意见不能为空")
    private String warefaleAdvice;

    public String getWarefaleAdvice() {
        return warefaleAdvice;
    }

    public void setWarefaleAdvice(String warefaleAdvice) {
        this.warefaleAdvice = warefaleAdvice;
    }
}