package dataStructure.Compute.ProducerAndConsumer;

/**
 * @author Yawen Cao
 * @data 2021/11/12 16:31
 */
public class Buffer {
    int data;  // ����Ĵ�С
    int capability; // ��ǰ����
     // true ������������
    public Buffer(int data){
        this.data=data;
        this.capability=0;
    }
    public synchronized void produce(){
        // full
        while(capability==data){
            notifyAll();
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
//        notifyAll();

        capability+=1;
    }
    public synchronized void consumer(){
        while(capability==0){
            notifyAll();
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
//        notifyAll();

        capability-=1;
        notifyAll();
    }
}
