package movie.domain;

import javax.persistence.*;
import java.util.List;
import java.util.Date;
import lombok.Data;


@Entity
@Table(name="Moviewiews_table")
@Data
public class Moviewiews {

        @Id
        //@GeneratedValue(strategy=GenerationType.AUTO)
        private Long movieId;
        private String desc;
        private Integer reviewCnt;
        private String movieStatus;
        private Long rsvId;
        private String rsvStatus;
        private Long customerId;
        private Integer numberOfSeats;
        private Date startDate;
        private Date endDate;


}
