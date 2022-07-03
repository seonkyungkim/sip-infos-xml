package com.nkia.demo.xml;

import javax.xml.bind.annotation.*;
import java.util.List;

@XmlRootElement(name="sipTrunkStatistics")
@XmlAccessorType(XmlAccessType.NONE)
public class SIPTrunkData {

    private List<SIPTrunk> sipTrunkData;

//    @XmlElementWrapper(name="sipTrunkStatistics")  //이게 있으면 sipTrunkData의 값이 null이 아니라 []로 들어옴
    @XmlElement(name="sipTrunkData")
    public List<SIPTrunk> getSipTrunkData(){
        return sipTrunkData;
    }

    public void setSipTrunkData(List<SIPTrunk> sipTrunkData){
        this.sipTrunkData = sipTrunkData;
    }


    @Override
    public String toString() {
        return "SIPTrunkInfos{" +
                "sipTrunkData=" + sipTrunkData +
                '}';
    }

/*
    private List<SIPTrunk> sipTrunkData;

    @XmlElementWrapper
    @XmlElement(name="sipTrunkData")
    public List<SIPTrunk> getSipTrunks(){
        return sipTrunkData;
    }

    public void setSipTrunks(List<SIPTrunk> sipTrunkData){
        this.sipTrunkData = sipTrunkData;
    }
*/
}
