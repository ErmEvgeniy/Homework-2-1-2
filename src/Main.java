class Main {
    public static void main(String[] args) {
        int account = 100;
        int topup1 = 100;
        int topup2 = 1001;
        bonuscounter(account,topup1);
        bonuscounter(account,topup2);
    }
    static void bonuscounter(int total , int  pay ){
        int bonus = 0;
        if( pay > 1000){
            bonus = pay / 100;
        }
        int accountresult= total + pay + bonus;
        System.out.println("на счету = " + accountresult + " количество бонусов = " + bonus);
    }
}
