package com.bytedance.sdk.component.dkl.hnj.hnj.hnj;

import android.content.ContentValues;
import android.content.Context;
import android.database.AbstractCursor;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.text.TextUtils;
import com.bytedance.sdk.component.dkl.hnj.dse;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
class hn {

    /* JADX INFO: renamed from: hn, reason: collision with root package name */
    private Context f12813hn;
    private C0187hn hnj;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private class hnj extends AbstractCursor {
        private hnj() {
        }

        @Override // android.database.AbstractCursor, android.database.Cursor
        public String[] getColumnNames() {
            return new String[0];
        }

        @Override // android.database.AbstractCursor, android.database.Cursor
        public int getCount() {
            return 0;
        }

        @Override // android.database.AbstractCursor, android.database.Cursor
        public double getDouble(int i10) {
            return 0.0d;
        }

        @Override // android.database.AbstractCursor, android.database.Cursor
        public float getFloat(int i10) {
            return 0.0f;
        }

        @Override // android.database.AbstractCursor, android.database.Cursor
        public int getInt(int i10) {
            return 0;
        }

        @Override // android.database.AbstractCursor, android.database.Cursor
        public long getLong(int i10) {
            return 0L;
        }

        @Override // android.database.AbstractCursor, android.database.Cursor
        public short getShort(int i10) {
            return (short) 0;
        }

        @Override // android.database.AbstractCursor, android.database.Cursor
        public String getString(int i10) {
            return null;
        }

        @Override // android.database.AbstractCursor, android.database.Cursor
        public boolean isNull(int i10) {
            return true;
        }
    }

    hn(Context context) {
        try {
            this.f12813hn = context.getApplicationContext();
            if (this.hnj == null) {
                this.hnj = new C0187hn();
            }
        } catch (Throwable unused) {
        }
    }

    public C0187hn hnj() {
        return this.hnj;
    }

    /* JADX INFO: renamed from: com.bytedance.sdk.component.dkl.hnj.hnj.hnj.hn$hn, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public class C0187hn {

        /* JADX INFO: renamed from: hn, reason: collision with root package name */
        private volatile SQLiteDatabase f12814hn = null;

        public C0187hn() {
        }

        private boolean hn() {
            SQLiteDatabase sQLiteDatabase = this.f12814hn;
            return sQLiteDatabase != null && sQLiteDatabase.inTransaction();
        }

