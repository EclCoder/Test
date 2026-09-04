package com.mbridge.msdk.foundation.download.database;

import android.database.Cursor;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public interface IDatabaseHelper {
    public static final String TAG = "DatabaseHelper";

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public interface IDatabaseListener {
        void onDatabase(DownloadModel downloadModel);
    }

    void clear();

    void find(String str, String str2, IDatabaseListener iDatabaseListener);

    List<DownloadModel> findAll();

    void findByDownloadUrl(String str, IDatabaseListener iDatabaseListener);

    List<DownloadModel> getUnwantedModels(long j10);

    void insert(DownloadModel downloadModel);

    Cursor rawQuery(String str, String[] strArr);

    void remove(String str);

    void remove(String str, String str2);

    void update(DownloadModel downloadModel, String str);

    void updateProgress(String str, String str2, DownloadModel downloadModel);

    void updateUnzipResource(String str, String str2, long j10);
}
