package cn.tedu.net;

import java.net.Inet4Address;
import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * FileName£ºGetLocalhost
 * Date£º2021/9/7 10:42:50
 */
public class GetLocalhost {
    public static void main(String[] args) {
        String host = getHost();
        System.out.println(host);
    }

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
        return hostName+'£º'+IP;
    }
}
