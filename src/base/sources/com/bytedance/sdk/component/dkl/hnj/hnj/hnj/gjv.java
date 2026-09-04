package com.bytedance.sdk.component.dkl.hnj.hnj.hnj;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import com.bytedance.sdk.component.dkl.hnj.dse;
import com.bytedance.sdk.component.dkl.hnj.hnj.hnj.hnj.dkl;
import com.google.api.client.auth.openidconnect.SMoW.mDXVAtwcaFMHJ;
import java.util.ArrayList;
import vl.Rlkc.CIdIVqKnNZ;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes2.dex */
public class gjv extends SQLiteOpenHelper {
    final Context hnj;

    public gjv(Context context) {
        super(context, CIdIVqKnNZ.NnPlnmeqWfGq, (SQLiteDatabase.CursorFactory) null, 1);
        this.hnj = context;
    }

    private void hn(SQLiteDatabase sQLiteDatabase) {
        ArrayList<String> arrayListQor = qor(sQLiteDatabase);
        if (arrayListQor == null || arrayListQor.size() <= 0) {
            return;
        }
        int size = arrayListQor.size();
        int i10 = 0;
        while (i10 < size) {
            String str = arrayListQor.get(i10);
            i10++;
            sQLiteDatabase.execSQL(String.format("DROP TABLE IF EXISTS %s ;", str));
        }
    }

    private void hnj(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL(com.bytedance.sdk.component.dkl.hnj.hnj.hnj.hnj.hnj.hn(dse.dkl().qor().hn()));
        sQLiteDatabase.execSQL(com.bytedance.sdk.component.dkl.hnj.hnj.hnj.hnj.gjv.qor(dse.dkl().qor().hnj()));
        sQLiteDatabase.execSQL(com.bytedance.sdk.component.dkl.hnj.hnj.hnj.hnj.dse.qor(dse.dkl().qor().gjv()));
        sQLiteDatabase.execSQL(dkl.hnj(dse.dkl().qor().sk()));
        sQLiteDatabase.execSQL(com.bytedance.sdk.component.dkl.hnj.dkl.dkl.hn());
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onCreate(SQLiteDatabase sQLiteDatabase) {
        try {
            hnj(sQLiteDatabase);
        } catch (Throwable unused) {
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i10, int i11) {
        try {
            if (i10 <= i11) {
                hnj(sQLiteDatabase);
            } else {
                hn(sQLiteDatabase);
                hnj(sQLiteDatabase);
            }
        } catch (Throwable unused) {
        }
    }

    private ArrayList<String> qor(SQLiteDatabase sQLiteDatabase) {
        ArrayList<String> arrayList = new ArrayList<>();
        try {
            Cursor cursorRawQuery = sQLiteDatabase.rawQuery("select name from sqlite_master where type='table' order by name", null);
            if (cursorRawQuery != null) {
                while (cursorRawQuery.moveToNext()) {
                    String string = cursorRawQuery.getString(0);
                    if (!string.equals(mDXVAtwcaFMHJ.Ols) && !string.equals("sqlite_sequence")) {
                        arrayList.add(string);
                    }
                }
                cursorRawQuery.close();
            }
        } catch (Exception unused) {
        }
        return arrayList;
    }
}
