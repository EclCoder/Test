package b1;

import android.content.Context;
import android.content.SharedPreferences;
import fl.g0;
import fl.k;
import fl.l;
import fl.s;
import gl.r;
import java.io.IOException;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import kotlin.coroutines.jvm.internal.m;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.t;
import tl.o;
import z0.f;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public final class a implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final o f8258a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Function3 f8259b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Context f8260c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f8261d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final k f8262e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Set f8263f;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX INFO: renamed from: b1.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class C0108a extends m implements o {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        int f8264r;

        C0108a(kl.f fVar) {
            super(2, fVar);
        }

        @Override // tl.o
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Object obj, kl.f fVar) {
            return ((C0108a) create(obj, fVar)).invokeSuspend(g0.f38750a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kl.f create(Object obj, kl.f fVar) {
            return new C0108a(fVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            ll.b.f();
            if (this.f8264r != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            s.b(obj);
            return kotlin.coroutines.jvm.internal.b.a(true);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static final class b extends t implements tl.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Context f8265a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f8266b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(Context context, String str) {
            super(0);
            this.f8265a = context;
            this.f8266b = str;
        }

        @Override // tl.a
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public final SharedPreferences invoke() {
            SharedPreferences sharedPreferences = this.f8265a.getSharedPreferences(this.f8266b, 0);
            kotlin.jvm.internal.s.g(sharedPreferences, "context.getSharedPrefere…me, Context.MODE_PRIVATE)");
            return sharedPreferences;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final c f8267a = new c();

        private c() {
        }

        public static final boolean a(Context context, String name) {
            kotlin.jvm.internal.s.h(context, "context");
            kotlin.jvm.internal.s.h(name, "name");
            return context.deleteSharedPreferences(name);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static final class d extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        Object f8268r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        /* synthetic */ Object f8269s;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        int f8271u;

        d(kl.f fVar) {
            super(fVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f8269s = obj;
            this.f8271u |= Integer.MIN_VALUE;
            return a.this.a(null, this);
        }
    }

    private a(tl.a aVar, Set set, o oVar, Function3 function3, Context context, String str) {
        this.f8258a = oVar;
        this.f8259b = function3;
        this.f8260c = context;
        this.f8261d = str;
        this.f8262e = l.b(aVar);
        this.f8263f = set == b1.b.a() ? null : r.M0(set);
    }

    private final void d(Context context, String str) {
        c.a(context, str);
    }

    private final SharedPreferences e() {
        return (SharedPreferences) this.f8262e.getValue();
    }

    /* JADX WARN: Code duplicated, block: B:27:0x006c  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // z0.f
    public Object a(Object obj, kl.f fVar) {
        d dVar;
        a aVar;
        if (fVar instanceof d) {
            dVar = (d) fVar;
            int i10 = dVar.f8271u;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                dVar.f8271u = i10 - Integer.MIN_VALUE;
            } else {
                dVar = new d(fVar);
            }
        } else {
            dVar = new d(fVar);
        }
        Object objInvoke = dVar.f8269s;
        Object objF = ll.b.f();
        int i11 = dVar.f8271u;
        boolean z10 = true;
        if (i11 == 0) {
            s.b(objInvoke);
            o oVar = this.f8258a;
            dVar.f8268r = this;
            dVar.f8271u = 1;
            objInvoke = oVar.invoke(obj, dVar);
            if (objInvoke == objF) {
                return objF;
            }
            aVar = this;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            aVar = (a) dVar.f8268r;
            s.b(objInvoke);
        }
        if (!((Boolean) objInvoke).booleanValue()) {
            return kotlin.coroutines.jvm.internal.b.a(false);
        }
        Set set = aVar.f8263f;
        if (set == null) {
            Map<String, ?> all = aVar.e().getAll();
            kotlin.jvm.internal.s.g(all, "sharedPrefs.all");
            if (all.isEmpty()) {
                z10 = false;
            }
        } else {
            SharedPreferences sharedPreferencesE = aVar.e();
            if (set == null || !set.isEmpty()) {
                Iterator it = set.iterator();
                while (it.hasNext()) {
                    if (sharedPreferencesE.contains((String) it.next())) {
                    }
                }
                z10 = false;
            } else {
                z10 = false;
            }
        }
        return kotlin.coroutines.jvm.internal.b.a(z10);
    }

    @Override // z0.f
    public Object b(kl.f fVar) throws IOException {
        Context context;
        String str;
        SharedPreferences.Editor editorEdit = e().edit();
        Set set = this.f8263f;
        if (set == null) {
            editorEdit.clear();
        } else {
            Iterator it = set.iterator();
            while (it.hasNext()) {
                editorEdit.remove((String) it.next());
            }
        }
        if (!editorEdit.commit()) {
            throw new IOException("Unable to delete migrated keys from SharedPreferences.");
        }
        if (e().getAll().isEmpty() && (context = this.f8260c) != null && (str = this.f8261d) != null) {
            d(context, str);
        }
        Set set2 = this.f8263f;
        if (set2 != null) {
            set2.clear();
        }
        return g0.f38750a;
    }

    @Override // z0.f
    public Object c(Object obj, kl.f fVar) {
        return this.f8259b.invoke(new b1.c(e(), this.f8263f), obj, fVar);
    }

    public /* synthetic */ a(Context context, String str, Set set, o oVar, Function3 function3, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, str, (i10 & 4) != 0 ? b1.b.a() : set, (i10 & 8) != 0 ? new C0108a(null) : oVar, function3);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public a(Context context, String sharedPreferencesName, Set keysToMigrate, o shouldRunMigration, Function3 migrate) {
        this(new b(context, sharedPreferencesName), keysToMigrate, shouldRunMigration, migrate, context, sharedPreferencesName);
        kotlin.jvm.internal.s.h(context, "context");
        kotlin.jvm.internal.s.h(sharedPreferencesName, "sharedPreferencesName");
        kotlin.jvm.internal.s.h(keysToMigrate, "keysToMigrate");
        kotlin.jvm.internal.s.h(shouldRunMigration, "shouldRunMigration");
        kotlin.jvm.internal.s.h(migrate, "migrate");
    }
}
