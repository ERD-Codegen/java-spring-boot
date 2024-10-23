package top.ruilink.realworld.article.infra;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import top.ruilink.realworld.article.domain.Test;

@Repository
public interface TestRepository extends JpaRepository<Test, Long> {
}