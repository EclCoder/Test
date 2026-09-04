package com.bytedance.sdk.openadsdk.oj;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Handler;
import com.bytedance.sdk.openadsdk.BusMonitorDependWrapper;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class hnj {
    private static Context gjv;
    private Boolean aq;
    private hn dkl;
    private com.bytedance.sdk.openadsdk.oj.qor.hnj dse;
    public static final long hnj = com.bytedance.sdk.openadsdk.oj.gjv.hnj.hnj();

    /* JADX INFO: renamed from: hn, reason: collision with root package name */
    private static final String[] f14576hn = {"_id", "sdk_version", "scene", "start_count", "success_count", "fail_count", "rit", "tag", "label", CampaignEx.JSON_KEY_TIMESTAMP, "mediation", "is_init", "extra"};
    private static final long qor = System.currentTimeMillis();

    /* JADX INFO: renamed from: sk, reason: collision with root package name */
    private final ArrayList<gjv> f14577sk = new ArrayList<>();
    private final Runnable ojm = new Runnable() { // from class: com.bytedance.sdk.openadsdk.oj.hnj.1
        @Override // java.lang.Runnable
        public void run() {
            if (!hnj.this.gjv() || hnj.this.f14577sk.isEmpty()) {
                return;
            }
            hnj hnjVar = hnj.this;
            hnjVar.hnj(hnjVar.f14577sk);
            hnj.this.f14577sk.clear();
        }
    };

    /* JADX INFO: renamed from: ta, reason: collision with root package name */
    private int f14578ta = 0;
    private final Runnable dnm = new Runnable() { // from class: com.bytedance.sdk.openadsdk.oj.hnj.4
        @Override // java.lang.Runnable
        public void run() {
            int i10;
            try {
                SQLiteDatabase sQLiteDatabaseHn = com.bytedance.sdk.openadsdk.oj.hnj.hnj.hn();
                if (sQLiteDatabaseHn != null) {
                    String[] strArr = {String.valueOf(hnj.this.dkl.getOnceLogInterval() < 86400000 ? hnj.qor : hnj.hnj)};
                    int iMax = Math.max(10, hnj.this.dkl.getOnceLogCount());
                    int i11 = iMax > 100 ? 10 : iMax;
                    Cursor cursorQuery = sQLiteDatabaseHn.query("monitor_table", hnj.f14576hn, "timestamp < ?", strArr, null, null, null, String.valueOf(i11));
                    if (cursorQuery != null) {
                        ArrayList arrayList = new ArrayList();
                        ArrayList arrayList2 = new ArrayList();
                        int columnIndex = cursorQuery.getColumnIndex("_id");
                        int columnIndex2 = cursorQuery.getColumnIndex("sdk_version");
                        int columnIndex3 = cursorQuery.getColumnIndex("scene");
                        int columnIndex4 = cursorQuery.getColumnIndex("start_count");
                        int columnIndex5 = cursorQuery.getColumnIndex("success_count");
                        int columnIndex6 = cursorQuery.getColumnIndex("fail_count");
                        int columnIndex7 = cursorQuery.getColumnIndex("rit");
                        int columnIndex8 = cursorQuery.getColumnIndex("tag");
                        int columnIndex9 = cursorQuery.getColumnIndex("label");
                        int columnIndex10 = cursorQuery.getColumnIndex(CampaignEx.JSON_KEY_TIMESTAMP);
                        int columnIndex11 = cursorQuery.getColumnIndex("mediation");
                        int i12 = i11;
                        int columnIndex12 = cursorQuery.getColumnIndex("is_init");
                        try {
                            int columnIndex13 = cursorQuery.getColumnIndex("extra");
                            while (cursorQuery.moveToNext()) {
                                ArrayList arrayList3 = arrayList;
                                com.bytedance.sdk.openadsdk.oj.hn.hnj hnjVar = new com.bytedance.sdk.openadsdk.oj.hn.hnj();
                                if (columnIndex >= 0) {
                                    long j10 = cursorQuery.getLong(columnIndex);
                                    hnjVar.hnj(j10);
                                    arrayList2.add(String.valueOf(j10));
                                }
                                if (columnIndex2 >= 0) {
                                    hnjVar.hnj(cursorQuery.getString(columnIndex2));
                                }
                                if (columnIndex3 >= 0) {
                                    hnjVar.hn(cursorQuery.getString(columnIndex3));
                                }
                                if (columnIndex4 >= 0) {
                                    hnjVar.hnj(cursorQuery.getInt(columnIndex4));
                                }
                                if (columnIndex5 >= 0) {
                                    hnjVar.hn(cursorQuery.getInt(columnIndex5));
                                }
                                if (columnIndex6 >= 0) {
                                    hnjVar.qor(cursorQuery.getInt(columnIndex6));
                                }
                                if (columnIndex7 >= 0) {
                                    hnjVar.qor(cursorQuery.getString(columnIndex7));
                                }
                                if (columnIndex8 >= 0) {
                                    hnjVar.gjv(cursorQuery.getString(columnIndex8));
                                }
                                if (columnIndex9 >= 0) {
                                    hnjVar.sk(cursorQuery.getString(columnIndex9));
                                }
                                if (columnIndex10 >= 0) {
                                    hnjVar.hn(cursorQuery.getLong(columnIndex10));
                                }
                                if (columnIndex11 >= 0) {
                                    columnIndex10 = columnIndex10;
                                    i10 = columnIndex11;
                                    hnjVar.dkl(cursorQuery.getString(i10));
                                } else {
                                    columnIndex10 = columnIndex10;
                                    i10 = columnIndex11;
                                }
                                if (columnIndex12 >= 0) {
                                    columnIndex10 = columnIndex10;
                                    columnIndex10 = columnIndex10;
                                    hnjVar.gjv(cursorQuery.getInt(columnIndex12));
                                }
                                if (columnIndex13 >= 0) {
                                    hnjVar.dse(cursorQuery.getString(columnIndex13));
                                }
                                arrayList3.add(hnjVar);
                                columnIndex11 = i10;
                                columnIndex = columnIndex;
                                arrayList = arrayList3;
                                columnIndex2 = columnIndex2;
                            }
                            ArrayList arrayList4 = arrayList;
                            cursorQuery.close();
                            if (!arrayList4.isEmpty()) {
                                hnj.this.dkl.onMonitorUpload(arrayList4);
                                SQLiteDatabase sQLiteDatabaseHnj = com.bytedance.sdk.openadsdk.oj.hnj.hnj.hnj();
                                if (sQLiteDatabaseHnj != null && sQLiteDatabaseHnj.isOpen()) {
                                    StringBuilder sb2 = new StringBuilder();
                                    sb2.append("_id IN (");
                                    for (int i13 = 0; i13 < arrayList2.size(); i13++) {
                                        sb2.append("?");
                                        if (i13 < arrayList2.size() - 1) {
                                            sb2.append(",");
                                        }
                                    }
                                    sb2.append(")");
                                    sQLiteDatabaseHnj.delete("monitor_table", sb2.toString(), (String[]) arrayList2.toArray(new String[0]));
                                    if (hnj.this.dse != null) {
                                        hnj.this.dse.hnj(hnj.qor);
                                    }
                                }
                                if (arrayList4.size() < i12 || hnj.this.f14578ta > 1000) {
                                    return;
                                }
                                hnj.this.hnj(false);
                            }
                        } catch (Throwable unused) {
                        }
                    }
                }
            } catch (Throwable unused2) {
            }
        }
    };

    private hnj(hn hnVar) {
        try {
            this.dkl = new BusMonitorDependWrapper(hnVar);
            this.dse = new com.bytedance.sdk.openadsdk.oj.qor.hnj(hnVar.getContext());
            gjv = hnVar.getContext();
        } catch (Throwable unused) {
        }
    }

    static /* synthetic */ int gjv(hnj hnjVar) {
        int i10 = hnjVar.f14578ta;
        hnjVar.f14578ta = i10 + 1;
        return i10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean gjv() {
        if (this.aq == null) {
            hn hnVar = this.dkl;
            this.aq = Boolean.valueOf((hnVar == null || hnVar.getContext() == null || !this.dkl.isMonitorOpen() || this.dkl.getHandler() == null) ? false : true);
        }
        return this.aq.booleanValue();
    }

    public static hnj hnj(hn hnVar) {
        return new hnj(hnVar);
    }

    public static Context hnj() {
        Context context = gjv;
        return context != null ? context : BusMonitorDependWrapper.getReflectContext();
    }

    public void hnj(final gjv gjvVar) {
        if (gjvVar == null || !gjv()) {
            return;
        }
        final Handler handler = this.dkl.getHandler();
        handler.post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.oj.hnj.2
            @Override // java.lang.Runnable
            public void run() {
                hnj.this.f14577sk.add(gjvVar);
                if (hnj.this.f14577sk.size() >= 10) {
                    handler.removeCallbacks(hnj.this.ojm);
                    hnj hnjVar = hnj.this;
                    hnjVar.hnj(hnjVar.f14577sk);
                    hnj.this.f14577sk.clear();
                }
            }
        });
        handler.removeCallbacks(this.ojm);
        handler.postDelayed(this.ojm, 5000L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void hnj(List<gjv> list) {
        com.bytedance.sdk.openadsdk.oj.hn.hnj hnjVarHnj;
        if (list == null || list.isEmpty()) {
            return;
        }
        SQLiteDatabase sQLiteDatabase = null;
        try {
            SQLiteDatabase sQLiteDatabaseHnj = com.bytedance.sdk.openadsdk.oj.hnj.hnj.hnj();
            if (sQLiteDatabaseHnj != null) {
                try {
                    sQLiteDatabaseHnj.beginTransaction();
                    for (int i10 = 0; i10 < list.size(); i10++) {
                        gjv gjvVar = list.get(i10);
                        if (gjvVar != null && (hnjVarHnj = gjvVar.hnj()) != null) {
                            Cursor cursorQuery = sQLiteDatabaseHnj.query("monitor_table", f14576hn, "sdk_version = ? AND scene = ? AND rit = ? AND tag = ? AND label = ? AND mediation = ? AND is_init = ? AND timestamp = ? AND extra = ?", new String[]{hnjVarHnj.hn(), hnjVarHnj.qor(), hnjVarHnj.dse(), hnjVarHnj.aq(), hnjVarHnj.ojm(), hnjVarHnj.dnm(), String.valueOf(hnjVarHnj.bug()), String.valueOf(hnjVarHnj.ta()), hnjVarHnj.orl()}, null, null, null);
                            if (cursorQuery != null) {
                                if (cursorQuery.moveToNext()) {
                                    int columnIndex = cursorQuery.getColumnIndex("_id");
                                    if (columnIndex >= 0) {
                                        hnjVarHnj.hnj(cursorQuery.getLong(columnIndex));
                                    }
                                    int columnIndex2 = cursorQuery.getColumnIndex("start_count");
                                    if (columnIndex2 >= 0) {
                                        hnjVarHnj.hnj(cursorQuery.getInt(columnIndex2) + hnjVarHnj.gjv());
                                    }
                                    int columnIndex3 = cursorQuery.getColumnIndex("success_count");
                                    if (columnIndex3 >= 0) {
                                        hnjVarHnj.hn(cursorQuery.getInt(columnIndex3) + hnjVarHnj.sk());
                                    }
                                    int columnIndex4 = cursorQuery.getColumnIndex("fail_count");
                                    if (columnIndex4 >= 0) {
                                        hnjVarHnj.qor(cursorQuery.getInt(columnIndex4) + hnjVarHnj.dkl());
                                    }
                                }
                                cursorQuery.close();
                            }
                            ContentValues contentValues = new ContentValues();
                            if (hnjVarHnj.hnj() > 0) {
                                contentValues.put("_id", Long.valueOf(hnjVarHnj.hnj()));
                            }
                            contentValues.put("sdk_version", hnjVarHnj.hn());
                            contentValues.put("scene", hnjVarHnj.qor());
                            contentValues.put("start_count", Integer.valueOf(hnjVarHnj.gjv()));
                            contentValues.put("success_count", Integer.valueOf(hnjVarHnj.sk()));
                            contentValues.put("fail_count", Integer.valueOf(hnjVarHnj.dkl()));
                            contentValues.put("rit", hnjVarHnj.dse());
                            contentValues.put("tag", hnjVarHnj.aq());
                            contentValues.put("label", hnjVarHnj.ojm());
                            contentValues.put(CampaignEx.JSON_KEY_TIMESTAMP, Long.valueOf(hnjVarHnj.ta()));
                            contentValues.put("mediation", hnjVarHnj.dnm());
                            contentValues.put("is_init", Integer.valueOf(hnjVarHnj.bug()));
                            contentValues.put("extra", hnjVarHnj.orl());
                            sQLiteDatabaseHnj.insertWithOnConflict("monitor_table", null, contentValues, 5);
                        }
                    }
                    sQLiteDatabaseHnj.setTransactionSuccessful();
                } catch (Throwable unused) {
                    sQLiteDatabase = sQLiteDatabaseHnj;
                    if (sQLiteDatabase != null) {
                        try {
                            sQLiteDatabase.endTransaction();
                            return;
                        } catch (Throwable unused2) {
                            return;
                        }
                    }
                    return;
                }
            }
            if (sQLiteDatabaseHnj != null) {
                try {
                    sQLiteDatabaseHnj.endTransaction();
                } catch (Throwable unused3) {
                }
            }
        } catch (Throwable unused4) {
        }
    }

    public void hnj(final boolean z10) {
        final Handler handler = this.dkl.getHandler();
        hn hnVar = this.dkl;
        if (hnVar == null || handler == null || hnVar.getContext() == null || this.dse == null || !gjv()) {
            return;
        }
        handler.postDelayed(new Runnable() { // from class: com.bytedance.sdk.openadsdk.oj.hnj.3
            @Override // java.lang.Runnable
            public void run() {
                try {
                    hnj.gjv(hnj.this);
                    if (z10) {
                        long jHnj = hnj.this.dse.hnj();
                        if (jHnj == 0) {
                            hnj.this.dse.hnj(System.currentTimeMillis());
                            return;
                        } else if (com.bytedance.sdk.openadsdk.oj.gjv.hnj.hnj(jHnj) && System.currentTimeMillis() - jHnj < hnj.this.dkl.getUploadIntervalTime()) {
                            return;
                        }
                    }
                    handler.post(hnj.this.dnm);
                } catch (Throwable unused) {
                }
            }
        }, Math.max(this.dkl.getOnceLogInterval(), 10000));
    }
}
