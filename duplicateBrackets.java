import java.util.Scanner;
import java.util.Stack;

class duplicateBrackets {
    public static void main(String[] args){
        System.out.println("Everything going good");


        Scanner scn=new Scanner(System.in);
        Stack<Character> st=new Stack<>();
        String str=scn.nextLine();

        for(int i=0;i<str.length();i++){
                char ch=str.charAt(i);
                if(ch==')'){
                    if(st.peek()=='('){
                        System.out.println("true");
                        return;

                    }else{
                        while(st.peek()!='('){
                            st.pop();
                        }
                        st.pop();
                    }
                }else{
                    st.push(ch);
                }


        }
        System.out.println("false");


    }


}
