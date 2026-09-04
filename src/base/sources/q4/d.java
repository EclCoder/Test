package q4;

import android.database.sqlite.SQLiteProgram;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
class d implements p4.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final SQLiteProgram f50365a;

    d(SQLiteProgram sQLiteProgram) {
        this.f50365a = sQLiteProgram;
    }

    @Override // p4.d
    public void E0(int i10) {
        this.f50365a.bindNull(i10);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f50365a.close();
    }

    @Override // p4.d
    public void e(int i10, double d10) {
        this.f50365a.bindDouble(i10, d10);
    }

    @Override // p4.d
    public void h0(int i10, String str) {
        this.f50365a.bindString(i10, str);
    }

    @Override // p4.d
    public void s0(int i10, long j10) {
        this.f50365a.bindLong(i10, j10);
    }

    @Override // p4.d
    public void u0(int i10, byte[] bArr) {
        this.f50365a.bindBlob(i10, bArr);
    }
}
