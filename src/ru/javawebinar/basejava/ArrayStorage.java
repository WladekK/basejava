package ru.javawebinar.basejava;

public class ArrayStorage {

    private final int STORAGE_SIZE = 10_000;

    private Resume[] storage = new Resume[STORAGE_SIZE];

    public Resume get(Resume resume){
        for (Resume r: storage){
            if (r.equals(resume)){
                return r;
            }
        }
        return null;
    }

    public boolean save(Resume resume){
        for (int i = 0; i < storage.length-1; i++){
            if (storage[i] == null){
                storage[i] = resume;
                return true;
            }
        }
        return false;
    }

    public boolean delete(Resume resume){
        for (int i = 0; i < storage.length-1; i++){
            if (storage[i].equals(resume)){
                storage[i] = null;
                return true;
            }
        }
        return false;
    }

    public int size(){
        return storage.length;
    }

    public Resume[] getStorage() {
        return storage;
    }

    public void setStorage(Resume[] storage) {
        this.storage = storage;
    }
}
