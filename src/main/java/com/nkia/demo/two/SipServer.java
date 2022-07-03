package com.nkia.demo.two;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@ToString
@XmlRootElement(name = "sipServer")
@XmlAccessorType(XmlAccessType.NONE)
public class SipServer {

    @XmlElement(name = "NAME")
    @Getter @Setter
    String serverName;

    @XmlElement(name = "HA_ROLE")
    @Getter @Setter
    String serverStatus;

}
