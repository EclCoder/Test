package i5;

import android.database.Cursor;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public final class c implements b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final androidx.room.h f41009a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final k4.a f41010b;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class a extends k4.a {
        a(androidx.room.h hVar) {
            super(hVar);
        }

        @Override // k4.d
        public String d() {
            return "INSERT OR IGNORE INTO `Dependency` (`work_spec_id`,`prerequisite_id`) VALUES (?,?)";
        }

        @Override // k4.a
        /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
        public void g(p4.f fVar, i5.a aVar) {
            String str = aVar.f41007a;
            if (str == null) {
                fVar.E0(1);
            } else {
                fVar.h0(1, str);
            }
            String str2 = aVar.f41008b;
            if (str2 == null) {
                fVar.E0(2);
            } else {
                fVar.h0(2, str2);
            }
        }
    }

    public c(androidx.room.h hVar) {
        this.f41009a = hVar;
        this.f41010b = new a(hVar);
    }

    @Override // i5.b
    public List a(String str) {
        k4.c cVarC = k4.c.c("SELECT work_spec_id FROM dependency WHERE prerequisite_id=?", 1);
        if (str == null) {
            cVarC.E0(1);
        } else {
            cVarC.h0(1, str);
        }
        this.f41009a.b();
        Cursor cursorB = m4.c.b(this.f41009a, cVarC, false, null);
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

    @Override // i5.b
    public boolean b(String str) {
        k4.c cVarC = k4.c.c("SELECT COUNT(*)=0 FROM dependency WHERE work_spec_id=? AND prerequisite_id IN (SELECT id FROM workspec WHERE state!=2)", 1);
        if (str == null) {
            cVarC.E0(1);
        } else {
            cVarC.h0(1, str);
        }
        this.f41009a.b();
        boolean z10 = false;
        Cursor cursorB = m4.c.b(this.f41009a, cVarC, false, null);
        try {
            if (cursorB.moveToFirst()) {
                z10 = cursorB.getInt(0) != 0;
            }
            return z10;
        } finally {
            cursorB.close();
            cVarC.release();
        }
    }

    @Override // i5.b
    public void c(i5.a aVar) {
        this.f41009a.b();
        this.f41009a.c();
        try {
            this.f41010b.h(aVar);
            this.f41009a.r();
        } finally {
            this.f41009a.g();
        }
    }

    @Override // i5.b
    public boolean d(String str) {
        k4.c cVarC = k4.c.c("SELECT COUNT(*)>0 FROM dependency WHERE prerequisite_id=?", 1);
        if (str == null) {
            cVarC.E0(1);
        } else {
            cVarC.h0(1, str);
        }
        this.f41009a.b();
        boolean z10 = false;
        Cursor cursorB = m4.c.b(this.f41009a, cVarC, false, null);
        try {
            if (cursorB.moveToFirst()) {
                z10 = cursorB.getInt(0) != 0;
            }
            return z10;
        } finally {
            cursorB.close();
            cVarC.release();
        }
    }
}
