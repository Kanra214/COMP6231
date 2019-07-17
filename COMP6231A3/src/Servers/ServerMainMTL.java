package Servers;


import javax.xml.ws.Endpoint;

public class ServerMainMTL {
    public static void main(String[] args) {
        System.out.println("Starting MTL server...");
        Branch branch = Branch.MTL;


        System.out.println("Beginning to publish ClientHandler now");
        Server server = new Server(branch);
        Endpoint.publish("http://127.0.0.1:" + branch.getEndPointPort() + "/hw", new ClientHandler(server));
        System.out.println("Done publishing");
        server.start();



    }

}
