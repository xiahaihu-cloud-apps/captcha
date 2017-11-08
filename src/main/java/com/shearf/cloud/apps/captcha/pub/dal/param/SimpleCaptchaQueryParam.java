package com.shearf.cloud.apps.captcha.pub.dal.param;

import com.shearf.cloud.apps.commons.foundation.base.IParam;
import lombok.Data;

import java.util.Date;

/**
 * @author xiahaihu2009@gmail.com
 */
@Data
public class SimpleCaptchaQueryParam implements IParam {

    private static final long serialVersionUID = 4476936019381525958L;
    /**
     * 查询开始时间
     */
    private Date startTime;

    /**
     * 查询结束时间
     */
    private Date endTime;
}
