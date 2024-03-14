package factory;

public class CharacterFactory {
    public static Character createCharacter(String type) {
        if (type.equalsIgnoreCase("warrior")) {
            return new Warrior();
        } else if (type.equalsIgnoreCase("mage")) {
            return new Mage();
        } else {
            return null;
        }
    }
}
