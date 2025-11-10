void main() {
    Scanner sc = new Scanner(System.in);
    System.out.println("Gib Zahl ein:");
    double n = sc.nextInt();
    sc.close();
    int x = 1;
    if(n>0){
        for (int i=1;i<=n ; i++){
            x = x*i;
        }
    }

    System.out.println(x);

    for(int i=1;i<=n;i++){
        if(n%i !=0){
            System.out.println("fehler");
            break;
        }
        n = n/i;
    }






}