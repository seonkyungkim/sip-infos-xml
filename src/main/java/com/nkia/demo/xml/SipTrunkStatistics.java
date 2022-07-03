package com.nkia.demo.xml;

import com.nkia.demo.two.SipTrunk;
import lombok.ToString;

import javax.xml.bind.annotation.*;
import java.util.List;

/*
* serverx 에서 가져올 때 depth 늘려주기 위한 클래스.
* two에서는 사용하지 않음.
* */
@ToString
@XmlRootElement(name="sipTrunkStatistics")
@XmlAccessorType(XmlAccessType.NONE)
public class SipTrunkStatistics {

    private List<SipTrunk> sipTrunk;

//    @XmlElementWrapper  //빼도 되나
    @XmlElement(name = "sipTrunkData")
    public List<SipTrunk> getSipTrunk() {
        return sipTrunk;
    }

    public void setSipTrunk(List<SipTrunk> sipTrunk) {
        this.sipTrunk = sipTrunk;
    }
}
