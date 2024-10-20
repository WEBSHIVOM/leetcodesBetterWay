package com.webshivom.hdls.IdentifyUserOverMillionUserData;

import com.webshivom.hdls.UTIL.CsvReader;
import com.webshivom.hdls.models.User;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;
import java.util.Objects;
import java.util.stream.Stream;

/**
 * 1. <b> Hashing</b>
 *
 * Explanation: Store the usernames in a hash table (e.g., a HashSet in Java).
 * This allows for average-case O(1) time complexity for both insertions and lookups.
 * Implementation:
 * Use a hash function to map each username to a unique index.
 * When searching for a username, compute the hash and check the corresponding bucket.
 * Pros: Fast lookups, easy to implement.
 * Cons: Potential for hash collisions, though these can be managed
 * with techniques like chaining or open addressing.
 *
 * <br>
 *
 * 2. <b> Bloom Filter</b>
 * Explanation: A Bloom filter is a probabilistic data structure
 * that allows for O(1) time complexity lookups and requires less
 * memory than a hash table. However, it may give false positives
 * (i.e., it may incorrectly indicate that a username exists).
 * Implementation:
 * Create a Bloom filter with multiple hash functions.
 * Insert all usernames into the Bloom filter.
 * To check if a username exists, you check if all corresponding bits
 * for the hash functions are set to 1.
 * Pros: Very space-efficient, fast lookups.
 * Cons: Possibility of false positives, no false negatives.
 *
 * <br>
 *
 * 3. <b> Trie (Prefix Tree) </b>
 * Explanation: A Trie is a tree-like data structure where
 * each node represents a character of a username. This structure
 * is useful for prefix searches and is commonly used in autocomplete systems.
 * Implementation:
 * Insert each username into the Trie.
 * To check for a username, traverse the Trie according to the characters in the username.
 * Pros: Efficient for prefix-based lookups, no false positives or negatives.
 * Cons: Higher memory usage compared to a hash table, slightly slower lookups.
 *
 * <br>
 *
 * 4. <b> Binary Search on Sorted List</b>
 * Explanation: If the usernames are stored in a sorted list,
 * binary search can be used to check if a username exists in O(log n) time.
 * Implementation:
 * Sort the usernames.
 * Use binary search to check if a username exists.
 * Pros: Simple implementation, guaranteed O(log n) time complexity.
 * Cons: Requires sorting, which is O(n log n), and maintaining sorted order can
 * be costly if usernames are frequently updated.
 *
 * <br>
 *
 * 5. <b> Distributed Systems Approach</b>
 * Explanation: If the usernames are distributed across multiple servers or shards,
 * you would need to ensure an efficient distributed lookup.
 * Implementation:
 * Use consistent hashing to distribute usernames across multiple servers.
 * Each server can independently use one of the methods above to check for existence.
 * Aggregate the results from all servers.
 * Pros: Scales well with a very large number of users.
 * Cons: Complexity in implementation and maintaining consistency across servers.
 *
 * <br>
 *
 * 6. <b>Database Indexing</b>
 * Explanation: Store usernames in a database with an indexed column.
 * Most modern databases use B-trees or similar structures to index fields,
 * allowing for efficient lookups.
 * Implementation:
 * Use a database like MySQL, PostgreSQL, or NoSQL databases with indexing capabilities.
 * Create an index on the username column.
 * Query the database to check if the username exists.
 * Pros: Leverages existing database technologies, handles large data sets.
 * Cons: Dependent on database performance, potential bottleneck under high load.
 *
 * <br>
 *
 * <b>
 *     Summary
 * </b>
 * The optimal approach depends on the specific requirements (e.g., memory constraints,
 * acceptable probability of false positives, whether usernames are frequently updated).
 * For pure speed with minimal memory usage, a Bloom filter is a good choice,
 * whereas a hash table or database indexing might be preferable if you need
 * exact results without false positives.
 */
public class IdentifyUserOverMillionUserData {

    public static void populateBloomFilterFromCSV(String filePath, BloomFilter bloomFilter) throws FileNotFoundException {
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            // Stream through the file line by line
            Stream<String> lines = br.lines();
            lines.forEach(bloomFilter::add);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) throws FileNotFoundException {
        // Create Bloom filter with 10 million bits and 7 hash functions
        int numberOfHashFunctions = 7;
        int bitArraySize = 100000;
        BloomFilter bloomFilter = new BloomFilter(bitArraySize, numberOfHashFunctions);

        // File path of the large CSV file
        String filePath = "C:\\Users\\shivo\\Downloads\\people-100000.csv";

        List<User> userList =CsvReader.readCsv(filePath);

        userList.stream().filter(Objects::nonNull).forEach(e->bloomFilter.add(e.toString()));
        // Check if a specific string might be in the CSV
        String searchString = "john_doe";
        if (bloomFilter.mightContain(searchString)) {
            System.out.println(searchString + " might be in the CSV.");
        } else {
            System.out.println(searchString + " is definitely not in the CSV.");
        }
    }
}
