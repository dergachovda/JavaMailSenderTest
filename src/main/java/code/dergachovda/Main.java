package code.dergachovda;

import code.dergachovda.mailsender.ISender;
import code.dergachovda.mailsender.SslSender;
import code.dergachovda.mailsender.TlsSender;

public class Main {

    public static void main(String[] args){
        String username = "";
        String password = "";
        String ToEmail = "";

        if (args.length == 3) {
            username = String.valueOf(args[0]);
            password = String.valueOf(args[1]);
            ToEmail = String.valueOf(args[2]);
        }

        ISender tlsSender = new TlsSender(username, password);
        ISender sslSender = new SslSender(username, password);

        tlsSender.send("This is Subject", "TLS: This is text!", "support@upitec.com", ToEmail);
        sslSender.send("This is Subject", "SSL: This is text!", "support@upitec.com", ToEmail);
    }
}
