package User_Diary_App;

public class User {

    public Diary createDiary(String username, String password){
        return new Diary(username, password);
    }

    public void deleteEntry(Diary diary,int entryId){
        diary.deleteEntry(entryId);
    }

    public void unlockDiary(Diary diary, String password){
        diary.unlockDiary(password);
    }

    public void lockDairy(Diary diary, String password){
        diary.lockDiary();
    }
    public void updateEntry(Diary diary, int id, String newTitle, String newBody){
        diary.updateEntry(id, newTitle, newBody);
    }

    public Entry findEntryById(Diary diary, int entryId) {
        return diary.findEntryById(entryId);
    }

    public void createEntry(Diary myDiary, int id, String title, String body) {
        myDiary.createEntry(id, title, body);
    }


}
