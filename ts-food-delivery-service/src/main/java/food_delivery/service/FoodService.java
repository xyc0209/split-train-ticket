package food_delivery.service;



import edu.fudan.common.util.Response;
import food_delivery.entity.FoodDeliveryOrder;
import food_delivery.entity.FoodOrder;
import org.springframework.http.HttpHeaders;

import java.util.List;


public interface FoodService {

    Response modifyFoodOrder(FoodDeliveryOrder fo);

    FoodOrder findByOrderId(String orderId);


}
