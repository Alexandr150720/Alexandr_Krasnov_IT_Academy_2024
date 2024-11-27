package com.academy.course.lesson3.home.work;

public class Main {

    static byte bytPrimGlobal = 100;
    static short shPrimGlobal = 16000;
    static int intPrimGlobal = 400000;
    static long lonPrimGlobal = 3000000000L;

    static float flPrimGlobal = 123.123f;
    static double doubPrimGlobal = 1024.1024;
    static char chPrimGlobal = 'F';

    static boolean boolPrimGlobal = true;

    static String strRefGlobal = "Some massage";

    static Byte bytRefGlobal = 1;
    static Short shRefGlobal = 32000;
    static Integer intRefGlobal = 800000;
    static Long lonRefGlobal = 123456789999L;

    static Float flRefGlobal = 13819.12347f;
    static Double doubRefGlobal = 1234567.7654321;
    static Character chRefGlobal = 789;

    static Boolean boolRefGlobal = null;


    public static void main(String[] args) {

        byte bytPrimLocal = -89;
        short shPrimLocal = 28888;
        int intPrimLocal = 500000000;
        long lonPrimLocal = 77700000054355000L;

        float flPrimLocal = 4321.4321f;
        double doubPrimLocal = 2050.0502;
        char chPrimLocal = '&';

        boolean boolPrimLocal = false;

        String strRefLocal = "44";

        Byte bytRefLocal = 0;
        Short shRefLocal = -10000;
        Integer intRefLocal = -1000000;
        Long lonRefLocal = 9999999999999999L;

        Float flRefLocal = 20.20f;
        Double doubRefLocal = 47293799.980809382;
        Character chRefLocal = 3000;

        Boolean boolRefLocal = false;

//Output variable
        System.out.println("bytPrimGlobal = " + bytPrimGlobal);
        System.out.println("shPrimGlobal = " + shPrimGlobal);
        System.out.println("intPrimGlobal = " + intPrimGlobal);
        System.out.println("lonPrimGlobal = " + lonPrimGlobal);
        System.out.println("flPrimGlobal = " + flPrimGlobal);
        System.out.println("doubPrimGlobal = " + doubPrimGlobal);
        System.out.println("boolPrimGlobal = " + boolPrimGlobal);
        System.out.println("chRefGlobal " + chRefGlobal);
        System.out.println("strRefGlobal = " + strRefGlobal);
        System.out.println("bytRefGlobal = " + bytRefGlobal);
        System.out.println("shRefGlobal = " + shRefGlobal);
        System.out.println("intRefGlobal = " + intRefGlobal);
        System.out.println("lonRefGlobal = " + lonRefGlobal);
        System.out.println("flRefGlobal = " + flRefGlobal);
        System.out.println("doubRefGlobal = " + doubRefGlobal);
        System.out.println("chRefGlobal = " + chRefGlobal);
        System.out.println("boolRefGlobal = " + boolRefGlobal);

        System.out.println("bytPrimLocal = " + bytPrimLocal);
        System.out.println("shPrimLocal = " + shPrimLocal);
        System.out.println("intPrimLocal = " + intPrimLocal);
        System.out.println("lonPrimLocal = " + lonPrimLocal);
        System.out.println("flPrimLocal = " + flPrimLocal);
        System.out.println("doubPrimLocal = " + doubPrimLocal);
        System.out.println("boolPrimLocal = " + boolPrimLocal);
        System.out.println("chRefLocal = " + chRefLocal);
        System.out.println("strRefLocal = " + strRefLocal);
        System.out.println("bytRefLocal = " + bytRefLocal);
        System.out.println("shRefLocal = " + shRefLocal);
        System.out.println("intRefLocal = " + intRefLocal);
        System.out.println("lonRefLocal = " + lonRefLocal);
        System.out.println("flRefLocal = " + flRefLocal);
        System.out.println("doubRefLocal = " + doubRefLocal);
        System.out.println("chRefLocal = " + chRefLocal);
        System.out.println("boolRefLocal = " + boolRefLocal);

//Type assignment
    //Primitive byte
        bytPrimLocal = (byte) shPrimLocal;
        System.out.println("shPrim to bytPrim: " + bytPrimLocal);//так как тип short больше byte, значение short будет проходить по диапозрну byte пока не найдёт в этом диапозоне значение равное значению short.

        bytPrimLocal = (byte) intPrimLocal;
        System.out.println("intPrim to bytPrim: " + bytPrimLocal);

        bytPrimLocal = (byte) lonPrimLocal;
        System.out.println("lonPrim to bytPrim: " + bytPrimLocal);

        bytPrimLocal = (byte) flPrimLocal;
        System.out.println("flPrim to bytPrim: " + bytPrimLocal);

        bytPrimLocal = (byte) doubPrimLocal;
        System.out.println("doubPrim to bytPrim: " + bytPrimLocal);

        bytPrimLocal = (byte) chPrimLocal;
        System.out.println("chPrim to bytPrim to chPrim: " + bytPrimLocal);

        //bytPrimLocal = (byte) boolPrimLocal; примитивный тип boolean может принимать только лог. значения true или false(в ссылочных типах данных Boolean так же может принмать null)

        bytPrimLocal = Byte.parseByte(strRefLocal);
        System.out.println("strRef to bytPrim: " + bytPrimLocal );

    //Primitive short

        shPrimLocal = (short) bytPrimLocal;
        System.out.println("bytRef to shPrim: " + shPrimLocal);

        shPrimLocal = (short) intPrimLocal;
        System.out.println("intPrim to shPrim: " + shPrimLocal);

        shPrimLocal = (short) lonPrimLocal;
        System.out.println("lonPrim to shPrim: " + shPrimLocal);

        shPrimLocal = (short) flPrimLocal;
        System.out.println("flPrimsh to shPrim: " + shPrimLocal);

        shPrimLocal = (short) doubPrimLocal;
        System.out.println("doubPrim to shPrim: " + shPrimLocal);

        shPrimLocal = (short) chPrimLocal;
        System.out.println("chPrim to shPrim: " + shPrimLocal);

        shPrimLocal = Short.parseShort(strRefLocal);
        System.out.println("strRef to shPrim: " + shPrimLocal);

    //Primitive integer

        intPrimLocal = (int) bytPrimLocal;
        System.out.println("bytPrim to intPrim: " + intPrimLocal);

        intPrimLocal = (int) shPrimLocal;
        System.out.println("shPrim to intPrim: " + intPrimLocal);

        intPrimLocal = (int) lonPrimLocal;
        System.out.println("lonPrim to intPrim: " + intPrimLocal);

        intPrimLocal = (int) flPrimLocal;
        System.out.println("flPrim to intPrim: " + intPrimLocal);

        intPrimLocal = (int) doubPrimLocal;
        System.out.println("doubPrim to intPrim: " + intPrimLocal);

        intPrimLocal = (int) chPrimLocal;
        System.out.println("chPrim to intPrim: " + intPrimLocal);

        intPrimLocal = Integer.parseInt(strRefLocal);
        System.out.println("strRef to intPrim: " + intPrimLocal);

    //Primitive long

        lonPrimLocal = (long) bytPrimLocal;
        System.out.println("bytPrim to lonPrim: " + lonPrimLocal);

        lonPrimLocal = (long) shPrimLocal;
        System.out.println("shPrim to lonPrim: " + lonPrimLocal);

        lonPrimLocal = (long) intPrimLocal;
        System.out.println("intPrim to lonPrim: " + lonPrimLocal);

        lonPrimLocal = (long) flPrimLocal;
        System.out.println("flPrim to lonPrim: " + lonPrimLocal);

        lonPrimLocal = (long) doubPrimLocal;
        System.out.println("doubPrim to lonPrim: " + lonPrimLocal);

        lonPrimLocal = (long) chPrimLocal;
        System.out.println("chPrim to lonPrim: " + lonPrimLocal);

        lonPrimLocal = Long.parseLong(strRefLocal);
        System.out.println("strRef to lonPrim: " + lonPrimLocal);

    //Primitive float

        flPrimLocal = (float) bytPrimGlobal;
        System.out.println("bytPrim to flPrim: " + flPrimLocal);

        flPrimLocal = (float) shPrimGlobal;
        System.out.println("shPrim to flPrim: " + flPrimLocal);

        flPrimLocal = (float) intPrimGlobal;
        System.out.println("intPrim to flPrim: " + flPrimLocal);

        flPrimLocal = (float) lonPrimGlobal;
        System.out.println("lonPrim to flPrim: " + flPrimLocal);

        flPrimLocal = (float) flPrimGlobal;
        System.out.println("flPrim to flPrim: " + flPrimLocal);

        flPrimLocal = (float) doubPrimGlobal;
        System.out.println("doubPrim to flPrim: " + flPrimLocal);

        flPrimLocal = (float) chPrimGlobal;
        System.out.println("chPrim to flPrim: " + flPrimLocal);

        flPrimLocal = Float.parseFloat(strRefLocal);
        System.out.println("strRef to flPrim: " + flPrimLocal);


    //Primitive double

        doubPrimLocal = (double) bytPrimLocal;
        System.out.println("bytPrim to doubPrim: " + doubPrimLocal);

        doubPrimLocal = (double) shPrimLocal;
        System.out.println("shPrim to doubPrim: " + doubPrimLocal);

        doubPrimLocal = (double) intPrimLocal;
        System.out.println("intPrim to doubPrim: " + doubPrimLocal);

        doubPrimLocal = (double) lonPrimLocal;
        System.out.println("longPrim to doubPrim: " + doubPrimLocal);

        doubPrimLocal = (double) flPrimLocal;
        System.out.println("flPrim to doubPrim: " + doubPrimLocal);

        doubPrimLocal = (double) chPrimLocal;
        System.out.println("chPrim to doubPrim: " + doubPrimLocal);

        doubPrimLocal = Double.parseDouble(strRefLocal);
        System.out.println("strRef to doubPrim: " + doubPrimLocal);

    //Primitive character

        chPrimLocal = (char) bytPrimGlobal;
        System.out.println("bytPrim to chPrim: " + chPrimLocal);

        chPrimLocal = (char) shPrimGlobal;
        System.out.println("shPrim to chPrim: " + chPrimLocal);

        chPrimLocal = (char) intPrimGlobal;
        System.out.println("intPrim to chPrim: " + chPrimLocal);

        chPrimLocal = (char) lonPrimGlobal;
        System.out.println("lonPrimto chPrim: " + chPrimLocal);

        chPrimLocal = (char) flPrimGlobal;
        System.out.println("flPrim to chPrim: " + chPrimLocal);

        chPrimLocal = (char) doubPrimGlobal;
        System.out.println("doubPrim to chPrim: " + chPrimLocal);

        chPrimLocal = (char) Integer.parseInt(strRefLocal);
        System.out.println("strRef to chPrim: " + chPrimLocal);

    //Reflection Byte

        bytRefLocal = (byte) bytPrimGlobal;
        System.out.println("bytPrim to bytRef: " + bytRefLocal);

        bytRefLocal = (byte) shPrimGlobal;
        System.out.println("shPrim to bytRef: " + bytRefLocal);

        bytRefLocal = (byte) intPrimGlobal;
        System.out.println("intPrim to bytRef: " + bytRefLocal);

        bytRefLocal = (byte) lonPrimGlobal;
        System.out.println("lonPrim to bytRef: " + bytRefLocal);

        bytRefLocal = (byte) flPrimGlobal;
        System.out.println("flPrim to bytRef: " + bytRefLocal);

        bytRefLocal = (byte) doubPrimGlobal;
        System.out.println("doubPrim to bytRef: " + bytRefLocal);

        bytRefLocal = (byte) chPrimGlobal;
        System.out.println("chPrim to bytRef: " + bytRefLocal);

        bytRefLocal = Byte.parseByte(strRefLocal);
        System.out.println("strRef to bytRef: " + bytRefLocal);

        //bytRefLocal = (byte) shRefLocal; ссылочному типу данных присваивается только значение примитивного типа или такого же ссылочного типа данных (как я понял данную операцию провести нельзя так как значения являются объектами разных классов p.s. но это не точно)

    //Reflection Short

        shRefLocal = (short) bytPrimGlobal;
        System.out.println("bytPrim to shRef: " + shRefLocal);

        shRefLocal = (short) shPrimGlobal;
        System.out.println("shPrim to shRef: " + shRefLocal);

        shRefLocal = (short) intPrimGlobal;
        System.out.println("intPrim to shRef: " + shRefLocal);

        shRefLocal = (short) lonPrimGlobal;
        System.out.println("lonPrim to shRef: " + shRefLocal);

        shRefLocal = (short) flPrimGlobal;
        System.out.println("flPrim to shRef: " + shRefLocal);

        shRefLocal = (short) doubPrimGlobal;
        System.out.println("doubPrim to shRef: " + shRefLocal);

        shRefLocal = (short) chPrimGlobal;
        System.out.println("chPrim to shRef: " + shRefLocal);

        shRefLocal = Short.parseShort(strRefLocal);
        System.out.println("strRef to shRef: " + shRefLocal);

    //Reflection Integer

        intRefLocal = (int) bytPrimGlobal;
        System.out.println("bytPrim to intRef: " + intRefLocal);

        intRefLocal = (int) shPrimGlobal;
        System.out.println("shPrim to intRef: " + intRefLocal);

        intRefLocal = (int) intPrimGlobal;
        System.out.println("intPrim to intRef: " + intRefLocal);

        intRefLocal = (int) lonPrimGlobal;
        System.out.println("lonPrim to intRef: " + intRefLocal);

        intRefLocal = (int) flPrimGlobal;
        System.out.println("flPrim to intRef: " + intRefLocal);

        intRefLocal = (int) doubPrimGlobal;
        System.out.println("doubPrim to intRef: " + intRefLocal);

        intRefLocal = (int) chPrimGlobal;
        System.out.println("chPrim to intRef: " + intRefLocal);

        //intRefLocal = Integer.parseInt(strRefGlobal); в строке глобальной переменной лежит текст, а не численное значение

    //Reflection Long

        lonRefLocal = (long) bytPrimGlobal;
        System.out.println("bytPrim to lonRef: " + lonRefLocal);

        lonRefLocal = (long) shPrimGlobal;
        System.out.println("shPrim to lonRef: " + lonRefLocal);

        lonRefLocal = (long) intPrimGlobal;
        System.out.println("intPrim to lonRef: " + lonRefLocal);

        lonRefLocal = (long) lonPrimGlobal;
        System.out.println("lonPrim to lonRef: " + lonRefLocal);

        lonRefLocal = (long) flPrimGlobal;
        System.out.println("flPrim to lonRef: " + lonRefLocal);

        lonRefLocal = (long) doubPrimGlobal;
        System.out.println("doubPrim to lonRef: " + lonRefLocal);

        lonRefLocal = (long) chPrimGlobal;
        System.out.println("chPrim to lonRef: " + lonRefLocal);

        lonRefLocal = Long.parseLong(strRefLocal);
        System.out.println("strRef to lonRef: " + lonRefLocal);

    //Reflection Float

        flRefLocal = (float) bytPrimGlobal;
        System.out.println("bytPrim to flRef: " + flRefLocal);

        flRefLocal = (float) shPrimGlobal;
        System.out.println("shPrim to flRef: " + flRefLocal);

        flRefLocal = (float) intPrimGlobal;
        System.out.println("intPrim to flRef: " + flRefLocal);

        flRefLocal = (float) flPrimGlobal;
        System.out.println("flPrim to flRef: " + flRefLocal);

        flRefLocal = (float) doubPrimGlobal;
        System.out.println("doubPrim to flRef: " + flRefLocal);

        flRefLocal = (float) chPrimGlobal;
        System.out.println("chPrim to flRef: " + flRefLocal);

        flRefLocal = Float.parseFloat(strRefLocal);
        System.out.println("strRef to flRef: " + flRefLocal);

    //Reflection Double

        doubRefLocal = (double) bytPrimGlobal;
        System.out.println("bytPrim to doubRef: " + doubRefLocal);

        doubRefLocal = (double) shPrimGlobal;
        System.out.println("shPrim to doubRef: " + doubRefLocal);

        doubRefLocal = (double) intPrimGlobal;
        System.out.println("intPrim to doubRef: " + doubRefLocal);

        doubRefLocal = (double) lonPrimGlobal;
        System.out.println("lonPrim to doubRef: " + doubRefLocal);

        doubRefLocal = (double) flPrimGlobal;
        System.out.println("flPrim to doubRef: " + doubRefLocal);

        doubRefLocal = (double) doubPrimGlobal;
        System.out.println("doubPrim to doubRef: " + doubRefLocal);

        doubRefLocal = (double) chPrimGlobal;
        System.out.println("chPrim to doubRef: " + doubRefLocal);

        doubRefLocal = Double.parseDouble(strRefLocal);
        System.out.println("strRef to doubRef: " + doubRefLocal);

    //Reflection Character

        chRefLocal = (char) bytPrimGlobal;
        System.out.println("bytPrim to chRef: " + chRefLocal);

        chRefLocal = (char) shPrimGlobal;
        System.out.println("shPrim to chRef: " + chRefLocal);

        chRefLocal = (char) intPrimGlobal;
        System.out.println("intPrim to chRef: " + chRefLocal);

        chRefLocal = (char) lonPrimGlobal;
        System.out.println("lonPrim to chRef: " + chRefLocal);

        chRefLocal = (char) flPrimGlobal;
        System.out.println("flPrim to chRef: " + chRefLocal);

        chRefLocal = (char) doubPrimGlobal;
        System.out.println("doubPrim to chRef: " + chRefLocal);

        chRefLocal = (char) Integer.parseInt(strRefLocal);
        System.out.println("strRef to chRef: " + chRefLocal);

    //Reflection String

        strRefLocal = String.valueOf(bytPrimGlobal);
        System.out.println("bytPrim to strRef: " + strRefLocal);

        strRefLocal = String.valueOf(shPrimGlobal);
        System.out.println("shPrim to strRef: " + strRefLocal);

        strRefLocal = String.valueOf(intPrimGlobal);
        System.out.println("intPrim to strRef: " + strRefLocal);

        strRefLocal = String.valueOf(lonPrimGlobal);
        System.out.println("intPrim to strRef: " + strRefLocal);

        strRefLocal = String.valueOf(flPrimGlobal);
        System.out.println("flPrim to strRef: " + strRefLocal);

        strRefLocal = String.valueOf(doubPrimGlobal);
        System.out.println("doubRef to strRef: " + strRefLocal);

        strRefLocal = String.valueOf(chPrimGlobal);
        System.out.println("chPrim to strRef: " + strRefLocal);

        strRefLocal = String.valueOf(boolPrimGlobal);
        System.out.println("boolPrim to strRef: " + strRefLocal);

        strRefLocal = String.valueOf(bytRefGlobal);
        System.out.println("bytRef to strRef: " + strRefLocal);

        strRefLocal = String.valueOf(shRefGlobal);
        System.out.println("shRef to strRef: " + strRefLocal);

        strRefLocal = String.valueOf(intRefGlobal);
        System.out.println("intRef to strRef: " + strRefLocal);

        strRefLocal = String.valueOf(lonRefGlobal);
        System.out.println("lonRef to strRef: " + strRefLocal);

        strRefLocal = String.valueOf(flRefGlobal);
        System.out.println("flRef to strRef: " + strRefLocal);

        strRefLocal = String.valueOf(doubRefGlobal);
        System.out.println("doubRef to strRef: " + strRefLocal);

        strRefLocal = String.valueOf(chRefGlobal);
        System.out.println("chRef to strRef: " + strRefLocal);

        strRefLocal = String.valueOf(boolRefGlobal);
        System.out.println("boolRef to strRef: " + strRefLocal);


//Output NumberClass
    //Primitive variables
        Number a1 = new Number();
        a1.setaPrim((byte) 127);
        System.out.println(a1.getaPrim());

        Number b1 = new Number();
        b1.setbPrim((short) 32767);
        System.out.println(b1.getbPrim());

        Number c1 = new Number();
        c1.setcPrim(2147483647);
        System.out.println(c1.getcPrim());

        Number d1 = new Number();
        d1.setdPrim((long) 9223372036854775807L);
        System.out.println(d1.getdPrim());

        Number e1 = new Number();
        e1.setePrim((float) 3.14f);
        System.out.println(e1.getePrim());

        Number f1 = new Number();
        f1.setfPrim((double) 284.47384);
        System.out.println(f1.getfPrim());

        Number g1 = new Number();
        g1.setgPrim((char) 1081);
        System.out.println(g1.getgPrim());

        Number h1 = new Number();
        h1.sethPrim(false);
        System.out.println(h1.gethPrim());

    //Reference variables

        Number i1 = new Number();
        i1.setiRef("Sorry for variable name");
        System.out.println(i1.getiRef());

        Number a2 = new Number();
        a2.setaRef((byte) -128);
        System.out.println(a2.getaRef());

        Number b2 = new Number();
        b2.setbRef((short) -32768);
        System.out.println(b2.getbRef());

        Number c2 = new Number();
        c2.setcRef(-2147483648);
        System.out.println(c2.getcRef());

        Number d2 = new Number();
        d2.setdRef((long) -9223372036854775808L);
        System.out.println(d2.getdRef());

        Number e2 = new Number();
        e2.seteRef((float) -3.14f);
        System.out.println(e2.geteRef());

        Number f2 = new Number();
        f2.setfRef((double) -284.47384);
        System.out.println(f2.getfRef());

        Number g2 = new Number();
        g2.setgRef((char) 348);
        System.out.println(g2.getgRef());

        Number h2 = new Number();
        h2.sethRef(true);
        System.out.println(h2.gethRef());
    }

}
