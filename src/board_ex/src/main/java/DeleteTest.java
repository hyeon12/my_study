import board.Board;
import configs.DBConn;
import mappers.BoardMapper;
import org.apache.ibatis.session.SqlSession;

public class DeleteTest {
    public static void main(String[] args) {
        SqlSession session = DBConn.getSession();
        BoardMapper mapper = session.getMapper(BoardMapper.class);

        Board board = Board.builder().poster("(추가)작성자").build();

        int del = mapper.delete(board);
        System.out.println(del);

        int del2 = mapper.delete2("작성자2");
        System.out.println(del2);
    }
}
