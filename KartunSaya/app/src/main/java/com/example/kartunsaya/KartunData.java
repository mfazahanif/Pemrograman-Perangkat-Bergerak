package com.example.kartunsaya;

import java.util.ArrayList;

public class KartunData {
    public static String[][] data = new String[][]{
            {"0","Spongebob Squarepants", "Spongebob Squarepants adalah serial kartun yang diproduksi oleh Nickelodeon pada tahun 1999 oleh Stephen Hillenburg","https://i.postimg.cc/qBYNC03y/sponge.jpg"},
            {"1","Larva", "Larva adalah serial kartun yang diproduksi oleh Tuba Entertainment di Seoul, Korea","https://i.postimg.cc/cJgWcJXR/larva.jpg"},
            {"2","Tom and Jerry", "Tom and Jerry adalah salah satu kartun tertua, yaitu diproduksi pada tahun 1940 oleh William Hanna dan Joseph Barbera","https://i.postimg.cc/XvCMCzYx/tom.jpg"},
            {"3","Bernard Bear", "Bernard Bear adalah serial kartun yang menceritakan seekor beruang kutub yang selalu sial. Kartun ini dirilis pada tahun 2004","https://i.postimg.cc/3NLf6Xwd/bernard.jpg"},
            {"4","Oscar Oasis", "Oscar Oasis adalah serial kartun yang menceritakan seekor kadal yang bertahan hidup di sebuah gurun. Kartun ini pertama kali tayang pada tahun 2010","https://i.postimg.cc/tCYBJVTN/oscar.jpg"},
            {"5","Shaun The Sheep", "Shaun the Sheep adalah serial kartun untuk anak-anak yang berasal dari Inggris. Kartun ini pertama kali tayang pada tahun 2007","https://i.postimg.cc/vHbLhTdR/shaun.jpg"},
            {"6","Upin&Ipin dan Kawan-Kawan", "Upin dan Ipin adalah serial kartun yang dirilis pada tahun 2007 di negara Malaysia. Kartun ini menceritakan tentang petualangan Upin Ipin dan kawan-kawan. Kartun ini diproduksi oleh Les` Copaque","https://i.postimg.cc/sxcWqPCk/upin.jpg"},
    };

    public static ArrayList<Kartun> getListData(){
        ArrayList<Kartun> list = new ArrayList<>();
        for (String[] kartunData : data){
            Kartun kartun = new Kartun();
            kartun.setId(Integer.parseInt(kartunData[0]));
            kartun.setName(kartunData[1]);
            kartun.setDescription(kartunData[2]);
            kartun.setPhoto(kartunData[3]);

            list.add(kartun);
        }
        return list;
    }
}
