package com.vsk.practice.exercise;



public class NonRepeatingCharacter {
    public static void main(String[] args) {
        NonRepeatingCharacter("yy");
    }
    static char NonRepeatingCharacter(String s)
    {
        for(int i = 0 ; i < s.length(); i++){
            boolean flag = true;
            for(int j = i+1 ; j < s.length(); j++){
                if(s.charAt(i) == s.charAt(j)){
                    flag = false;
                    break;
                }
            }
            if (flag){
                return s.charAt(i);
            }
        }
        return '$';
    }
}
//    public static void main(String[] args) {
//        String S = "vidyasagar";
//        char[] c = S.toCharArray();
//        System.out.println(c);
//        for (int i = 0 ; i < c.length ; i++) {
//            if(visitedCharacter(c[i])){
//                continue;
//            }
//            boolean flag =true;
//            for (int j = i+1; j < c.length; j++) {
//                if (c[i] == c[j]) {
//                    flag = false;
//                    break;
//                }
//            }
//            if (flag) {
//                System.out.println(c[i]);
//            }
//        }
//    }
//    public static boolean visitedCharacter(char c1){
//        ArrayList<Character> arr = new ArrayList<>();
//
//        for (Character character : arr) {
//            if (character == c1) {
//                return true;
//            }
//        }
//        arr.add(c1);
//        return false;
//    }

//    String s = "zxvczbtxyzvy";
//        for(int i = 0 ; i < s.length(); i++){
//        boolean flag = true;
//        for(int j = i+1 ; j < s.length(); j++){
//        if(s.charAt(i) == s.charAt(j)){
//        flag = false;
//        break;
//        }
//        }
//        if (flag){
//        System.out.println(s.charAt(i));
//        break;
//        }
//        }