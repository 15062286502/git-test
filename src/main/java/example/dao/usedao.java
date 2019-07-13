package example.dao;

import example.entity.Goods;
import example.entity.User;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class usedao {
    ApplicationContext context=new ClassPathXmlApplicationContext("file:C:\\Users\\syf\\IdeaProjects\\Spring\\src\\main\\java\\applicationContext.xml");
    SqlSessionFactory  sessionFactory=(SqlSessionFactory)context.getBean("sqlSessionFactory");
    public String add(String username) throws IOException {
        String psw=null;
       /* String resource = "config.xml";
        //使用类加载器加载mybatis的配置文件（它也加载关联的映射文件）
        InputStream is = usedao.class.getClassLoader().getResourceAsStream(resource);
        //构建sqlSession的工厂
        SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder().build(is);
        //使用MyBatis提供的Resources类加载mybatis的配置文件（它也加载关联的映射文件）
        Reader reader = Resources.getResourceAsReader(resource);
        //构建sqlSession的工厂
        SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder().build(reader);
        //创建能执行映射文件中sql的sqlSession
        SqlSession session = sessionFactory.openSession();
        *
         * 映射sql的标识字符串，
         * me.gacl.mapping.userMapper是userMapper.xml文件中mapper标签的namespace属性的值，
         * getUser是select标签的id属性值，通过select标签的id属性值就可以找到要执行的SQL
         */
        SqlSession session = sessionFactory.openSession();
        String statement = "UserMapper.getUser";//映射sql的标识字符串
        //执行查询返回一个唯一user对象的sql

        User user = session.selectOne(statement, username);
       psw=user.getPassword();
        return psw;
    }
    public void register(User user)throws IOException{
       /* String resource = "config.xml";
        //使用类加载器加载mybatis的配置文件（它也加载关联的映射文件）
        InputStream is = usedao.class.getClassLoader().getResourceAsStream(resource);
        //构建sqlSession的工厂
        SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder().build(is);
        //使用MyBatis提供的Resources类加载mybatis的配置文件（它也加载关联的映射文件）
        Reader reader = Resources.getResourceAsReader(resource);
        //构建sqlSession的工厂
        SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder().build(reader);*/
        //创建能执行映射文件中sql的sqlSession
        SqlSession session = sessionFactory.openSession();
        String statement = "UserMapper.register";

        session.insert(statement,user);
        session.commit();

    }

    public Goods Query(String name) {
        SqlSession session = sessionFactory.openSession();
        String statement = "UserMapper.query";
       Goods good=session.selectOne(statement,name);
        return good;
    }

    public List<Goods> AllQuery() {
        SqlSession session = sessionFactory.openSession();
        String statement = "UserMapper.allquery";
        List<Goods> g =session.selectList(statement);
        return g;
    }
}
