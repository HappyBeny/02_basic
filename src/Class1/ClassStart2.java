package class1;

public class ClassStart2 {
    public static void main(String[] args) {

        String[] SN = {"학생1", "학생2"};
        int[] SA = {15, 16};
        int[] SG = {90, 80};

        for (int i = 0; i < SN.length; i++) {
            System.out.println("이름 : " + SN[i] + ", 나이 : " + SA[i] + ", 성적 : " + SG[i]);
        }
    }
}
