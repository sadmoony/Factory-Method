public class Demo {

    public static void main(String[] args){
        Character character = new Character("Moonlight", ClassFactory.getClass("Paladin"));

        character.setAttributes(Stats.generate());
        character.printSheet();

    }
}
