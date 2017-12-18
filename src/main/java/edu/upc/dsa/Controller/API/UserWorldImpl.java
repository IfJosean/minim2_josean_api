package edu.upc.dsa.Controller.API;

import edu.upc.dsa.Model.Model.Main.Pedido;
import edu.upc.dsa.Model.Model.Main.User;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Logger;

/**
 * Created by Josean on 18/12/2017.
 */
public class UserWorldImpl {

    //Variable declarations

    private static UserWorldImpl instance = null;
    final static Logger logger = Logger.getLogger(UserWorldImpl.class);
    private Map<Integer, User> map; // key=userId

    //Constructor

    public UserWorldImpl(){
        map = new HashMap<>();
    }

    //Getters and Setters

    public Map<Integer, User> getMap() {
        return map;
    }
    public void setMap(Map<Integer, User> map) {
        this.map = map;
    }
    public String getUsername (int id) {
        return get(id).getUsername();
    }

    //Singleton pattern

    public static UserWorldImpl getInstance() {
        if (instance == null) instance = new UserWorldImpl();
        return instance;
    }

    //Private functions

    private Boolean doExist(int id){
        logger.info("doExist: Checking if user id: "+id+" exists...");

        if(map.containsKey(id)) {
            logger.info("doExist: User with id: "+id+" already exists");
            return true;
        }

        else {
            logger.info("doExist: User with id: "+id+" doesn't exist");
            return false;
        }
    }

    private ArrayList<User> sortUsersById(ArrayList<User> users) {
        users.sort(Comparator.comparing(User::getId));
        return users;
    }

    private ArrayList<User> sortPedidosByPrecio(ArrayList<Pedido> pedidos) {
        pedidos.sort(Comparator.comparing(User::getId));
        return pedidos;
    }

    public ArrayList<User> getAll() {
        return new ArrayList<>(map.values());
    }

    public ArrayList<User> getAllSortedById() {
        return sortUsersById(getAll());
    }



    public ArrayList<Pedido> getAll() {
        return new ArrayList<>(map.values());
    }

    public ArrayList<Pedido> getAllSortedById() {
        return sortPedidosByPrecio(getAll());
    }


    public ArrayList<Pedido> getPedidosRealizados(User u){
        return u.getPedidosRealizados()
    }


}
