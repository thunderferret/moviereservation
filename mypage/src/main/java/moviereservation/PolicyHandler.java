package moviereservation;

import moviereservation.config.kafka.KafkaProcessor;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Service;

@Service
public class PolicyHandler{

    @StreamListener(KafkaProcessor.INPUT)
    public void wheneverTicketReserved_CheckProcess(@Payload TicketReserved ticketReserved){

        if(!ticketReserved.validate()) return;

        System.out.println("\n\n##### listener CheckProcess : " + ticketReserved.toJson() + "\n\n");

        // Sample Logic //
            
    }
    @StreamListener(KafkaProcessor.INPUT)
    public void wheneverTicketCancelled_CheckProcess(@Payload TicketCancelled ticketCancelled){

        if(!ticketCancelled.validate()) return;

        System.out.println("\n\n##### listener CheckProcess : " + ticketCancelled.toJson() + "\n\n");

        // Sample Logic //
            
    }
    @StreamListener(KafkaProcessor.INPUT)
    public void wheneverReserved_CheckProcess(@Payload Reserved reserved){

        if(!reserved.validate()) return;

        System.out.println("\n\n##### listener CheckProcess : " + reserved.toJson() + "\n\n");

        // Sample Logic //
            
    }
    @StreamListener(KafkaProcessor.INPUT)
    public void wheneverCancelled_CheckProcess(@Payload Cancelled cancelled){

        if(!cancelled.validate()) return;

        System.out.println("\n\n##### listener CheckProcess : " + cancelled.toJson() + "\n\n");

        // Sample Logic //
            
    }
    @StreamListener(KafkaProcessor.INPUT)
    public void wheneverPayCancelled_CheckProcess(@Payload PayCancelled payCancelled){

        if(!payCancelled.validate()) return;

        System.out.println("\n\n##### listener CheckProcess : " + payCancelled.toJson() + "\n\n");

        // Sample Logic //
            
    }
    @StreamListener(KafkaProcessor.INPUT)
    public void wheneverApproved_CheckProcess(@Payload Approved approved){

        if(!approved.validate()) return;

        System.out.println("\n\n##### listener CheckProcess : " + approved.toJson() + "\n\n");

        // Sample Logic //
            
    }
    @StreamListener(KafkaProcessor.INPUT)
    public void wheneverSeatAssigned_CheckProcess(@Payload SeatAssigned seatAssigned){

        if(!seatAssigned.validate()) return;

        System.out.println("\n\n##### listener CheckProcess : " + seatAssigned.toJson() + "\n\n");

        // Sample Logic //
            
    }
    @StreamListener(KafkaProcessor.INPUT)
    public void wheneverSeatCancelled_CheckProcess(@Payload SeatCancelled seatCancelled){

        if(!seatCancelled.validate()) return;

        System.out.println("\n\n##### listener CheckProcess : " + seatCancelled.toJson() + "\n\n");

        // Sample Logic //
            
    }


    @StreamListener(KafkaProcessor.INPUT)
    public void whatever(@Payload String eventString){}


}
