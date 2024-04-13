public class Lab5_2{
    public static void main(String[] args) {
        Time t1 = new Time();
        Time t2 = new Time(12,55);
        t1.addTime(t1.hr,t2.hr, t1.min, t2.min);
    }
}

class Time{
    int hr,min;

    Time(){
        hr = 2;
        min = 50;
    }

    Time(int h,int m){
        hr = h;
        min = m;
    }

    void addTime(int t1h,int t2h,int t1m,int t2m){
        int totalHr = t1h + t2h;
        int totalMin = t1m + t2m;

        if(totalMin>59){
            totalHr = totalHr + totalMin/60;
            totalMin = totalMin%60;
        }

        System.out.println(totalHr+":"+totalMin);
    }
}