package User_Diary_App;

import Exceptions.InvalidPinException;

import java.util.ArrayList;
import java.util.List;

public class Diary {
    private final String username;
    private final String password;
    private boolean locked ;
    private final List<Entry> entries;

    public Diary(String username, String password) {
        if (username == null || username.isEmpty()) {
            throw new IllegalArgumentException("Username cannot be null or empty.");
        }
        if (password == null || password.isEmpty()) {
            throw new IllegalArgumentException("Password cannot be null or empty.");
        }
        this.username = username;
        this.password = password;
        this.entries = new ArrayList<>();
        this.locked = true;

    }


    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public boolean isLocked() {
        return locked;
    }

    public int getNumberOfEntries() {
        return entries.size();
    }

    public void lockDiary(String password) {
        if (!this.password.equals(password)) {
            throw new IllegalArgumentException("Incorrect password.");
        }
        this.locked = true;
    }

    public void unlockDiary(String password) {
        if (!this.password.equals(password)) {
            throw new InvalidPinException("Incorrect password.");
        }
        this.locked = false;
    }

    public void createEntry(int id, String title, String body) {
        if (locked) {
            throw new IllegalStateException("Diary is locked. Cannot add entry.");
        }
        Entry newEntry = new Entry(id, title, body);
        entries.add(newEntry);
    }

    public Entry findEntryById(int id) {
        if (locked) {
            throw new IllegalStateException("Diary is locked. Cannot search for entry.");
        }
        for (Entry entry : entries) {
            if (entry.getId() == id) {
                return entry;
            }
        }
        throw new IllegalArgumentException("Entry with id " + id + " not found.");
    }

    public void deleteEntry(int id) {
        if (locked) {
            throw new IllegalStateException("Diary is locked. Cannot delete entry.");
        }
        boolean removed = entries.removeIf(entry -> entry.getId() == id);
        if (!removed) {
            throw new IllegalArgumentException("Entry with id " + id + " not found.");
        }
    }

    public void updateEntry(int id, String title, String body) {
        if (locked) {
            throw new IllegalStateException("Diary is locked. Cannot update entry.");
        }
        Entry entryToUpdate = findEntryById(id);
        entryToUpdate.setTitle(title);
        entryToUpdate.setBody(body);
    }
}
