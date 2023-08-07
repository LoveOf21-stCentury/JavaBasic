package Les1;

import java.io.BufferedReader;
import java.io.FileReader;

public class Lctr1 {
    public static void main(String[] args) throws Exception {
//        String  a = "qwe";
//        int x = 112;
//        String q = a+x;
//        System.out.println(q);


//        Scanner s = new Scanner(System.in);
//        System.out.println("int a: ");
//        boolean flag = s.hasNextInt();
//        System.out.println(flag);
//        int a = s.nextInt();
//        System.out.println(a);
//        s.close();

//        try (FileWriter fw = new FileWriter("file.txt", false)) {
//            fw.write("line 1");
//            fw.append('\n');
//            fw.append('2');
//            fw.append('\n');
//            fw.write("line 3");
//            fw.flush();
//        } catch (IOException ex) {
//            System.out.println(ex.getMessage());
//        }



//        FileReader fr = new FileReader("file.txt");
//        int c;
//        while((c= fr.read()) != -1){
//            char ch = (char) c;
//            if (ch == '\n'){
//                System.out.println(ch);
//            } else {
//                System.out.println(ch);
//            }
//        } еще throw Exception раскоментировать

        BufferedReader br = new BufferedReader(new FileReader("file.txt"));
        String str;
        while ((str = br.readLine()) != null){
            System.out.printf("== %s ==\n", str);
        }
        br.close();

    }

}
