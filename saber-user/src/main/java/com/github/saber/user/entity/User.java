package com.github.saber.user.entity;

import com.baomidou.mybatisplus.enums.IdType;
import java.math.BigDecimal;
import java.util.Date;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.activerecord.Model;
import java.io.Serializable;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.ser.std.ToStringSerializer;

/**
 * <p>
 * 用户信息表，保存用户信息。
 * </p>
 *
 * @author jianb.jiang
 * @since 2018-08-07
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class User extends Model<User> {

    private static final long serialVersionUID = 1L;

    /**
     * 主键ID
     */
    @TableId(value = "id", type = IdType.AUTO)
    @JsonSerialize(using=ToStringSerializer.class)
    private Long id;
    /**
     * 登录名
     */
    private String username;
    /**
     * 昵称
     */
    private String nickname;
    /**
     * 实名
     */
    private String realname;
    /**
     * 密码
     */
    private String password;
    /**
     * 盐
     */
    private String salt;
    /**
     * 邮件
     */
    private String email;
    /**
     * 邮箱状态（是否认证等）
     */
    private String emailStatus;
    /**
     * 手机电话
     */
    private String mobile;
    /**
     * 手机状态（是否认证等）
     */
    private String mobileStatus;
    /**
     * 固定电话
     */
    private String telephone;
    /**
     * 金额（余额）
     */
    private BigDecimal amount;
    /**
     * 性别
     */
    private String gender;
    /**
     * 权限
     */
    private String role;
    /**
     * 签名
     */
    private String signature;
    /**
     * 内容数量
     */
    private Integer contentCount;
    /**
     * 评论数量
     */
    private Integer commentCount;
    /**
     * QQ号码
     */
    private String qq;
    /**
     * 微信号
     */
    private String wechat;
    /**
     * 微博
     */
    private String weibo;
    private String facebook;
    private String linkedin;
    /**
     * 生日
     */
    private Date birthday;
    /**
     * 公司
     */
    private String company;
    /**
     * 职位、职业
     */
    private String occupation;
    /**
     * 地址
     */
    private String address;
    /**
     * 邮政编码
     */
    private String zipcode;
    /**
     * 个人网址
     */
    private String site;
    /**
     * 毕业学校
     */
    private String graduateschool;
    /**
     * 学历
     */
    private String education;
    /**
     * 头像
     */
    private String avatar;
    /**
     * 证件类型：身份证 护照 军官证等
     */
    private String idcardtype;
    /**
     * 证件号码
     */
    private String idcard;
    /**
     * 状态
     */
    private String status;
    /**
     * 标识
     */
    private String flag;
    /**
     * 创建日期
     */
    private Date created;
    /**
     * 用户来源（可能来之oauth第三方）
     */
    private String createSource;
    /**
     * 最后的登录时间
     */
    private Date logged;
    /**
     * 激活时间
     */
    private Date activated;
    /**
     * 第三方用户id
     */
    private String openid;
    /**
     * 父用户id
     */
    private Long pid;
    /**
     * 直推人数（直接子节点数）
     */
    private Integer childNum;
    /**
     * 团队人数总计（直接子节点数+间接子节点数，目前层级3级）
     */
    private Integer teamNum;
    /**
     * 团队消费金额总计
     */
    private BigDecimal teamBuyAmount;
    /**
     * 代理商级别
     */
    private Long agentsLevel;


    @Override
    protected Serializable pkVal() {
        return this.id;
    }

}
