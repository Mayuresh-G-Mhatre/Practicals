package p1;

import  javax.ejb.Local;

@Local
public interface cartBeanLocal 
{
    String addToCart(String pid, String name, String price);
    
    String showCart();
}
