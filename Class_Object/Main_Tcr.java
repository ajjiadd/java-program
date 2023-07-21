package Class_Object;

public class Main_Tcr {
    //Class Attributes sections--->
    //under the Class of "Main_Tcr";
    String fname = "Abdullah - Al";
    String lname = "Jiad";

    //Class Methods Sections--->
    //create a function;

    static void bd(){
        System.out.println("Hello Bangladesh!");
    }

    public void bd_main(){
        System.out.println("Hello Peoples...");
    }




    public static void main(String[] args){
        //1st person call
        Teacher teacher1 = new Teacher();

        teacher1.name = "ABDULLAH - AL JIAD";
        teacher1.gender = "Male";
        teacher1.num = 1996622222;
        System.out.println("\n"+teacher1.name + "\n" + teacher1.gender + "\n" + teacher1.num);


        //2nd person call

        Teacher teacher2 = new Teacher();

        teacher2.name = "Sayda Rahman";
        teacher2.gender = "Female";
        teacher2.num = 1995544287;

        System.out.println("\n"+teacher2.name + "\n" + teacher2.gender + "\n" + teacher2.num);
        
        //3rd person call

        Teacher teacher3 = new Teacher();

        teacher3.name = "Sayda Rahman";
        teacher3.gender = "Female";
        teacher3.num = 1935544287;

        System.out.println("\n"+teacher3.name + "\n" + teacher3.gender + "\n" + teacher3.num);


        //1st student call form another class of name is : "Student"

        Student student1 = new Student();

        student1.name = "Abdullah Al Jiad";
        student1.id = 1288;
        student1.semester = "Third";

        System.out.println("\n"+student1.name +"\n"+ student1.id + "\n" + student1.semester);

        //2nd person call

        Student student2 = new Student();

        student2.name = "Adnan Sekh";
        student2.id = 365;
        student2.semester = "Third";

        System.out.println("\n"+student2.name +"\n"+ student2.id + "\n" + student2.semester);

        //Class Attributes Section--->
        //external integer number called;[from class "Student"]
        Student integer1 = new Student();
        integer1.x = 200;
        Student integer = new Student();
        System.out.println("\n"+"The result is: " + integer1.x);
        System.out.println("\n" + "The result is: " + integer.x);

        //part of "Main_Tcr" Class;
        Main_Tcr myobj = new Main_Tcr();
        System.out.println("\n"+myobj.fname +" "+ myobj.lname +"\n");


        //Class Methods section--->
        //call a function ; // for Attribute is : "Static";
        bd();

        //rename a function of "bd_main"; //for Attribute is : "Public";
        Main_Tcr myobjj = new Main_Tcr();
        myobjj.bd_main();




        //Class of "Web_Developer"

        Web_Developer Fullstack = new Web_Developer();

        Fullstack.Name = "ABDULLAH - AL JIAD";
        Fullstack.Skill = "WEB DEVELOPER";
        Fullstack.Language = "C/ C++/ JAVA/ JAVA SCRIPT/ HTML/ CSS";
        System.out.println(Fullstack.Name+""+Fullstack.Skill+""+Fullstack.Language);



        }    
    
    }

