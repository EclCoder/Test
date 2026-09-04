package wl;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public abstract class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f56362a = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final c f56363b = nl.b.f47820a.b();

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class a extends c implements Serializable {

        /* JADX INFO: renamed from: wl.c$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
        private static final class C0861a implements Serializable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final C0861a f56364a = new C0861a();
            private static final long serialVersionUID = 0;

            private C0861a() {
            }

            private final Object readResolve() {
                return c.f56362a;
            }
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
            throw new InvalidObjectException("Deserialization is supported via proxy only");
        }

        private final Object writeReplace() {
            return C0861a.f56364a;
        }

        @Override // wl.c
        public double g() {
            return c.f56363b.g();
        }

        @Override // wl.c
        public int h() {
            return c.f56363b.h();
        }

        @Override // wl.c
        public int i(int i10) {
            return c.f56363b.i(i10);
        }

        private a() {
        }
    }

    public abstract double g();

    public abstract int h();

    public abstract int i(int i10);
}
