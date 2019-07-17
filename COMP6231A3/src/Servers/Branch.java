package Servers;

public enum Branch {
    TOR(7770, 7771, 7772),
    MTL(8880,8881, 8882),
    OTW(9990,9991, 9992);

    private int udpSendPort,udpReplyPort, endPointPort;
    Branch(int udpSendPort, int udpReplyPort, int endPointPort){
        this.udpSendPort = udpSendPort;
        this.udpReplyPort = udpReplyPort;
        this.endPointPort = endPointPort;
    }
    public int getUdpSendPort(){
        return udpSendPort;
    }
    public int getUdpReplyPort(){
        return udpReplyPort;
    }
    public int getEndPointPort(){
        return endPointPort;
    }
    public static Branch getBranchFromString(String s){
        switch(s){
            case "TOR":
                return TOR;
            case "MTL":
                return MTL;
            case "OTW":
                return OTW;
        }
        return null;
    }
    public static Branch getBranchFromPort(int port){
        switch(port){
            case 7770:
                return TOR;
            case 7771:
                return TOR;
            case 7772:
                return TOR;
            case 8880:
                return MTL;
            case 8881:
                return MTL;
            case 8882:
                return MTL;
            case 9990:
                return OTW;
            case 9991:
                return OTW;
            case 9992:
                return OTW;

        }
        return null;
    }

}
