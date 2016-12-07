class PetTest
{
    public static void main(String [] args)
    {
        pet myDog = new pet();
        pet.name = "Fido";
        pet.age = 9;
        pet.weight = 29.5;
        
        pet myParrot= new pet();
        pet.name = "Polly";
        pet.age = 32;
        pet.weight = 2.85;
        
        pet myCat= new pet();
        pet.name = "Tiger";
        pet.age = 4;
        
        myDog.pet();
        myParrot.pet();
        myCat.pet();
    }
}