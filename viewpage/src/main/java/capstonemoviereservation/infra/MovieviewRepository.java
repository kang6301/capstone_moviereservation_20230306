package capstonemoviereservation.infra;

import capstonemoviereservation.domain.*;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import java.util.List;

@RepositoryRestResource(collectionResourceRel="movieviews", path="movieviews")
public interface MovieviewRepository extends PagingAndSortingRepository<Movieview, Long> {

    List<Movieview> findByRsvId(Long rsvId);
List<Movieview> findByPayId(Long payId);


    
}
