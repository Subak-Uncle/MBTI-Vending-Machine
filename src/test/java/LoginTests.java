import com.ohgiraffers.dto.User;
import com.ohgiraffers.model.Exception;
import com.ohgiraffers.model.MbtiServiceImpl;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class LoginTests {
    private MbtiServiceImpl mbtiService;
    private Exception exception;

    @BeforeEach
    public void setUp() {
        this.mbtiService = MbtiServiceImpl.getMbtiService();
        this.exception = Exception.getException();
    }

    @DisplayName("DB에 있는 아이디, 비밀번호 입력 시 정상 작동 테스트")
    @Test
    public void testValidationUser() {
        String userId = "admin1";
        String userPw = "admin1";

        User result = mbtiService.login(userId, userPw);
        Assertions.assertEquals("admin1", result.getUserId());
        Assertions.assertEquals("admin1", result.getUserPw());
    }

    @DisplayName("DB에 없는 값이 입력되면 예외 발생 테스트")
    @Test
    public void testInputException() {
        String userId = "admin2";
        String userPw = "admin2";

        Assertions.assertThrows(
                IllegalArgumentException.class,
                () -> exception.validateUserId(userId)
        );

        Assertions.assertThrows(
                IllegalArgumentException.class,
                () -> exception.validateUserPw(userPw)
        );
    }

}
