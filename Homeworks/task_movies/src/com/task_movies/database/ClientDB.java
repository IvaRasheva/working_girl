package com.task_movies.database;

import com.task_movies.model.VideoStoreClient;

import java.util.ArrayList;
import java.util.List;

public class ClientDB {
    private List<VideoStoreClient> db = new ArrayList<>();

    public boolean addClient(VideoStoreClient client){
        int idx = findByNameIdx(client.getClientId());
//        db.add(client);
        if (idx == -1){
            db.add(client);
            return true;
        } else
            return false;
    }

    public boolean removeClient(String id){
        int idx = findByNameIdx(id);
        if (idx > - 1){
            db.remove(idx);
            return true;
        } else
            return false;
    }

    public VideoStoreClient[] whoHasMovie(String title){
        List<VideoStoreClient> result = new ArrayList<VideoStoreClient>();

        for (VideoStoreClient vsc : db){
            if (vsc.hasMovie(title)){
                result.add(vsc);
            }
        }
        return result.toArray(new VideoStoreClient[0]);
    }

    public List<VideoStoreClient> getDb() {
        return db;
    }

    public int findByNameIdx(String id){
        for (int i = 0; i < db.size(); i++) {
            if (db.get(i).getClientId().equals(id)){
                return i;
            }
        }
        return -1;
    }

}
