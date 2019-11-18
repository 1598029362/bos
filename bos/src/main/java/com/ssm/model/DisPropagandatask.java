package com.ssm.model;

import java.util.Date;

public class DisPropagandatask {
    private Short id;

    private String outline;

    private Date releasetime;

    private Date failuretime;

    private Short status;

    private String content;

    public Short getId() {
        return id;
    }

    public void setId(Short id) {
        this.id = id;
    }

    public String getOutline() {
        return outline;
    }

    public void setOutline(String outline) {
        this.outline = outline == null ? null : outline.trim();
    }

    public Date getReleasetime() {
        return releasetime;
    }

    public void setReleasetime(Date releasetime) {
        this.releasetime = releasetime;
    }

    public Date getFailuretime() {
        return failuretime;
    }

    public void setFailuretime(Date failuretime) {
        this.failuretime = failuretime;
    }

    public Short getStatus() {
        return status;
    }

    public void setStatus(Short status) {
        this.status = status;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }
}