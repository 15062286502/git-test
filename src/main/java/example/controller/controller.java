package example.controller;
import example.entity.Goods;
import example.entity.User;
import example.service.UserService;
import jdk.nashorn.internal.runtime.arrays.ArrayLikeIterator;
import org.omg.CORBA.Request;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/home")
public class controller {
    @RequestMapping("/index")
    public String index() {
        return "index";
    }
    @RequestMapping("/hello")
    public String hello() {
        return "hello";
    }
    @RequestMapping(value = "/login",method= RequestMethod.POST)
    public String login(@RequestParam("name")String name, @RequestParam("password")String password) throws IOException {
        UserService s=new UserService();
        String psw=s.login(name);
        if(psw.equals(password)){
            return "hello";
        }
        return "loginError";
    }
    @RequestMapping(value = "/register",method= RequestMethod.POST)
    public String Register(@RequestParam("name")String name, @RequestParam("password")String password)throws IOException{
        User user=new User();
        user.setName(name);
        user.setPassword(password);
        UserService s=new UserService();
        s.Register(user);
        return "hello";
    }
    @RequestMapping(value = "/query",method= RequestMethod.POST)
    public ModelAndView query(@RequestParam("name")String name){
        UserService s=new UserService();
        Goods g=s.Query(name);
        return new ModelAndView("Query","message",g);
    }
    @RequestMapping(value = "/allquery",method= RequestMethod.POST)
    public ModelAndView allquery(){
        UserService s=new UserService();
        List<Goods> g=s.AllQuery();
        return new ModelAndView("AllQuery","message",g);
    }
}
