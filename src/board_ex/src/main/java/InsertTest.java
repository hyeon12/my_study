import board.Board;
import configs.DBConn;
import mappers.BoardMapper;
import org.apache.ibatis.session.SqlSession;

public class InsertTest {
    public static void main(String[] args) {
        SqlSession session = DBConn.getSession();
        BoardMapper mapper = session.getMapper(BoardMapper.class);
        Board board2 = Board.builder()
                .poster("(추가2)작성자")
                .subject("(추가)제목")
                .content("(추가)내용")
                .build();

        int insert = mapper.insert(board2);
        System.out.println(insert);
        System.out.println(board2);


    }
}
