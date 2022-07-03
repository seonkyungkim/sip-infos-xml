package com.nkia.demo.two;

import lombok.ToString;

import javax.xml.bind.annotation.*;
import java.util.List;

@ToString
@XmlRootElement(name="sipTrunkStatistics")
@XmlAccessorType(XmlAccessType.NONE)
public class SipTrunkInfos {

    private List<SipTrunk> sipTrunkList;

    @XmlElement(name="sipTrunkData")
    public List<SipTrunk> getSipTrunkList() {
        return sipTrunkList;
    }

    public void setSipTrunkList(List<SipTrunk> sipTrunkList) {
        this.sipTrunkList = sipTrunkList;
    }
}
