package com.mbridge.msdk.foundation.db;

import android.database.sqlite.SQLiteDatabase;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.tools.q0;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public class a<T> {
    protected f mHelper;

    public a(f fVar) {
        this.mHelper = fVar;
    }

    protected synchronized SQLiteDatabase getReadableDatabase() {
        try {
        } catch (Exception unused) {
            if (!MBridgeConstans.DEBUG) {
                return null;
            }
            q0.a("BaseDao", "getReadableDatabase error");
            return null;
        }
        return this.mHelper.c();
    }

    protected synchronized SQLiteDatabase getWritableDatabase() {
        try {
        } catch (Exception unused) {
            if (!MBridgeConstans.DEBUG) {
                return null;
            }
            q0.a("BaseDao", "getWritableDatabase error");
            return null;
        }
        return this.mHelper.d();
    }
}
