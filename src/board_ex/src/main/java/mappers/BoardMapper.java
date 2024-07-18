package mappers;

import board.Board;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface BoardMapper {
    List<Board> getList();

    @Select("SELECT POSTER poster FROM BOARD")
    List<Board> getList2();

    int insert(Board board);

    int update(Board board);

    int delete(Board board);

    @Delete("DELETE FROM BOARD WHERE POSTER=#{poster}")
    int delete2(String poster);
}
