package dataStructure.Queue;

/**
 * @author 86153
 * @data 2021/6/10 18:39
 */
public interface myQueue {
    public void append(Object object) throws Exception;
    public Object delete() throws Exception;
    public Object getFront() throws Exception;   //��ȡ����Ԫ��
    public boolean notEmpty();
}

