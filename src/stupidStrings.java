public class stupidStrings {

    public static void main(String[] args) {


        //string
        String s1 = "hello";
        String s2 = new String("hello");

        // == compares ref and values
        // .equals only compares values

        System.out.println(s1==s2);
        System.out.println(s1.equals(s2));

        s1 = s1.concat(s2);
        System.out.println(s1);
        String s3 = "hellohello";
        String s4 = "hellohello";

        System.out.println(s1==s4);
        System.out.println(s1.equals(s4));

        //stringBuffer and stingBuilder are used to create mutable sting

        StringBuffer sb = new StringBuffer("ok");
        //sb.append(" it");
        System.out.println(sb);

        //stringBuilder is not thread safe
        StringBuilder sbld = new StringBuilder("ok");
        //sbld.append(" it");

        System.out.println(sbld);
        //buffer cant == builder

    }

}
