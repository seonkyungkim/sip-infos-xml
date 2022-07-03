package com.nkia.demo.xml;

import javax.xml.bind.annotation.*;
import java.util.List;

@XmlRootElement(name="sipTrunkStatistics")
@XmlAccessorType(XmlAccessType.NONE)
public class SIPTrunkInfos {

    private List<SIPTrunkInfo> sipTrunkInfoList;

//    @XmlElementWrapper(name="sipTrunkData")
    @XmlElement(name="sipTrunkData")
    public List<SIPTrunkInfo> getSipTrunkInfoList(){
        return sipTrunkInfoList;
    }

    public void setSipTrunkInfoList(List<SIPTrunkInfo> sipTrunkInfoList){
        this.sipTrunkInfoList = sipTrunkInfoList;
    }

    @Override
    public String toString() {
        return "SIPTrunkInfos{" +
                "sipTrunkInfoList=" + sipTrunkInfoList +
                '}';
    }
}
