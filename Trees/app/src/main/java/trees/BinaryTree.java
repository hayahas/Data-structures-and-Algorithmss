package trees;

import org.checkerframework.common.value.qual.StringVal;

import java.util.*;

public class BinaryTree<T> {

    Node<T> root;

    public ArrayList<T> preOrder(Node<T> temp, ArrayList<T> result) {
        if (root == null) {
            throw new NullPointerException("Tree is Empty");
        }
        if (temp != null) {
            result.add(temp.value);
            preOrder(temp.left, result);
            preOrder(temp.right, result);
        }
        return result;
    }


    public ArrayList<T> inOrder (Node<T> temp, ArrayList<T> result){

    if (root == null){
        throw new NullPointerException("Tree is Empty");
    }

    if(temp != null){
        inOrder(temp.left,result);
        result.add(temp.value);
        inOrder(temp.right,result);
    }
        return result;
    }

    public ArrayList<T> postOrder (Node<T> temp, ArrayList<T> result){

       if(root == null ){
           throw new NullPointerException("Tree is Empty");
       }

       if(temp != null){
           postOrder(temp.left,result);
           postOrder(temp.right,result);
           result.add(temp.value);
       }
       return result;
    }

    public T getMax(){
        if (root == null) {
            throw new NullPointerException("Tree is empty, cannot find maximum.");
        }
        Node<T> temp = root;
        while(temp.right != null){
            temp=temp.right;
        }
        return temp.value;
    }


    public T getMin(){
        if (root == null) {
            throw new NullPointerException("Tree is empty, cannot find minimum.");
        }
        Node<T> temp = root;
        while(temp.left != null){
            temp=temp.left;
        }
        return temp.value;
    }


    public T bottomLeft(Node root){
        if(root == null) return null;

        Queue<Node<T>> queue = new LinkedList<>();

        queue.offer(root);

        while(!queue.isEmpty()){
            root = queue.poll();
            if(root.right != null) queue.offer(root.right);
            if(root.left != null) queue.offer(root.left);
        }

        return (T) root.value;
    }
    public T bottomright(Node root){
        if(root == null) return null;

        Queue<Node<T>> queue = new LinkedList<>();

        queue.offer(root);

        while(!queue.isEmpty()){
            root = queue.poll();
            if(root.left != null) queue.offer(root.left);
            if(root.right != null) queue.offer(root.right);
        }

        return (T) root.value;
    }


    public int deepestLevelSum(Node<T> root){
        Queue<Node<T>> queue = new LinkedList<>();
        queue.offer(root);
        int deepLevelSum = 0;

        while(!queue.isEmpty()){
            int levelSum = 0;
            int size = queue.size();
            for(int i=0;i<size;i++){
                Node<T> curr = queue.poll();
                levelSum+= (int)curr.value;
                if(curr.left != null) queue.offer(curr.left);
                if(curr.right != null) queue.offer(curr.right);

            }
            deepLevelSum= levelSum;
        }
        return deepLevelSum;
    }


    public boolean isIdentical(Node<T> root1, Node<T> root2){

        if(root1 == null && root2 == null) return true;
        if(root1 == null || root2 == null) return false;

        return ((root1.value == root2.value) && isIdentical(root1.left,root2.left) &&isIdentical(root1.right,root2.right));

    }

   public boolean isUnivalued(Node root){
       boolean left = root.left == null || root.left.value == root.value && isUnivalued(root.left);
       boolean right = root.right == null || root.right.value == root.value && isUnivalued(root.right);

       return left && right;
   }


    public Node sortedArrToBST(int nums[]){
        if(nums.length == 0) return null;
        return sortedArrToBSTHelper(nums,0,nums.length-1);
    }

  public Node sortedArrToBSTHelper(int nums[],int left, int right){
        if(left > right) return null;
        int mid = left + (right-left) /2;

        Node root = new Node(nums[mid]);
      root.left= sortedArrToBSTHelper(nums, left , mid-1);
      root.right= sortedArrToBSTHelper(nums, mid+1 , right);

      return root;

  }

  public List<Integer> largestValEachLevel(Node root){
       List<Integer> result = new ArrayList<>();
       if(root == null) return result;

       Queue<Node> queue = new LinkedList<>();
       queue.offer(root);

       while (!queue.isEmpty()){
           int level = queue.size();
           int largestVal = Integer.MIN_VALUE;
           for (int i =0 ;i<level;i++){
               Node current = queue.poll();

               largestVal=Math.max((int) current.value, largestVal);

               if(root.left != null) queue.offer(root.left);
               if(root.right != null) queue.offer(root.right);

           }

           result.add(largestVal);
       }

       return result;
  }


