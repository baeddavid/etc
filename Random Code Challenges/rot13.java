    public static String rot13(String code){
        char[] charArr = code.toCharArray();
        int[] codeArr = new int[charArr.length];
        String answer = "";

        for(int i = 0; i < charArr.length; i++)
            codeArr[i] = charArr[i];

        for(int i = 0; i < codeArr.length; i++){
            if(codeArr[i] == 32 || codeArr[i] == 33 || codeArr[i] == 63 || codeArr[i] == 44 || codeArr[i] == 46)
                continue;
            else if(codeArr[i] + 13 > 90)
                codeArr[i] = 65 + (codeArr[i] + 13 -90 - 1);
            else
                codeArr[i] += 13;
        }

        for(int i = 0; i < charArr.length; i++) {
            charArr[i] = (char) codeArr[i];
            answer += charArr[i];
        }
        return answer;
    }
}
