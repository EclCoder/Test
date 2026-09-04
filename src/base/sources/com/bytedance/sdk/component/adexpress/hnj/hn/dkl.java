package com.bytedance.sdk.component.adexpress.hnj.hn;

import android.content.ContentValues;
import android.database.Cursor;
import android.text.TextUtils;
import android.util.Log;
import android.util.LruCache;
import com.mbridge.msdk.playercommon.exoplayer2.upstream.DataSchemeDataSource;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class dkl {

    /* JADX INFO: renamed from: hn, reason: collision with root package name */
    private static volatile dkl f12712hn = null;
    public static int hnj = 20;

    /* JADX INFO: renamed from: sk, reason: collision with root package name */
    private volatile ConcurrentHashMap<String, com.bytedance.sdk.component.adexpress.hnj.qor.qor> f12713sk;
    private final Object gjv = new Object();
    private AtomicBoolean dkl = new AtomicBoolean(false);
    private LruCache<String, com.bytedance.sdk.component.adexpress.hnj.qor.hn> dse = new LruCache<String, com.bytedance.sdk.component.adexpress.hnj.qor.hn>(hnj) { // from class: com.bytedance.sdk.component.adexpress.hnj.hn.dkl.1
        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.util.LruCache
        /* JADX INFO: renamed from: hnj, reason: merged with bridge method [inline-methods] */
        public int sizeOf(String str, com.bytedance.sdk.component.adexpress.hnj.qor.hn hnVar) {
            return 1;
        }
    };
    private Set<String> qor = Collections.synchronizedSet(new HashSet());

    private dkl() {
    }

    private void gjv(String str) {
        LruCache<String, com.bytedance.sdk.component.adexpress.hnj.qor.hn> lruCache;
        if (TextUtils.isEmpty(str) || (lruCache = this.dse) == null || lruCache.size() <= 0) {
            return;
        }
        synchronized (this.gjv) {
            this.dse.remove(str);
        }
    }

    public static void hnj(int i10) {
        hnj = i10;
    }

    Set<String> hn(String str) {
        if (!TextUtils.isEmpty(str) && com.bytedance.sdk.component.adexpress.hnj.hnj.hnj.hnj().hn() != null) {
            HashSet hashSet = new HashSet();
            Cursor cursorHnj = com.bytedance.sdk.component.adexpress.hnj.hnj.hnj.hnj().hn().hnj("template_diff_new", null, "rit=?", new String[]{str}, null, null, null);
            if (cursorHnj != null) {
                try {
                    try {
                        if (cursorHnj.moveToFirst()) {
                            do {
                                hashSet.add(cursorHnj.getString(cursorHnj.getColumnIndex("id")));
                            } while (cursorHnj.moveToNext());
                            return hashSet;
                        }
                    } catch (Exception e10) {
                        Log.e("TmplDbHelper", "", e10);
                    }
                } finally {
                    cursorHnj.close();
                }
            }
        }
        return null;
    }

    void qor(String str) {
        com.bytedance.sdk.component.adexpress.hnj.qor.qor qorVar;
        try {
            if (this.f12713sk != null && !this.f12713sk.isEmpty() && (qorVar = this.f12713sk.get(str)) != null) {
                if (!TextUtils.isEmpty(qorVar.hnj()) && com.bytedance.sdk.component.adexpress.hnj.hnj.hnj.hnj().dkl() != null) {
                    com.bytedance.sdk.component.adexpress.hnj.hnj.hnj.hnj().dkl();
                }
                this.f12713sk.remove(str);
            }
        } catch (Throwable unused) {
        }
    }

    public static dkl hnj() {
        if (f12712hn == null) {
            synchronized (dkl.class) {
                try {
                    if (f12712hn == null) {
                        f12712hn = new dkl();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return f12712hn;
    }

    public static String qor() {
        return new StringBuilder("CREATE TABLE IF NOT EXISTS template_diff_new (_id INTEGER PRIMARY KEY AUTOINCREMENT,rit TEXT ,id TEXT UNIQUE,md5 TEXT ,url TEXT , data TEXT , version TEXT , update_time TEXT)").toString();
    }

    com.bytedance.sdk.component.adexpress.hnj.qor.hn hnj(String str) {
        com.bytedance.sdk.component.adexpress.hnj.qor.hn hnVar;
        com.bytedance.sdk.component.adexpress.hnj.qor.hn hnVarHnj;
        if (TextUtils.isEmpty(str) || com.bytedance.sdk.component.adexpress.hnj.hnj.hnj.hnj().hn() == null) {
            return null;
        }
        synchronized (this.gjv) {
            hnVar = this.dse.get(String.valueOf(str));
        }
        if (hnVar != null) {
            return hnVar;
        }
        Cursor cursorHnj = com.bytedance.sdk.component.adexpress.hnj.hnj.hnj.hnj().hn().hnj("template_diff_new", null, "id=?", new String[]{str}, null, null, null);
        if (cursorHnj != null) {
            try {
                if (cursorHnj.moveToFirst()) {
                    do {
                        String string = cursorHnj.getString(cursorHnj.getColumnIndex("rit"));
                        String string2 = cursorHnj.getString(cursorHnj.getColumnIndex("id"));
                        String string3 = cursorHnj.getString(cursorHnj.getColumnIndex("md5"));
                        String string4 = cursorHnj.getString(cursorHnj.getColumnIndex("url"));
                        String string5 = cursorHnj.getString(cursorHnj.getColumnIndex(DataSchemeDataSource.SCHEME_DATA));
                        String string6 = cursorHnj.getString(cursorHnj.getColumnIndex("version"));
                        hnVarHnj = new com.bytedance.sdk.component.adexpress.hnj.qor.hn().hnj(string).hn(string2).qor(string3).gjv(string4).sk(string5).dkl(string6).hnj(Long.valueOf(cursorHnj.getLong(cursorHnj.getColumnIndex("update_time"))));
                        synchronized (this.gjv) {
                            this.dse.put(string2, hnVarHnj);
                        }
                        this.qor.add(string2);
                    } while (cursorHnj.moveToNext());
                    cursorHnj.close();
                    return hnVarHnj;
                }
            } catch (Throwable unused) {
            }
            cursorHnj.close();
        }
        return null;
    }

    List<com.bytedance.sdk.component.adexpress.hnj.qor.hn> hn() {
        if (com.bytedance.sdk.component.adexpress.hnj.hnj.hnj.hnj().hn() == null) {
            return null;
        }
        boolean z10 = this.dkl.get();
        this.dkl.set(true);
        ArrayList arrayList = new ArrayList();
        Cursor cursorHnj = com.bytedance.sdk.component.adexpress.hnj.hnj.hnj.hnj().hn().hnj("template_diff_new", null, null, null, null, null, null);
        if (cursorHnj != null) {
            while (cursorHnj.moveToNext()) {
                try {
                    String string = cursorHnj.getString(cursorHnj.getColumnIndex("rit"));
                    String string2 = cursorHnj.getString(cursorHnj.getColumnIndex("id"));
                    String string3 = cursorHnj.getString(cursorHnj.getColumnIndex("md5"));
                    String string4 = cursorHnj.getString(cursorHnj.getColumnIndex("url"));
                    String string5 = cursorHnj.getString(cursorHnj.getColumnIndex(DataSchemeDataSource.SCHEME_DATA));
                    String string6 = cursorHnj.getString(cursorHnj.getColumnIndex("version"));
                    arrayList.add(new com.bytedance.sdk.component.adexpress.hnj.qor.hn().hnj(string).hn(string2).qor(string3).gjv(string4).sk(string5).dkl(string6).hnj(Long.valueOf(cursorHnj.getLong(cursorHnj.getColumnIndex("update_time")))));
                    synchronized (this.gjv) {
                        this.dse.put(string2, (com.bytedance.sdk.component.adexpress.hnj.qor.hn) arrayList.get(arrayList.size() - 1));
                    }
                    this.qor.add(string2);
                    if (!z10 && com.bytedance.sdk.component.adexpress.hnj.hnj.hnj.hnj().dkl() != null) {
                        if (this.f12713sk == null) {
                            this.f12713sk = new ConcurrentHashMap<>();
                        }
                        if (string2 != null && !this.f12713sk.contains(string2)) {
                            this.f12713sk.put(string2, new com.bytedance.sdk.component.adexpress.hnj.qor.qor(string, string2, string3));
                        }
                    }
                } catch (Throwable unused) {
                    cursorHnj.close();
                }
            }
            cursorHnj.close();
            return arrayList;
        }
        return arrayList;
    }

    void hnj(com.bytedance.sdk.component.adexpress.hnj.qor.hn hnVar, boolean z10) {
        if (hnVar == null || com.bytedance.sdk.component.adexpress.hnj.hnj.hnj.hnj().hn() == null || TextUtils.isEmpty(hnVar.hn())) {
            return;
        }
        Cursor cursorHnj = com.bytedance.sdk.component.adexpress.hnj.hnj.hnj.hnj().hn().hnj("template_diff_new", null, "id=?", new String[]{hnVar.hn()}, null, null, null);
        boolean z11 = cursorHnj != null && cursorHnj.getCount() > 0;
        String string = null;
        if (cursorHnj != null) {
            try {
                string = cursorHnj.moveToFirst() ? cursorHnj.getString(cursorHnj.getColumnIndex("rit")) : null;
                cursorHnj.close();
            } catch (Throwable unused) {
            }
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("rit", hnVar.hnj());
        contentValues.put("id", hnVar.hn());
        contentValues.put("md5", hnVar.qor());
        contentValues.put("url", hnVar.gjv());
        contentValues.put(DataSchemeDataSource.SCHEME_DATA, hnVar.sk());
        contentValues.put("version", hnVar.dkl());
        contentValues.put("update_time", hnVar.dse());
        if (z11) {
            com.bytedance.sdk.component.adexpress.hnj.hnj.hnj.hnj().hn().hnj("template_diff_new", contentValues, "id=?", new String[]{hnVar.hn()});
        } else {
            com.bytedance.sdk.component.adexpress.hnj.hnj.hnj.hnj().hn().hnj("template_diff_new", contentValues);
        }
        synchronized (this.gjv) {
            this.dse.put(hnVar.hn(), hnVar);
        }
        this.qor.add(hnVar.hn());
        if (z10) {
            return;
        }
        try {
            if (com.bytedance.sdk.component.adexpress.hnj.hnj.hnj.hnj().dkl() == null) {
                return;
            }
            if (this.f12713sk == null) {
                this.f12713sk = new ConcurrentHashMap<>();
            }
            com.bytedance.sdk.component.adexpress.hnj.qor.qor qorVar = new com.bytedance.sdk.component.adexpress.hnj.qor.qor(hnVar.hnj(), hnVar.hn(), hnVar.qor());
            this.f12713sk.put(hnVar.hn(), qorVar);
            if (string != null) {
                com.bytedance.sdk.component.adexpress.hnj.hnj.hnj.hnj().dkl();
                qorVar.hn();
            }
            com.bytedance.sdk.component.adexpress.hnj.hnj.hnj.hnj().dkl();
            hnVar.hnj();
        } catch (Throwable unused2) {
        }
    }

    void hnj(Set<String> set) {
        if (set == null || set.isEmpty() || com.bytedance.sdk.component.adexpress.hnj.hnj.hnj.hnj().hn() == null) {
            return;
        }
        String[] strArr = (String[]) set.toArray(new String[set.size()]);
        if (strArr.length > 0) {
            for (int i10 = 0; i10 < strArr.length; i10++) {
                gjv(strArr[i10]);
                com.bytedance.sdk.component.adexpress.hnj.hnj.hnj.hnj().hn().hnj("template_diff_new", "id=?", new String[]{strArr[i10]});
                qor(strArr[i10]);
            }
        }
    }
}
