package org.iesch.org.rest1.erroresDTO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ProductErrorDTO {

    String mensaje;
    String error;
    int status;
    Date date;

}
