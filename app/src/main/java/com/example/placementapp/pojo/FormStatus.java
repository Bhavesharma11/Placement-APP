package com.example.placementapp.pojo;

public class FormStatus {
    public String processRound;
    public String processStatus;
    public String processDate;

    public String getProcessRound() {
        return processRound;
    }

    public void setProcessRound(String processRound) {
        this.processRound = processRound;
    }

    public String getProcessStatus() {
        return processStatus;
    }

    public void setProcessStatus(String processStatus) {
        this.processStatus = processStatus;
    }

    public String getProcessDate() {
        return processDate;
    }

    public void setProcessDate(String processDate) {
        this.processDate = processDate;
    }

    public FormStatus() {
    }

    public FormStatus(String processRound, String processStatus, String processDate) {
        this.processRound = processRound;
        this.processStatus = processStatus;
        this.processDate = processDate;
    }
}
