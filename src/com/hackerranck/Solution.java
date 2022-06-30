package com.hackerranck;

import org.codehaus.jackson.JsonFactory;
import org.codehaus.jackson.JsonParser;
import org.codehaus.jackson.JsonToken;
import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.map.util.Comparators;

import java.io.*;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

public class Solution {

    private String s;

    public Solution(String s) {
        this.s = s;
    }

    public static void main(String args[]) throws Exception {
        /*Scanner sc = new Scanner(System.in);
        int l = sc.nextInt();
        int b = sc.nextInt();

        Shape shape = new Shape(l,b);
        shape.area();

        Shape rectangle = new Rectangle(l,b);
        rectangle.area();*/

        //String encryptedMessage = "world hel2o";

        /*String[] arr = encryptedMessage.split(" ");

        for (int i =0; i<arr.length; i++) {
            String word = arr[i];
            String newWord = "";
            if (word.matches("\\S*(\\S*([a-zA-Z]\\S*[0-9])|([0-9]\\S*[a-zA-Z]))\\S*")) {
                for (int j=0; j<word.length(); j++) {
                    if (Character.isDigit(word.charAt(j))) {
                        int n = Integer.parseInt(String.valueOf(word.charAt(j)));
                        char s = word.charAt(j-1);

                        newWord = word.substring(0, j-1);
                        for (int k = 0; k<n; k++) {
                            newWord = newWord + s;
                        }
                        newWord = newWord + word.substring(j+1);
                    }
                }
                arr[i] = newWord;
            }
        }
        String decrypt = "";
        for (int i = arr.length-1; i>-1; i--) {
            decrypt = decrypt + arr[i] + " ";
        }

        return decrypt;

        System.out.println(decrypt);*/

        /*List<List<Integer>> arr = new ArrayList<>();
        List<Integer> em1 = new ArrayList<>();
        List<Integer> em2 = new ArrayList<>();
        List<Integer> em3 = new ArrayList<>();
        List<Integer> em4 = new ArrayList<>();
        List<Integer> em5 = new ArrayList<>();
        List<Integer> em6 = new ArrayList<>();
        em1.add(1);
        em1.add(1);
        em1.add(1);
        em1.add(0);
        em1.add(0);
        em1.add(0);

        em2.add(0);
        em2.add(1);
        em2.add(0);
        em2.add(0);
        em2.add(0);
        em2.add(0);

        em3.add(1);
        em3.add(1);
        em3.add(1);
        em3.add(0);
        em3.add(0);
        em3.add(0);

        em4.add(0);
        em4.add(0);
        em4.add(2);
        em4.add(4);
        em4.add(4);
        em4.add(0);

        em5.add(0);
        em5.add(0);
        em5.add(0);
        em5.add(2);
        em5.add(0);
        em5.add(0);

        em6.add(0);
        em6.add(0);
        em6.add(1);
        em6.add(2);
        em6.add(4);
        em6.add(0);


        arr.add(em1);
        arr.add(em2);
        arr.add(em3);
        arr.add(em4);
        arr.add(em5);
        arr.add(em6);

        int max = Integer.MIN_VALUE;

        for (int i=0; i <arr.size(); i++) {
            for (int j=0; j<arr.get(i).size()-1; j++) {
                if (i>1 && j>1) {
                    int temp = arr.get(i).get(j) + arr.get(i).get(j - 1) + arr.get(i).get(j - 2) + arr.get(i - 1).get(j - 1) + arr.get(i - 2).get(j) + arr.get(i - 2).get(j - 1) + arr.get(i - 2).get(j - 2);
                    if (temp > max) {
                        max = temp;
                    }
                }
            }
        }

        System.out.println(max);*/

        /*List<Integer> a = new ArrayList<>();
        int d = 4;
        a.add(1);
        a.add(2);
        a.add(3);
        a.add(4);
        a.add(5);
        int n = a.size();
        Integer[] tempArray = new Integer[n];
        for (int i = 0; i < n; i++) {
            if ((i - d) < 0) {
                tempArray[n + i - d] = a.get(i);
            } else {
                tempArray[i - d] = a.get(i);
            }
        }
        List<Integer> output = Arrays.asList(tempArray);*/

        /*List<Integer> q = new ArrayList<>();
        q.add(1);
        q.add(2);
        q.add(5);
        q.add(3);
        q.add(7);
        q.add(8);
        q.add(6);
        q.add(4);
        int bribe = 0;
        for (int i = q.size() - 1; i > -1; i--) {
            if (q.get(i) - (i+1) > 2) {
                System.out.println("Too chaotic");
                break;
            }
            for (int j = Math.max(0, q.get(i)-2); j<i; j++) {
                if (q.get(j) > q.get(i)) {
                    bribe ++;
                }
            }
        }
        System.out.println(bribe);*/
        /*List<Integer> a = new ArrayList<>();
        a.add(3);
        a.add(2);
        a.add(1);
        Integer[] arr = new Integer[a.size()];
        a.toArray(arr);
        int n = arr.length;
        int swaps = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - 1; j++) {
                // Swap adjacent elements if they are in decreasing order
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = temp;
                    swaps++;
                }
            }
        }
        System.out.println("Array is sorted in " + swaps + " swaps.");
        System.out.println("First element: " + arr[0]);
        System.out.println("Last element: " + arr[n-1]);*/

        /*List<Integer> a = new ArrayList<>();
        a.add(3);
        a.add(7);
        a.add(2);
        a.add(9);
        a.add(4);
        Integer[] arr = new Integer[a.size()];
        a.toArray(arr);
        Arrays.sort(arr);
        int n = arr.length;
        *//*for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - 1; j++) {
                // Swap adjacent elements if they are in decreasing order
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = temp;
                }
            }
        }*//*
        int sum = 0;
        int count = 0;
        //int k = 15;
        for (int i = 0; i<arr.length; i++) {
            sum = sum + arr[i];
            if (sum<=k) {
                count ++;
            } else {
                break;
            }
        }
        return count;*/
        /*Player p1 = new Player("Gibran", 10);
        Player p2 = new Player("Pranjal", 20);

        if (p1.score == p2.score) {
            return p1.name.compareTo(p2.name);
        }*/

        /*List<Integer> expenditure = new ArrayList<>();
        expenditure.add(1);
        expenditure.add(2);
        expenditure.add(3);
        expenditure.add(4);
        expenditure.add(4);
        Integer[] arr = new Integer[expenditure.size()];
        expenditure.toArray(arr);
        int d = 4;
        int[] med = new int[d];
        int notif = 0;
        for (int i = 0; i<arr.length; i++) {
            if (i >= d) {
                for (int j = 0; j < d; j++) {
                    med[j] = arr[(i-d)+j];
                }
                Arrays.sort(med);
                double median;
                if (d%2 != 0 ) {
                    median = med[((d+1)/2)-1];
                } else {
                    median = (double)((med[(d/2)-1]) + (med[(d/2)]))/2;
                }
                if (arr[i] >= (median*2)) {
                    notif++;
                }
            }
        }
        System.out.println(notif);*/


        /*String A = "hello";
        String B = "java";

        String aCap = A.substring(0,1).toUpperCase();
        String bCap = B.substring(0,1).toUpperCase();

        System.out.println(A.length()+B.length());
        System.out.println(A.compareTo(B) > 0 ? "Yes" : "No");
        System.out.println((aCap + A.substring(1)) + " " + (bCap + B.substring(1)));*/

        /*String pattern  = "[AZ[a-z](a-z)";
        try {
            Pattern p1 = Pattern.compile(pattern);
            System.out.println("Valid");
        } catch (PatternSyntaxException ex) {
            System.out.println("Invalid");
        }*/

        /*String sen = "Goodbye bye bye world world world";
        Pattern p1 = Pattern.compile("\\b([a-z]|[A-Z]+)(\\s+\\1\\b)+", Pattern.CASE_INSENSITIVE);
        Matcher m = p1.matcher(sen);
        while (m.find()) {
            sen = sen.replaceAll(m.group(), m.group(1));
        }
        System.out.println('*');
        System.out.println('*');
        System.out.println('*');
        System.out.println(sen);
        System.out.println('*');
        System.out.println('*');
        System.out.println('*');*/

        /*HashSet<String> set = new HashSet<>();
        set.add("a");
        set.add("b");
        set.add("c");
        set.add("d");
        set.add("e");

        for (String i: set) {
            System.out.println(i);
        }*/

        /*String line = "<h1><h1>Sanjay has no watch</h1></h1><par>So wait for a while</par>";
        boolean matchFound = false;
        Pattern p1 = Pattern.compile("<(.+)>([^<]+)<\\/\\1>");
        Matcher matcher = p1.matcher(line);
        while (matcher.find()) {
            System.out.println(matcher.group(2));
            matchFound = true;
        }

        if (!matchFound) {
            System.out.println("None");
        }*/

        /*int x,y,z;
        x=9;
        y=10;
        z=++x+y++;
        System.out.println(x +""+ y +""+ z);*/


        /*int[] a = new int[5];
        a[0] = 3;
        a[1] = 54;
        a[2] = 10;
        a[3] = 92;
        a[4] = -1;
        Arrays.sort(a);
        for (int j : a) {
            System.out.println(j);
        }*/

        /*Stream.iterate(1, element->element+1)
                .filter(element->element%5==0)
                .limit(5)
                .forEach(System.out::println);*/

        /*List<Product> productsList = new ArrayList<Product>();
        //Adding Products
        productsList.add(new Product(1,"HP Laptop",25000f));
        productsList.add(new Product(2,"Dell Laptop",30000f));
        productsList.add(new Product(3,"Lenovo Laptop",28000f));
        productsList.add(new Product(4,"Sony Laptop",28000f));
        productsList.add(new Product(5,"Apple Laptop",90000f));
        // This is more compact approach for filtering data
        productsList.stream()
                .filter(product -> product.price == 30000)
                .forEach(product -> System.out.println(product.name));*/


        /*HashMap props = new HashMap();
        props.put("key45", "some value");
        props.put("key12", "some other value");
        props.put("key39", "yet another value");
        Set s = props.keySet();
        s = new TreeSet(s);
        System.out.println(s);*/

        /*Set<Integer> set = new HashSet<>();
        set.add(1);
        set.add(2);
        System.out.println(set);*/
        /*String s1 = new String("aaa");
        String s2 = new String("aaa");
        HashSet<Object> set = new HashSet<>();
        Solution sw1 = new Solution("aaa");
        Solution sw2 = new Solution("aaa");
        set.add(s1);
        set.add(s2);
        set.add(sw1);
        set.add(sw2);
        System.out.println(set.size());*/

        /*List<Integer> arr = new ArrayList<>();
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(4);
        arr.add(5);
        Integer[] mainArr = arr.toArray(new Integer[arr.size()]);
        int n = mainArr.length;
        int k = 2;
        ArrayList<Integer> finalList = new ArrayList<>();
        for (int i = 0; i<= n-k; i++) {
            List<Integer> sub = new ArrayList<>();
            for (int j = i; j<k+i; j++) {
                sub.add(mainArr[j]);
            }
            for(int x = 0; x<sub.size(); x++) {
                System.out.print(sub.get(x) + " ");
            }
            System.out.println("\n");
            Integer min = sub.stream()
                    .min((n1, n2) -> n1>n2 ? 1 : -1).get();
            //Arrays.sort(sub.toArray(new Integer[sub.size()]));
            //Collections.sort(sub);
            finalList.add(min);
        }
        //Collections.sort(finalList);
        //Arrays.sort(finalList.toArray(new Integer[finalList.size()]));
        Integer max = finalList.stream().max((n1, n2) -> n1>n2 ? 1 : -1).get();
        System.out.println(max);*/

        /*List<Integer> arr = new ArrayList<>();
        arr.add(10);
        arr.add(640);
        arr.add(26);
        arr.add(276);
        arr.add(224);
        arr.add(737);
        arr.add(677);
        arr.add(893);
        arr.add(87);
        arr.add(422);
        arr.add(30);
        arr.add(10);
        arr.add(2);

        List<Integer> temp = new ArrayList<>();
        temp.add(0);
        temp.add(9);
        List<Integer> temp3 = new ArrayList<>();
        temp3.add(2);
        temp3.add(2);
        List<Integer> temp4 = new ArrayList<>();
        temp4.add(5);
        temp4.add(5);
        List<Integer> temp5 = new ArrayList<>();
        temp5.add(1);
        temp5.add(6);
        List<Integer> temp6 = new ArrayList<>();
        temp6.add(5);
        temp6.add(6);
        List<Integer> temp7 = new ArrayList<>();
        temp7.add(5);
        temp7.add(9);
        List<Integer> temp8 = new ArrayList<>();
        temp8.add(0);
        temp8.add(8);
        List<Integer> temp9 = new ArrayList<>();
        temp9.add(6);
        temp9.add(7);
        List<Integer> temp10 = new ArrayList<>();
        temp10.add(1);
        temp10.add(9);
        List<Integer> temp11 = new ArrayList<>();
        temp11.add(3);
        temp11.add(3);
        List<List<Integer>> operations = new ArrayList<>();
        operations.add(temp);
        operations.add(temp3);
        operations.add(temp4);
        operations.add(temp5);
        operations.add(temp6);
        operations.add(temp7);
        operations.add(temp8);
        operations.add(temp9);
        operations.add(temp10);
        operations.add(temp11);

        for (List<Integer> op : operations) {
            int tempNumber = 0;
            tempNumber = arr.get(op.get(0));
            arr.set(op.get(0), arr.get(op.get(1)));
            arr.set(op.get(1), tempNumber);
        }

        arr.stream().forEach(i -> System.out.println(i));*/

        /*List<Integer> arr = Arrays.asList(4,3,2,3,5);
        Collections.sort(arr);
        arr.set(0, (arr.get(0)-(arr.get(0)-1)));

        for (int i = 1; i<arr.size(); i++) {
            if (Math.abs(arr.get(i) - arr.get(i-1)) > 1 || Math.abs(arr.get(i)-arr.get(i+1))>1) {
                arr.set(i, (arr.get(i)));
            }
        }

        System.out.println(arr.get(arr.size()-1));*/

        /*String word = "abcabc";
        int input1 = 1;
        int input2 = 1;
        int count = 0;

        String newWord = word;

        do {
            String temp = newWord.substring(newWord.length() - input1, newWord.length());
            newWord = temp + newWord.substring(0, newWord.length() - input1);
            count++;
            if (newWord.equalsIgnoreCase(word)) break;
            String temp2 = newWord.substring(newWord.length() - input2, newWord.length());
            newWord = temp2 + newWord.substring(0, newWord.length() - input2);
            count++;
        } while (!newWord.equalsIgnoreCase(word));

        System.out.println(newWord + " " + count);*/

        String word = "{\n" +
                "    \"0\" : { \"name\" : \"John\" }," +
                "    \"1\" : { \"name\" : \"Mike\" }" +
                "}";

        System.out.println(deepestValue(word));

    }


