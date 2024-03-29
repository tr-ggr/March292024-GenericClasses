package Map;


import java.util.ArrayList;
import java.util.Optional;

public class MyMap <key, value> {
    private class Node<T>{
        private T t;
        private Node<T> next;
        public Node(T t) {
            this.t = t;
        }

        public T getT() {
            return t;
        }

        public T getValue() {
            return next.getT();
        }

        public void setValue(value v) {
            next = new Node<>((T)v);
        }
    }

    private ArrayList<Node> map = new ArrayList<>();

    public void put(key k, value v){
        Optional<Node> temp = map.stream().filter(n -> n.getT().equals(k)).findFirst();
        if(temp.isPresent()){
            temp.get().setValue(v);
        } else {
            Node<key> N = new Node<>(k);
            N.setValue(v);
            map.add(N);
        }

//        for(Node<key> n : map){
//            if(n.getT().equals(k)){
//                n.setValue(v);
//                return;
//            }
//        }
//
//        Node<key> N = new Node<>(k);
//        N.setValue(v);
//        map.add(N);

    }

    public value get(key k){
        Optional<Node> temp = map.stream().filter(n -> n.getT().equals(k)).findFirst();

        if(temp.isPresent()){
            return (value) temp.get().getValue();
        } else {
            return null;
        }

//        for(Node<key> n : map){
//            if(n.getT().equals(k)){
//                return (value) n.getValue();
//            }
//        }
//        return null;
    }

    public value remove(key k){
        value temporary;

        Optional<Node> temp = map.stream().filter(n -> n.getT().equals(k)).findFirst();

        if(temp.isPresent()){
            temporary = (value) temp.get().getValue();
            map.remove(temp.get());
            return temporary;
        } else {
            return null;
        }

//        for(Node<key> n : map){
//            if(n.getT().equals(k)){
//                temporary = (value) n.getValue();
//                map.remove(n);
//                return temporary;
//            }
//        }
//        return null;
    }
}
