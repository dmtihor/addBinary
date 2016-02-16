class AddBinary {
    String add(String a, String b) {

        int aLength = a.length();
        int bLength = b.length();
        int temp = 0;
        int i = 0;
        StringBuilder res = new StringBuilder();

        while (i < aLength || i < bLength) {
            char aTemp = (i < aLength) ? a.charAt(aLength - 1 - i) : '0';
            char bTemp = (i < bLength) ? b.charAt(bLength - 1 - i) : '0';

            int sum = (aTemp - '0') + (bTemp - '0') + temp;

            if (sum == 0) {
                res.append('0');
                temp = 0;
            } else if (sum == 1) {
                res.append('1');
                temp = 0;
            } else if (sum == 2) {
                res.append('0');
                temp = 1;
            } else if (sum == 3) {
                res.append('1');
                temp = 1;
            }
            i++;
        }

        if (temp == 1) {
            res.append('1');
        }
        return res.reverse().toString();
    }
}