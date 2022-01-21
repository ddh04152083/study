package com.ddh.swagger.bean;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;
import java.io.Serializable;
import java.util.Date;


@Entity
public class UserBean implements Serializable {
    private static final long serialVersionUID = 2L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @NotEmpty(message = "用户名不能为空")
    @Size(max = 20)
    @Column(nullable = false, length = 20) // 映射为字段，值不能为空
    private String userName;
    @NotEmpty(message = "密码不能为空")
    @Size(max = 100)
    @Column(nullable = false, length = 100) // 映射为字段，值不能为空
    private String password;
    @Size(max = 20)
    @Column(nullable = false, length = 20)
    private String nick;

    private Date createDate;

    private Date updateDate;
    @NotEmpty(message = "添加不能为空")
    @Size(max = 40)
    @Column(nullable = false, length = 40) // 映射为字段，值不能为空
    private String addUserName;
    @Size(max = 40)
    @Column(nullable = false, length = 40) // 映射为字段，值不能为空
    private String updateUserName;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getNick() {
        return nick;
    }

    public void setNick(String nick) {
        this.nick = nick;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public Date getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }

    public String getAddUserName() {
        return addUserName;
    }

    public void setAddUserName(String addUserName) {
        this.addUserName = addUserName;
    }

    public String getUpdateUserName() {
        return updateUserName;
    }

    public void setUpdateUserName(String updateUserName) {
        this.updateUserName = updateUserName;
    }
}
