package c1;

import android.content.Context;
import fl.g0;
import fl.s;
import gl.r;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import kotlin.coroutines.jvm.internal.m;
import kotlin.jvm.functions.Function3;
import tl.o;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public abstract class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Set f9271a = new LinkedHashSet();

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static final class a extends m implements Function3 {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        int f9272r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        /* synthetic */ Object f9273s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        /* synthetic */ Object f9274t;

        a(kl.f fVar) {
            super(3, fVar);
        }

        @Override // kotlin.jvm.functions.Function3
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(b1.c cVar, d1.f fVar, kl.f fVar2) {
            a aVar = new a(fVar2);
            aVar.f9273s = cVar;
            aVar.f9274t = fVar;
            return aVar.invokeSuspend(g0.f38750a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            ll.b.f();
            if (this.f9272r != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            s.b(obj);
            b1.c cVar = (b1.c) this.f9273s;
            d1.f fVar = (d1.f) this.f9274t;
            Set setKeySet = fVar.a().keySet();
            ArrayList arrayList = new ArrayList(r.v(setKeySet, 10));
            Iterator it = setKeySet.iterator();
            while (it.hasNext()) {
                arrayList.add(((d1.f.a) it.next()).a());
            }
            Map mapA = cVar.a();
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry entry : mapA.entrySet()) {
                if (!arrayList.contains((String) entry.getKey())) {
                    linkedHashMap.put(entry.getKey(), entry.getValue());
                }
            }
            d1.c cVarC = fVar.c();
            for (Map.Entry entry2 : linkedHashMap.entrySet()) {
                String str = (String) entry2.getKey();
                Object value = entry2.getValue();
                if (value instanceof Boolean) {
                    cVarC.i(d1.i.a(str), value);
                } else if (value instanceof Float) {
                    cVarC.i(d1.i.d(str), value);
                } else if (value instanceof Integer) {
                    cVarC.i(d1.i.e(str), value);
                } else if (value instanceof Long) {
                    cVarC.i(d1.i.f(str), value);
                } else if (value instanceof String) {
                    cVarC.i(d1.i.g(str), value);
                } else if (value instanceof Set) {
                    d1.f.a aVarH = d1.i.h(str);
                    kotlin.jvm.internal.s.f(value, "null cannot be cast to non-null type kotlin.collections.Set<kotlin.String>");
                    cVarC.i(aVarH, (Set) value);
                }
            }
            return cVarC.d();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static final class b extends m implements o {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        int f9275r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        /* synthetic */ Object f9276s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ Set f9277t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(Set set, kl.f fVar) {
            super(2, fVar);
            this.f9277t = set;
        }

        @Override // tl.o
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(d1.f fVar, kl.f fVar2) {
            return ((b) create(fVar, fVar2)).invokeSuspend(g0.f38750a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kl.f create(Object obj, kl.f fVar) {
            b bVar = new b(this.f9277t, fVar);
            bVar.f9276s = obj;
            return bVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            ll.b.f();
            if (this.f9275r != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            s.b(obj);
            Set setKeySet = ((d1.f) this.f9276s).a().keySet();
            ArrayList arrayList = new ArrayList(r.v(setKeySet, 10));
            Iterator it = setKeySet.iterator();
            while (it.hasNext()) {
                arrayList.add(((d1.f.a) it.next()).a());
            }
            boolean z10 = true;
            if (this.f9277t != i.c()) {
                Set set = this.f9277t;
                if (set == null || !set.isEmpty()) {
                    Iterator it2 = set.iterator();
                    while (it2.hasNext()) {
                        if (!arrayList.contains((String) it2.next())) {
                        }
                    }
                    z10 = false;
                } else {
                    z10 = false;
                }
            }
            return kotlin.coroutines.jvm.internal.b.a(z10);
        }
    }

    public static final b1.a a(Context context, String sharedPreferencesName, Set keysToMigrate) {
        kotlin.jvm.internal.s.h(context, "context");
        kotlin.jvm.internal.s.h(sharedPreferencesName, "sharedPreferencesName");
        kotlin.jvm.internal.s.h(keysToMigrate, "keysToMigrate");
        return keysToMigrate == f9271a ? new b1.a(context, sharedPreferencesName, null, e(keysToMigrate), d(), 4, null) : new b1.a(context, sharedPreferencesName, keysToMigrate, e(keysToMigrate), d());
    }

    public static /* synthetic */ b1.a b(Context context, String str, Set set, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            set = f9271a;
        }
        return a(context, str, set);
    }

    public static final Set c() {
        return f9271a;
    }

    private static final Function3 d() {
        return new a(null);
    }

    private static final o e(Set set) {
        return new b(set, null);
    }
}
