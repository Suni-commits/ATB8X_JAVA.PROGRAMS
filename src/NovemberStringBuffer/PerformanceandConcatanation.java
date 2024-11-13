package NovemberStringBuffer;

public class PerformanceandConcatanation {
    public static void main(String[] args){
        // Performce using String
        long StartTime,EndTime;
        // Using String (String concatenation creates new String objects each time)
        StartTime=System.currentTimeMillis();
        String str="";
        for(int i=0;i<100000;i++){
            str += "a"; //insuffient string concatanation
        }
        EndTime=System.currentTimeMillis();
        System.out.println("String is taking time : " +(EndTime - StartTime) +" ms");
        // Using StringBuffer compaing concatanation
        StartTime=System.currentTimeMillis();
        StringBuffer sb=new StringBuffer();
        for(int i=0;i<100000;i++){
            sb.append("a");
        }
        EndTime=System.currentTimeMillis();
        System.out.println("Time taking using StringBuffer  is  : " +(EndTime - StartTime) +" ms");
    }
}
