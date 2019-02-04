public class Runner {
    //Warm Up 1

    public boolean icyHot(int temp1, int temp2) {
        if(( temp1 < 0 &&  temp2 > 100) || ( temp2 < 0 && temp1 > 100)){
            return true;
        }
        return false;
    }

    //Warm Up 2

    public String stringX(String str) {
        String x = "";
        for (int i = 0 ; i < str.length(); i++) {
            if(!(i > 0 && i < (str.length()-1) && str.substring(i, i+1).equals("x"))) {
                x = x + str.substring(i, i+1);
            }
        }
        return x;
    }

    //String 1

    public String makeAbba(String a, String b) {
        return (a + b + b + a) ;
    }

    //Array 1

    public boolean sameFirstLast(int[] nums) {
        if ( nums.length >= 1 && nums[0] == nums[nums.length - 1]) {
            return true;
        } else {
            return false;
        }
    }

    //Logic 1

    public boolean cigarParty(int cigars, boolean isWeekend) {
        if( cigars >= 40 && cigars <= 60) {
            return true;
        }
        if( cigars >= 40 && isWeekend == true ) {
            return true;
        } else {

            return false;
        }
    }

    //Logic 2

    public int luckySum(int a, int b, int c) {
        if ( a == 13){
            return 0;
        }
        if ( b == 13){
            return a;
        }
        if ( c == 13){
            return a + b;
        } else {
            return a + b + c;
        }
    }

    //String 2

    public String doubleChar(String str) {
        String empty = "";
        for ( int i = 0; i < str.length(); i++) {
            empty = empty + str.substring(i,i+1) + str.substring(i,i+1) ;
        }
        return empty;
    }

    //String 3

    public boolean gHappy(String str) {
        int string = str.length();
        boolean real = true;

        for (int i = 0; i < string; i++) {
            if (str.charAt(i) == 'g') {
                if (i > 0 && str.charAt(i - 1) == 'g')
                    real = true;
                else if (i < string - 1 && str.charAt( i + 1) == 'g')
                    real = true;
                else
                    real = false;
            }
        }
        return real;
    }


    //Array 2

    public boolean lucky13(int[] nums) {
        boolean happy = true ;
        for ( int i = 0; i < nums.length; i++){
            if( nums[i] == 1 || nums[i] == 3){
                return false;
            }
        }
        return true;
    }

    //Array 3

    public int maxSpan(int[] nums) {
        if (nums.length > 0) {
            int maxSpan = 1;
            for (int i = 0; i < nums.length; i++)
                for (int b = nums.length - 1; b > i; b--)
                    if (nums[b] == nums[i]) {
                        int real = (b - i) + 1;
                        if (real > maxSpan){
                            maxSpan = real;
                        }
                    }
            return maxSpan;
        } else {
            return 0;
        }
    }










}