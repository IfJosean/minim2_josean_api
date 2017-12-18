package edu.upc.dsa.Controller.API;

import edu.upc.dsa.Model.Model.Main.User;

/**
 * Created by Josean on 18/12/2017.
 */
public interface UserWorld {

    Boolean set(User usr);
    Boolean del(int id);
    User get(int id);


}
