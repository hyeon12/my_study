import board.Board;
import configs.DBConn;
import mappers.BoardMapper;
import org.apache.ibatis.session.SqlSession;

public class UpdateTest {
    public static void main(String[] args) {
        SqlSession session = DBConn.getSession();
        BoardMapper mapper = session.getMapper(BoardMapper.class);

        Board board3 = Board.builder()
                .poster("(추가2)작성자")
                .subject("(변경)제목")
                .content("(변경)내용")
                .build();

        int update = mapper.update(board3);
        System.out.println(update);
    }
}
