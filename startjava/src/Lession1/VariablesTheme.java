package Lession1;

class VariablesTheme {
    public static void main(String[] args) {
        System.out.println("1. �������� ���������� � ����� �� �������� �� �������");
        byte numCore = 2;
        short ram  = 8;
        int ssd = 520;
        long freqCpu = 2400;
        float weight = 2.7f;
        double diag = 15.6;
        System.out.println("���������� ���� ����������: " + numCore + "\n������� ����������, ���: " + freqCpu
                + "\n����� ���, ��: " + ram + "\n����� SSD, ��: " + ssd + "\n���, ��: " + weight
                + "\n��������� ������: " + diag);
        System.out.println("\n2. ������ ��������� ������ �� �������");
        int pricePen = 100;
        int priceBook = 200;
        int sum = pricePen + priceBook;
        double discount = sum * 0.11;
        double res = sum - discount;
        System.out.println("I. ����� ������: " + discount);
        System.out.println("II. ����� ��������� ������ �� �������: " + res);
        System.out.println("\n3. ����� �� ������� ����� JAVA");
        System.out.println("    J     A    V     V    A");
        System.out.println("    J    A A    V   V    A A");
        System.out.println("J   J   AAAAA    V V    AAAAA");
        System.out.println(" J J   A     A    V    A     A");
        System.out.println("\n4. ����������� min � max �������� �������� ����� ������");
        byte maxByte = 127;
        System.out.println("������������ �������� byte: " + maxByte);
        byte incByte = ++maxByte;
        System.out.println("�������� byte ����� ����������: " + incByte);
        byte decByte = --incByte;
        System.out.println("�������� byte ����� ����������: " + decByte);
        short maxShort  = 32767;
        System.out.println("������������ �������� short: " + maxShort);
        short incShort = ++maxShort;
        System.out.println("�������� short ����� ����������: " + incShort);
        short decShort = --incShort;
        System.out.println("�������� short ����� ����������: " + decShort);
        int maxInt = 2147483647;
        System.out.println("������������ �������� int: " + maxInt);
        int incInt = ++maxInt;
        System.out.println("�������� int ����� ����������: " + incInt);
        int decInt = --incInt;
        System.out.println("�������� int ����� ����������: " + decInt);
        long maxLong  = 9223372036854775807L;
        System.out.println("������������ �������� long: " + maxLong);
        long incLong = ++maxLong;
        System.out.println("�������� long ����� ����������: " + incLong);
        long decLong = --incLong;
        System.out.println("�������� long ����� ����������: " + decLong);
        System.out.println("\n5. ������������ �������� ����������");
        int num1 = 2;
        int num2 = 5;
        int num3;
        System.out.println("i. � ������� ������� ����������");
        System.out.println("�������� �������� ���������� num1 = " + num1 + " ,num2 = " + num2);
        num3 = num1;
        num1 = num2;
        num2 = num3;
        System.out.println("����� �������� ���������� num1 = " + num1 + ", num2 = " + num2);
        System.out.println("ii. � ������� �������������� ��������");
        System.out.println("�������� �������� ���������� num1 = " + num1 + ", num2 = " + num2);
        num1 += num2;
        num2 = num1 - num2;
        num1 -= num2;
        System.out.println("����� �������� ���������� num1 = " + num1 + ", num2 = " + num2);
        System.out.println("iii. � ������� ��������� ��������");
        System.out.println("�������� �������� ���������� num1 = " + num1 + ", num2 = " + num2);
        num1 = num1 ^ num2;
        num2 = num2 ^ num1;
        num1 = num1 ^ num2;
        System.out.println("����� �������� ���������� num1 = " + num1 + ", num2 = " + num2);
        System.out.println("\n6. ����� �������� � �� �����");
        System.out.println("35 " + (char)35);
        System.out.println("38 " + (char)38);
        System.out.println("64 " + (char)64);
        System.out.println("94 " + (char)94);
        System.out.println("95 " + (char)95);
        System.out.println("\n7.����������� ���������� �����, �������� � ������ �����");
        int N = 123;
        int X = N / 100;
        int Y = N % 100 / 10;
        int Z = N % 10;
        System.out.println("����� " + N + " �������� ����� "+ X);
        System.out.println("����� " + N + " �������� �������� "+ Y);
        System.out.println("����� " + N + " �������� ������ "+ Z);






    }
}
