package com.nkia.demo.xml;

import lombok.Getter;
import lombok.Setter;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/*
* 장비정보
* */
@XmlRootElement(name = "sipServer")
@XmlAccessorType(XmlAccessType.NONE)
public class SIPServer {

    @XmlElement(name="NAME")
    @Getter @Setter
    private String serverName;

    @XmlElement(name="HA_ROLE")
    @Getter @Setter
    private String serverStatus;

/*

    @Getter
    @Setter
    private int innerInfo;  //내선등록현황
*/

    @Override
    public String toString() {
        return "SIPServer{" +
                "serverName='" + serverName + '\'' +
                ", serverStatus='" + serverStatus + '\'' +
                '}';
    }
}
