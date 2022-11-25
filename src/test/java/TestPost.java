import com.qaprosoft.carina.core.foundation.IAbstractTest;
import com.qaprosoft.carina.core.foundation.api.http.HttpResponseStatusType;
import com.solvd.carina.demo.api.PostLink;
import org.testng.annotations.Test;

public class TestPost implements IAbstractTest {

    @Test
    public void testPostLink(){
        PostLink post = new PostLink();
        post.setProperties("api/bitly/post/links.properties");
        //post.expectResponseStatus(HttpResponseStatusType.CREATED_201);
        post.callAPI();
        post.validateResponseAgainstSchema("api/bitly/post/rs.schema");
    }

    @Test
    public void testCheckLink(){
        PostLink post = new PostLink();
        post.setProperties("api/bitly/post/links.properties");
        post.expectResponseStatus(HttpResponseStatusType.OK_200);
        post.callAPI();
    }
}
