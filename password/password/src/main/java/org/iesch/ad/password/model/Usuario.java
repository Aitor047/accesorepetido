package org.iesch.ad.password.model;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.util.DigestUtils;

import java.time.LocalDateTime;
import java.util.ArrayList;

@Data
public class Usuario {
    private String password;
    private String username;
    private ArrayList<String> oldpassword;
    private LocalDateTime validoHasta;

    public Usuario() {
        this.oldpassword = new ArrayList<>(3);
    }

    public Usuario(String password, String username) {
        this.password = DigestUtils.md5DigestAsHex((password).getBytes());
        this.username = username;
        this.oldpassword = new ArrayList<>(3);
        this.validoHasta = LocalDateTime.now().plusDays(180);
    }
}
