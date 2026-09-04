package com.bykv.vk.openvk.preload.geckox.utils;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import com.bykv.vk.openvk.preload.geckox.logger.GeckoLogger;
import java.io.Closeable;
import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class CloseableUtils {
    public static boolean close(Closeable closeable) {
        if (closeable == null) {
            return true;
        }
        try {
            closeable.close();
            return true;
        } catch (IOException e10) {
            GeckoLogger.e("gecko-debug-tag", "close:", e10);
            return false;
        }
    }

    public static boolean close(Cursor cursor) {
        if (cursor == null) {
            return true;
        }
        try {
            cursor.close();
            return true;
        } catch (Exception e10) {
            GeckoLogger.e("gecko-debug-tag", "close:", e10);
            return false;
        }
    }

    public static boolean close(SQLiteDatabase sQLiteDatabase) {
        if (sQLiteDatabase == null) {
            return true;
        }
        try {
            sQLiteDatabase.close();
            return true;
        } catch (Exception e10) {
            GeckoLogger.e("gecko-debug-tag", "close:", e10);
            return false;
        }
    }
}
