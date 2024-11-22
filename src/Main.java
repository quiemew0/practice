import animals.Animal;
import animals.Cat;
import animals.Dog;

import java.util.ArrayList;
import java.util.List;

//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class Main {
    public static void main(String[] args) {
        Animal dog1= new Dog();
        Animal cat1 = new Cat();

        /*List<Animal> animals = new ArrayList<>();
        animals.add(dog1);
        animals.add(cat1);*/
        dog1.eat();
        cat1.eat();
            //ss.sleep();
    }
}