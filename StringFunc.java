import java.util.Scanner;

class StringOp {
    String str1, str2;

    public StringOp(String str1, String str2) {
        this.str1 = str1;
        this.str2 = str2;
    }
}

class StringFunc{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string 1:");
        String str1 = sc.next();
        System.out.println("Enter string 2:");
        String str2 = sc.next();
        StringOp str = new StringOp(str1, str2);

        int ch, wish,pos;
        String string2,sub;
        
		System.out.println("----MENU----");
        System.out.println("1.Length\n2.Concatenation\n3.Extraction\n4.Comparison\n5.Modification\n6.Search");
        do {
            System.out.println("Enter your choice:");
            ch = sc.nextInt();
            switch (ch) {
                case 1:
                       System.out.println("Length of string 1: " + str.str1.length());
                       break;
                case 2:
                       System.out.println("Concatenated string: " + str.str1.concat(str.str2));
                       break;
                case 3:
                       System.out.println("Enter the position:");
                       pos = sc.nextInt();
                       if(pos >= 0 && pos < str.str1.length())
                          System.out.println("Character at position " + pos + ": " + str.str1.charAt(pos));
                       else
                          System.out.println("Invalid position.");
                          
                       break;
                case 4:
                       System.out.println("Enter the string to compare:");
                       string2 = sc.next();
                       System.out.println("Strings are equal? " + str.str1.equals(string2));
                       break;
                case 5:
       				   System.out.println("Enter the substring you want to replace:");
                       String oldSubstring = sc.next();
                       System.out.println("Enter the new substring:");
                       String newSubstring = sc.next();
                       String modifiedString = str.str1.replace(oldSubstring, newSubstring);
                       System.out.println("Modified string: " + modifiedString);
                       break;

                case 6:
                       System.out.println("Enter the substring to search for:");
                       sub = sc.next();
                       int index = str.str1.indexOf(sub);
                       if(index != -1) 
                          System.out.println("Substring found at index: " + index);
                       else
                          System.out.println("Substring not found.");
                       break;
                default:
                       System.out.println("Invalid choice.");
            }
            
            System.out.println("Do you wish to continue(1/0)?:");
            wish = sc.nextInt();
        } while (wish == 1);
    }
}
