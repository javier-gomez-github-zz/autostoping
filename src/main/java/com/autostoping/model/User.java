package com.autostoping.model;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "USERS")
public class User {
    private int user_id;
    private String email;
    private String username;
    private String displayname;
    private String password;
    private int view_count;
    private int level_id;
    private Boolean enabled = true;
    private Boolean verified = false;
    private Boolean approved = true;

    @Id
    @Column(name = "USER_ID")
    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getDisplayname() {
        return displayname;
    }

    public void setDisplayname(String displayname) {
        this.displayname = displayname;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getView_count() {
        return view_count;
    }

    public void setView_count(int view_count) {
        this.view_count = view_count;
    }

    public int getLevel_id() {
        return level_id;
    }

    public void setLevel_id(int level_id) {
        this.level_id = level_id;
    }

    public Boolean getEnabled() {
        return enabled;
    }

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    public Boolean getVerified() {
        return verified;
    }

    public void setVerified(Boolean verified) {
        this.verified = verified;
    }

    public Boolean getApproved() {
        return approved;
    }

    public void setApproved(Boolean approved) {
        this.approved = approved;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (obj.getClass() != getClass()) {
            return false;
        }
        User rhs = (User) obj;
        return new EqualsBuilder()
                .append(this.user_id, rhs.user_id)
                .append(this.email, rhs.email)
                .append(this.username, rhs.username)
                .append(this.displayname, rhs.displayname)
                .append(this.password, rhs.password)
                .append(this.view_count, rhs.view_count)
                .append(this.level_id, rhs.level_id)
                .append(this.enabled, rhs.enabled)
                .append(this.verified, rhs.verified)
                .append(this.approved, rhs.approved)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder()
                .append(user_id)
                .append(email)
                .append(username)
                .append(displayname)
                .append(password)
                .append(view_count)
                .append(level_id)
                .append(enabled)
                .append(verified)
                .append(approved)
                .toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this)
                .append("user_id", user_id)
                .append("email", email)
                .append("username", username)
                .append("displayname", displayname)
                .append("password", password)
                .append("view_count", view_count)
                .append("level_id", level_id)
                .append("enabled", enabled)
                .append("verified", verified)
                .append("approved", approved)
                .toString();
    }
}
