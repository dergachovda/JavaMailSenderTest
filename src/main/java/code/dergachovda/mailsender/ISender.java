package code.dergachovda.mailsender;

public interface ISender {
    void send(String subject, String text, String fromEmail, String toEmail);
}
