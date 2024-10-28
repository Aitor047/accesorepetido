package org.iesch.ad.ejemploExcepciones.errorresDTO;

import lombok.Data;

import java.util.Date;

@Data
public class ErrorDTO {
    private String message;
    private String error;
    private int status;
    private Date date;


}
