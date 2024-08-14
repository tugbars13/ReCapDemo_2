public class Main {
    public static void main(String[] args) {

        //double [] myList = new double [4] ;
        double[] myList = {1.2, 1.3, 6.3, 5.6};
        //iki şekildede dizi tanımlayabilirsiniz
        double total = 0;
        double MAX = myList[0];

        //sayılarımızı ekrana yazdırıyoruz
        for (int i = 0; i < myList.length; i++) {
            total = total + myList[i];
            System.out.println(myList[i]);
            //dizideki en büyük sayıyı buluruz
            if (MAX < myList[i]) {
                MAX = myList[i];
            }
        }
        System.out.println("Toplam = " + total);
        System.out.println("En Büyük Sayı = " + MAX);

    }
}