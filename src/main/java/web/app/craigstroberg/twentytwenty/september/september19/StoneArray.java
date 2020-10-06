package web.app.craigstroberg.twentytwenty.september.september19;

public class StoneArray {
    public static void main(String[] args) {
        // String[] stones = new String[10];
        // stones[0] = "Hello 0";
        // stones[1] = "Hello 1";
        // stones[2] = "Hello 2";
        // stones[3] = "Hello 3";
        // stones[4] = "Hello 4";
        // stones[5] = "Hello 5";
        // stones[6] = "Hello 6";
        // stones[7] = "Hello 7";
        // stones[8] = "Hello 8";
        // stones[9] = "Hello 9";
        //
        // System.out.println(stones);
        //
        // for (int i = 0; i < stones.length; i++) {
        //     System.out.println(stones[i]);
        // }

        char[] laceShortcut = {'J', 'a', 'n', 'e'};

        char[] lace = new char[4];
        lace[0] = 'J';
        lace[1] = 'a';
        lace[2] = 'n';
        lace[3] = 'e';

        // indexs that do not exist
        // why don't they exist it is because arrays dont like your negativity
        // they like to confuse you thinking you can access an
        // item that is the same size as the array

        // System.out.println(lace[-1]);
        // System.out.println(lace[4]);

        // What is the first item in the lace array
        System.out.println("First Item " + lace[0]);

        // What is the last item in the lace array
        System.out.println("Last Item " + lace[3]);

        Stone[] bag = new Stone[5];
        Stone jane = new Stone("Jane");
        Stone sophie = new Stone("Sophie");

        bag[0] = jane;
        bag[4] = sophie;

        for (int i = 0; i < bag.length; i++) {
            System.out.println("Stone index : " + i + " stone name " + bag[i]);
        }
    }
}
