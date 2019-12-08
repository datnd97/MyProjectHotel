package com.security.demospringsecurity.message.request;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.util.Date;

public class ProfileForm {
    private Long id;
    @NotBlank
    @Size(min= 3,max = 50)
    private String sex;

    @NotBlank
    private Date birthday;

    public ProfileForm(Long id, @NotBlank @Size(min = 3, max = 50) String sex, @NotBlank Date birthday) {
        this.id = id;
        this.sex = sex;
        this.birthday = birthday;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public ProfileForm() {
    }
}
