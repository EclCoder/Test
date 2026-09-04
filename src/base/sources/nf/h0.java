package nf;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public interface h0 {

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class a implements h0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final List f47591a;

        public a(List words) {
            kotlin.jvm.internal.s.h(words, "words");
            this.f47591a = words;
        }

        public final List a() {
            return this.f47591a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && kotlin.jvm.internal.s.c(this.f47591a, ((a) obj).f47591a);
        }

        public int hashCode() {
            return this.f47591a.hashCode();
        }

        public String toString() {
            return "Done(words=" + this.f47591a + ')';
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class b implements h0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f47592a;

        public b(String reason) {
            kotlin.jvm.internal.s.h(reason, "reason");
            this.f47592a = reason;
        }

        public final String a() {
            return this.f47592a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && kotlin.jvm.internal.s.c(this.f47592a, ((b) obj).f47592a);
        }

        public int hashCode() {
            return this.f47592a.hashCode();
        }

        public String toString() {
            return "Failed(reason=" + this.f47592a + ')';
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class c implements h0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final c f47593a = new c();

        private c() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class d implements h0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f47594a;

        public d(int i10) {
            this.f47594a = i10;
        }

        public final int a() {
            return this.f47594a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && this.f47594a == ((d) obj).f47594a;
        }

        public int hashCode() {
            return Integer.hashCode(this.f47594a);
        }

        public String toString() {
            return "Transcribing(percent=" + this.f47594a + ')';
        }
    }
}
