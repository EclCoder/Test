package com.inmobi.media;

import android.content.ContentValues;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import o4.Wz.OGoz;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes2.dex */
public final class Fb {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C3167n9 f24768a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public WeakReference f24769b;

    public Fb(C3167n9 databaseHelper) {
        kotlin.jvm.internal.s.h(databaseHelper, "databaseHelper");
        this.f24768a = databaseHelper;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(C3453yb c3453yb, kotlin.coroutines.jvm.internal.d dVar) {
        Db db2;
        if (dVar instanceof Db) {
            db2 = (Db) dVar;
            int i10 = db2.f24647c;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                db2.f24647c = i10 - Integer.MIN_VALUE;
            } else {
                db2 = new Db(this, dVar);
            }
        } else {
            db2 = new Db(this, dVar);
        }
        Object obj = db2.f24645a;
        Object objF = ll.b.f();
        int i11 = db2.f24647c;
        if (i11 == 0) {
            fl.s.b(obj);
            C3167n9 c3167n9 = this.f24768a;
            ContentValues contentValuesA = Hb.a(c3453yb);
            db2.f24647c = 1;
            if (c3167n9.a("logs_v2", contentValuesA, 4, db2) == objF) {
                return objF;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            fl.s.b(obj);
        }
        WeakReference weakReference = this.f24769b;
        if (weakReference != null && ((C3374v9) weakReference.get()) != null) {
            C3374v9.a();
        }
        return fl.g0.f38750a;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    public final Object b(C3453yb c3453yb, kotlin.coroutines.jvm.internal.d dVar) {
        Eb eb2;
        if (dVar instanceof Eb) {
            eb2 = (Eb) dVar;
            int i10 = eb2.f24707c;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                eb2.f24707c = i10 - Integer.MIN_VALUE;
            } else {
                eb2 = new Eb(this, dVar);
            }
        } else {
            eb2 = new Eb(this, dVar);
        }
        Eb eb3 = eb2;
        Object obj = eb3.f24705a;
        Object objF = ll.b.f();
        int i11 = eb3.f24707c;
        if (i11 == 0) {
            fl.s.b(obj);
            C3167n9 c3167n9 = this.f24768a;
            ContentValues contentValuesA = Hb.a(c3453yb);
            String[] strArr = {c3453yb.f27931a};
            eb3.f24707c = 1;
            if (C3167n9.a(c3167n9, "logs_v2", contentValuesA, "filename=?", strArr, eb3, 16) == objF) {
                return objF;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            fl.s.b(obj);
        }
        WeakReference weakReference = this.f24769b;
        if (weakReference != null && ((C3374v9) weakReference.get()) != null) {
            C3374v9.a();
        }
        return fl.g0.f38750a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(kotlin.coroutines.jvm.internal.d dVar) {
        Ab ab2;
        if (dVar instanceof Ab) {
            ab2 = (Ab) dVar;
            int i10 = ab2.f24466c;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                ab2.f24466c = i10 - Integer.MIN_VALUE;
            } else {
                ab2 = new Ab(this, dVar);
            }
        } else {
            ab2 = new Ab(this, dVar);
        }
        Object objA = ab2.f24464a;
        Object objF = ll.b.f();
        int i11 = ab2.f24466c;
        if (i11 == 0) {
            fl.s.b(objA);
            C3167n9 c3167n9 = this.f24768a;
            ab2.f24466c = 1;
            c3167n9.getClass();
            objA = c3167n9.a(new C3063j9(c3167n9, "SELECT * FROM logs_v2 WHERE hasLoggerFinished=1", null), ab2);
            if (objA == objF) {
                return objF;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            fl.s.b(objA);
        }
        Iterable iterable = (Iterable) objA;
        ArrayList arrayList = new ArrayList(gl.r.v(iterable, 10));
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add(Hb.a((ContentValues) it.next()));
        }
        return arrayList;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object b(String str, kotlin.coroutines.jvm.internal.d dVar) {
        Cb cb2;
        if (dVar instanceof Cb) {
            cb2 = (Cb) dVar;
            int i10 = cb2.f24588c;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                cb2.f24588c = i10 - Integer.MIN_VALUE;
            } else {
                cb2 = new Cb(this, dVar);
            }
        } else {
            cb2 = new Cb(this, dVar);
        }
        Object objA = cb2.f24586a;
        Object objF = ll.b.f();
        int i11 = cb2.f24588c;
        if (i11 == 0) {
            fl.s.b(objA);
            C3167n9 c3167n9 = this.f24768a;
            cb2.f24588c = 1;
            c3167n9.getClass();
            objA = c3167n9.a(new C2934e9(c3167n9, "SELECT COUNT(*) FROM logs_v2 WHERE filename='" + str + "'", null), cb2);
            if (objA == objF) {
                return objF;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            fl.s.b(objA);
        }
        return kotlin.coroutines.jvm.internal.b.a(((Number) objA).intValue() != 0);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object b(kotlin.coroutines.jvm.internal.d dVar) {
        Bb bb2;
        if (dVar instanceof Bb) {
            bb2 = (Bb) dVar;
            int i10 = bb2.f24531c;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                bb2.f24531c = i10 - Integer.MIN_VALUE;
            } else {
                bb2 = new Bb(this, dVar);
            }
        } else {
            bb2 = new Bb(this, dVar);
        }
        Object objA = bb2.f24529a;
        Object objF = ll.b.f();
        int i11 = bb2.f24531c;
        if (i11 == 0) {
            fl.s.b(objA);
            C3167n9 c3167n9 = this.f24768a;
            bb2.f24531c = 1;
            c3167n9.getClass();
            objA = c3167n9.a(new C3063j9(c3167n9, "SELECT * FROM logs_v2 WHERE hasLoggerFinished=0", null), bb2);
            if (objA == objF) {
                return objF;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            fl.s.b(objA);
        }
        Iterable iterable = (Iterable) objA;
        ArrayList arrayList = new ArrayList(gl.r.v(iterable, 10));
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add(Hb.a((ContentValues) it.next()));
        }
        return arrayList;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(long j10, int i10, kotlin.coroutines.jvm.internal.d dVar) {
        C3478zb c3478zb;
        if (dVar instanceof C3478zb) {
            c3478zb = (C3478zb) dVar;
            int i11 = c3478zb.f28009c;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c3478zb.f28009c = i11 - Integer.MIN_VALUE;
            } else {
                c3478zb = new C3478zb(this, dVar);
            }
        } else {
            c3478zb = new C3478zb(this, dVar);
        }
        Object objA = c3478zb.f28007a;
        Object objF = ll.b.f();
        int i12 = c3478zb.f28009c;
        if (i12 == 0) {
            fl.s.b(objA);
            C3167n9 c3167n9 = this.f24768a;
            c3478zb.f28009c = 1;
            c3167n9.getClass();
            objA = c3167n9.a(new C3063j9(c3167n9, "SELECT * FROM logs_v2 WHERE id NOT IN (SELECT id FROM ( SELECT id FROM logs_v2 WHERE saveTimestamp > " + j10 + " ORDER BY saveTimestamp DESC LIMIT " + i10 + ") AS recent_logs);", null), c3478zb);
            if (objA == objF) {
                return objF;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException(OGoz.cvwsOKmtwND);
            }
            fl.s.b(objA);
        }
        Iterable iterable = (Iterable) objA;
        ArrayList arrayList = new ArrayList(gl.r.v(iterable, 10));
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add(Hb.a((ContentValues) it.next()));
        }
        return arrayList;
    }

    public final Object a(String str, kotlin.coroutines.jvm.internal.d dVar) {
        Object objA = C3167n9.a(this.f24768a, "logs_v2", "filename='" + str + "'", dVar, 4);
        return objA == ll.b.f() ? objA : fl.g0.f38750a;
    }
}
