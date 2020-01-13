package pl.exsio.querydsl.entityql.benchmark;

import com.querydsl.sql.Configuration;
import com.querydsl.sql.H2Templates;
import com.querydsl.sql.SQLQueryFactory;
import pl.exsio.querydsl.entityql.benchmark.PerformanceBenchmark;
import pl.exsio.querydsl.entityql.benchmark.execution.QueryExecutionBenchmark;
import pl.exsio.querydsl.entityql.config.EntityQlQueryFactory;

public abstract class EntityQLQueryExecutionBenchmark extends QueryExecutionBenchmark implements PerformanceBenchmark {

    public static SQLQueryFactory queryFactory() {
        return new EntityQlQueryFactory(new Configuration(new H2Templates()), dataSource());
    }
}
