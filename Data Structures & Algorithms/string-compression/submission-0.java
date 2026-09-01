class Solution {
    public int compress(char[] chars) {
        int i = 0;
        int index = 0;
        
        while(i<chars.length){
            char current = chars[i];
            int count = 0;
            while(i<chars.length && chars[i] == current){
                count++;
                i++;
            }

            //write the character
            chars[index] = current;
            index++;

            if(count>1){
                String number = String.valueOf(count);
                for(int j=0;j<number.length();j++){
                    chars[index] = number.charAt(j);
                    index++;
                }
            }
        } return index;
    }
}