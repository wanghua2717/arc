package com.wang.dubbo.api;



import lombok.Data;

import java.io.Serializable;
@Data
public class User  implements Serializable{
    private long id;
    private String name;
    private double salary;
}
