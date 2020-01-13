package pl.exsio.querydsl.entityql.benchmark.execution.jpa;

import org.junit.Test;
import org.openjdk.jmh.annotations.*;
import org.openjdk.jmh.infra.Blackhole;
import org.openjdk.jmh.runner.RunnerException;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseBuilder;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseType;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;
import pl.exsio.querydsl.entityql.benchmark.PerformanceBenchmark;
import pl.exsio.querydsl.entityql.config.entity.JBook;
import pl.exsio.querydsl.entityql.config.entity.it.Book;
import pl.exsio.querydsl.entityql.dto.BookDto;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import javax.sql.DataSource;
import java.util.List;
import java.util.Properties;

import static org.junit.Assert.assertTrue;

public class JpaCriteriaQueryExecutionBenchmark extends JpaQueryExecutionBenchmark {


    @State(Scope.Benchmark)
    public static class Settings {

        EntityManagerFactory emf;

        @Setup
        public void setup() {
            emf = emf();
        }
    }

    @Benchmark
    @Fork(value = 1)
    @Warmup(iterations = 6, time = 10)
    @Measurement(iterations = 6, time = 10)
    @BenchmarkMode(Mode.Throughput)
    public void run(Blackhole blackHole, Settings settings) {
        EntityManager em = settings.emf.createEntityManager();
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<BookDto> query = cb.createQuery(BookDto.class);
        Root<JBook> jbook = query.from(JBook.class);
        query.select(cb.construct(BookDto.class, jbook.get("id"), jbook.get("name"), jbook.get("desc"), jbook.get("price")));
        List<BookDto> books = em.createQuery(query).getResultList();
        blackHole.consume(books);
        em.close();
    }

    @Test
    public void shouldRunJpaCriteriaQueryQueryExecutionBenchmark() throws RunnerException {
        double score = runBenchmark();
        assertTrue(score >= 0);
    }
}
