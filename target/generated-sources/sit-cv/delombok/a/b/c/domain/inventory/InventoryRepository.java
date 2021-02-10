package a.b.c.domain.inventory;

import java.util.List;

import a.b.c.domain.order.OrderDetailEntity;

public class InventoryRepository {

    public List<InventoryEntity> findByProductCdInWithLock(List<OrderDetailEntity> details) {
      // TODO impl
      return null;
    }
  }