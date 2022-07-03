package com.nkia.demo.xml;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="sipServer")
@XmlAccessorType(XmlAccessType.FIELD)
public class SIPServerInfo {

    @XmlElement(name = "sipServer")
    private SIPServer sipServer;

    public SIPServer getSipServer(){
        return sipServer;
    }

    public void setSipServer(SIPServer sipServer){
        this.sipServer = sipServer;
    }

    @Override
    public String toString() {
        return "SIPServerInfo{" +
                "sipServer=" + sipServer +
                '}';
    }
}
