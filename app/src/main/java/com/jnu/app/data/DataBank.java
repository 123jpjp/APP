package com.jnu.app.data;

import android.content.Context;
import android.util.Log;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class DataBank {
    final String DATA_FILENAME_TUTORS = "tutors.data";
    final String DATA_FILENAME_MAJORS = "majors.data";

    public ArrayList<Tutor> LoadTutorItems(Context context) {
        ArrayList<Tutor> data = new ArrayList<>();
        try {
            FileInputStream fileIn = context.openFileInput(DATA_FILENAME_TUTORS);
            ObjectInputStream objectIn = new ObjectInputStream(fileIn);
            data = (ArrayList<Tutor>) objectIn.readObject();
            objectIn.close();
            fileIn.close();
            Log.d("Serialization", "Data loaded successfully. item count"+data.size());
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return data;
    }

    public void SaveTutorItems(Context context, ArrayList<Tutor> books) {
        try{
            FileOutputStream fileOut = context.openFileOutput(DATA_FILENAME_TUTORS, Context.MODE_PRIVATE);
            ObjectOutputStream objectOut = new ObjectOutputStream(fileOut);
            objectOut.writeObject(books);
            objectOut.close();
            fileOut.close();
            Log.d("Serialization", "Data is serialized and saved.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public ArrayList<Major> LoadMajorItems(Context context) {
        ArrayList<Major> data = new ArrayList<>();
        try {
            FileInputStream fileIn = context.openFileInput(DATA_FILENAME_MAJORS);
            ObjectInputStream objectIn = new ObjectInputStream(fileIn);
            data = (ArrayList<Major>) objectIn.readObject();
            objectIn.close();
            fileIn.close();
            Log.d("Serialization", "Data loaded successfully. item count"+data.size());
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return data;
    }

    public void SaveMajorItems(Context context, ArrayList<Major> books) {
        try{
            FileOutputStream fileOut = context.openFileOutput(DATA_FILENAME_MAJORS, Context.MODE_PRIVATE);
            ObjectOutputStream objectOut = new ObjectOutputStream(fileOut);
            objectOut.writeObject(books);
            objectOut.close();
            fileOut.close();
            Log.d("Serialization", "Data is serialized and saved.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

