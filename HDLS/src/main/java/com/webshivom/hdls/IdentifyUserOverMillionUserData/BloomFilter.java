package com.webshivom.hdls.IdentifyUserOverMillionUserData;

import java.nio.charset.StandardCharsets;
import java.util.BitSet;
import java.util.Random;

public class BloomFilter {
    private BitSet bitSet;
    private int size;
    private int[] hashSeeds;

    public BloomFilter(int size, int numberOfHashFunctions) {
        this.size = size;
        this.bitSet = new BitSet(size);
        this.hashSeeds = new int[numberOfHashFunctions];

        Random secureRandom = new Random();
        for (int i = 0; i < numberOfHashFunctions; i++) {
            hashSeeds[i] = secureRandom.nextInt();
        }
    }

    private int hash(String data, int seed) {
        int hash = 0;
        byte[] bytes = data.getBytes(StandardCharsets.US_ASCII);

        // Use a more reliable hashing method (e.g., a polynomial hash function)
        for (byte b : bytes) {
            hash = hash * seed + (b & 0xFF); // Ensure byte is treated as unsigned
        }

        // Use modulus to ensure the hash index is within the BitSet size
        return Math.abs(hash) % size;
    }

    public void add(String data) {
        for (int seed : hashSeeds) {
            int hash = hash(data, seed);
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
