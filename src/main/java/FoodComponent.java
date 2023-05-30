import dagger.Component;
import dagger.Provides;

import javax.inject.Singleton;
@Singleton
@Component(modules = {FoodServiceModule.class})
public interface FoodComponent {
    FoodFrame providesFoodFrame();
}