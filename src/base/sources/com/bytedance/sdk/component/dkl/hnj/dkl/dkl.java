package com.bytedance.sdk.component.dkl.hnj.dkl;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.text.TextUtils;
import java.util.LinkedList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class dkl implements sk {
    private Context hnj;

    public dkl(Context context) {
        this.hnj = context;
    }

    @Override // com.bytedance.sdk.component.dkl.hnj.dkl.sk
    public void hn(gjv gjvVar) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("id", gjvVar.hnj());
        contentValues.put("url", gjvVar.hn());
        contentValues.put("replaceholder", Integer.valueOf(gjvVar.qor() ? 1 : 0));
        contentValues.put("retry", Integer.valueOf(gjvVar.gjv()));
        contentValues.put("error_code", gjvVar.dse());
        contentValues.put("error_msg", gjvVar.ojm());
        contentValues.put("url_type", Integer.valueOf(gjvVar.sk()));
        contentValues.put("ad_id", gjvVar.dkl());
        com.bytedance.sdk.component.dkl.hnj.hnj.hnj.qor.hnj(this.hnj, "trackurl", contentValues, "id=?", new String[]{gjvVar.hnj()});
    }

    @Override // com.bytedance.sdk.component.dkl.hnj.dkl.sk
    public List<gjv> hnj() {
        LinkedList linkedList = new LinkedList();
        Cursor cursorHnj = com.bytedance.sdk.component.dkl.hnj.hnj.hnj.qor.hnj(this.hnj, "trackurl", null, null, null, null, null, null);
        if (cursorHnj != null) {
            while (cursorHnj.moveToNext()) {
                try {
                    try {
                        String string = cursorHnj.getString(cursorHnj.getColumnIndex("id"));
                        String string2 = cursorHnj.getString(cursorHnj.getColumnIndex("url"));
                        boolean z10 = cursorHnj.getInt(cursorHnj.getColumnIndex("replaceholder")) > 0;
                        int i10 = cursorHnj.getInt(cursorHnj.getColumnIndex("retry"));
                        int i11 = cursorHnj.getInt(cursorHnj.getColumnIndex("url_type"));
                        String string3 = cursorHnj.getString(cursorHnj.getColumnIndex("ad_id"));
                        String string4 = cursorHnj.getString(cursorHnj.getColumnIndex("error_code"));
                        String string5 = cursorHnj.getString(cursorHnj.getColumnIndex("error_msg"));
                        gjv gjvVar = new gjv(string, string2, z10, i11, string3);
                        gjvVar.hnj(i10);
                        if (!TextUtils.isEmpty(string4)) {
                            gjvVar.hnj(string4);
                        }
                        if (!TextUtils.isEmpty(string5)) {
                            gjvVar.hn(string5);
                        }
                        linkedList.add(gjvVar);
                    } catch (Throwable unused) {
                        return linkedList;
                    }
                } finally {
                    cursorHnj.close();
                }
            }
            cursorHnj.close();
            return linkedList;
        }
        return linkedList;
    }

    @Override // com.bytedance.sdk.component.dkl.hnj.dkl.sk
    public void qor(gjv gjvVar) {
        com.bytedance.sdk.component.dkl.hnj.hnj.hnj.qor.hnj(this.hnj, "trackurl", "id=?", new String[]{gjvVar.hnj()});
    }

    public static String hn() {
        return "CREATE TABLE IF NOT EXISTS trackurl (_id INTEGER PRIMARY KEY AUTOINCREMENT,id TEXT UNIQUE,url TEXT ,replaceholder INTEGER default 0, retry INTEGER default 0)";
    }

    @Override // com.bytedance.sdk.component.dkl.hnj.dkl.sk
    public gjv hnj(String str) {
        Cursor cursorHnj = com.bytedance.sdk.component.dkl.hnj.hnj.hnj.qor.hnj(this.hnj, "trackurl", null, "id=?", new String[]{str}, null, null, null);
        if (cursorHnj != null && cursorHnj.moveToFirst()) {
            try {
                String string = cursorHnj.getString(cursorHnj.getColumnIndex("id"));
                String string2 = cursorHnj.getString(cursorHnj.getColumnIndex("url"));
                boolean z10 = cursorHnj.getInt(cursorHnj.getColumnIndex("replaceholder")) > 0;
                int i10 = cursorHnj.getInt(cursorHnj.getColumnIndex("retry"));
                int i11 = cursorHnj.getInt(cursorHnj.getColumnIndex("url_type"));
                String string3 = cursorHnj.getString(cursorHnj.getColumnIndex("ad_id"));
                String string4 = cursorHnj.getString(cursorHnj.getColumnIndex("error_code"));
                String string5 = cursorHnj.getString(cursorHnj.getColumnIndex("error_msg"));
                gjv gjvVar = new gjv(string, string2, z10, i11, string3);
                gjvVar.hnj(i10);
                if (!TextUtils.isEmpty(string4)) {
                    gjvVar.hnj(string4);
                }
                if (!TextUtils.isEmpty(string5)) {
                    gjvVar.hn(string5);
                }
                cursorHnj.close();
                return gjvVar;
            } catch (Throwable th2) {
                try {
                    th2.getMessage();
                    cursorHnj.close();
                    cursorHnj = null;
                } catch (Throwable th3) {
                    cursorHnj.close();
                    throw th3;
                }
            }
        }
        if (cursorHnj != null) {
            cursorHnj.close();
        }
        return null;
    }

    @Override // com.bytedance.sdk.component.dkl.hnj.dkl.sk
    public void hnj(gjv gjvVar) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("id", gjvVar.hnj());
        contentValues.put("url", gjvVar.hn());
        contentValues.put("replaceholder", Integer.valueOf(gjvVar.qor() ? 1 : 0));
        contentValues.put("retry", Integer.valueOf(gjvVar.gjv()));
        contentValues.put("url_type", Integer.valueOf(gjvVar.sk()));
        contentValues.put("ad_id", gjvVar.dkl());
        contentValues.put("error_code", gjvVar.dse());
        contentValues.put("error_msg", gjvVar.ojm());
        com.bytedance.sdk.component.dkl.hnj.hnj.hnj.qor.hnj(this.hnj, "trackurl", contentValues);
    }
}
