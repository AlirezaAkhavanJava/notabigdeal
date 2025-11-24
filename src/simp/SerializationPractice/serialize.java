package simp.SerializationPractice;

import java.io.*;

public class serialize {
    public static void operate() throws IOException, InterruptedException {
        File filePath = new File("product.ser");
        FileOutputStream fos = new FileOutputStream(filePath);
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        Product tea = new Product("Ahmed Tea" , 14.0F);
        oos.writeObject(tea);

        Thread.sleep(100);
        oos.close();
        fos.close();

        System.out.println("====== OPERATION FINISHED SUCCESSFULLY ======");
    }

    public static void deserialize(File filePath) throws IOException, InterruptedException, ClassNotFoundException {
        // mnt/hdd/Idea/CoreJava
        Product tea;
        FileInputStream fis = new FileInputStream(filePath);
        ObjectInputStream ois = new ObjectInputStream(fis);
        tea = (Product) ois.readObject();
        ois.close();
        fis.close();
        System.out.println("====== DESERIALIZATION FINISHED ======");
        System.out.println(tea.price);
        System.out.println(tea.productName);
    }
}
