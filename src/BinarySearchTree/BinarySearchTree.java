package BinarySearchTree;

public class BinarySearchTree {
   Node root;

    public class Node{
        int value;
        Node left;
        Node right;

        public Node(int value){
            this.value = value;
        }
    }

    public BinarySearchTree() {
        root = null;
    }

    public BinarySearchTree(int value){
        Node newNode= new Node(value);
        root = newNode;
    }

    public boolean insert(int value){
        Node newNode = new Node(value);
        if(root == null){
            root = newNode;
            return true;
        }
        Node temp = root;
        while(true){
            if(newNode == temp) return false;
            if(newNode.value < temp.value){
                if(temp.left == null){
                    temp.left = newNode;
                    return true;
                }
                temp = temp.left;
            }
            else{
                if(temp.right == null){
                    temp.right = newNode;
                    return true;
                }
                temp = temp.right;
            }

        }

    }

    public boolean contains(int value){
        //if(root == null) return false; #while 문에서 알아서 거름
        Node temp = root;
        while(temp!=null){
            if(value < temp.value){
                temp = temp.left;
            }
            else if(value > temp.value){
                temp = temp.right;
            }
            else return true;
        }
        return false;
    }

    //Recursive BST
    private boolean rContains(Node currentNode, int value){
        if(currentNode == null) return false;

        if(currentNode.value == value) return true;

        if(value < currentNode.value){
            return rContains(currentNode.left, value);
        }
        else{
            return rContains(currentNode.right, value);
        }
    }

    public boolean rContains(int value){
        return rContains(root, value);
    }

    private Node rInsert(Node currentNode, int value){
        if(currentNode == null) return new Node(value);

        if(value < currentNode.value){
            currentNode.left = rInsert(currentNode.left, value);
        }
        else if(value > currentNode.value){
            currentNode.right = rInsert(currentNode, value);
        }
        return currentNode;
    }

    public void rInsert(int value){
        if(root == null) root = new Node(value);
        rInsert(root, value);
    }

    private Node deleteNode(Node currentNode, int value){
        if(currentNode == null) return null;

        if(value < currentNode.value){
            currentNode.left = deleteNode(currentNode.left, value);
        }else if(value > currentNode.value){
            currentNode.right = deleteNode(currentNode.right, value);
        }else{
            if(currentNode.left == null && currentNode.right == null) return null;
            else if (currentNode.left == null) {
                currentNode = currentNode.right;
            } else if (currentNode.right == null) {
                currentNode = currentNode.left;
            } else{
                int subTreeMin = minValue(currentNode.right);
                currentNode.value = subTreeMin;
                currentNode.right = deleteNode(currentNode.right, subTreeMin);
            }
        }
        return currentNode;
    }

    public int minValue(Node currentNode){
        while(currentNode.left != null){
            currentNode = currentNode.left;
        }
        return currentNode.value;
    }

    public void deleteNode(int value){
        deleteNode(root, value);
    }

}
