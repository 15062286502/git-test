package example.service;
import example.dao.usedao;
import example.entity.Goods;
import example.entity.User;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class UserService {
    public String  login(String username) throws IOException {
        usedao u=new usedao();
        return u.add(username);
    }
    public void Register(User user)throws IOException{
        usedao u=new usedao();
        u.register(user);
    }
    public Goods Query(String name){
        usedao u=new usedao();
        return u.Query(name);
    }
    public List<Goods> AllQuery(){
        usedao u=new usedao();
        return u.AllQuery();
    }
}
