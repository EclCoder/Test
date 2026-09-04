package sc;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public abstract class j {

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f52300a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final a f52301b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private a f52302c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private boolean f52303d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private boolean f52304e;

        /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
        static class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            String f52305a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            Object f52306b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            a f52307c;

            a() {
            }
        }

        private a a() {
            a aVar = new a();
            this.f52302c.f52307c = aVar;
            this.f52302c = aVar;
            return aVar;
        }

        private b b(Object obj) {
            a().f52306b = obj;
            return this;
        }

        private static boolean d(Object obj) {
            if (obj instanceof CharSequence) {
                return ((CharSequence) obj).length() == 0;
            }
            if (obj instanceof Collection) {
                return ((Collection) obj).isEmpty();
            }
            if (obj instanceof Map) {
                return ((Map) obj).isEmpty();
            }
            if (obj instanceof m) {
                return !((m) obj).h();
            }
            return obj.getClass().isArray() && Array.getLength(obj) == 0;
        }

        public b c(Object obj) {
            return b(obj);
        }

        /* JADX WARN: Code duplicated, block: B:11:0x002c  */
        /* JADX WARN: Code duplicated, block: B:13:0x0033  */
        /* JADX WARN: Code duplicated, block: B:18:0x0059  */
        public String toString() {
            String str;
            boolean z10 = this.f52303d;
            boolean z11 = this.f52304e;
            StringBuilder sb2 = new StringBuilder(32);
            sb2.append(this.f52300a);
            sb2.append('{');
            String str2 = "";
            for (a aVar = this.f52301b.f52307c; aVar != null; aVar = aVar.f52307c) {
                Object obj = aVar.f52306b;
                if (obj == null) {
                    if (!z10) {
                        sb2.append(str2);
                        str = aVar.f52305a;
                        if (str != null) {
                            sb2.append(str);
                            sb2.append('=');
                        }
                        if (obj == null && obj.getClass().isArray()) {
                            String strDeepToString = Arrays.deepToString(new Object[]{obj});
                            sb2.append((CharSequence) strDeepToString, 1, strDeepToString.length() - 1);
                        } else {
                            sb2.append(obj);
                        }
                        str2 = ", ";
                    }
                } else if (!z11 || !d(obj)) {
                    sb2.append(str2);
                    str = aVar.f52305a;
                    if (str != null) {
                        sb2.append(str);
                        sb2.append('=');
                    }
                    if (obj == null) {
                        sb2.append(obj);
                    } else {
                        sb2.append(obj);
                    }
                    str2 = ", ";
                }
            }
            sb2.append('}');
            return sb2.toString();
        }

        private b(String str) {
            a aVar = new a();
            this.f52301b = aVar;
            this.f52302c = aVar;
            this.f52303d = false;
            this.f52304e = false;
            this.f52300a = (String) p.o(str);
        }
    }

    public static Object a(Object obj, Object obj2) {
        if (obj != null) {
            return obj;
        }
        if (obj2 != null) {
            return obj2;
        }
        throw new NullPointerException("Both parameters are null");
    }

    public static b b(Object obj) {
        return new b(obj.getClass().getSimpleName());
    }
}
