/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utspbo;

import java.util.Scanner;

/**
 *
 * @author C-6
 */
public class utsvivian {
    public static void main(String[] args) {
        System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
        System.out.println("UTS 20 Mei 2024 oleh Vivian Forliana NIM 23201243");
        System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");

        Scanner input = new Scanner(System.in);
        String nama;
        int gender;

        System.out.println("Silahkan masukkan nama anda: ");
        nama = input.nextLine();
        System.out.println("1. laki-laki ");
        System.out.println("2. perempuan ");
        System.out.println("Silahkan pilih gender anda (1 atau 2): ");
        gender = input.nextInt();
        input.nextLine();

        String panggilan = (gender == 1) ? "Mas" : "Mbak";
        System.out.println("Selamat Datang " + panggilan + " " + nama);

        boolean ulang = true;
        while (ulang) {
            System.out.println("\nKALKULATOR");

            int bilangan1 = 0, bilangan2 = 0;
            boolean validInput = false;

            while (!validInput) {
                System.out.println("Masukkan Bilangan 1: ");
                if (input.hasNextInt()) {
                    bilangan1 = input.nextInt();
                    validInput = true;
                } else {
                    System.out.println("Masukkan bilangan yang valid.");
                    input.next();
                }
            }

            validInput = false;
            while (!validInput) {
                System.out.println("Masukkan Bilangan 2: ");
                if (input.hasNextInt()) {
                    bilangan2 = input.nextInt();
                    validInput = true;
                } else {
                    System.out.println("Masukkan bilangan yang valid.");
                    input.next();
                }
            }

            int hasil = 0;
            boolean operatorSalah;

            do {
                operatorSalah = false;
                System.out.println("Pilih Operator (+, -, *, /): ");
                char operator = input.next().charAt(0);

                switch (operator) {
                    case '+':
                        hasil = bilangan1 + bilangan2;
                        break;
                    case '-':
                        hasil = bilangan1 - bilangan2;
                        break;
                    case '*':
                        hasil = bilangan1 * bilangan2;
                        break;
                    case '/':
                        if (bilangan2 == 0) {
                            System.out.println("Pembagian Dengan 0 Tidak Diizinkan!!!");
                            operatorSalah = true;
                        } else {
                            hasil = bilangan1 / bilangan2;
                        }
                        break;
                    default:
                        System.out.println("Operator tidak valid!!");
                        operatorSalah = true;
                }
            } while (operatorSalah);

            System.out.println("Hasil perhitungan: " + hasil);

            System.out.println("Ingin melanjutkan (y/n)? ");
            char jawab = input.next().toLowerCase().charAt(0);
            if (jawab == 'n') {
                System.out.println("Thank you for using the calculator. Goodbye!!");
                ulang = false;
            }

            input.nextLine();
        }

        input.close();
    }
}
