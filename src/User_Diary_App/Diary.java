package User_Diary_App;


import Exceptions.InvalidPinException;

import java.util.ArrayList;

public class Diary {
    private String username;
    private String password;
    private boolean isLocked;
    private ArrayList<Entry> entries;


    public Diary(String username, String password) {
        if (username == null || username.isEmpty()) {
            throw new IllegalArgumentException("You need a username to create a diary");
        }

        if (password == null || password.isEmpty()) {
            throw new IllegalArgumentException("You need a password to create a diary");
        }

        this.username = username;
        this.password = password;
        this.entries = new ArrayList<>();
        this.isLocked = true;
    }

    public int getNumberOfEntry() {
        return entries.size();
    }


    public void unlockDiary(String password){
       if (getPassword().equals(password)){
           isLocked = false;
       } else {
         throw new InvalidPinException("Wrong Password kindly enter a new one ");
       }
    }
    public void lockDiary(){
        this.password = null;
        isLocked = true;
    }

    public boolean isLocked(){
        return isLocked;
    }

    public void createEntry(int id, String title , String body){
        Entry newEntry = new Entry(id, title, body);
        entries.add(newEntry);
    }
    public void deleteEntry(int id){
        entries.removeIf(myEntry -> myEntry.getId() == id);

    }
    public Entry findEntryById(int id){
        for(Entry myEntry : entries){
            if(myEntry.getId() == id) {
                return myEntry;
            }
        }
        return null;
    }

    public void updateEntry(int id, String title, String body){
            for(Entry myEntry: entries){
                if(myEntry.getId() == id){
                    myEntry.setTitle(title);
                    myEntry.setBody(body);
                    return;
                }
            }
        throw new NullPointerException("Entry ID Not Found");
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }
}
