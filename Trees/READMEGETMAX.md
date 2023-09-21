# Trees : Get Min & Max values


### Whiteboard Process
![img_1.png](img_1.png)

### Approach & Efficiency
OOP , While Loop

### Solution

- [Link to code ](/Trees/app/src/main/java/trees/App.java)

```java
package trees;

public class BinaryTree<T> {
    
    
    public T getMax() {
        Node<T> temp = root;
        while (temp.right != null) {
            temp = temp.right;
        }
        return temp.value;
    }

    public T getMin() {
        Node<T> temp = root;
        while (temp.left != null) {
            temp = temp.left;
        }
        return temp.value;
    }
}
```
