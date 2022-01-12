package dataStructure.Leetcode.Match271;

/**
 * @author Yawen Cao
 * @data 2021/12/12 15:18
 */
public class Question5955 {
    public static int maxTotalFruits(int[][] fruits, int startPos, int k) {
        int length = fruits.length;
        int[] prefixSumArr=new int[length+1];
        int sum=0;
        for(int i=1;i<=length;i++){
            sum+=fruits[i-1][1];
            prefixSumArr[i]=sum;
        }
        int ret=Integer.MIN_VALUE;
        // i: �տ�ʼ���������
        for(int i=0;i<=k;i++){
            int l = 0,r=0;
            if(i>=(int)(k/2+0.5)){
                l=startPos-k;
                r=startPos;
            }else{
                l=startPos-i;
                r=startPos+k-2*i;
            }
            int j=0;
            int w = length - 1;
            // ���ֲ��ҵ�һ�����ڵ���l��λ��
            while(j<=w){
                int mid=(j+w)/2;
                if(j==w) break;
                else if(fruits[mid][0]>=l) w=mid;
                else if(fruits[mid][0]<l) j=mid+1;
            }
            // ���û�ҵ�
            if(fruits[j][0]<l) continue;
            // ��ߵ���ˮ����λ��
            int left=j;
            j = 0;w=length-1;
            // ���ֲ��ҵ�һ��С�ڵ���r��λ��
            while(j<=w){
                int mid=(j+w)/2;
                if(j==w || j==w-1) break;
                else if(fruits[mid][0]<=r) j=mid;
                else if(fruits[mid][0]>r) w=mid-1;
            }
            // �ұߵ���ˮ����λ��
            int right;
            // ���û�ҵ�
            if(fruits[j][0]>r) continue;
            if(fruits[w][0]<=r) right=w;
            else right=j;
            System.out.println("��������"+i+"��,Ȼ��������,��Ӧ����߽���±�Ϊ"+left+"��Ӧ���б߽���±�Ϊ"+right);
            // ǰ׺����ˮ������
            ret=Math.max(ret,prefixSumArr[right+1]-prefixSumArr[left]);
        }
        System.out.println();
        // i: �տ�ʼ�����ұ���
        for(int i=0;i<=k;i++){
            int l = 0,r=0;
            if(i>=(int)(k/2+0.5)){
                l=startPos;
                r=startPos+k;
            }else{
                l=startPos-(k-2*i);
                r=startPos+i;
            }
            int j=0;
            int w = length - 1;
            // ���ֲ��ҵ�һ�����ڵ���l��λ��
            while(j<=w){
                int mid=(j+w)/2;
                if(j==w) break;
                else if(fruits[mid][0]>=l) w=mid;
                else if(fruits[mid][0]<l) j=mid+1;
            }
            // ���û�ҵ�
            if(fruits[j][0]<l) continue;
            // ��ߵ���ˮ����λ��
            int left=j;
            j = 0;w=length-1;
            // ���ֲ��ҵ�һ��С�ڵ���r��λ��
            while(j<=w){
                int mid=(j+w)/2;
                if(j==w || j==w-1) break;
                else if(fruits[mid][0]<=r) j=mid;
                else if(fruits[mid][0]>r) w=mid-1;
            }
            // �ұߵ���ˮ����λ��
            int right;
            // ���û�ҵ�
            if(fruits[j][0]>r) continue;
            if(fruits[w][0]<=r) right=w;
            else right=j;
            System.out.println("��������"+i+"��,Ȼ��������,��Ӧ����߽���±�Ϊ"+left+"��Ӧ���б߽���±�Ϊ"+right);
            // ǰ׺����ˮ������
            ret=Math.max(ret,prefixSumArr[right+1]-prefixSumArr[left]);
        }
        return ret;
    }
}
