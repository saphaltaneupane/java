package array;
/*
*       Subject            Marks
*          nepali           90
*           math            80
*            english        70
*             social        85
*              computer     92
*              total
*              percentage*/

public class subjectstotal{
    public static void main(String[] args) {
        String subjects[]={"nepali","math", "english","social","computer"};
        int subjectsmarks[]={90,80,70,85,92};
        int total=0;
        for(int i=0;i<subjectsmarks.length;i++){
            total=total+subjectsmarks[i];
        }
        for(int i=0;i<subjectsmarks.length;i++){
            System.out.print(subjects[i]+" " +subjectsmarks[i]);
            System.out.println();
        }
//     for(int x:subjectsmarks)
//
//     {
//
//         System.out.println(subjectsmarks+" "+x);
//     }

        System.out.println("total:"+total);
        int percent=total/5;
        System.out.println(percent);
    }

}
