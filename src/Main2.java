void main() {
    int[] Liste = {1,2,3,4,5};
    int zahle = 0;
    for (int j : Liste) {
        zahle = zahle + j;
    }
    zahle = zahle/Liste.length;
    System.out.println(zahle);


    int[] Liste2 ={1,2,3,4,5};
    int[] Liste3= new int [Liste2.length];

    for(int i=0;i<Liste2.length;i++){
        Liste3[i]=Liste2[i];
    }

    System.out.println(java.util.Arrays.toString(Liste3));
}