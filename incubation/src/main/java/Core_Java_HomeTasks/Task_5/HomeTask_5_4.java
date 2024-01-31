package Core_Java_HomeTasks.Task_5;

public class HomeTask_5_4 {
    public int blueTicket(int a, int b, int c) {

        if(abpair(a,b)==10 || bcpair(b,c)==10 || capair(c,a)==10){
            return 10;
        }
        if((abpair(a,b)==bcpair(b,c)+10)|| (abpair(a,b)==capair(c,a)+10)){
            return 5;
        }
        return 0;

    }

    public int abpair(int a,int b){return a+b;}
    public int bcpair(int b,int c){return b+c;}
    public int capair(int c,int a){return c+a;}
}
