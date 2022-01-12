package dataStructure.Leetcode.binarySearch;

/**
 * @author Yawen Cao
 * @data 2021/11/21 15:44
 */
public class binarySearch {
    // ���ҵ�һ�����ڵ���Ԫ�ص��±�
    public void bsForFirstGT(int[] arr,int find){
        int l=0,r=arr.length-1;
        while(l<=r){
            int mid=(l+r)/2;
            if(l==r) break;
            else if(arr[mid]<find) l=mid+1;
            else if(arr[mid]>=find) r=mid;
        }
        if(arr[l]>find) System.out.println("�Ҳ�����Ԫ��,���ǵ�һ�����ڵ��ڸ�Ԫ�ص��±�Ϊ "+l);
        else if(arr[l]==find) System.out.println("��Ԫ�ص��±�"+l);
        else System.out.println("�����е�����Ԫ��ȫ��С��find");
    }

    // �ҵ�һ������Ԫ�ص��±�
    public void bsForFirstG(int[] arr,int find){
        int l=0,r=arr.length-1;
        while(l<=r){
            int mid=(l+r)/2;
            if(l==r) break;
            else if(arr[mid]<=find) l=mid+1;
            else if(arr[mid]>find) r=mid;
        }
        if(arr[l]<=find) System.out.println("�Ҳ�����һ�����ڸ�Ԫ�ص�ֵ");
        else System.out.println(l);
    }
    // ���ҵ�һ��С�ڵ���Ԫ�ص��±�
    public void bsForLast(int[] arr,int find){
        int l=0,r=arr.length-1;
        while(l<=r){
            int mid=(l+r)/2;
            if(l==r || l==r-1) break;
            else if(arr[mid]<=find) l=mid;
            else if(arr[mid]>find) r=mid-1;
        }
        if(arr[r]<=find) System.out.println(r);
        else System.out.println(l);
    }
}
