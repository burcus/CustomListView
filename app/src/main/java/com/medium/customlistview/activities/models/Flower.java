package com.medium.customlistview.activities.models;

import android.net.Uri;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Flower {

    public String name;
    public String genus;
    public int photo;

    /* If you don't have lombok plugin, you can use this constructor - Eğer projede lombok kütüphanesi yoksa bu yapılandırıcıyı kullanabilirsiniz
    public Flower(String name, String genus, String photo){
        this.name = name;
        this.genus = genus;
        this.photo = photo;
    }
    */
}
