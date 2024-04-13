public class Lab8_1 {
    public static void main(String[] args){
       
    try{
        int x = Integer.parseInt(args[0]);
        int y = Integer.parseInt(args[1]);

        int ans=1;
        for(int i=0;i<=y;i++){
            ans=ans*y;
            System.out.println(ans);

        }
    }
    catch(Exception e){
        e.printStackTrace();

    }
}
}
