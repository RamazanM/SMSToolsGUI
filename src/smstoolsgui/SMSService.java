
package smstoolsgui;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author ramazan
 */
public class SMSService {
    
     public String INCOMING_PATH = "/var/spool/sms/incoming";
       
    
    
    
    
    
    public ArrayList<Message> getMessages() throws FileNotFoundException, IOException{
        ArrayList<Message> messages=new ArrayList();
        File incomingFolder=new File(INCOMING_PATH);
        File[] messageFiles=incomingFolder.listFiles();
        for(File file:messageFiles){
            BufferedReader bufferedReader=new BufferedReader(new FileReader(file));
            String line;
            ArrayList<String> lines=new ArrayList<>();
            Message message=new Message();
            while((line=bufferedReader.readLine()) != null)
               lines.add(line);
            message.setSender(lines.get(0).substring(6));
            message.setMessage(lines.get(lines.size()-1));
            messages.add(message);
        }
         return messages;
    }
}
