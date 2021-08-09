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
public class RestauranteSingleton {
    //Primero pongo privado el constructor
    private RestauranteSingleton(){}
    
    //Segundo creo un atributo estatico del tipo de dato de la clase
    private static RestauranteSingleton restauranteSingleton;
    
    //Tercero crear un metodo que obtenga el singleton. En caso de no existir, lo crea
    public static RestauranteSingleton obtenerSingleton(){
        if(restauranteSingleton == null){
            restauranteSingleton = new RestauranteSingleton();
        }
        return restauranteSingleton;
    }
}
