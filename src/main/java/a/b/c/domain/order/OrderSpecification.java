package a.b.c.domain.order;

import java.util.List;

import a.b.c.domain.inventory.InventoryEntity;

public class OrderSpecification {
    
  /**
   * <p>注文番号を生成します。</p>
   * 
   * @param orderSeq
   *          連番
   * @return 注文番号 書式：現時点のタイムスタンプ(yyMMddhhmm) + 連番(5 桁 0 パディング)
   */
  public static String generateOrderNo(long orderSeq) {
    // TODO impl
    return "";
  }

  /**
   * <p>同じ商品コードを持つ注文明細と在庫に対し、在庫を引き当てます。</p>
   * <p>在庫番号の小さい順に、注文数に等しくなるまで在庫数を減算します。</p>
   * 
   * @param order
   * @param inventories
   */
  public static void allocate(OrderEntity order, List<InventoryEntity> inventories) {
    // TODO impl
  }
}
