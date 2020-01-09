package pl.exsio.querydsl.entityql.config.entity.it.generated

import com.querydsl.core.types.Path
import com.querydsl.core.types.dsl.NumberPath
import com.querydsl.sql.ForeignKey
import com.querydsl.sql.PrimaryKey
import pl.exsio.querydsl.entityql.QBase
import pl.exsio.querydsl.entityql.QColumnMetadataFactory
import pl.exsio.querydsl.entityql.QPathConfig
import pl.exsio.querydsl.entityql.QPathFactory

public final class QOrderItem extends QBase<pl.exsio.querydsl.entityql.config.entity.it.OrderItem> {

  public static final QOrderItem INSTANCE = new QOrderItem();

  public final NumberPath<java.lang.Long> id;

  public final NumberPath<java.lang.Long> quantity;

  public final NumberPath<java.lang.Long> bookId;

  public final NumberPath<java.lang.Long> orderId;

  public final ForeignKey<pl.exsio.querydsl.entityql.config.entity.it.Book> book;

  public final ForeignKey<pl.exsio.querydsl.entityql.config.entity.it.Order> order;

  public final PrimaryKey<pl.exsio.querydsl.entityql.config.entity.it.OrderItem> _primaryKey;

  public QOrderItem() {
    this("ORDER_ITEMS");
  }

  @SuppressWarnings(value = "unchecked")
  public QOrderItem(String variable) {
    super(pl.exsio.querydsl.entityql.config.entity.it.OrderItem, variable, "", "ORDER_ITEMS");

    id:
    {
      this.id =
          ((NumberPath<java.lang.Long>)
              QPathFactory.create(
                      this,
                      new QPathConfig(
                          java.lang.Long.class, java.lang.Long.class, "ORDER_ITEM_ID", true, 1, -5))
                  .get());
      addMetadata(this.id, QColumnMetadataFactory.create("ORDER_ITEM_ID", 1, -5, true));
    }

    quantity:
    {
      this.quantity =
          ((NumberPath<java.lang.Long>)
              QPathFactory.create(
                      this,
                      new QPathConfig(
                          java.lang.Long.class, java.lang.Long.class, "QTY", false, 4, -5))
                  .get());
      addMetadata(this.quantity, QColumnMetadataFactory.create("QTY", 4, -5, false));
    }

    bookId:
    {
      this.bookId =
          ((NumberPath<java.lang.Long>)
              QPathFactory.create(
                      this,
                      new QPathConfig(
                          java.lang.Long.class, java.lang.Long.class, "BOOK_ID", false, 2, -5))
                  .get());
      addMetadata(this.bookId, QColumnMetadataFactory.create("BOOK_ID", 2, -5, false));
    }

    orderId:
    {
      this.orderId =
          ((NumberPath<java.lang.Long>)
              QPathFactory.create(
                      this,
                      new QPathConfig(
                          java.lang.Long.class, java.lang.Long.class, "ORDER_ID", false, 3, -5))
                  .get());
      addMetadata(this.orderId, QColumnMetadataFactory.create("ORDER_ID", 3, -5, false));
    }

    book:
    {
      this.book =
          ((ForeignKey<pl.exsio.querydsl.entityql.config.entity.it.Book>)
              createForeignKey(this.bookId, "BOOK_ID"));
    }

    order:
    {
      this.order =
          ((ForeignKey<pl.exsio.querydsl.entityql.config.entity.it.Order>)
              createForeignKey(this.orderId, "ORDER_ID"));
    }

    _primaryKey:
    {
      List<Path> paths = new ArrayList();

      paths.add(this.id);

      this._primaryKey =
          ((PrimaryKey<pl.exsio.querydsl.entityql.config.entity.it.OrderItem>)
              createPrimaryKey(paths.toArray(new Path[0])));
    }
  }
}
