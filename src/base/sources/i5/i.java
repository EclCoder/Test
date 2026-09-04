package i5;

import android.database.Cursor;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public final class i implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final androidx.room.h f41019a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final k4.a f41020b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final k4.d f41021c;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class a extends k4.a {
        a(androidx.room.h hVar) {
            super(hVar);
        }

        @Override // k4.d
        public String d() {
            return "INSERT OR REPLACE INTO `SystemIdInfo` (`work_spec_id`,`system_id`) VALUES (?,?)";
        }

        @Override // k4.a
        /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
        public void g(p4.f fVar, g gVar) {
            String str = gVar.f41017a;
            if (str == null) {
                fVar.E0(1);
            } else {
                fVar.h0(1, str);
            }
            fVar.s0(2, gVar.f41018b);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class b extends k4.d {
        b(androidx.room.h hVar) {
            super(hVar);
        }

        @Override // k4.d
        public String d() {
            return "DELETE FROM SystemIdInfo where work_spec_id=?";
        }
    }

    public i(androidx.room.h hVar) {
        this.f41019a = hVar;
        this.f41020b = new a(hVar);
        this.f41021c = new b(hVar);
    }

    @Override // i5.h
    public g a(String str) {
        k4.c cVarC = k4.c.c("SELECT `SystemIdInfo`.`work_spec_id` AS `work_spec_id`, `SystemIdInfo`.`system_id` AS `system_id` FROM SystemIdInfo WHERE work_spec_id=?", 1);
        if (str == null) {
            cVarC.E0(1);
        } else {
            cVarC.h0(1, str);
        }
        this.f41019a.b();
        Cursor cursorB = m4.c.b(this.f41019a, cVarC, false, null);
        try {
            return cursorB.moveToFirst() ? new g(cursorB.getString(m4.b.b(cursorB, "work_spec_id")), cursorB.getInt(m4.b.b(cursorB, "system_id"))) : null;
        } finally {
            cursorB.close();
            cVarC.release();
        }
    }

    @Override // i5.h
    public List b() {
        k4.c cVarC = k4.c.c("SELECT DISTINCT work_spec_id FROM SystemIdInfo", 0);
        this.f41019a.b();
        Cursor cursorB = m4.c.b(this.f41019a, cVarC, false, null);
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

    @Override // i5.h
    public void c(String str) {
        this.f41019a.b();
        p4.f fVarA = this.f41021c.a();
        if (str == null) {
            fVarA.E0(1);
        } else {
            fVarA.h0(1, str);
        }
        this.f41019a.c();
        try {
            fVarA.E();
            this.f41019a.r();
        } finally {
            this.f41019a.g();
            this.f41021c.f(fVarA);
        }
    }

    @Override // i5.h
    public void d(g gVar) {
        this.f41019a.b();
        this.f41019a.c();
        try {
            this.f41020b.h(gVar);
            this.f41019a.r();
        } finally {
            this.f41019a.g();
        }
    }
}
