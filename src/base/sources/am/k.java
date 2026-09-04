package am;

import java.util.Iterator;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public abstract class k {

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class a implements g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ tl.o f442a;

        public a(tl.o oVar) {
            this.f442a = oVar;
        }

        @Override // am.g
        public Iterator iterator() {
            return k.a(this.f442a);
        }
    }

    public static final Iterator a(tl.o block) {
        kotlin.jvm.internal.s.h(block, "block");
        h hVar = new h();
        hVar.g(ll.b.a(block, hVar, hVar));
        return hVar;
    }

    public static g b(tl.o block) {
        kotlin.jvm.internal.s.h(block, "block");
        return new a(block);
    }
}
