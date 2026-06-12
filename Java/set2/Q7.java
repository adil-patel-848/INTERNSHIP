// 7. Write a program to find the grade of a student of a subject based on given table. 

class Q7
{
    public static void main(String[]args)
    {
        int mrk=71;
        String grade=(100>=mrk && mrk>=71)?"Distinction":(mrk<71 && mrk>=61)?"1st division":
                    (mrk<61 && mrk>=51)?"2nd division":(mrk<51 && mrk>=41)?"3rd division":
                    (mrk<41 && mrk>=36)?"pass":(mrk<36 && mrk>=0)?"fail":"invalid number";
        System.out.println("Grade: "+grade);
    }
}