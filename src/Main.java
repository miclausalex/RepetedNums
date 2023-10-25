import jdk.internal.org.objectweb.asm.tree.InnerClassNode;

import java.util.*;

// Fa o lista cu 100.000 de numere intre 1 si 100, gaseste de cate ori se repeta fiecare,
// aici rezultatul s-ar potrivi sa il pui intr-un map
public class Main {
    public static void main(String[] args) {
        Random rand = new Random();
        List<Integer> newList = new ArrayList<>();
        int upperbound=100;
        for (long i=0; i<=100000; i++)
        {
            newList.add(rand.nextInt(upperbound));
        }
        Map<Integer, Integer> numPres = new HashMap<>();
        for (Integer i : newList){
            numPres.put(i , numPres.getOrDefault(i,0)+1);
        }
        System.out.println(numPres);
        }
    }
