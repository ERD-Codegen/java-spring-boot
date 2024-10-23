package top.ruilink.realworld.article.infra.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Update;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Options;
import top.ruilink.realworld.article.domain.Test2;

import java.util.List;

@Mapper
public interface Test2Mapper {

    @Insert("INSERT INTO test2s (created_at, updated_at) VALUES (#{test2.createdAt}, #{test2.updatedAt})")
    @Options(useGeneratedKeys = true, keyProperty = "id")
    void insert(@Param("test2") Test2 test2);

    @Select("SELECT id, created_at, updated_at FROM test2s WHERE id = #{id}")
    Test2 findById(@Param("id") Long id);

    @Update("UPDATE test2s SET updated_at = #{test2.updatedAt} WHERE id = #{test2.id}")
    void update(@Param("test2") Test2 test2);

    @Delete("DELETE FROM test2s WHERE id = #{id}")
    void delete(@Param("id") Long id);

    @Select("SELECT id, created_at, updated_at FROM test2s")
    List<Test2> findAll();
}