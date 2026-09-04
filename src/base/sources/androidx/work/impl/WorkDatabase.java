package androidx.work.impl;

import android.content.Context;
import androidx.room.g;
import androidx.room.h;
import i5.e;
import i5.k;
import i5.n;
import i5.q;
import i5.t;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import p4.c;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public abstract class WorkDatabase extends h {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final long f7844l = TimeUnit.DAYS.toMillis(1);

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class a implements c.InterfaceC0762c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Context f7845a;

        a(Context context) {
            this.f7845a = context;
        }

        @Override // p4.c.InterfaceC0762c
        public c a(c.b bVar) {
            c.b.a aVarA = c.b.a(this.f7845a);
            aVarA.c(bVar.f49509b).b(bVar.f49510c).d(true);
            return new q4.c().a(aVarA.a());
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class b extends h.b {
        b() {
        }

        @Override // androidx.room.h.b
        public void c(p4.b bVar) {
            super.c(bVar);
            bVar.x();
            try {
                bVar.B(WorkDatabase.w());
                bVar.L();
            } finally {
                bVar.P();
            }
        }
    }

    public static WorkDatabase s(Context context, Executor executor, boolean z10) {
        h.a aVarA;
        if (z10) {
            aVarA = g.c(context, WorkDatabase.class).c();
        } else {
            aVarA = g.a(context, WorkDatabase.class, b5.h.d());
            aVarA.f(new a(context));
        }
        return (WorkDatabase) aVarA.g(executor).a(u()).b(androidx.work.impl.a.f7854a).b(new androidx.work.impl.a.h(context, 2, 3)).b(androidx.work.impl.a.f7855b).b(androidx.work.impl.a.f7856c).b(new androidx.work.impl.a.h(context, 5, 6)).b(androidx.work.impl.a.f7857d).b(androidx.work.impl.a.f7858e).b(androidx.work.impl.a.f7859f).b(new androidx.work.impl.a.i(context)).b(new androidx.work.impl.a.h(context, 10, 11)).b(androidx.work.impl.a.f7860g).e().d();
    }

    static h.b u() {
        return new b();
    }

    static long v() {
        return System.currentTimeMillis() - f7844l;
    }

    static String w() {
        return "DELETE FROM workspec WHERE state IN (2, 3, 5) AND (period_start_time + minimum_retention_duration) < " + v() + " AND (SELECT COUNT(*)=0 FROM dependency WHERE     prerequisite_id=id AND     work_spec_id NOT IN         (SELECT id FROM workspec WHERE state IN (2, 3, 5)))";
    }

    public abstract n A();

    public abstract q B();

    public abstract t C();

    public abstract i5.b t();

    public abstract e x();

    public abstract i5.h y();

    public abstract k z();
}
