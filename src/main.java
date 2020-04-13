class Main {
    public static void main(String[] args) {
        int account = 100;
        int top_up1 = 100;
        int top_up2 = 1001;
        bonus_counter(account,top_up1);
        bonus_counter(account,top_up2);
    }
    static void bonus_counter(int b , int  f ){
        int bonus = 0;
        if( f > 1000){
            bonus = f / 100;
        }
        int account_result= b + f + bonus;
        System.out.println("на счету = " + account_result + " количество бонусов = " +bonus);
    }
}
