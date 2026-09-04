package em;

import java.io.Closeable;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public abstract class p1 extends k0 implements Closeable, AutoCloseable {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f38037c = new a(null);

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class a extends kl.b {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final p1 d(kl.j.b bVar) {
            if (bVar instanceof p1) {
                return (p1) bVar;
            }
            return null;
        }

        private a() {
            super(k0.f38025b, new Function1() { // from class: em.o1
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return p1.a.d((kl.j.b) obj);
                }
            });
        }
    }
}
