package y4;

import android.os.Build;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public abstract class a implements y4.d {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Set f57364c = new HashSet();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f57365a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f57366b;

    /* JADX INFO: renamed from: y4.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static class C0878a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final Set f57367a = new HashSet(Arrays.asList(p.c().a()));
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static class b extends a {
        b(String str, String str2) {
            super(str, str2);
        }

        @Override // y4.a
        public final boolean c() {
            return true;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static class c extends a {
        c(String str, String str2) {
            super(str, str2);
        }

        @Override // y4.a
        public final boolean c() {
            return true;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static class d extends a {
        d(String str, String str2) {
            super(str, str2);
        }

        @Override // y4.a
        public final boolean c() {
            return false;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static class e extends a {
        e(String str, String str2) {
            super(str, str2);
        }

        @Override // y4.a
        public final boolean c() {
            return Build.VERSION.SDK_INT >= 26;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static class f extends a {
        f(String str, String str2) {
            super(str, str2);
        }

        @Override // y4.a
        public final boolean c() {
            return Build.VERSION.SDK_INT >= 27;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static class g extends a {
        g(String str, String str2) {
            super(str, str2);
        }

        @Override // y4.a
        public final boolean c() {
            return Build.VERSION.SDK_INT >= 28;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static class h extends a {
        h(String str, String str2) {
            super(str, str2);
        }

        @Override // y4.a
        public final boolean c() {
            return Build.VERSION.SDK_INT >= 29;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static class i extends a {
        i(String str, String str2) {
            super(str, str2);
        }

        @Override // y4.a
        public final boolean c() {
            return Build.VERSION.SDK_INT >= 33;
        }
    }

    a(String str, String str2) {
        this.f57365a = str;
        this.f57366b = str2;
        f57364c.add(this);
    }

    public static Set e() {
        return Collections.unmodifiableSet(f57364c);
    }

    @Override // y4.d
    public boolean a() {
        return c() || d();
    }

    @Override // y4.d
    public String b() {
        return this.f57365a;
    }

    public abstract boolean c();

    public boolean d() {
        return jp.a.b(C0878a.f57367a, this.f57366b);
    }
}
