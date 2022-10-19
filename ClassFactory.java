public class ClassFactory {
    public static CharacterClass getClass(String type){
        if("Barbarian".equalsIgnoreCase(type))
            return new Barbarian();
        else if ("Paladin".equalsIgnoreCase(type))
            return new Paladin();

        return null;
    }
}
