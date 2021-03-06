package com.example.placementapp.pojo;

import java.util.Objects;

public class FormStatus {
    public String processRound;
    public String processDate;

    public String getProcessRound() {
        return processRound;
    }

    public void setProcessRound(String processRound) {
        this.processRound = processRound;
    }


    public String getProcessDate() {
        return processDate;
    }

    public void setProcessDate(String processDate) {
        this.processDate = processDate;
    }

    public FormStatus() {
    }

    public FormStatus(String processRound, String processDate) {
        this.processRound = processRound;
        this.processDate = processDate;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null)
            return false;
        if (!(o instanceof FormStatus))
            return false;
        FormStatus second = (FormStatus) o;
        return this.getProcessRound().equals(second.getProcessRound());
    }
}
