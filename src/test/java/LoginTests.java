import com.ohgiraffers.dto.User;
import com.ohgiraffers.model.Exceptions;
import com.ohgiraffers.model.MbtiServiceImpl;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.IOException;

public class LoginTests {
    private MbtiServiceImpl mbtiService;
    private Exceptions exception;

    @BeforeEach
    public void setUp() throws IOException {
        this.mbtiService = MbtiServiceImpl.getMbtiService();
        this.exception = Exceptions.getException();
    }

    @DisplayName("DB에 있는 아이디, 비밀번호 입력 시 정상 작동 테스트")
    @Test
    public void testValidationUser() throws IOException {
        String userId = "admin1";
        String userPw = "admin1";

        User result = mbtiService.login(userId, userPw);
        Assertions.assertEquals("admin1", result.getUserId());
        Assertions.assertEquals("admin1", result.getUserPw());
    }

    @DisplayName("DB에 없는 값이 입력되면 예외 발생 테스트")
    @Test
    public void testInputException() {
        String userId = "admin3";
        String userPw = "admin3";

        Assertions.assertThrows(
                IllegalArgumentException.class,
                () -> exception.validateUserId(userId)
        );

        Assertions.assertThrows(
                IllegalArgumentException.class,
                () -> exception.validateUserPw(userPw)
        );
    }

    @DisplayName("DB에 없는 값이 입력되면 에러 메시지 반환 테스트")
    @Test
    public void testInputException2() {
        String userId = "admin5";
        String userPw = "admin3";

        Assertions.assertEquals("아이디 에러", exception.solveIdException(userId));
        Assertions.assertEquals("비밀번호 에러", exception.solvePwException(userPw));
    }

}
