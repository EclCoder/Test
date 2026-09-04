package nf;

import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public interface s {

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class a implements s {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final List f47625a;

        public a(List words) {
            kotlin.jvm.internal.s.h(words, "words");
            this.f47625a = words;
        }

        public final List a() {
            return this.f47625a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && kotlin.jvm.internal.s.c(this.f47625a, ((a) obj).f47625a);
        }

        public int hashCode() {
            return this.f47625a.hashCode();
        }

        public String toString() {
            return "Done(words=" + this.f47625a + ')';
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class b implements s {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f47626a;

        public b(int i10) {
            this.f47626a = i10;
        }

        public final int a() {
            return this.f47626a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && this.f47626a == ((b) obj).f47626a;
        }

        public int hashCode() {
            return Integer.hashCode(this.f47626a);
        }

        public String toString() {
            return "ExtractingAudio(percent=" + this.f47626a + ')';
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class c implements s {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final p f47627a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final String f47628b;

        public c(p kind, String str) {
            kotlin.jvm.internal.s.h(kind, "kind");
            this.f47627a = kind;
            this.f47628b = str;
        }

        public final p a() {
            return this.f47627a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return this.f47627a == cVar.f47627a && kotlin.jvm.internal.s.c(this.f47628b, cVar.f47628b);
        }

        public int hashCode() {
            int iHashCode = this.f47627a.hashCode() * 31;
            String str = this.f47628b;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }

        public String toString() {
            return "Failed(kind=" + this.f47627a + ", message=" + this.f47628b + ')';
        }

        public /* synthetic */ c(p pVar, String str, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this(pVar, (i10 & 2) != 0 ? null : str);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class d implements s {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final d f47629a = new d();

        private d() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class e implements s {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final e f47630a = new e();

        private e() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class f implements s {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f47631a;

        public f(int i10) {
            this.f47631a = i10;
        }

        public final int a() {
            return this.f47631a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof f) && this.f47631a == ((f) obj).f47631a;
        }

        public int hashCode() {
            return Integer.hashCode(this.f47631a);
        }

        public String toString() {
            return "Transcribing(percent=" + this.f47631a + ')';
        }
    }
}
