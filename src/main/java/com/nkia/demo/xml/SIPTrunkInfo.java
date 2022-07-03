package com.nkia.demo.xml;

import lombok.Getter;
import lombok.Setter;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

//Trunk를 표현하는 도메인
@XmlAccessorType(XmlAccessType.NONE)
public class SIPTrunkInfo {

    @Getter
    @Setter
    private int trunkNum;   // Sequence Data (ex. 1,2,3...)

    @XmlElement(name="TRUNK")
    @Getter
    @Setter
    private String trunkName;   //Trunk_SBC_Dev

    @XmlElement(name="IN_SERVICE")
    @Getter
    @Setter
    private boolean trunkStatus;    //YES or NO

    @XmlElement(name="CURRENT_CALL")
    @Getter
    @Setter
    private int activeCall;

    @XmlElement(name="PEAK_CALLS")
    @Getter
    @Setter
    private int peakCalls;

    @XmlElement(name="CALL_ATTEMPTS")
    @Getter
    @Setter
    private int callAttempts;

    @Override
    public String toString() {
        return "SIPTrunkInfo{" +
                "trunkNum=" + trunkNum +
                ", trunkName='" + trunkName + '\'' +
                ", trunkStatus=" + trunkStatus +
                ", activeCall=" + activeCall +
                ", peakCalls=" + peakCalls +
                ", callAttempts=" + callAttempts +
                '}';
    }
}
