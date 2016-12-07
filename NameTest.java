//Carl Charlet

public class NameTest
{

    public static void main (String [] args)
    {
        //Sorry Dimitri I don't remember your last Name.. Since you r my TA I pick your name.lol
        
        Name teacher = new Name("Henry", 'H', "Leitner");
        Name tf = new Name("Dimitri", "Brown");

        System.out.println();
        System.out.println(teacher.getNormalOrder());
        System.out.println(tf.getNormalOrder());
        System.out.println();
        System.out.println(teacher.getReverseOrder());
        System.out.println(tf.getReverseOrder());
        System.out.println();
        System.out.println(teacher.getInitials());
        System.out.println(tf.getInitials());
        System.out.println();
    }

}