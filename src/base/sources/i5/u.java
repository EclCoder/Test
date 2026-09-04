package i5;

import android.database.Cursor;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public final class u implements t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final androidx.room.h f41081a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final k4.a f41082b;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class a extends k4.a {
        a(androidx.room.h hVar) {
            super(hVar);
        }

        @Override // k4.d
        public String d() {
            return "INSERT OR IGNORE INTO `WorkTag` (`tag`,`work_spec_id`) VALUES (?,?)";
        }

        @Override // k4.a
        /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
        public void g(p4.f fVar, s sVar) {
            String str = sVar.f41079a;
            if (str == null) {
                fVar.E0(1);
            } else {
                fVar.h0(1, str);
            }
            String str2 = sVar.f41080b;
            if (str2 == null) {
                fVar.E0(2);
            } else {
                fVar.h0(2, str2);
            }
        }
    }

    public u(androidx.room.h hVar) {
        this.f41081a = hVar;
        this.f41082b = new a(hVar);
    }

    @Override // i5.t
    public void a(s sVar) {
        this.f41081a.b();
        this.f41081a.c();
        try {
            this.f41082b.h(sVar);
            this.f41081a.r();
        } finally {
            this.f41081a.g();
        }
    }

    @Override // i5.t
    public List b(String str) {
        k4.c cVarC = k4.c.c("SELECT DISTINCT tag FROM worktag WHERE work_spec_id=?", 1);
        if (str == null) {
            cVarC.E0(1);
        } else {
            cVarC.h0(1, str);
        }
        this.f41081a.b();
        Cursor cursorB = m4.c.b(this.f41081a, cVarC, false, null);
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
}
