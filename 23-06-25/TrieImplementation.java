class TrieNode {
    TrieNode[] children = new TrieNode[26];
    boolean isEnd;
}

public class TrieImplementation {
    private final TrieNode root = new TrieNode();

    public void insert(String word) {
        TrieNode node = root;
        for (char ch : word.toCharArray()) {
            int index = ch - 'a';
            if (node.children[index] == null)
                node.children[index] = new TrieNode();
            node = node.children[index];
        }
        node.isEnd = true;
    }

    public boolean search(String word) {
        TrieNode node = root;
        for (char ch : word.toCharArray()) {
            int index = ch - 'a';
            if (node.children[index] == null) return false;
            node = node.children[index];
        }
        return node.isEnd;
    }

    public static void main(String[] args) {
        TrieImplementation trie = new TrieImplementation();
        trie.insert("hello");
        trie.insert("world");
        System.out.println("Search hello: " + trie.search("hello"));
        System.out.println("Search word: " + trie.search("word"));
    }
}
