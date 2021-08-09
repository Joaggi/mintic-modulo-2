/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package holamundo.patrones;

/**
 *
 * @author J_oa_
 */
public class MainSingleton {
    public static void main(String[] args) {
        // RestauranteSingleton restauranteSingleton = new RestauranteSingleton(); //Esta linea no se puede crear ya que el restaurante tiene privado el constructor
        
        RestauranteSingleton restauranteSingleton1 = RestauranteSingleton.obtenerSingleton();
       
        RestauranteSingleton restauranteSingleton2 = RestauranteSingleton.obtenerSingleton();
        
        System.out.println(restauranteSingleton1 == restauranteSingleton2);
    }
}
