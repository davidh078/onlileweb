package org.llp;

public class datastructure {
public static void main(String[] args) {

System.out.println("sringbuffer method/heap method");
StringBuffer s1=new StringBuffer("java");
StringBuffer s2=new StringBuffer("javaselenium");
StringBuffer s3=new StringBuffer("javaAutomation");

System.out.println(System.identityHashCode(s1));
System.out.println(System.identityHashCode(s2));
System.out.println(System.identityHashCode(s3));
StringBuffer gm=s2.append(s3);
System.out.println(""+System.identityHashCode(gm));



System.out.println(System.identityHashCode(s1));
System.out.println(System.identityHashCode(s2));
System.out.println(System.identityHashCode(s3));

System.out.println(""+System.identityHashCode(gm));

StringBuffer s11=new StringBuffer("java");
StringBuffer s21=new StringBuffer("javaselenium");
StringBuffer s31=new StringBuffer("javaAutomation");

System.out.println(System.identityHashCode(s11));
System.out.println(System.identityHashCode(s21));
System.out.println(System.identityHashCode(s31));
StringBuffer gm1=s21.append(s31);
System.out.println(""+System.identityHashCode(gm1));

}
}
