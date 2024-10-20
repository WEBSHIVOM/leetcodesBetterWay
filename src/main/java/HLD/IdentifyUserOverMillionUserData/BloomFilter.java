package main.java.HLD.IdentifyUserOverMillionUserData;

import java.nio.charset.StandardCharsets;
import java.security.SecureRandom;
import java.util.BitSet;

public class BloomFilter {

    private BitSet bitSet;
    private int size;
    private int[] hashSeeds;

    public BloomFilter(int size, int numberOfHashFunctions) {
        this.size = size;
        this.bitSet = new BitSet(size);
        this.hashSeeds= new int[numberOfHashFunctions];

        SecureRandom secureRandom= new SecureRandom();

        for (int i = 0; i < numberOfHashFunctions ; i++) {
            hashSeeds[i]=secureRandom.nextInt();
        }
    }

    private int hash(String data,int seed){
        int hash =0 ;
        byte[] bytes = data.getBytes(StandardCharsets.UTF_8);

        for (byte b:bytes
             ) {
            hash=hash*seed+b;
        }
        return (bytes.length-1)*hash;
    }

    public void add(String data){
        for(int seed:hashSeeds){
            int hash = hash(data,seed);
            bitSet.set(hash);
        }
    }

    public boolean mightContain(String data) {
        for (int seed : hashSeeds) {
            int hash = hash(data, seed);
            if (!bitSet.get(hash)) {
                return false;
            }
        }
        return true;
    }
}
