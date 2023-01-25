package org.example.beans;

import lombok.Data;

import java.io.Serializable;

@Data
public class OwnerBean implements Serializable {
    private String username;

    private String username_original;

}
