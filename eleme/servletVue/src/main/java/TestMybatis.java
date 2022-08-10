import com.neusoft.dao.EleUserMapper;
import com.neusoft.po.EleUser;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;

public class TestMybatis {
    @Test
    public void test01() throws IOException {
        //读取mybatis配置文件
        String resource = "mybatis.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);//静态工厂方法
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);//建造者模式

        SqlSession session = sqlSessionFactory.openSession(true);
        EleUserMapper eleUserMapper = session.getMapper(EleUserMapper.class);

        EleUser eleUser = eleUserMapper.selectByPrimaryKey("e114514");
        System.out.println(eleUser);
    }
}
