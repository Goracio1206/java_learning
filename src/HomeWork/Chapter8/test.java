package HomeWork.Chapter8;

/**
 * Created by Vitalii.Nedzelskyi on 27.11.2015.
 */
public class test {
    public static void main(String[] args) {
        String str = "ava";
        char ch = 0x74; // 74 - это код символа 'J'
        str = ch + str;
        System.out.print(str);
        System.out.println("");
        StringBuffer s = new StringBuffer("you java");
        s.insert(2, "like ");
        System.out.print(s);

    }
}
