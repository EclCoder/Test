package androidx.room;

import android.database.Cursor;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class i extends p4.c.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private androidx.room.a f7179b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final a f7180c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f7181d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String f7182e;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static abstract class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f7183a;

        public a(int i10) {
            this.f7183a = i10;
        }

        protected abstract void a(p4.b bVar);

        protected abstract void b(p4.b bVar);

        protected abstract void c(p4.b bVar);

        protected abstract void d(p4.b bVar);

        protected abstract void e(p4.b bVar);

        protected abstract void f(p4.b bVar);

        protected abstract b g(p4.b bVar);
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f7184a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f7185b;

        public b(boolean z10, String str) {
            this.f7184a = z10;
            this.f7185b = str;
        }
    }

    public i(androidx.room.a aVar, a aVar2, String str, String str2) {
        super(aVar2.f7183a);
        this.f7179b = aVar;
        this.f7180c = aVar2;
        this.f7181d = str;
        this.f7182e = str2;
    }

    private void h(p4.b bVar) {
        if (!k(bVar)) {
            b bVarG = this.f7180c.g(bVar);
            if (bVarG.f7184a) {
                this.f7180c.e(bVar);
                l(bVar);
                return;
            } else {
                throw new IllegalStateException("Pre-packaged database has an invalid schema: " + bVarG.f7185b);
            }
        }
        Cursor cursorH = bVar.H(new p4.a("SELECT identity_hash FROM room_master_table WHERE id = 42 LIMIT 1"));
        try {
            String string = cursorH.moveToFirst() ? cursorH.getString(0) : null;
            cursorH.close();
            if (!this.f7181d.equals(string) && !this.f7182e.equals(string)) {
                throw new IllegalStateException("Room cannot verify the data integrity. Looks like you've changed schema but forgot to update the version number. You can simply fix this by increasing the version number.");
            }
        } catch (Throwable th2) {
            cursorH.close();
            throw th2;
        }
    }

    private void i(p4.b bVar) {
        bVar.B("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
    }

    private static boolean j(p4.b bVar) {
        Cursor cursorV0 = bVar.v0("SELECT count(*) FROM sqlite_master WHERE name != 'android_metadata'");
        try {
            boolean z10 = false;
            if (cursorV0.moveToFirst() && cursorV0.getInt(0) == 0) {
                z10 = true;
            }
            return z10;
        } finally {
            cursorV0.close();
        }
    }

    private static boolean k(p4.b bVar) {
        Cursor cursorV0 = bVar.v0("SELECT 1 FROM sqlite_master WHERE type = 'table' AND name='room_master_table'");
        try {
            boolean z10 = false;
            if (cursorV0.moveToFirst() && cursorV0.getInt(0) != 0) {
                z10 = true;
            }
            return z10;
        } finally {
            cursorV0.close();
        }
    }

    private void l(p4.b bVar) {
        i(bVar);
        bVar.B(k4.b.a(this.f7181d));
    }

    @Override // p4.c.a
    public void b(p4.b bVar) {
        super.b(bVar);
    }

    @Override // p4.c.a
    public void d(p4.b bVar) {
        boolean zJ = j(bVar);
        this.f7180c.a(bVar);
        if (!zJ) {
            b bVarG = this.f7180c.g(bVar);
            if (!bVarG.f7184a) {
                throw new IllegalStateException("Pre-packaged database has an invalid schema: " + bVarG.f7185b);
            }
        }
        l(bVar);
        this.f7180c.c(bVar);
    }

    @Override // p4.c.a
    public void e(p4.b bVar, int i10, int i11) {
        g(bVar, i10, i11);
    }

    @Override // p4.c.a
    public void f(p4.b bVar) {
        super.f(bVar);
        h(bVar);
        this.f7180c.d(bVar);
        this.f7179b = null;
    }

    @Override // p4.c.a
    public void g(p4.b bVar, int i10, int i11) {
        List listC;
        androidx.room.a aVar = this.f7179b;
        if (aVar == null || (listC = aVar.f7085d.c(i10, i11)) == null) {
            androidx.room.a aVar2 = this.f7179b;
            if (aVar2 != null && !aVar2.a(i10, i11)) {
                this.f7180c.b(bVar);
                this.f7180c.a(bVar);
                return;
            }
            throw new IllegalStateException("A migration from " + i10 + " to " + i11 + " was required but not found. Please provide the necessary Migration path via RoomDatabase.Builder.addMigration(Migration ...) or allow for destructive migrations via one of the RoomDatabase.Builder.fallbackToDestructiveMigration* methods.");
        }
        this.f7180c.f(bVar);
        Iterator it = listC.iterator();
        while (it.hasNext()) {
            ((l4.a) it.next()).a(bVar);
        }
        b bVarG = this.f7180c.g(bVar);
        if (bVarG.f7184a) {
            this.f7180c.e(bVar);
            l(bVar);
        } else {
            throw new IllegalStateException("Migration didn't properly handle: " + bVarG.f7185b);
        }
    }
}
