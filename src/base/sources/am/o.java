package am;

import java.util.Iterator;
import kotlin.jvm.functions.Function1;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public abstract class o extends l {

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class a implements g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Iterator f445a;

        public a(Iterator it) {
            this.f445a = it;
        }

        @Override // am.g
        public Iterator iterator() {
            return this.f445a;
        }
    }

    public static g e(Iterator it) {
        kotlin.jvm.internal.s.h(it, "<this>");
        return f(new a(it));
    }

    public static final g f(g gVar) {
        kotlin.jvm.internal.s.h(gVar, "<this>");
        return gVar instanceof am.a ? gVar : new am.a(gVar);
    }

    public static g g(final Object obj, Function1 nextFunction) {
        kotlin.jvm.internal.s.h(nextFunction, "nextFunction");
        return obj == null ? d.f425a : new f(new tl.a() { // from class: am.m
            @Override // tl.a
            public final Object invoke() {
                return o.j(obj);
            }
        }, nextFunction);
    }

    public static g h(final tl.a nextFunction) {
        kotlin.jvm.internal.s.h(nextFunction, "nextFunction");
        return f(new f(nextFunction, new Function1() { // from class: am.n
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return o.i(nextFunction, obj);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object i(tl.a aVar, Object it) {
        kotlin.jvm.internal.s.h(it, "it");
        return aVar.invoke();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object j(Object obj) {
        return obj;
    }
}
