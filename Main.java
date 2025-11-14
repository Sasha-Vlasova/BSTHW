import java.util.Iterator;
import java.util.Scanner;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        // Test 1: Create a BST with integers using natural ordering
        System.out.println("=== Test 1: Basic Integer BST ===");
        BinarySearchTree<Integer> bst = new BinarySearchTree<>();
        
        // Add elements
        System.out.println("Adding elements: 50, 30, 70, 20, 40, 60, 80");
        bst.add(50);
        bst.add(30);
        bst.add(70);
        bst.add(20);
        bst.add(40);
        bst.add(60);
        bst.add(80);

        
        
        // Test basic properties
        System.out.println("Size: " + bst.size());
        System.out.println("Is Empty: " + bst.isEmpty());
        System.out.println("Min: " + bst.min());
        System.out.println("CHECK: " + bst.minValue()); // checking my code?
        System.out.println("Max: " + bst.max());
        System.out.println("Is Balanced: " + bst.isBalanced());
        System.out.println();
        
        // Test contains
        System.out.println("=== Test 2: Contains ===");
        System.out.println("Contains 40: " + bst.contains(40));
        System.out.println("Contains 100: " + bst.contains(100));
        System.out.println();
        
        // Test get
        System.out.println("=== Test 3: Get ===");
        System.out.println("Get 60: " + bst.get(60));
        System.out.println("Get 99: " + bst.get(99));
        System.out.println();
        
        // Test traversals
        System.out.println("=== Test 4: Traversals ===");


        System.out.print("Inorder (should be sorted): ");
    Iterator<Integer> inorder = bst.getIterator(BSTInterface.Traversal.InOrder);
        while(inorder.hasNext()){
            System.out.print(inorder.next() + " ");
        }
        System.out.println();
        

        System.out.print("Preorder: ");
    Iterator<Integer> preorder = bst.getIterator(BSTInterface.Traversal.PreOrder);
        while(preorder.hasNext()){
            System.out.print(preorder.next() + " ");
        }
        System.out.println();
        
        System.out.print("Postorder: ");
    Iterator<Integer> postorder = bst.getIterator(BSTInterface.Traversal.PostOrder);
        while(postorder.hasNext()){
            System.out.print(postorder.next() + " ");
        }
        System.out.println("\n");
        
        // Test remove
        System.out.println("=== Test 5: Remove ===");
        System.out.println("Removing 20 (leaf node): " + bst.remove(20));
        System.out.println("Size after removal: " + bst.size());
        
        System.out.println("Removing 30 (node with two children): " + bst.remove(30));
        System.out.println("Size after removal: " + bst.size());
        
        System.out.println("Removing 100 (non-existent): " + bst.remove(100));
        System.out.println("Size after removal: " + bst.size());
        
        System.out.print("Inorder after removals: ");
        Iterator<Integer> afterRemove = bst.iterator();
        while(afterRemove.hasNext()){
            System.out.print(afterRemove.next() + " ");
        }
        System.out.println("\n");
        

        // ==================== CHECKING my code for BST ==========================
        
        
        //Q: should I ask user to enter data or it is enough to show the case with Dr. Jack's data???


        
        // test TODO-1: Implement maxDepth
        System.out.println("The max root-to-leaf depth of the tree:  " + bst.maxDepth());

        // test TODO-2: Implement minValue
        System.out.println("The min value in a non-empty binary search tree: " + bst.minValue());


        // test TODO-3:  Duplication
        bst.doubleTree(); // we have doplicated all nodes, let print this new tree using - PreORDER, InORDER, PostORDER:
        
        System.out.print("PreOrder after duplication: ");
        Iterator<Integer> afterDuplication = bst.preorderIterator();
        while (afterDuplication.hasNext())
            System.out.print(afterDuplication.next() + " ");
        System.out.println("\n");

        System.out.println("InOrder after duplication: ");
        Iterator<Integer> afterDupl = bst.iterator();
        while (afterDupl.hasNext())
            System.out.print(afterDupl.next() + " ");
        System.out.println("\n");

        System.out.println("PostOrder after duplication");
        Iterator<Integer> afterD = bst.postorderIterator();
        while (afterD.hasNext())
            System.out.print(afterD.next() + " ");
        System.out.println("\n");
 /**/
        // test TODO-4: Compares trees to see if they are structurally identical
       
       
        // Q: Do you mean identical by the element present or by the element present and their "order"?
       
       
       
        System.out.print("Would you like to create a tree made of Integers? (Yes/No) ");
        
        Scanner keyboard = new Scanner(System.in);
        String ans;
        ans = keyboard.next(); 
        
        
        
        // Q: should I consider other types of tree?
        
        
        if (ans.equalsIgnoreCase("yes"))
        {
            BinarySearchTree<Integer> newBST = new BinarySearchTree<>(); // creating a new tree for user 
            int integer;

            do{ // populating tree
            System.out.print("Please, enter the number: ");
            integer = keyboard.nextInt();
            newBST.add(integer);

            System.out.print("Would you like to add another number? (Yes/No) ");
            ans = keyboard.next();
            } while (ans.equalsIgnoreCase("yes"));

            if (bst.sameTree(newBST))

            {
                System.out.println( "\nThese tree is identical to the tree we have!");
            }
                
            else
                System.out.println("\nSorry, but your tree is different from what we have..");
        }
        else
            System.out.println("Thank you for your answer, have a good day!");

    
    }
}
