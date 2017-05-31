package kz.test.step1;

/**
 * Created by yevgeniya.zuyeva on 25.05.2017.
 */
public class BraveKnight implements Knight {
    private Quest quest;

    public BraveKnight(Quest quest) {
        this.quest = quest;
    }

    @Override
    public void embarkOnQuest() throws QuestException {
        quest.embark();
    }
}
