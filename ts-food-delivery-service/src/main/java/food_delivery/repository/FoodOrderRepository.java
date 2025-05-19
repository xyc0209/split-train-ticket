package food_delivery.repository;



import food_delivery.entity.FoodOrder;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface FoodOrderRepository extends CrudRepository<FoodOrder, String> {

    @Override
    FoodOrder save(FoodOrder s);


    Optional<FoodOrder> findById(String id);
}
