
import java.util.*;

class Product {

    private String productName;
    private double productPrice;


    

    public void addProduct(String productName, double productPrice) {

        this.productName = productName;
        this.productPrice = productPrice;

    }

    public void removeProduct(ArrayList<Product> arr) {

        Scanner in = new Scanner(System.in);
        System.out.print("Enter product name: ");

        String name = in.nextLine();

        boolean found = false;
        int i;
        for (i = 0; i < arr.size(); i++) {

            if (arr.get(i).productName.equals(name)) {
                found = true;
                break;

            }
        }
        if (found) {
            arr.remove(i);
            System.out.println("Product removed");
        }
        else {
            System.out.println("product not found");
        }



    }


    public void getDetails(ArrayList<Product> arr) {

        for (int i = 0; i < arr.size(); i++) {
            System.out.println("Product name : " + arr.get(i).productName +
            " and Price : " + arr.get(i).productPrice);
        }

    }


    public void getProductByIndex(ArrayList<Product> arr) {

        Scanner in = new Scanner(System.in);
        System.out.println("enter index : ");
        int ind = in.nextInt();

        if (ind < 0 || ind > arr.size() - 1) {
            System.out.println("Index out of bound");
        }
        else {
            System.out.println("Product name : " + arr.get(ind).productName + 
            " and Price : " + arr.get(ind).productPrice);
        }

    }

    public void removeProductByIndex(ArrayList<Product> arr) {

        Scanner in = new Scanner(System.in);
        System.out.println("enter index : ");
        int ind = in.nextInt();

        if (ind < 0 || ind > arr.size() - 1) {
            System.out.println("Index out of bound");
        }
        else {
            arr.remove(ind);
            System.out.println("Product removed");
        }


    }

}


class ShoppingCart extends Product {

}



class Main1 {

    public static void main(String[] args) {
        ShoppingCart mainObj = new ShoppingCart();
        Scanner in = new Scanner(System.in);
        ArrayList<Product> arr = new ArrayList<>();

        Product p1 = new Product();
        p1.addProduct("Samsung", 2000);

        Product p2 = new Product();
        p2.addProduct("Reamle", 8552);

        Product p3 = new Product();
        p3.addProduct("redmi", 26800);

        Product p4 = new Product();
        p4.addProduct("oneplus", 85800);

        Product p5 = new Product();
        p5.addProduct("nokia", 800);

        arr.add(p1);
        arr.add(p2);
        arr.add(p3);
        arr.add(p4);
        arr.add(p5);

        //mainObj.getDetails(arr);
        //mainObj.getProductByIndex(arr);



        while (true) {

            System.out.println("\nEnter 1 for adding product.");
            System.out.println("Enter 2 for product details.");
            System.out.println("Enter 3 for remove product.");
            System.out.println("Enter 4 for get product based on index.");
            System.out.println("Enter 5 for remove product based on index.");
            System.out.println("Enter 0 to stop.\n");


            int check = in.nextInt();

            if (check == 1) {

                // String name = in.nextLine();
                // double price = in.nextDouble();
                // mainObj.addProduct(name, price);

                mainObj.addProduct("Hp", 541528);
                arr.add(mainObj);
            }
            else if (check == 2) {
                mainObj.getDetails(arr);
            }
            else if (check == 3) {
                mainObj.removeProduct(arr);
            }
            else if (check == 4) {
                mainObj.getProductByIndex(arr);
            }
            else if (check == 5) {
                mainObj.removeProductByIndex(arr);
            }
            else if (check == 0) {
                break;
            }


        }
        


    }
}