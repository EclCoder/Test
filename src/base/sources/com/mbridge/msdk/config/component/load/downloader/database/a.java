package com.mbridge.msdk.config.component.load.downloader.database;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Handler;
import android.text.TextUtils;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.download.database.IDatabaseHelper;
import com.mbridge.msdk.foundation.tools.q0;
import java.net.URL;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public class a implements com.mbridge.msdk.config.component.load.downloader.database.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final d f28921a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Handler f28922b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f28923c = com.mbridge.msdk.config.component.database.c.TABLE_FILE_DB;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private volatile SQLiteDatabase f28924d;

    /* JADX INFO: renamed from: com.mbridge.msdk.config.component.load.downloader.database.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class RunnableC0377a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.mbridge.msdk.config.component.load.downloader.database.c.a f28925a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f28926b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f28927c;

        RunnableC0377a(com.mbridge.msdk.config.component.load.downloader.database.c.a aVar, String str, String str2) {
            this.f28925a = aVar;
            this.f28926b = str;
            this.f28927c = str2;
        }

        /* JADX WARN: Code duplicated, block: B:37:0x00d2 A[Catch: all -> 0x00d6, TRY_LEAVE, TryCatch #2 {all -> 0x00d6, blocks: (B:35:0x00ce, B:37:0x00d2), top: B:56:0x00ce }] */
        /* JADX WARN: Code duplicated, block: B:42:0x00da  */
        /* JADX WARN: Code duplicated, block: B:47:0x00e7  */
        /* JADX WARN: Code duplicated, block: B:50:0x00ee  */
        /* JADX WARN: Code duplicated, block: B:65:? A[RETURN, SYNTHETIC] */
        @Override // java.lang.Runnable
        public void run() throws Throwable {
            Cursor cursor;
            com.mbridge.msdk.config.component.load.downloader.database.c.a aVar;
            com.mbridge.msdk.config.component.load.downloader.database.c.a aVar2;
            if (com.mbridge.msdk.config.component.load.downloader.utils.a.b(a.this.f28924d)) {
                a aVar3 = a.this;
                aVar3.f28924d = aVar3.f28921a.getWritableDatabase();
            }
            com.mbridge.msdk.config.component.load.downloader.database.b bVarA = null;
            if (com.mbridge.msdk.config.component.load.downloader.utils.a.b(a.this.f28924d) || !a.this.f28924d.isOpen()) {
                if (com.mbridge.msdk.config.component.load.downloader.utils.a.a(this.f28925a)) {
                    this.f28925a.a(null);
                    return;
                }
                return;
            }
            try {
                String str = this.f28926b;
                if (TextUtils.isEmpty(str)) {
                    try {
                        URL url = new URL(this.f28927c);
                        str = url.getProtocol() + "://" + url.getHost() + url.getPath();
                    } catch (Throwable th2) {
                        q0.b(IDatabaseHelper.TAG, th2.getMessage());
                    }
                }
                Cursor cursorRawQuery = a.this.f28924d.rawQuery("SELECT * FROM " + a.this.f28923c + " WHERE cacheKey = ?", new String[]{str});
                if (cursorRawQuery != null) {
                    try {
                        if (cursorRawQuery.moveToFirst()) {
                            bVarA = com.mbridge.msdk.config.component.load.downloader.database.b.a(cursorRawQuery);
                        }
                    } catch (Exception e10) {
                        cursor = cursorRawQuery;
                        e = e10;
                        try {
                            if (MBridgeConstans.DEBUG) {
                                e.printStackTrace();
                            }
                            if (cursor != null) {
                                cursor.close();
                            }
                            aVar2 = this.f28925a;
                            if (aVar2 == null) {
                                return;
                            }
                        } catch (Throwable th3) {
                            th = th3;
                            if (cursor != null) {
                                cursor.close();
                            }
                            aVar = this.f28925a;
                            if (aVar != null) {
                                aVar.a(null);
                            }
                            throw th;
                        }
                    } catch (Throwable th4) {
                        cursor = cursorRawQuery;
                        th = th4;
                        if (cursor != null) {
                            cursor.close();
                        }
                        aVar = this.f28925a;
                        if (aVar != null) {
                            aVar.a(null);
                        }
                        throw th;
                    }
                }
                if (cursorRawQuery != null) {
                    cursorRawQuery.close();
                }
                aVar2 = this.f28925a;
                if (aVar2 == null) {
                    return;
                }
            } catch (Exception e11) {
                e = e11;
                cursor = null;
                if (MBridgeConstans.DEBUG) {
                    e.printStackTrace();
                }
                if (cursor != null) {
                    cursor.close();
                }
                aVar2 = this.f28925a;
                if (aVar2 == null) {
                    return;
                }
                aVar2.a(bVarA);
            } catch (Throwable th5) {
                th = th5;
                cursor = null;
                if (cursor != null) {
                    cursor.close();
                }
                aVar = this.f28925a;
                if (aVar != null) {
                    aVar.a(null);
                }
                throw th;
            }
            aVar2.a(bVarA);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class b implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.mbridge.msdk.config.component.load.downloader.database.b f28929a;

        b(com.mbridge.msdk.config.component.load.downloader.database.b bVar) {
            this.f28929a = bVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (com.mbridge.msdk.config.component.load.downloader.utils.a.b(a.this.f28924d)) {
                a aVar = a.this;
                aVar.f28924d = aVar.f28921a.getWritableDatabase();
            }
            if (com.mbridge.msdk.config.component.load.downloader.utils.a.b(a.this.f28924d) || !a.this.f28924d.isOpen()) {
                return;
            }
            try {
                a.this.f28924d.beginTransaction();
                a.this.f28924d.insertWithOnConflict(a.this.f28923c, null, com.mbridge.msdk.config.component.load.downloader.database.b.a(this.f28929a), 4);
                a.this.f28924d.setTransactionSuccessful();
            } catch (Exception e10) {
                q0.b(IDatabaseHelper.TAG, e10.getMessage());
            } finally {
                try {
                    if (a.this.f28924d.inTransaction()) {
                        a.this.f28924d.endTransaction();
                    }
                } catch (Throwable th2) {
                    q0.b(IDatabaseHelper.TAG, th2.getMessage());
                }
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class c implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.mbridge.msdk.config.component.load.downloader.database.b f28931a;

        c(com.mbridge.msdk.config.component.load.downloader.database.b bVar) {
            this.f28931a = bVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (com.mbridge.msdk.config.component.load.downloader.utils.a.b(a.this.f28924d)) {
                a aVar = a.this;
                aVar.f28924d = aVar.f28921a.getWritableDatabase();
            }
            if (com.mbridge.msdk.config.component.load.downloader.utils.a.b(a.this.f28924d) || !a.this.f28924d.isOpen()) {
                return;
            }
            try {
                if (!TextUtils.isEmpty(this.f28931a.b())) {
                    a.this.f28924d.update(a.this.f28923c, com.mbridge.msdk.config.component.load.downloader.database.b.a(this.f28931a), "cacheKey = ? ", new String[]{this.f28931a.b()});
                } else {
                    if (TextUtils.isEmpty(this.f28931a.f())) {
                        return;
                    }
                    a.this.f28924d.update(a.this.f28923c, com.mbridge.msdk.config.component.load.downloader.database.b.a(this.f28931a), "originalURL = ? ", new String[]{this.f28931a.f()});
                }
            } catch (Exception e10) {
                q0.b(IDatabaseHelper.TAG, e10.getMessage());
            }
        }
    }

    public a(Handler handler, d dVar) {
        this.f28922b = handler;
        this.f28921a = dVar;
    }

    @Override // com.mbridge.msdk.config.component.load.downloader.database.c
    public void a(String str, String str2, com.mbridge.msdk.config.component.load.downloader.database.c.a aVar) {
        this.f28922b.post(new RunnableC0377a(aVar, str2, str));
    }

    @Override // com.mbridge.msdk.config.component.load.downloader.database.c
    public void a(com.mbridge.msdk.config.component.load.downloader.database.b bVar) {
        this.f28922b.postAtFrontOfQueue(new b(bVar));
    }

    @Override // com.mbridge.msdk.config.component.load.downloader.database.c
    public void a(com.mbridge.msdk.config.component.load.downloader.database.b bVar, String str) {
        this.f28922b.post(new c(bVar));
    }
}
