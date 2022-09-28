package p1;

import javax.ejb.Stateful;
import java.util.*;

@Stateful
public class cartBean implements cartBeanLocal {

    public Vector<Product> cart = new Vector<Product>();
    @Override
    public String addToCart(String pid, String name, String price) {
        for(Product product : cart)
        {
            if(product.getPid().equals(pid))
            {
                return "Product is already in cart";
            }
        }
        Product pr = new Product(pid,name,price);
        cart.add(pr);
        return "Product added";
      }

    @Override
    public String showCart() {
        String allProductInCart = "";
        for(Product product : cart)
        {
            allProductInCart += product.getPid()+":"+product.getName()+":"+product.getPrice()+";";
        }
        return allProductInCart;
    }
}

class Product
{
    String pid;
    String name;
    String price;

    public Product(String pid, String name, String price) {
        this.pid = pid;
        this.name = name;
        this.price = price;
    }

    public String getPid() {
        return pid;
    }

    public void setPid(String pid) {
        this.pid = pid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }
    
}
