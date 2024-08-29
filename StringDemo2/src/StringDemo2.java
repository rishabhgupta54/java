class StringDemo2 {
    public static void main(String[] args) {
        String str1 = "First String";
        String str2 = "First String";
        String str3 = str1;

        System.out.println("Length of str1 is:" + str1.length());
        System.out.println("Character at 3rd index of str1 is:" + str1.charAt(3));

        if(str1.equals(str2)) {
            System.out.println("str1 == str2");
        } else {
            System.out.println("str1 != str2");
        }

        if(str1.equals(str3)) {
            System.out.println("str1 == str3");
        } else {
            System.out.println("str1 != str3");
        }
    }
}
