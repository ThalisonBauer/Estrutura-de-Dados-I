package Aula06;

import java.util.Scanner;

/**
 * Created by Thalison Bauer on 30/08/2016.
 */
public class testePilha {
    public static void main(String[] args) {
        Pilha minhaPilha = new Pilha();
        Scanner tc = new Scanner(System.in);
        minhaPilha.isInit();
        minhaPilha.push(4);
        minhaPilha.push(12);
        minhaPilha.push(14);
        minhaPilha.pop();
        System.out.println(minhaPilha.topo);
        System.out.println("Informe um numero");
        int num = tc.nextInt();
        minhaPilha.isEmpty();
        minhaPilha.isFull();
        System.out.println(minhaPilha.pull(num));
    }
}
