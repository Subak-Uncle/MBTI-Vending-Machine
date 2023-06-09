import com.ohgiraffers.model.MbtiServiceImpl;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class LoginTests {
    private MbtiServiceImpl mbtiService;

    @BeforeEach
    public void setUp() {
        this.mbtiService = MbtiServiceImpl.getMbtiService();
    }

    @DisplayName("DB에 있는 아이디, 비밀번호 입력 시 정상 작동 테스트")
    @Test
    public void testValidationUser() {
        String userId = "admin1";
        String userPw = "admin1";

        int result = mbtiService.login(userId, userPw);
        Assertions.assertEquals(0, result);
    }

}
