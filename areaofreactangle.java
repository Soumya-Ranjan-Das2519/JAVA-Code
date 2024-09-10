import java.io.*;

import javafx.scene.effect.Light.Spot;
/**
 * areaofreactangle
 */
public class areaofreactangle {
    public static void main(String[] args) 
    throws Exception{
        int a,b,l;
        DataInputStream ar =new DataInputStream(System.in);
        System.out.println("enter the length of the reactangle:");
        l=Integer.parseInt(ar.readLine());
        System.out.println("enter the breath of the reactangle:");
        b=Integer.parseInt(ar.readLine());
        a=l*b;
        System.out.println("area of the reactangle is :"+a);


    }

    
}