        /* JADX WARN: Bottom block not found for handler: all -> 0x000d */
        /* JADX WARN: Code restructure failed: missing block: B:30:?, code lost:
        
            return;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private void hnj() {
            /*
                r2 = this;
                android.database.sqlite.SQLiteDatabase r0 = r2.f12814hn     // Catch: java.lang.Throwable -> Ld
                if (r0 == 0) goto Lf
                android.database.sqlite.SQLiteDatabase r0 = r2.f12814hn     // Catch: java.lang.Throwable -> Ld
                boolean r0 = r0.isOpen()     // Catch: java.lang.Throwable -> Ld
                if (r0 != 0) goto L45
                goto Lf
            Ld:
                r0 = move-exception
                goto L3f
            Lf:
                monitor-enter(r2)     // Catch: java.lang.Throwable -> Ld
                android.database.sqlite.SQLiteDatabase r0 = r2.f12814hn     // Catch: java.lang.Throwable -> L1d
                if (r0 == 0) goto L1f
                android.database.sqlite.SQLiteDatabase r0 = r2.f12814hn     // Catch: java.lang.Throwable -> L1d
                boolean r0 = r0.isOpen()     // Catch: java.lang.Throwable -> L1d
                if (r0 != 0) goto L3b
                goto L1f
            L1d:
                r0 = move-exception
                goto L3d
            L1f:
                com.bytedance.sdk.component.dkl.hnj.dse r0 = com.bytedance.sdk.component.dkl.hnj.dse.dkl()     // Catch: java.lang.Throwable -> L1d
                com.bytedance.sdk.component.dkl.hnj.hnj.sk r0 = r0.qor()     // Catch: java.lang.Throwable -> L1d
                com.bytedance.sdk.component.dkl.hnj.dse r1 = com.bytedance.sdk.component.dkl.hnj.dse.dkl()     // Catch: java.lang.Throwable -> L1d
                android.content.Context r1 = r1.sk()     // Catch: java.lang.Throwable -> L1d
                android.database.sqlite.SQLiteDatabase r0 = r0.hnj(r1)     // Catch: java.lang.Throwable -> L1d
                r2.f12814hn = r0     // Catch: java.lang.Throwable -> L1d
                android.database.sqlite.SQLiteDatabase r0 = r2.f12814hn     // Catch: java.lang.Throwable -> L1d
                r1 = 0
                r0.setLockingEnabled(r1)     // Catch: java.lang.Throwable -> L1d
            L3b:
                monitor-exit(r2)     // Catch: java.lang.Throwable -> L1d
                return
            L3d:
                monitor-exit(r2)     // Catch: java.lang.Throwable -> Ld
                throw r0     // Catch: java.lang.Throwable -> Ld
            L3f:
                boolean r1 = r2.hn()
                if (r1 != 0) goto L46
            L45:
                return
            L46:
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.component.dkl.hnj.hnj.hnj.hn.C0187hn.hnj():void");
        }

        public void hnj(String str) {
            try {
                hnj();
                this.f12814hn.execSQL(str);
            } catch (Throwable th2) {
                if (hn()) {
                    throw th2;
                }
            }
        }

        public Cursor hnj(String str, String[] strArr, String str2, String[] strArr2, String str3, String str4, String str5) {
            try {
                hnj();
                return this.f12814hn.query(str, strArr, str2, strArr2, str3, str4, str5);
            } catch (Throwable th2) {
                hnj hnjVar = new hnj();
                if (hn()) {
                    throw th2;
                }
                return hnjVar;
            }
        }

        public int hnj(String str, ContentValues contentValues, String str2, String[] strArr) throws Exception {
            try {
                hnj();
                return this.f12814hn.update(str, contentValues, str2, strArr);
            } catch (Exception e10) {
                if (hn()) {
                    throw e10;
                }
                return 0;
            }
        }

        public long hnj(String str, String str2, ContentValues contentValues) throws Exception {
            try {
                hnj();
                return this.f12814hn.insert(str, str2, contentValues);
            } catch (Exception e10) {
                if (hn()) {
                    throw e10;
                }
                return -1L;
            }
        }

        public synchronized void hnj(String str, String str2, List<com.bytedance.sdk.component.dkl.hnj.gjv.hnj> list) {
            JSONObject jSONObjectDkl;
            try {
                try {
                    hnj();
                    this.f12814hn.beginTransaction();
                    ContentValues contentValues = new ContentValues();
                    for (int i10 = 0; i10 < list.size(); i10++) {
                        com.bytedance.sdk.component.dkl.hnj.gjv.hnj hnjVar = list.get(i10);
                        if (hnjVar != null && (jSONObjectDkl = hnjVar.dkl()) != null) {
                            contentValues.put("id", hnjVar.qor());
                            String strHn = dse.dkl().fc().hn(jSONObjectDkl.toString());
                            if (!TextUtils.isEmpty(strHn)) {
                                contentValues.put(AppMeasurementSdk.ConditionalUserProperty.VALUE, strHn);
                                contentValues.put("gen_time", Long.valueOf(System.currentTimeMillis()));
                                contentValues.put("retry", (Integer) 0);
                                contentValues.put("encrypt", (Integer) 1);
                                if (com.bytedance.sdk.component.dkl.hnj.qor.hnj.gjv() && hnjVar.ojm() > 0 && (hnjVar.gjv() == 0 || hnjVar.gjv() == 3)) {
                                    contentValues.put("channel", Integer.valueOf(hnjVar.ojm()));
                                }
                                this.f12814hn.insert(str, str2, contentValues);
                            }
                            contentValues.clear();
                        }
                    }
                    this.f12814hn.setTransactionSuccessful();
                    list.size();
                    if (this.f12814hn != null) {
                        this.f12814hn.endTransaction();
                    }
                } catch (Exception e10) {
                    list.size();
                    if (!hn()) {
                        if (this.f12814hn != null) {
                            this.f12814hn.endTransaction();
                        }
                    } else {
                        throw e10;
                    }
                }
            } catch (Throwable th2) {
                if (this.f12814hn != null) {
                    this.f12814hn.endTransaction();
                }
                throw th2;
            }
        }

        public int hnj(String str, String str2, String[] strArr) throws Exception {
            try {
                hnj();
                return this.f12814hn.delete(str, str2, strArr);
            } catch (Exception e10) {
                if (hn()) {
                    throw e10;
                }
                return 0;
            }
        }
    }
}
