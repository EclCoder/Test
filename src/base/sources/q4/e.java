package q4;

import android.database.sqlite.SQLiteStatement;
import p4.f;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
class e extends d implements f {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final SQLiteStatement f50366b;

    e(SQLiteStatement sQLiteStatement) {
        super(sQLiteStatement);
        this.f50366b = sQLiteStatement;
    }

    @Override // p4.f
    public int E() {
        return this.f50366b.executeUpdateDelete();
    }

    @Override // p4.f
    public long b0() {
        return this.f50366b.executeInsert();
    }
}
