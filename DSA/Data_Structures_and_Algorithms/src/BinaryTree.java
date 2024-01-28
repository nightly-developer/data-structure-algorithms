public class BinaryTree {
  BinaryTree left, right;//references of node 
  int data;

  //constructor
  public BinaryTree(int data) {
    this.data = data;//this is root value = data
  }

  //Insertion
  public void insert(int value) {
    if (value <= data) {
      if (left == null)//base condition
        left = new BinaryTree(value);//new node created and ref by 'left'
      else
        left.insert(value);//recursion
    }

    else {
      if (value >= data)
        if (right == null)//base condition
          right = new BinaryTree(value);//new node created and ref by 'right'
        else
          right.insert(value);//recursion
    }
  }
  
  //Traversing
  public boolean contains(int value) {
    if (value == data) //base condition
      return true;

    else if (value < data) {
      if (left == null)//base condition
        return false;
      else
        return left.contains(value);//recursion
    }

    else {
      if (right == null) //base condition
        return false;
      else
        return right.contains(value);//recursion
    }
  }
  
  public void printInOrder() {
    if (left != null) //printing left side of tree
      left.printInOrder();//recursion
    
    System.out.println(data);//printing root node
  
    if (right != null)//printing right side of tree
      right.printInOrder();//recurtion
  }
}