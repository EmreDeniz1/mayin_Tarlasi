package Mayin_Tarlasi;


public class Matris {

    int a;
    int b;
    String[][] ana;
    int[][] may;
    int y;
    int sayac;


    public Matris(int a, int b) {
        this.a = a;
        this.b = b;
        this.y = Math.round(this.a*this.b / 4);
        this.may = new int[a][b];
        this.ana = new String[a][b];
        this.sayac = (this.a * this.b - y);
    }
    public String[][] Tire(){

        for(int i = 0; i < this.a; i++) {
           for (int j = 0; j < this.b; j++) {
                ana[i][j] = "-";
            }
        }

        return ana;
    }
    public int[][] Mayin(Matris big){
        System.out.println("Mayýn: " +y);
        for(int i = 0; i < big.a; i++){
            for(int j = 0; j < big.b; j++){
                double x = Math.random();
               if(x > 0.5){
                   may[i][j] = 9;
                   y--;
               } if (y < 1)
                    break;
            }
            if (y < 1)
                break;
        }
        for( int i = 0; i < may.length; i++){
            for (int j = 0 ; j < may[0].length; j++){
                System.out.print(may[i][j]);
                System.out.print(" ");}
            System.out.println(" "); }

        return may;
    }

    public boolean Tarama(int x, int c){
        int k = 0, w = 0;
        int sat1 = x - 1, sut1 = c - 1;
        int sat2 = x + 1, sut2 = c + 1;

        if(this.may[x][c] == 9){
            System.out.print("Mayýna Bastýnýz.");
            return false;
        } else {
            if(x - 1 < 0){
                sat1 = 0;
            } if (x + 1 > this.a - 1){
                sat2 = x;
            } if(c - 1 < 0){
                sut1 = 0;
            } if(c + 1 > this.b - 1){
                sut2 = c;
            }
            for(int i = sat1; i <= sat2 ; i++){
                for(int j = sut1; j <= sut2 ; j++ ){
                    if(may[i][j] == 9){
                        k++;
                    }
                }
            }

            ana[x][c] = String.valueOf(k);
            for( int i = 0; i < ana.length; i++){
                for (int j = 0 ; j < ana[0].length; j++){
                    System.out.print(ana[i][j]);
                    System.out.print(" ");}
                System.out.println(" "); }
            return true;
            }

        }


    }

