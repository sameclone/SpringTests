package kz.test.step1;

import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

/**
 * Created by yevgeniya.zuyeva on 25.05.2017.
 */
public class BraveKnightTest {

    @Test
    public void knightShouldEmbarkOnQuest() throws QuestException{
        Quest mockQuest = mock(Quest.class);
        BraveKnight knight = new BraveKnight(mockQuest);
        knight.embarkOnQuest();
        verify(mockQuest, times(1)).embark();

    }
}
