package javaAkka;

import akka.actor.UntypedActor;

import java.util.Random;
import java.util.concurrent.TimeUnit;

/**
 * Created by Gungor-Mebitech on 6.05.2017.
 */
public class SendMail extends UntypedActor{
    private static int i=1;

    @Override
    public void preStart() {
        System.out.println(i+". Mail Gönderici Başlatıldı.");
        i++;
    }


    @Override
    public void onReceive(Object msg) throws Exception {


        if(msg instanceof MailObject) {
            MailObject o = (MailObject) msg;
            System.out.println("<<< START : " + o.getMessage()+ " isimli işlem başladı " + " aktör adresi : " +getSelf().path());
            Random r=new Random();
            int a=r.nextInt(5);
            TimeUnit.SECONDS.sleep(a);
            System.out.println("<<< END : " + o.getMessage()+ " isimli işlem bitirdi. " + " aktör adresi : " +getSelf().path());
        }

    }
}
