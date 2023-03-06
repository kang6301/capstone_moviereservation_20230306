package capstonemoviereservation.domain;

import capstonemoviereservation.domain.*;
import capstonemoviereservation.infra.AbstractEvent;
import java.util.*;
import lombok.*;


@Data
@ToString
public class PaymentApproved extends AbstractEvent {

    private Long payId;
    private Long rsvId;
    private Long movieId;
    private String status;

    public PaymentApproved(Payment aggregate){
        super(aggregate);
    }
    public PaymentApproved(){
        super();
    }
}