  public int allNodesSummation(Node root){
        int sum = 0;
        if(root == null) return sum;

        Stack<Node> stack = new Stack();
        stack.push(root);

        while(!stack.isEmpty()){
            Node current = stack.pop();
            sum+=(int) current.value;
            if(current.left != null) stack.push(current.left);
            if(current.right != null) stack.push(current.right);
        }
        return sum;
  }

//  public int sumRange(Node root, int num1, int num2){
//        int sum =0;
//        if(root == null) return sum;
//
//        Stack<Node> stack = new Stack<>();
//        stack.push(root);
//
//        while(!stack.isEmpty()){
//            Node current = stack.pop();
//            if(current != null){
//                if((int) current.value >= num1 && (int) current.value <= num2){
//                    sum+= (int) current.value;
//                }
//
//                if((int) current.left.value < num1) stack.push(current.left);
//                if((int) current.right.value > num2) stack.push(current.right);
//
//
//            }
//        }
//return sum;
//  }
    public ArrayList<T> breadthFirst (){

        ArrayList<T> result = new ArrayList<>();

        if(root == null ){
            throw new NullPointerException("Tree is Empty");
        }

        Queue<Node> q = new LinkedList<>();

        q.add(root);
        while(!q.isEmpty()){
            Node<T> temp =q.poll();
            result.add(temp.value);
            if(temp.left != null) q.add(temp.left);
            if(temp.right != null) q.add(temp.right);

        }
        return result;

    }

    public Node merge2Trees(Node root1, Node root2){
        if(root1 == null) return root2;
        if(root2 == null) return root1;

        root1.value = (int) root1.value + (int)root2.value;
        root1.left = merge2Trees(root1.left, root2.left);
        root1.right = merge2Trees(root1.right, root2.right);

        return root1;
    }

    public Node invertTree(Node root){
        if (root == null) return null;

        Node left = invertTree(root.left);
        Node right = invertTree(root.right);

        root.left = right;
        root.right = left;

return root;
    }

    public int maxDepth(Node root){
        if(root == null) return 0;

        int left = maxDepth(root.left);
        int right = maxDepth(root.right);

        return Math.max(left,right) + 1;

    }

       public int getHeight(Node root){
        if(root == null) return 0;

         int leftHeight= getHeight(root.left);
         int rightHeight= getHeight(root.right);

         return Math.max(leftHeight,rightHeight) +1 ;

    }

    public boolean isBalanced(Node root){
        if(root == null) return true;

        int leftSubtree = getHeight(root.left);
        int rightSubtree = getHeight(root.right);

        if(Math.abs(leftSubtree-rightSubtree) > 1)
            return false;

        return isBalanced(root.left) && isBalanced(root.right);

    }

    public boolean isBinarysearchTree(Node root){
        if(root == null) return true;

        if(root.left != null && (int) root.left.value < (int) root.value)
            return true;
        if(root.right != null && (int) root.right.value > (int) root.value)
            return true;

        return isBinarysearchTree(root.left) && isBinarysearchTree(root.right);

    }

    public BinaryTree<String> fizzBuzzTree(BinaryTree<Integer> integerTree) {
        BinaryTree<String> fbTree = new BinaryTree<>();
        fbTree.root = fizzBuzzHelper(integerTree.root);
        return fbTree;
    }

    private Node<String> fizzBuzzHelper(Node<Integer> node) {
        if (node == null) {
            return null;
        }

        Node<String> fbNode;
        fbNode = new Node<>(Integer.toString(node.value));

        fbNode.left = fizzBuzzHelper(node.left);

        if (node.value % 3 == 0 && node.value % 5 == 0) {
            fbNode.value = "FizzBuzz";
        } else if (node.value % 3 == 0) {
            fbNode.value = "Fizz";
        } else if (node.value % 5 == 0) {
            fbNode.value = "Buzz";
        }

        fbNode.right = fizzBuzzHelper(node.right);

        return fbNode;
    }

    public void traverseTree(Node<String> node, List<String> result) {
        if (node != null) {
            traverseTree(node.left, result);
            result.add(node.value);
            traverseTree(node.right, result);
        }
    }



}
