package kl;

import kotlin.jvm.internal.s;
import tl.o;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public interface j {

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class a {
        public static j b(j jVar, j context) {
            s.h(context, "context");
            return context == k.f43531a ? jVar : (j) context.fold(jVar, new o() { // from class: kl.i
                @Override // tl.o
                public final Object invoke(Object obj, Object obj2) {
                    return j.a.c((j) obj, (j.b) obj2);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static j c(j acc, b element) {
            s.h(acc, "acc");
            s.h(element, "element");
            j jVarMinusKey = acc.minusKey(element.getKey());
            k kVar = k.f43531a;
            if (jVarMinusKey == kVar) {
                return element;
            }
            g.b bVar = g.f43529z2;
            g gVar = (g) jVarMinusKey.get(bVar);
            if (gVar == null) {
                return new e(jVarMinusKey, element);
            }
            j jVarMinusKey2 = jVarMinusKey.minusKey(bVar);
            return jVarMinusKey2 == kVar ? new e(element, gVar) : new e(new e(jVarMinusKey2, element), gVar);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public interface b extends j {

        /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
        public static final class a {
            public static Object a(b bVar, Object obj, o operation) {
                s.h(operation, "operation");
                return operation.invoke(obj, bVar);
            }

            public static b b(b bVar, c key) {
                s.h(key, "key");
                if (!s.c(bVar.getKey(), key)) {
                    return null;
                }
                s.f(bVar, "null cannot be cast to non-null type E of kotlin.coroutines.CoroutineContext.Element.get");
                return bVar;
            }

            public static j c(b bVar, c key) {
                s.h(key, "key");
                return s.c(bVar.getKey(), key) ? k.f43531a : bVar;
            }

            public static j d(b bVar, j context) {
                s.h(context, "context");
                return a.b(bVar, context);
            }
        }

        @Override // kl.j
        b get(c cVar);

        c getKey();
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public interface c {
    }

    Object fold(Object obj, o oVar);

    b get(c cVar);

    j minusKey(c cVar);

    j plus(j jVar);
}
