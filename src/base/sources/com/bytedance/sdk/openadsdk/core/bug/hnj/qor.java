package com.bytedance.sdk.openadsdk.core.bug.hnj;

import android.content.ContentValues;
import android.text.TextUtils;
import android.util.LruCache;
import com.bytedance.sdk.component.utils.apu;
import com.bytedance.sdk.openadsdk.core.oj;
import com.mbridge.msdk.playercommon.exoplayer2.upstream.DataSchemeDataSource;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class qor {

    /* JADX INFO: renamed from: hn, reason: collision with root package name */
    private static volatile qor f13688hn = null;
    public static int hnj = 20;
    private final Object qor = new Object();
    private final LruCache<String, hnj> gjv = new LruCache<String, hnj>(hnj) { // from class: com.bytedance.sdk.openadsdk.core.bug.hnj.qor.1
        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.util.LruCache
        /* JADX INFO: renamed from: hnj, reason: merged with bridge method [inline-methods] */
        public int sizeOf(String str, hnj hnjVar) {
            return 1;
        }
    };

    private qor() {
    }

    public static String gjv() {
        return "ALTER TABLE ugen_template ADD COLUMN rit TEXT ";
    }

    public static qor hnj() {
        if (f13688hn == null) {
            synchronized (qor.class) {
                try {
                    if (f13688hn == null) {
                        f13688hn = new qor();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return f13688hn;
    }

    public static String qor() {
        return new StringBuilder("CREATE TABLE IF NOT EXISTS ugen_template (_id INTEGER PRIMARY KEY AUTOINCREMENT,id TEXT UNIQUE,md5 TEXT ,url TEXT , data TEXT , rit TEXT , update_time TEXT)").toString();
    }

    List<hnj> hn() {
        ArrayList arrayList = new ArrayList();
        com.bytedance.sdk.openadsdk.xn.hnj.hnj hnjVar = new com.bytedance.sdk.openadsdk.xn.hnj.hnj(com.bytedance.sdk.openadsdk.xn.hn.hnj.hnj(oj.hnj(), "ugen_template", null, null, null, null, null, null));
        try {
            if (hnjVar.moveToFirst()) {
                do {
                    int columnIndex = hnjVar.getColumnIndex("id");
                    int columnIndex2 = hnjVar.getColumnIndex("md5");
                    int columnIndex3 = hnjVar.getColumnIndex("url");
                    int columnIndex4 = hnjVar.getColumnIndex(DataSchemeDataSource.SCHEME_DATA);
                    int columnIndex5 = hnjVar.getColumnIndex("update_time");
                    if (columnIndex != -1 && columnIndex2 != -1 && columnIndex3 != -1 && columnIndex5 != -1 && columnIndex4 != -1) {
                        int columnIndex6 = hnjVar.getColumnIndex("rit");
                        String string = columnIndex6 != -1 ? hnjVar.getString(columnIndex6) : null;
                        String string2 = hnjVar.getString(columnIndex);
                        String string3 = hnjVar.getString(columnIndex2);
                        String string4 = hnjVar.getString(columnIndex3);
                        hnj hnjVarHnj = new hnj().hnj(string2).hn(string3).qor(string4).gjv(hnjVar.getString(columnIndex4)).sk(string).hnj(Long.valueOf(hnjVar.getLong(columnIndex5)));
                        arrayList.add(hnjVarHnj);
                        synchronized (this.qor) {
                            this.gjv.put(string2, hnjVarHnj);
                        }
                    }
                } while (hnjVar.moveToNext());
            }
            hnjVar.close();
            return arrayList;
        } catch (Throwable th2) {
            try {
                apu.hnj("UGTmplDbHelper", "getUgenTemplate error", th2);
                return arrayList;
            } finally {
                hnjVar.close();
            }
        }
    }

    hnj hnj(String str, String str2) {
        hnj hnjVar;
        hnj hnjVarHnj;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        synchronized (this.qor) {
            hnjVar = this.gjv.get(str);
        }
        if (hnjVar != null) {
            if (TextUtils.equals(str2, hnjVar.hn())) {
                return hnjVar;
            }
            hn(str2);
            return null;
        }
        com.bytedance.sdk.openadsdk.xn.hnj.hnj hnjVar2 = new com.bytedance.sdk.openadsdk.xn.hnj.hnj(com.bytedance.sdk.openadsdk.xn.hn.hnj.hnj(oj.hnj(), "ugen_template", null, "id=? AND md5=?", new String[]{str, str2}, null, null, null));
        try {
            if (hnjVar2.moveToFirst()) {
                do {
                    int columnIndex = hnjVar2.getColumnIndex("id");
                    int columnIndex2 = hnjVar2.getColumnIndex("md5");
                    int columnIndex3 = hnjVar2.getColumnIndex("url");
                    int columnIndex4 = hnjVar2.getColumnIndex(DataSchemeDataSource.SCHEME_DATA);
                    int columnIndex5 = hnjVar2.getColumnIndex("update_time");
                    if (columnIndex != -1 && columnIndex2 != -1 && columnIndex3 != -1 && columnIndex5 != -1 && columnIndex4 != -1) {
                        int columnIndex6 = hnjVar2.getColumnIndex("rit");
                        String string = hnjVar2.getString(columnIndex);
                        String string2 = hnjVar2.getString(columnIndex2);
                        String string3 = hnjVar2.getString(columnIndex3);
                        String string4 = hnjVar2.getString(columnIndex4);
                        if (TextUtils.isEmpty(string4)) {
                            hnjVar2.close();
                            return null;
                        }
                        hnjVarHnj = new hnj().hnj(string).hn(string2).gjv(string4).qor(string3).sk(columnIndex6 != -1 ? hnjVar2.getString(columnIndex6) : null).hnj(Long.valueOf(hnjVar2.getLong(columnIndex5)));
                        synchronized (this.qor) {
                            this.gjv.put(string, hnjVarHnj);
                        }
                    }
                    hnjVar2.close();
                    return null;
                } while (hnjVar2.moveToNext());
                hnjVar2.close();
                return hnjVarHnj;
            }
        } catch (Throwable th2) {
            try {
                apu.hnj("UGTmplDbHelper", "getGgenTemplate error", th2);
            } finally {
                hnjVar2.close();
            }
        }
        return null;
    }

    private void hn(String str) {
        if (!TextUtils.isEmpty(str) && this.gjv.size() > 0) {
            synchronized (this.qor) {
                this.gjv.remove(str);
            }
        }
    }

    void hnj(hnj hnjVar) {
        if (hnjVar == null || TextUtils.isEmpty(hnjVar.hnj())) {
            return;
        }
        com.bytedance.sdk.openadsdk.xn.hnj.hnj hnjVar2 = new com.bytedance.sdk.openadsdk.xn.hnj.hnj(com.bytedance.sdk.openadsdk.xn.hn.hnj.hnj(oj.hnj(), "ugen_template", null, "id=?", new String[]{hnjVar.hnj()}, null, null, null));
        boolean z10 = hnjVar2.getCount() > 0;
        try {
            hnjVar2.close();
            ContentValues contentValues = new ContentValues();
            contentValues.put("id", hnjVar.hnj());
            contentValues.put("md5", hnjVar.hn());
            contentValues.put("url", hnjVar.qor());
            contentValues.put(DataSchemeDataSource.SCHEME_DATA, hnjVar.sk());
            contentValues.put("rit", hnjVar.dkl());
            contentValues.put("update_time", hnjVar.gjv());
            if (z10) {
                com.bytedance.sdk.openadsdk.xn.hn.hnj.hnj(oj.hnj(), "ugen_template", contentValues, "id=?", new String[]{hnjVar.hnj()});
            } else {
                com.bytedance.sdk.openadsdk.xn.hn.hnj.hnj(oj.hnj(), "ugen_template", contentValues);
            }
            synchronized (this.qor) {
                try {
                    this.gjv.put(hnjVar.hnj(), hnjVar);
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        } catch (Throwable unused) {
        }
    }

    Set<hnj> hnj(String str) {
        hnj hnjVar;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        HashSet hashSet = new HashSet();
        com.bytedance.sdk.openadsdk.xn.hnj.hnj hnjVar2 = new com.bytedance.sdk.openadsdk.xn.hnj.hnj(com.bytedance.sdk.openadsdk.xn.hn.hnj.hnj(oj.hnj(), "ugen_template", null, "rit=?", new String[]{str}, null, null, null));
        try {
            if (hnjVar2.moveToFirst()) {
                do {
                    int columnIndex = hnjVar2.getColumnIndex("id");
                    if (columnIndex != -1) {
                        String string = hnjVar2.getString(columnIndex);
                        if (!TextUtils.isEmpty(string)) {
                            synchronized (this.qor) {
                                hnjVar = this.gjv.get(string);
                            }
                            if (hnjVar != null) {
                                hashSet.add(hnjVar);
                            } else {
                                hnj hnjVar3 = new hnj();
                                int columnIndex2 = hnjVar2.getColumnIndex(DataSchemeDataSource.SCHEME_DATA);
                                if (columnIndex2 != -1) {
                                    String string2 = hnjVar2.getString(columnIndex2);
                                    if (!TextUtils.isEmpty(string2)) {
                                        hnjVar3.gjv(string2);
                                        hnjVar3.hnj(string);
                                        hnjVar3.sk(str);
                                        int columnIndex3 = hnjVar2.getColumnIndex("md5");
                                        int columnIndex4 = hnjVar2.getColumnIndex("url");
                                        int columnIndex5 = hnjVar2.getColumnIndex("update_time");
                                        if (columnIndex3 != -1) {
                                            hnjVar3.hn(hnjVar2.getString(columnIndex3));
                                        }
                                        if (columnIndex4 != -1) {
                                            hnjVar3.qor(hnjVar2.getString(columnIndex4));
                                        }
                                        if (columnIndex5 != -1) {
                                            hnjVar3.hnj(Long.valueOf(hnjVar2.getLong(columnIndex5)));
                                        }
                                        hashSet.add(hnjVar3);
                                        synchronized (this.qor) {
                                            this.gjv.put(string, hnjVar3);
                                        }
                                    }
                                }
                            }
                        }
                    }
                } while (hnjVar2.moveToNext());
            }
            hnjVar2.close();
            return hashSet;
        } catch (Throwable th2) {
            try {
                apu.hnj("UGTmplDbHelper", "getUgenTemplateFormRit error", th2);
                return hashSet;
            } finally {
                hnjVar2.close();
            }
        }
    }

    void hnj(Set<String> set) {
        if (set == null || set.isEmpty()) {
            return;
        }
        String[] strArr = (String[]) set.toArray(new String[set.size()]);
        if (strArr.length > 0) {
            for (String str : strArr) {
                hn(str);
                com.bytedance.sdk.openadsdk.xn.hn.hnj.hnj(oj.hnj(), "ugen_template", "id=?", new String[]{str});
            }
        }
    }
}
