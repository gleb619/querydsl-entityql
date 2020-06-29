package pl.exsio.querydsl.entityql.java.jpa.entity.generated;

import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.NumberPath;
import com.querydsl.sql.ForeignKey;
import com.querydsl.sql.PrimaryKey;
import java.util.Arrays;
import javax.annotation.Generated;
import pl.exsio.querydsl.entityql.QColumnMetadataFactory;
import pl.exsio.querydsl.entityql.QPathConfig;
import pl.exsio.querydsl.entityql.QPathFactory;
import pl.exsio.querydsl.entityql.QStaticModel;
import pl.exsio.querydsl.entityql.java.jpa.entity.JGroup;
import pl.exsio.querydsl.entityql.java.jpa.entity.JUser;
import pl.exsio.querydsl.entityql.java.jpa.entity.JUserGroup;

/**
 * This class was generated by EntityQL (https://github.com/eXsio/querydsl-entityql). It is not
 * recommended to make any changes to this class. Any manual changes will be lost upon the next
 * class generation.
 */
@Generated("pl.exsio.querydsl.entityql.QExporter")
public final class QJUserGroup extends QStaticModel<JUserGroup> {

  private static final long serialVersionUID = 1418974613;

  public static final QJUserGroup INSTANCE = new QJUserGroup();

  public static final QJUserGroup qJUserGroup = INSTANCE;

  public final NumberPath<Long> groupId;

  public final NumberPath<Long> userId;

  public final ForeignKey<JGroup> group;

  public final ForeignKey<JUser> user;

  public final PrimaryKey<JUserGroup> _primaryKey;

  public QJUserGroup() {
    this("JUSERS_GROUPS");
  }

  @SuppressWarnings(value = "unchecked")
  public QJUserGroup(String variable) {
    super(JUserGroup.class, variable, "", "JUSERS_GROUPS");

    groupId:
    {
      QPathConfig config = new QPathConfig(Long.class, Long.class, "GROUP_ID", true, 3, -5);

      this.groupId = QPathFactory.<NumberPath<Long>>create(this, config);

      addMetadata(this.groupId, QColumnMetadataFactory.create(config));
      this.columnsMap.put("groupId", this.groupId);
    }

    userId:
    {
      QPathConfig config = new QPathConfig(Long.class, Long.class, "USER_ID", true, 4, -5);

      this.userId = QPathFactory.<NumberPath<Long>>create(this, config);

      addMetadata(this.userId, QColumnMetadataFactory.create(config));
      this.columnsMap.put("userId", this.userId);
    }

    group:
    {
      this.group = this.<JGroup>createForeignKey(this.groupId, "GROUP_ID");
      this.joinColumnsMap.put("group", this.group);
    }

    user:
    {
      this.user = this.<JUser>createForeignKey(this.userId, "USER_ID");
      this.joinColumnsMap.put("user", this.user);
    }

    _primaryKey:
    {
      this.primaryKeyColumns = Arrays.<Path<?>>asList(this.groupId, this.userId);

      Path[] pkArray = (Path[]) primaryKeyColumns.<Path>toArray(new Path[0]);
      this._primaryKey = this.<JUserGroup>createPrimaryKey(pkArray);
    }
  }
}
