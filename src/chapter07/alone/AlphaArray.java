package chapter07.alone;

public class AlphaArray {

    public static void main(String[] args) {

        char[][] alphabets = new char[13][2];
        //행 [13] 열 [2] -> 1행의 1,2열 = [1].length

        int num = (int)'a';
        char ch = (char)(num-32);
        //char ch = 'A';

        //소문자로 하고싶을때는 char ch = 'a'; // 97
        //System.out.println((int)ch);

        for(int i = 0; i < alphabets.length; i++){//행의 길이
            for(int j = 0; j < alphabets[i].length; j++){//열의 길이
                alphabets[i][j] = ch;
                System.out.println(alphabets[i][j] + " ");
                ch++;
                //1행의 1열 97(a), 1행의 2열 98(b)
                //ch++로 다음 알파벳 대입
                //각 행의 열 길이를 반복하면 다음 행으로 넘어가는 중첩된 반복문
            }
            System.out.println(); //각 행마다 한줄 띄어쓰기
        }


//        String[][] strArr = new String[13][2]; -> 초기 구성
//        for(int i = 0; i < strArr.length; i++){
//            for(int j = 0; j < strArr[i].length; j++){}
//            System.out.println(strArr[i][j]);
//        }
    }
}
