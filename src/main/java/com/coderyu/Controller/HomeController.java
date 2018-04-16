package com.coderyu.Controller;

import com.coderyu.Domain.Product;
import com.coderyu.Domain.User;
import com.coderyu.dao.ProductDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import java.util.Date;
import java.util.List;
import static org.springframework.web.bind.annotation.RequestMethod.GET;
import static org.springframework.web.bind.annotation.RequestMethod.POST;
import static org.springframework.web.bind.annotation.RequestMethod.PUT;

@Controller
public class HomeController {

    @Autowired
    private ProductDAO productDAO;

    @ModelAttribute
    public void userModel(Long userId,String userName,Model model){
        User user=new User(userId,userName,new Date());
        model.addAttribute("user",user);
    }

    @RequestMapping(value = "/",method=GET)
    @ResponseBody
    public String home(String msg,Model model){
        return "OK"+(msg==null?"":msg);
    }

    @ResponseBody
    @RequestMapping(value="/createuser",method = POST,produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public User createUser(@RequestBody User user){
        String name=user.getUserName();
        Date time=user.getBirthday();
        return user;
    }

    @RequestMapping("/products")
    public @ResponseBody List<Product> productList(){
        return productDAO.getProductList();
    }

    @RequestMapping(value="/product/{id}",method = GET)
    public @ResponseBody Product getProduct(Long id){
        return productDAO.getProductById(id);
    }

    @RequestMapping(value="/product",method=POST)
    public @ResponseBody List<Product> createProduct(@RequestBody Product product){
        productDAO.createProduct(product);
        return productDAO.getProductList();
    }

    @RequestMapping(value="/product",method=PUT)
    public @ResponseBody List<Product> updateProduct(@RequestBody Product product){
        productDAO.updateProduct(product);
        return productDAO.getProductList();
    }
}
