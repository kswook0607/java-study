package drill06.prob05;

public class Animal {
    
    private static int count = 0;

    
    public Animal() {
        count++;
        System.out.println("동물 객체 생성!");
        System.out.println("현재 동물 수: " + count);
    }

    
    public static int getCount() {
        return count;
    }
}

