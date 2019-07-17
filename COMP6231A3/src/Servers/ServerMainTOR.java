package Servers;

import javax.xml.ws.Endpoint;

public class ServerMainTOR {
    public static void main(String[] args){
        System.out.println("Starting TOR server...");
        Branch branch = Branch.TOR;


        System.out.println("Beginning to publish ClientHandler now");
        Server server = new Server(branch);
        Endpoint.publish("http://127.0.0.1:" + branch.getEndPointPort() + "/hw", new ClientHandler(server));
        System.out.println("Done publishing");
        server.start();




    }

}
