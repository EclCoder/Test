package i5;

import android.database.Cursor;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public final class l implements k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final androidx.room.h f41026a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final k4.a f41027b;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class a extends k4.a {
        a(androidx.room.h hVar) {
            super(hVar);
        }

        @Override // k4.d
        public String d() {
            return "INSERT OR IGNORE INTO `WorkName` (`name`,`work_spec_id`) VALUES (?,?)";
        }

        @Override // k4.a
        /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
        public void g(p4.f fVar, j jVar) {
            String str = jVar.f41024a;
            if (str == null) {
                fVar.E0(1);
            } else {
                fVar.h0(1, str);
            }
            String str2 = jVar.f41025b;
            if (str2 == null) {
                fVar.E0(2);
            } else {
                fVar.h0(2, str2);
            }
        }
    }

    public l(androidx.room.h hVar) {
        this.f41026a = hVar;
        this.f41027b = new a(hVar);
    }

    @Override // i5.k
    public List a(String str) {
        k4.c cVarC = k4.c.c("SELECT name FROM workname WHERE work_spec_id=?", 1);
        if (str == null) {
            cVarC.E0(1);
        } else {
            cVarC.h0(1, str);
        }
        this.f41026a.b();
        Cursor cursorB = m4.c.b(this.f41026a, cVarC, false, null);
        try {
            ArrayList arrayList = new ArrayList(cursorB.getCount());
            while (cursorB.moveToNext()) {
                arrayList.add(cursorB.getString(0));
            }
            cursorB.close();
            cVarC.release();
            return arrayList;
        } catch (Throwable th2) {
            cursorB.close();
            cVarC.release();
            throw th2;
        }
    }

    @Override // i5.k
    public void b(j jVar) {
        this.f41026a.b();
        this.f41026a.c();
        try {
            this.f41027b.h(jVar);
            this.f41026a.r();
        } finally {
            this.f41026a.g();
        }
    }
}
