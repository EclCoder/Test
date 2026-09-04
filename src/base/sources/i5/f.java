package i5;

import android.database.Cursor;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public final class f implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final androidx.room.h f41014a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final k4.a f41015b;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class a extends k4.a {
        a(androidx.room.h hVar) {
            super(hVar);
        }

        @Override // k4.d
        public String d() {
            return "INSERT OR REPLACE INTO `Preference` (`key`,`long_value`) VALUES (?,?)";
        }

        @Override // k4.a
        /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
        public void g(p4.f fVar, d dVar) {
            String str = dVar.f41012a;
            if (str == null) {
                fVar.E0(1);
            } else {
                fVar.h0(1, str);
            }
            Long l10 = dVar.f41013b;
            if (l10 == null) {
                fVar.E0(2);
            } else {
                fVar.s0(2, l10.longValue());
            }
        }
    }

    public f(androidx.room.h hVar) {
        this.f41014a = hVar;
        this.f41015b = new a(hVar);
    }

    @Override // i5.e
    public Long a(String str) {
        k4.c cVarC = k4.c.c("SELECT long_value FROM Preference where `key`=?", 1);
        if (str == null) {
            cVarC.E0(1);
        } else {
            cVarC.h0(1, str);
        }
        this.f41014a.b();
        Long lValueOf = null;
        Cursor cursorB = m4.c.b(this.f41014a, cVarC, false, null);
        try {
            if (cursorB.moveToFirst() && !cursorB.isNull(0)) {
                lValueOf = Long.valueOf(cursorB.getLong(0));
            }
            return lValueOf;
        } finally {
            cursorB.close();
            cVarC.release();
        }
    }

    @Override // i5.e
    public void b(d dVar) {
        this.f41014a.b();
        this.f41014a.c();
        try {
            this.f41015b.h(dVar);
            this.f41014a.r();
        } finally {
            this.f41014a.g();
        }
    }
}
