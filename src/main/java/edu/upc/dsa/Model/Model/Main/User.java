package edu.upc.dsa.Model.Model.Main;

import java.util.HashMap;

/**
 * Created by Josean on 18/12/2017.
 */
public class User {

    //Private atributes

    private int id;
    private String username;
    private String password;
    private int lastMap;
    private HashMap<String,Integer> items;
    private HashMap<String,Integer> pedidos;
    private HashMap<String,Integer> pedidosrealizados;
    private boolean admin;


    //Constructors

    public User () {
        this.items = new HashMap<>();
    }

    public User(int id, String username, String password) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.items = new HashMap<>();
        this.pedidos = new HashMap<>();
        this.pedidosrealizados = new HashMap<>();
    }

    public User(int id, String username, String password, boolean admin) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.admin = admin;
        this.items = new HashMap<>();
        this.pedidos = new HashMap<>();
        this.pedidosrealizados = new HashMap<>();


    }

    //Getters and Sertters

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setAllItems(HashMap<String,Integer> items) {
        this.items = items;
    }

    public HashMap<String,Integer> getAllItems() {
        return items;
    }

    public void setItem (String item,Integer cantidad) {

        this.items.put(item,cantidad);
    }

    public Integer getItem (String item) {

        Integer cantidad = this.items.get(item);

        if (cantidad == null){
            return 0;
        }
        else {
            return cantidad;
        }
    }

    ///
    public HashMap<String,Integer> getPedidos() {
            return getPedidos();
    }

    public HashMap<String,Integer> getPedidosRealizados() {
        return getPedidosRealizados();
    }

    public void setPedidos
        this.pedidos;
    }

    public Integer getPedido (String item) {

        return pedidos;
    }

    ///
    public boolean getAdmin() {
        return admin;
    }

    public void setAdmin(boolean admin) {
        this.admin = admin;
    }

}
