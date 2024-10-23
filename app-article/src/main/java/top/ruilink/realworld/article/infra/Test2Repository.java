package top.ruilink.realworld.article.infra;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import top.ruilink.realworld.article.domain.Test2;

@Repository
public interface Test2Repository extends JpaRepository<Test2, Long> {
}