    static int deepestValue(String word) throws IOException {
        int current_max = 0;
        int max = 0;

        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) == '{') {
                current_max++;
            } else if (word.charAt(i) == '}') {
                if (current_max > max) {
                    max = current_max;
                }
                current_max--;
            }
        }
        return max;
        /*ObjectMapper mapper = new ObjectMapper();
        JsonFactory f = mapper.getJsonFactory();
        JsonParser p = f.createJsonParser(word);
        JsonToken t = p.nextToken();
        int currentDepth = 0;
        int maxDepth = 0;

        while (t != null) {
            if (t == JsonToken.START_OBJECT) {
                currentDepth++;
            } else {
                if (t == JsonToken.END_OBJECT) {
                    if (currentDepth > maxDepth) {
                        maxDepth = currentDepth;
                    }
                    currentDepth--;
                }
            }

            t = p.nextToken();
        }
        return maxDepth;*/
    }
}


/*class Parent {
    {
        System.out.println("A");
    }

    static {
        System.out.println("B");
    }
}

class Child extends Parent {
    {
        System.out.println("C");
    }

    static {
        System.out.println("D");
    }

    public static void main(String[] args) {
        Child child = new Child();
    }
}


class Test implements Runnable {
    public void run() {
        System.out.println("TURING");
    }
    public static void main(String[] args) throws InterruptedException {
        Thread thread = new Thread(new Test());
        thread.start();
        thread.start();
        System.out.println(thread.getState());
    }
}

class MyClass {
    public static void main(String[] args) {
        System.out.println("In first main");
    }
    public static void main(char[] args) {
        System.out.println('a');
    }
}

class Student{}
class Rockstar{}
class Hacker{}


class InstanceOFTutorial{

    static String count(ArrayList mylist){
        int a = 0,b = 0,c = 0;
        for(int i = 0; i < mylist.size(); i++){
            Object element=mylist.get(i);
            if(mylist.get(i) instanceof Student)
                a++;
            if(mylist.get(i) instanceof Rockstar)
            b++;
            if(mylist.get(i) instanceof Hacker)
            c++;
        }
        String ret = Integer.toString(a)+" "+ Integer.toString(b)+" "+ Integer.toString(c);
        return ret;
    }

    public static void main(String []args){
        ArrayList mylist = new ArrayList();
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i=0; i<t; i++){
            String s=sc.next();
            if(s.equals("Student"))mylist.add(new Student());
            if(s.equals("Rockstar"))mylist.add(new Rockstar());
            if(s.equals("Hacker"))mylist.add(new Hacker());
        }
        System.out.println(count(mylist));
    }
}*/

