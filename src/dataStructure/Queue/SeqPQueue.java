package dataStructure.Queue;

/**
 * @author 86153
 * @data 2021/6/12 15:10
 */
public class SeqPQueue {
    static final int defaultSize=10;
    int front;
    int rear;
    int count;
    int maxSize;
    Element[] data;     //

    public SeqPQueue(){
        data=new Element[defaultSize];
        front = 0;
        rear =0;
        count=0;
        maxSize=defaultSize;
    }
    public SeqPQueue(int size){
        data=new Element[size];
        front=0;
        rear=0;
        count=0;
        maxSize=size;
    }

    //����Ԫ��
    public void append(Object object) throws Exception {
        if(count==maxSize){
            throw new Exception("��������");
        }
        data[rear]=(Element)object;
        rear++;
        count++;
    }

    public Object delete() throws Exception {
        if(count==0){
            throw new Exception("����Ϊ��");
        }
        int index=0;
        Element min=data[0];
        //ѭ���������� �ҵ����ȼ���ߵ����ҵ����Ƚ�����е�
        for (int i = 0; i < data.length; i++) {
            if(data[i].getPriority()<min.getPriority()){
                index=i;
                min=data[i];
            }
        }
        for (int i = index; i < data.length-1; i++) {
            data[index]=data[index+1];
        }
        count--;
        rear--;
        return min;
    }

    public Element getFront() throws Exception {
        if(count==0){
            throw new Exception("����Ϊ��");
        }
        Element min=data[0];
        //ѭ���������� �ҵ����ȼ���ߵ����ҵ����Ƚ�����е�
        if(count==1){
            return min;
        }

        for (int i = 1; i < data.length; i++) {
            if(data[i].getPriority()<min.getPriority()){
                min=data[i];
            }
        }
        return min;
    }
}
