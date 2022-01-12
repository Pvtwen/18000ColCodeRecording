package dataStructure.Leetcode;

import java.time.Clock;

/**
 * @author Yawen Cao
 * @data 2021/12/24 12:05
 */
public class Question686 {
    public int repeatedStringMatch(String a, String b) {
        int ans=0;
        StringBuilder sb=new StringBuilder();
        while(sb.length()<b.length()){
            sb.append(a);
            ans++;
        }
        Clock clock = Clock.systemDefaultZone();
        long start = clock.millis();
        while(clock.millis()-start<100){
            if(sb.indexOf(b)!=-1) return ans;
            sb.append(a);
            ans++;
        }
        return -1;
    }
//    public int repeatedStringMatch(String a, String b) {
//        int n = a.length();
//        int m = b.length();
//        int l = m / n;
//        // �½�
//        if(m%n!=0) l++;
//        // �Ͻ�
//        int r=l+1;
//        // ֱ�Ӱ��Ͻ츳ֵ��a
//        int tmp=r;
//        String match="";
//        while(tmp>0){
//            match+=a;
//            tmp--;
//        }
//        System.out.println(match);
//        n=match.length();
//        m++;
//        b="-"+b;
//        int[] next = getNext(b);
//        // kmp i:matchָ�� j��bָ��
//        int i=0,j=1;
//        // ���ñ�־���� �ж��ǲ����Ѿ���ʼƥ����
//        while(j<m){
//            if(j==0 && i>=a.length()) break;
//            // �������һ��a��û��ƥ��ɹ� ֱ���˳�
//            if(j==0 || b.charAt(j)==match.charAt(i)){
//                i++;j++;
//            }else if(b.charAt(j) != match.charAt(i)){
//                j=next[j];
//            }
//            else if(i>=a.length()) break;
//        }
//        // ƥ��ɹ�
//        for (char c : match.toCharArray()) {
//            System.out.print(c + " ");
//        }
//        System.out.println();
//        System.out.println("ƥ�������λ��ʱ"+i);
//        System.out.println("l*a.length���±�Ϊ"+l*a.length());
//        if(j==m){
//            // ���ƥ��Ľ���λ��С�ڵ����½�ĳ��� �����½� ���� �����Ͻ�ĳ���
//            if(i-1<l*a.length()) return l;
//            else return r;
//        }else return -1;
//    }
//    public int[] getNext(String b){
//        int n = b.length();
//        int i = 0, j = 1;
//        int[] next=new int[n];
//        next[0]=-1;next[1]=0;
//        while(j<n-1){
//            if(i==0||b.charAt(i)==b.charAt(j)){
//                i++;j++;
//                if(b.charAt(i)==b.charAt(j)) next[j]=next[i];
//                else next[j]=i;
//            }else i=next[i];
//        }
//        return next;
//    }
}
