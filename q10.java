public class q10 {

    public static void main(String args[]) {
        String arr[] = {"c", "m", "m", "c", "m"};
        boolean istrue = false;
        if (arr.length == 1) {
            if (arr[0] == "c") {
                System.out.println("yes");
                return;
            } else {
                System.out.println("no");
                return;
            }
        }
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] == "c") {
                if (arr[i + 1] == "m") {
                    istrue = true;
                } else {
                    istrue = false;
                    break;
                }
            }
        }

        if (istrue) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }

    }
}