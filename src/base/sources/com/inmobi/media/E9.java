package com.inmobi.media;

import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class E9 extends SQLiteOpenHelper {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C3189o5 f24701a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public E9(C3189o5 databaseConfig) {
        super(databaseConfig.f27116a, "com.im_11.2.0.db", (SQLiteDatabase.CursorFactory) null, 1);
        kotlin.jvm.internal.s.h(databaseConfig, "databaseConfig");
        this.f24701a = databaseConfig;
    }

    public static void a(SQLiteDatabase sQLiteDatabase, C2945ek c2945ek) {
        sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS " + c2945ek.f26513a + " " + c2945ek.f26514b);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final String getDatabaseName() {
        this.f24701a.getClass();
        return "com.im_11.2.0.db";
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onConfigure(SQLiteDatabase sQLiteDatabase) {
        super.onConfigure(sQLiteDatabase);
        if (this.f24701a.f27118c != 2 || sQLiteDatabase == null) {
            return;
        }
        sQLiteDatabase.disableWriteAheadLogging();
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        if (sQLiteDatabase != null) {
            ArrayList arrayList = this.f24701a.f27117b;
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                a(sQLiteDatabase, (C2945ek) obj);
            }
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i10, int i11) {
    }
}
