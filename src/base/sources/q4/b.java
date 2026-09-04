package q4;

import android.content.Context;
import android.database.DatabaseErrorHandler;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import java.io.File;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
class b implements p4.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f50353a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f50354b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final p4.c.a f50355c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final boolean f50356d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Object f50357e = new Object();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private a f50358f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f50359g;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static class a extends SQLiteOpenHelper {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final q4.a[] f50360a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final p4.c.a f50361b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private boolean f50362c;

        /* JADX INFO: renamed from: q4.b$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
        class C0774a implements DatabaseErrorHandler {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ p4.c.a f50363a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ q4.a[] f50364b;

            C0774a(p4.c.a aVar, q4.a[] aVarArr) {
                this.f50363a = aVar;
                this.f50364b = aVarArr;
            }

            @Override // android.database.DatabaseErrorHandler
            public void onCorruption(SQLiteDatabase sQLiteDatabase) {
                this.f50363a.c(a.c(this.f50364b, sQLiteDatabase));
            }
        }

        a(Context context, String str, q4.a[] aVarArr, p4.c.a aVar) {
            super(context, str, null, aVar.f49507a, new C0774a(aVar, aVarArr));
            this.f50361b = aVar;
            this.f50360a = aVarArr;
        }

        static q4.a c(q4.a[] aVarArr, SQLiteDatabase sQLiteDatabase) {
            q4.a aVar = aVarArr[0];
            if (aVar == null || !aVar.a(sQLiteDatabase)) {
                aVarArr[0] = new q4.a(sQLiteDatabase);
            }
            return aVarArr[0];
        }

        q4.a a(SQLiteDatabase sQLiteDatabase) {
            return c(this.f50360a, sQLiteDatabase);
        }

        @Override // android.database.sqlite.SQLiteOpenHelper, java.lang.AutoCloseable
        public synchronized void close() {
            super.close();
            this.f50360a[0] = null;
        }

        synchronized p4.b d() {
            this.f50362c = false;
            SQLiteDatabase writableDatabase = super.getWritableDatabase();
            if (!this.f50362c) {
                return a(writableDatabase);
            }
            close();
            return d();
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onConfigure(SQLiteDatabase sQLiteDatabase) {
            this.f50361b.b(a(sQLiteDatabase));
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onCreate(SQLiteDatabase sQLiteDatabase) {
            this.f50361b.d(a(sQLiteDatabase));
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onDowngrade(SQLiteDatabase sQLiteDatabase, int i10, int i11) {
            this.f50362c = true;
            this.f50361b.e(a(sQLiteDatabase), i10, i11);
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onOpen(SQLiteDatabase sQLiteDatabase) {
            if (this.f50362c) {
                return;
            }
            this.f50361b.f(a(sQLiteDatabase));
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i10, int i11) {
            this.f50362c = true;
            this.f50361b.g(a(sQLiteDatabase), i10, i11);
        }
    }

    b(Context context, String str, p4.c.a aVar, boolean z10) {
        this.f50353a = context;
        this.f50354b = str;
        this.f50355c = aVar;
        this.f50356d = z10;
    }

    private a d() {
        a aVar;
        synchronized (this.f50357e) {
            try {
                if (this.f50358f == null) {
                    q4.a[] aVarArr = new q4.a[1];
                    if (this.f50354b == null || !this.f50356d) {
                        this.f50358f = new a(this.f50353a, this.f50354b, aVarArr, this.f50355c);
                    } else {
                        this.f50358f = new a(this.f50353a, new File(this.f50353a.getNoBackupFilesDir(), this.f50354b).getAbsolutePath(), aVarArr, this.f50355c);
                    }
                    this.f50358f.setWriteAheadLoggingEnabled(this.f50359g);
                }
                aVar = this.f50358f;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return aVar;
    }

    @Override // p4.c, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        d().close();
    }

    @Override // p4.c
    public String getDatabaseName() {
        return this.f50354b;
    }

    @Override // p4.c
    public p4.b getWritableDatabase() {
        return d().d();
    }

    @Override // p4.c
    public void setWriteAheadLoggingEnabled(boolean z10) {
        synchronized (this.f50357e) {
            try {
                a aVar = this.f50358f;
                if (aVar != null) {
                    aVar.setWriteAheadLoggingEnabled(z10);
                }
                this.f50359g = z10;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
