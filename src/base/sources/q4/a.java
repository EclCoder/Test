package q4;

import android.database.Cursor;
import android.database.sqlite.SQLiteCursor;
import android.database.sqlite.SQLiteCursorDriver;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteQuery;
import android.os.CancellationSignal;
import java.util.List;
import p4.f;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
class a implements p4.b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String[] f50346b = {"", " OR ROLLBACK ", " OR ABORT ", " OR FAIL ", " OR IGNORE ", " OR REPLACE "};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String[] f50347c = new String[0];

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final SQLiteDatabase f50348a;

    /* JADX INFO: renamed from: q4.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class C0773a implements SQLiteDatabase.CursorFactory {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ p4.e f50349a;

        C0773a(p4.e eVar) {
            this.f50349a = eVar;
        }

        @Override // android.database.sqlite.SQLiteDatabase.CursorFactory
        public Cursor newCursor(SQLiteDatabase sQLiteDatabase, SQLiteCursorDriver sQLiteCursorDriver, String str, SQLiteQuery sQLiteQuery) {
            this.f50349a.a(new d(sQLiteQuery));
            return new SQLiteCursor(sQLiteCursorDriver, str, sQLiteQuery);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class b implements SQLiteDatabase.CursorFactory {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ p4.e f50351a;

        b(p4.e eVar) {
            this.f50351a = eVar;
        }

        @Override // android.database.sqlite.SQLiteDatabase.CursorFactory
        public Cursor newCursor(SQLiteDatabase sQLiteDatabase, SQLiteCursorDriver sQLiteCursorDriver, String str, SQLiteQuery sQLiteQuery) {
            this.f50351a.a(new d(sQLiteQuery));
            return new SQLiteCursor(sQLiteCursorDriver, str, sQLiteQuery);
        }
    }

    a(SQLiteDatabase sQLiteDatabase) {
        this.f50348a = sQLiteDatabase;
    }

    @Override // p4.b
    public List A() {
        return this.f50348a.getAttachedDbs();
    }

    @Override // p4.b
    public void B(String str) {
        this.f50348a.execSQL(str);
    }

    @Override // p4.b
    public Cursor H(p4.e eVar) {
        return this.f50348a.rawQueryWithFactory(new C0773a(eVar), eVar.d(), f50347c, null);
    }

    @Override // p4.b
    public boolean J0() {
        return this.f50348a.inTransaction();
    }

    @Override // p4.b
    public void L() {
        this.f50348a.setTransactionSuccessful();
    }

    @Override // p4.b
    public void M(String str, Object[] objArr) {
        this.f50348a.execSQL(str, objArr);
    }

    @Override // p4.b
    public Cursor O(p4.e eVar, CancellationSignal cancellationSignal) {
        return this.f50348a.rawQueryWithFactory(new b(eVar), eVar.d(), f50347c, null, cancellationSignal);
    }

    @Override // p4.b
    public void P() {
        this.f50348a.endTransaction();
    }

    boolean a(SQLiteDatabase sQLiteDatabase) {
        return this.f50348a == sQLiteDatabase;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f50348a.close();
    }

    @Override // p4.b
    public boolean isOpen() {
        return this.f50348a.isOpen();
    }

    @Override // p4.b
    public f j0(String str) {
        return new e(this.f50348a.compileStatement(str));
    }

    @Override // p4.b
    public Cursor v0(String str) {
        return H(new p4.a(str));
    }

    @Override // p4.b
    public String w() {
        return this.f50348a.getPath();
    }

    @Override // p4.b
    public void x() {
        this.f50348a.beginTransaction();
    }
}
