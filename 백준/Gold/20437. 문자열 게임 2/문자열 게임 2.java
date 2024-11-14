import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();
        while(T-->0){
            int min=Integer.MAX_VALUE;
            int max=-1;
            String W = br.readLine();
            int K = Integer.parseInt(br.readLine());
            int[] alpha = new int[26];
            for(int i=0; i<W.length(); i++){
                alpha[W.charAt(i)-'a']++;
            }

            if(K==1){
                sb.append("1 1").append("\n");
                continue;
            }

            if(!hasSequence(alpha, K)){
                sb.append(-1);
            }else{
                for(int i=0; i<W.length(); i++){
                    if(alpha[W.charAt(i)-'a']<K) continue;
                    int count=1;
                    for(int j=i+1; j<W.length(); j++){
                        if(W.charAt(i)==W.charAt(j)){
                            count++;
                        }
                        if(count==K){
                            min = Math.min(min, j-i+1);
                            max = Math.max(max, j-i+1);
                            break;
                        }
                    }
                }
                sb.append(min).append(" ").append(max);
            }
            sb.append("\n");
        }
        System.out.println(sb);
    }

    public static boolean hasSequence(int[]alpha, int K){
        for(int i=0; i<26; i++){
            if(alpha[i]>=K) return true;
        }
        return false;
    }
}
