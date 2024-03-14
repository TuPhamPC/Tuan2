package factory;

public class Main {
    public static void main(String[] args) {
        // Tạo các nhân vật sử dụng CharacterFactory
        Character warrior = CharacterFactory.createCharacter("warrior");
        Character mage = CharacterFactory.createCharacter("mage");

        // Gọi phương thức attack của từng nhân vật
        warrior.attack();
        mage.attack();
    }
}

