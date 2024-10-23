package top.ruilink.realworld.article.infra.mapper;

import org.apache.ibatis.annotations.*;
import top.ruilink.realworld.article.domain.Test;

@Mapper
public interface TestMapper {

    @Insert("INSERT INTO tests (created_at, updated_at) VALUES (#{test.createdAt}, #{test.updatedAt})")
    @Options(useGeneratedKeys = true, keyProperty = "id")
    void insert(@Param("test") Test test);

    @Select("SELECT id, created_at, updated_at FROM tests WHERE id = #{id}")
    Test findById(@Param("id") Long id);

    @Update("UPDATE tests SET created_at = #{test.createdAt}, updated_at = #{test.updatedAt} WHERE id = #{test.id}")
    void update(@Param("test") Test test);

    @Delete("DELETE FROM tests WHERE id = #{id}")
    void delete(@Param("id") Long id);
}