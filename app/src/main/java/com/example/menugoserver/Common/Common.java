package com.example.menugoserver.Common;

import com.example.menugoserver.Model.Request;
import com.example.menugoserver.Model.User;

public class Common {
    public static User currentUser;
    public static Request currentRequest;
    public static String UPDATE = "Actualizar";
    public static String DELETE = "Eliminar";
    public static final int PICK_IMAGE_REQUEST = 71;

    public static String convertCodeToStatus(String code) {

        if (code.equals("0"))
            return "Pedido";
        else if (code.equals("1"))
            return "En reparto";
        else
            return "Recibido";
    }
}
