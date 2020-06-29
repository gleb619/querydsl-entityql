package pl.exsio.querydsl.entityql.java.jpa.entity.generated;

import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.NumberPath;
import com.querydsl.core.types.dsl.StringPath;
import com.querydsl.sql.PrimaryKey;
import java.math.BigDecimal;
import java.util.Arrays;
import javax.annotation.Generated;
import pl.exsio.querydsl.entityql.QColumnMetadataFactory;
import pl.exsio.querydsl.entityql.QPathConfig;
import pl.exsio.querydsl.entityql.QPathFactory;
import pl.exsio.querydsl.entityql.QStaticModel;
import pl.exsio.querydsl.entityql.java.jpa.entity.JBook;

/**
 * This class was generated by EntityQL (https://github.com/eXsio/querydsl-entityql). It is not
 * recommended to make any changes to this class. Any manual changes will be lost upon the next
 * class generation.
 */
@Generated("pl.exsio.querydsl.entityql.QExporter")
public final class QJBook extends QStaticModel<JBook> {

  private static final long serialVersionUID = 1595067359;

  public static final QJBook INSTANCE = new QJBook();

  public static final QJBook qJBook = INSTANCE;

  public final NumberPath<Long> id;

  public final StringPath name;

  public final StringPath desc;

  public final NumberPath<BigDecimal> price;

  public final PrimaryKey<JBook> _primaryKey;

  public QJBook() {
    this("JBOOKS");
  }

  @SuppressWarnings(value = "unchecked")
  public QJBook(String variable) {
    super(JBook.class, variable, "", "JBOOKS");

    id:
    {
      QPathConfig config = new QPathConfig(Long.class, Long.class, "BOOK_ID", true, 1, -5);

      this.id = QPathFactory.<NumberPath<Long>>create(this, config);

      addMetadata(this.id, QColumnMetadataFactory.create(config));
      this.columnsMap.put("id", this.id);
    }

    name:
    {
      QPathConfig config = new QPathConfig(String.class, String.class, "NAME", true, 2, 12);

      this.name = QPathFactory.<StringPath>create(this, config);

      addMetadata(this.name, QColumnMetadataFactory.create(config));
      this.columnsMap.put("name", this.name);
    }

    desc:
    {
      QPathConfig config = new QPathConfig(String.class, String.class, "DESC", true, 3, 2005);

      this.desc = QPathFactory.<StringPath>create(this, config);

      addMetadata(this.desc, QColumnMetadataFactory.create(config));
      this.columnsMap.put("desc", this.desc);
    }

    price:
    {
      QPathConfig config = new QPathConfig(BigDecimal.class, BigDecimal.class, "PRICE", true, 4, 3);

      this.price = QPathFactory.<NumberPath<BigDecimal>>create(this, config);

      addMetadata(this.price, QColumnMetadataFactory.create(config));
      this.columnsMap.put("price", this.price);
    }

    _primaryKey:
    {
      this.primaryKeyColumns = Arrays.<Path<?>>asList(this.id);

      Path[] pkArray = (Path[]) primaryKeyColumns.<Path>toArray(new Path[0]);
      this._primaryKey = this.<JBook>createPrimaryKey(pkArray);
    }
  }
}
