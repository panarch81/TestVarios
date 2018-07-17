package main.cl.panarch;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class PrimeNumbers {
    static class Node {
        //int data;
        String data;
        Node left;
        Node right;

        //public Node(int data){
        public Node(String data){
            this.data = data;
        }
    }

    public static void main(String[] args){
        /*System.out.println(isPrime(5));
        Node root = new Node(4);
        insertInorder(root, 1);
        insertInorder(root, 10);
        insertInorder(root, 2);
        insertInorder(root, 3);
        insertInorder(root, 5);
        insertInorder(root, 6);
        insertInorder(root, 8);
        insertInorder(root, 16);
        insertInorder(root, 9);
        insertInorder(root, 11);
        insertInorder(root, 12);
        insertInorder(root, 13);
        insertInorder(root, 14);
        insertInorder(root, 15);
*/
        try {

            FileReader fr = new FileReader(new File("arch-pom.txt"));
            BufferedReader br = new BufferedReader(fr);

            String statement = "";
            Node root = new Node("");
            int flag = 0;
            while ((statement = br.readLine()) != null) { //(LINEA 493)
                //System.out.println(statement);
                if(statement.contains("<dependencies>")){
                    flag = 1;
                }
                if(flag==1 && statement.contains("<artifactId>")){
                    //System.out.println(statement);

                    insertInorder(root, statement);
                }
            }

           // Node root = new Node("");
            // preorderTree(root);
            inorderTree(root);
            //postorderTree(root);
        }catch(Exception e){
            e.printStackTrace();

        }
    }

    public static void insertInorder(Node root, String data){
        if(root == null) return;

        if( data.compareTo(root.data) <= 0 ){
            if(root.left ==  null){
                root.left = new Node(data);
            }else{
                insertInorder(root.left, data);
            }
        }

        if(data.compareTo(root.data) > 1){
            if(root.right ==  null){
                root.right = new Node(data);
            }else{
                insertInorder(root.right, data);
            }
        }

    }

    /*public static void insertInorder(Node root, int data){
        if(root == null) return;

        if(data < root.data){
            if(root.left ==  null){
                root.left = new Node(data);
            }else{
                insertInorder(root.left, data);
            }
        }

        if(data > root.data){
            if(root.right ==  null){
                root.right = new Node(data);
            }else{
                insertInorder(root.right, data);
            }
        }

    }*/

    //Right Left Root
    public static void preorderTree(Node root){
        if(root == null) return;

        //if(isPrime(root.data)){
            System.out.println(root.data);
        //}
        preorderTree(root.left);
        preorderTree(root.right);
    }


    public static boolean isPrime(int number){
        for(int i=2; i < number; i++){
            if(number % i == 0) return false;
        }
        return true;
    }

    //Left Right Root
    public static void postorderTree(Node root){
        if(root == null) return;

        postorderTree(root.left);
        postorderTree(root.right);
        System.out.println(root.data);
    }

    //Left Root Right
    public static void inorderTree(Node root){
        if(root == null) return;
        inorderTree(root.left);
        System.out.println(root.data);
        inorderTree(root.right);
    }
}
