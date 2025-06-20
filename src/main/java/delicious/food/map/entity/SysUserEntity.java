package delicious.food.map.entity;

import com.baomidou.mybatisplus.annotation.*;

import java.io.Serializable;
import java.util.Date;

import lombok.Data;

/**
 * 系统用户 Entity
 *
 * @author dhbxs
 * @since 2025-05-29 01:42:03
 */
@Data
@TableName("sys_user")
public class SysUserEntity implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * ID
     */
    @TableId(value = "id", type = IdType.ASSIGN_ID)
    private String id;

    /**
     * 昵称
     */
    @TableField("nick_name")
    private String nickName;

    /**
     * 邮箱
     */
    @TableField("email")
    private String email;

    /**
     * 角色ID
     */
    @TableField("role_id")
    private Long roleId;

    /**
     * 密码
     */
    @TableField("password")
    private String password;

    /**
     * 密码盐值
     */
    @TableField("salt")
    private String salt;

    /**
     * JWT Token 签名
     */
    @TableField("sign")
    private String sign;

    /**
     * 是否删除
     */
    @TableField("is_delete")
    private String isDelete;

    /**
     * 创建时间
     */
    @TableField(value = "created_time", fill = FieldFill.INSERT)
    private Date createdTime;

    /**
     * 修改时间
     */
    @TableField(value = "modified_time", fill = FieldFill.INSERT_UPDATE)
    private Date modifiedTime;


}
