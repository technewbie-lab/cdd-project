package a.b.c.interfaces.order;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import a.b.c.domain.order.OrderEntity;

public class OrderFactory {

    public static OrderEntity dto2entity(OrderRequestDto dto) {

        ObjectMapper mapper = new ObjectMapper();
        OrderEntity entity = new OrderEntity();
        try {
            entity = mapper.readValue(mapper.writeValueAsString(dto), OrderEntity.class);
        } catch (JsonMappingException e) {
            e.printStackTrace();
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        return entity;
    }
}
