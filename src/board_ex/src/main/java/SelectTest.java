import board.Board;
import configs.DBConn;
import mappers.BoardMapper;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

public class SelectTest {
    public static void main(String[] args) {
        SqlSession session = DBConn.getSession();
        //BoardMapper mapper = session.getMapper(BoardMapper.class);

        List<Board> board = session.selectList("mappers.BoardMapper.getList");
        board.forEach(System.out::println);
    }
}
