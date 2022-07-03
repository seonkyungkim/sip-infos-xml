package com.nkia.demo.two;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@ToString
@XmlRootElement(name = "sipTrunkData")  //depth=3
@XmlAccessorType(XmlAccessType.NONE)    //
public class SipTrunk {

    @XmlElement(name="TRUNK")
    @Getter @Setter
    private String trunkName;   //Trunk_SBC_Dev

    @XmlElement(name="CURRENT_CALLS")
    @Getter @Setter
    private String activeCall;

    @XmlElement(name="PEAK_CALLS")
    @Getter @Setter
    private String peakCalls;

    @XmlElement(name="CALL_ATTEMPTS")
    @Getter @Setter
    private String callAttempts;

    @XmlElement(name="IN_SERVICE")
    @Getter @Setter
    private String trunkStatus;    //YES or NO

}
