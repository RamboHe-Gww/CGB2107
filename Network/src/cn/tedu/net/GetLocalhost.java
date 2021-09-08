package cn.tedu.net;

import java.net.Inet4Address;
import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * FileName：GetLocalhost
 * Date：2021/9/7 10:42:50
 */
public class GetLocalhost {
    public static void main(String[] args) {
        String host = getHost();
        System.out.println(host);
    }

    //获取IP和主机名
    public static String getHost(){
        String IP = null;
        String hostName = null;
        InetAddress localHost;
        try {
            localHost = Inet4Address.getLocalHost();
            IP = localHost.getHostAddress();
            hostName = localHost.getHostName();
        } catch (UnknownHostException e) {
            e.printStackTrace();
        }
        return hostName+'：'+IP;
    }
}
