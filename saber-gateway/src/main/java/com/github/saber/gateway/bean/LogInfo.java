package com.github.saber.gateway.bean;

import java.io.Serializable;
import java.util.Date;

import lombok.Data;

/**
 * <b>Description:</b>
 * <br><b>ClassName:</b> LogInfo
 * <br><b>Date:</b> 2018年7月12日 下午6:29:34
 * <br>@author <b>jianb.jiang</b>
 */
@Data
public class LogInfo implements Serializable {
    
    private static final long serialVersionUID = -8570114589073152035L;

    private String menu;

    private String opt;

    private String uri;


    private Date crtTime;

    private String crtUser;

    private String crtName;

    private String crtHost;

}
