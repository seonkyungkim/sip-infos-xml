package com.nkia.demo;

import com.nkia.demo.two.SipServer;
import com.nkia.demo.two.SipTrunk;
import com.nkia.demo.two.SipTrunkInfos;
import com.nkia.demo.xml.SIPServer;
import org.springframework.http.MediaType;
import org.springframework.http.client.ClientHttpResponse;
import org.springframework.web.client.RestTemplate;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;

public class TwoApplication {

    static final String URL = "http://";
    static final String SIP_SERVER_URL = "/serverx?sipServer";
    static final String SIP_TRUNK_URL = "/serverx?sipTrunkStatistics";

    public static void main(String[] args) {

        // RestTemplate 생성
        RestTemplate restTemplate = new RestTemplate();

        restTemplate.getInterceptors().add((request, body, execution) -> {
            ClientHttpResponse response = execution.execute(request, body);
            response.getHeaders().setContentType(MediaType.APPLICATION_XML);
            return response;
        });


        // API 두 곳에서 받아오는 경우
        try {
            URI serverURI = new URI(URL + SIP_SERVER_URL);
            URI trunkURI = new URI(URL + SIP_TRUNK_URL);

            // sipServer 태그의 정보 가져오기
            SipServer sipServer = restTemplate.getForObject(serverURI, SipServer.class);
            System.out.println(sipServer.toString());

            // sipTrunkSData 태그의 정보 가져오기
//            SipTrunk sipTrunk = restTemplate.getForObject(trunkURI, SipTrunk.class);
//            System.out.println(sipTrunk.toString());

//            SipTrunkInfos sipTrunkInfos = restTemplate.getForObject(trunkURI, SipTrunkInfos.class);
//            List<SipTrunk> sipTrunkList = sipTrunkInfos.getSipTrunkList();

            while(restTemplate.getForObject(trunkURI, SipTrunk.class) != null){
                SipTrunkInfos sipTrunkInfos = restTemplate.getForObject(trunkURI, SipTrunkInfos.class);
                List<SipTrunk> sipTrunkList = null;
                if (sipTrunkInfos != null) {
                    sipTrunkList = sipTrunkInfos.getSipTrunkList();
                    System.out.println(sipTrunkList);
                }
//                SipTrunk sipTrunk = restTemplate.getForObject(trunkURI, SipTrunk.class);
            }

        } catch (URISyntaxException e) {
            e.printStackTrace();
        }
    }
}

