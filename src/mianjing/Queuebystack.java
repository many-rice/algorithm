package mianjing;

import java.util.Stack;

/**
 *   两个栈实现队列
 */

public class Queuebystack {
    private Stack<Integer> in = new Stack<>();
    private Stack<Integer> out = new Stack<>();

    public static void main(String[] args) throws Exception{
        Queuebystack queuebystack = new Queuebystack();
        queuebystack.enter(1);
        queuebystack.enter(2);
        queuebystack.enter(3);
        System.out.println(queuebystack.leave());
        queuebystack.enter(4);
        System.out.println(queuebystack.leave());
        System.out.println(queuebystack.leave());
        System.out.println(queuebystack.leave());
        System.out.println(queuebystack.leave());
    }

    public void enter(Integer i){
         in.push(i);
    }

    public Integer leave() throws Exception{
        if(out.empty()){
            while(!in.empty()){
                out.push(in.pop());
            }
        }
        if(out.empty()) throw new QueueByStackException("队列为空");
        return out.pop();
    }
}

class QueueByStackException extends  Exception{
    public QueueByStackException(String message) {
        super(message);
    }
}
