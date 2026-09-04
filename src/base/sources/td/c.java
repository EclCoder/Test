package td;

import android.content.Context;
import android.os.Process;
import android.util.Log;
import androidx.datastore.core.CorruptionException;
import c1.i;
import d1.j;
import em.o0;
import fl.g0;
import fl.s;
import gl.r;
import hm.e;
import hm.g;
import java.util.List;
import java.util.Map;
import kl.f;
import kotlin.coroutines.jvm.internal.m;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.l0;
import tl.o;
import z0.h;
import zl.k;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class c {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    static final /* synthetic */ k[] f53298f = {l0.h(new e0(c.class, "dataStore", "getDataStore(Landroid/content/Context;)Landroidx/datastore/core/DataStore;", 0))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f53299a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f53300b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ThreadLocal f53301c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final kotlin.properties.c f53302d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final h f53303e;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static final class a extends m implements o {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        int f53304r;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ Function1 f53306t;

        /* JADX INFO: renamed from: td.c$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
        static final class C0812a extends m implements o {

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            int f53307r;

            /* JADX INFO: renamed from: s, reason: collision with root package name */
            /* synthetic */ Object f53308s;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            final /* synthetic */ Function1 f53309t;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0812a(Function1 function1, f fVar) {
                super(2, fVar);
                this.f53309t = function1;
            }

            @Override // tl.o
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(d1.c cVar, f fVar) {
                return ((C0812a) create(cVar, fVar)).invokeSuspend(g0.f38750a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final f create(Object obj, f fVar) {
                C0812a c0812a = new C0812a(this.f53309t, fVar);
                c0812a.f53308s = obj;
                return c0812a;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                ll.b.f();
                if (this.f53307r != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                s.b(obj);
                this.f53309t.invoke((d1.c) this.f53308s);
                return g0.f38750a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(Function1 function1, f fVar) {
            super(2, fVar);
            this.f53306t = function1;
        }

        @Override // tl.o
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(o0 o0Var, f fVar) {
            return ((a) create(o0Var, fVar)).invokeSuspend(g0.f38750a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final f create(Object obj, f fVar) {
            return c.this.new a(this.f53306t, fVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objF = ll.b.f();
            int i10 = this.f53304r;
            try {
                if (i10 == 0) {
                    s.b(obj);
                    if (kotlin.jvm.internal.s.c(c.this.f53301c.get(), kotlin.coroutines.jvm.internal.b.a(true))) {
                        throw new IllegalStateException("Don't call JavaDataStorage.edit() from within an existing edit() callback.\nThis causes deadlocks, and is generally indicative of a code smell.\nInstead, either pass around the initial `MutablePreferences` instance, or don't do everything in a single callback. ");
                    }
                    c.this.f53301c.set(kotlin.coroutines.jvm.internal.b.a(true));
                    h hVar = c.this.f53303e;
                    C0812a c0812a = new C0812a(this.f53306t, null);
                    this.f53304r = 1;
                    obj = j.a(hVar, c0812a, this);
                    if (obj == objF) {
                        return objF;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    s.b(obj);
                }
                d1.f fVar = (d1.f) obj;
                c.this.f53301c.set(kotlin.coroutines.jvm.internal.b.a(false));
                return fVar;
            } catch (Throwable th2) {
                c.this.f53301c.set(kotlin.coroutines.jvm.internal.b.a(false));
                throw th2;
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static final class b extends m implements o {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        int f53310r;

        b(f fVar) {
            super(2, fVar);
        }

        @Override // tl.o
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(o0 o0Var, f fVar) {
            return ((b) create(o0Var, fVar)).invokeSuspend(g0.f38750a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final f create(Object obj, f fVar) {
            return c.this.new b(fVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Map mapA;
            Object objF = ll.b.f();
            int i10 = this.f53310r;
            if (i10 == 0) {
                s.b(obj);
                e data = c.this.f53303e.getData();
                this.f53310r = 1;
                obj = g.r(data, this);
                if (obj == objF) {
                    return objF;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                s.b(obj);
            }
            d1.f fVar = (d1.f) obj;
            return (fVar == null || (mapA = fVar.a()) == null) ? gl.l0.h() : mapA;
        }
    }

    public c(Context context, String name) {
        kotlin.jvm.internal.s.h(context, "context");
        kotlin.jvm.internal.s.h(name, "name");
        this.f53299a = context;
        this.f53300b = name;
        this.f53301c = new ThreadLocal();
        this.f53302d = c1.a.b(name, new a1.b(new Function1() { // from class: td.a
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return c.e(this.f53296a, (CorruptionException) obj);
            }
        }), new Function1() { // from class: td.b
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return c.f(this.f53297a, (Context) obj);
            }
        }, null, 8, null);
        this.f53303e = i(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final d1.f e(c cVar, CorruptionException ex) {
        kotlin.jvm.internal.s.h(ex, "ex");
        Log.w(l0.b(c.class).k(), "CorruptionException in " + cVar.f53300b + " DataStore running in process " + Process.myPid(), ex);
        return d1.g.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List f(c cVar, Context it) {
        kotlin.jvm.internal.s.h(it, "it");
        return r.e(i.b(it, cVar.f53300b, null, 4, null));
    }

    private final h i(Context context) {
        return (h) this.f53302d.getValue(context, f53298f[0]);
    }

    public final d1.f g(Function1 transform) {
        kotlin.jvm.internal.s.h(transform, "transform");
        return (d1.f) em.j.b(null, new a(transform, null), 1, null);
    }

    public final Map h() {
        return (Map) em.j.b(null, new b(null), 1, null);
    }
}
