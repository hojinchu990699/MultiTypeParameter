package com.sist;

/**
 * Created by hojin on 16. 3. 1.
 */
public class PlatformLab {
    public static void main(String[] args){
        Platform<Tv,String> platform1=new Platform<Tv,String>();
        platform1.setKind(new Tv());
        platform1.setTitle("tvOS");
        Tv tv=platform1.getKind();
        String tvTitle=platform1.getTitle();

        System.out.println(tvTitle);

        Platform<Watch,String> platform2=new Platform<Watch,String>();
        platform2.setKind(new Watch());
        platform2.setTitle("watchOS2");
        Watch watch=platform2.getKind();
        String carTitle=platform2.getTitle();

        System.out.println(carTitle);
    }
}
