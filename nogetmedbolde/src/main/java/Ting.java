import processing.core.PApplet;

public class Ting {



    //Tings position
    float x, y;
    float colorR = 100;
    PApplet p;
    

    Ting(float x, float y){

        //Opgave 2: Her skal du skrive kode der sÃ¦tter positionen for tingen x og y
        this.x = x;
        this.y = y;

    }

    void tegn(){
        //Opgave 3: Her skal du skrive kode der tegner denne "Ting"
        p.ellipse(x,y,10,10);
        
    }

    void flyv(){

        this.x = x + 1;
        this.y = y + 1;
        //Opgave 4: Her skal du skrive kode der flytter "Ting"
        //ps: Husk de mÃ¥ ikke flytte sig uden for skÃ¦rmen...


    }




}