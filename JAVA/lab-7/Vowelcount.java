import java.util.*;;

class Countofvowel
{

    void wordcount(String str)
    {
        int j=0,a=0,e=0,i=0,o=0,u=0;

        for(j=0;j<=str.length();j++)
        {
            if(str[j] == 'a')
            {
                a++;
            }
            else if(str[j] == 'e')
            {
                e++;
            }
            else if(str[j] == 'i')
            {
                i++;
            }
            else if(str[j] == 'o')
            {
                o++;
            }
            else if(str[j] == 'u')
            {
                u++;
            }

        }

        System.out.println("A is:"+a);
        System.out.println("E is:"+e);
        System.out.println("I is:"+i);
        System.out.println("O is:"+o);
        System.out.println("U is:"+u);
    }
}




public class Vowelcount {
    public static void main(String[] args) {
        
        Scanner sc =  new Scanner(System.in);
        

        System.out.println("Enter string :"); 
        String str = sc.next();

        Countofvowel w1 = new Countofvowel();

        w1.wordcount(str);

    }
    
}
    