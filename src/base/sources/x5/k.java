package x5;

import android.text.TextUtils;
import com.mbridge.msdk.foundation.download.Command;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public final class k implements i {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Map f56682c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private volatile Map f56683d;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class a {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static final String f56684d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static final Map f56685e;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private boolean f56686a = true;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private Map f56687b = f56685e;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private boolean f56688c = true;

        static {
            String strB = b();
            f56684d = strB;
            HashMap map = new HashMap(2);
            if (!TextUtils.isEmpty(strB)) {
                map.put(Command.HTTP_HEADER_USER_AGENT, Collections.singletonList(new b(strB)));
            }
            f56685e = Collections.unmodifiableMap(map);
        }

        static String b() {
            String property = System.getProperty("http.agent");
            if (TextUtils.isEmpty(property)) {
                return property;
            }
            int length = property.length();
            StringBuilder sb2 = new StringBuilder(property.length());
            for (int i10 = 0; i10 < length; i10++) {
                char cCharAt = property.charAt(i10);
                if ((cCharAt > 31 || cCharAt == '\t') && cCharAt < 127) {
                    sb2.append(cCharAt);
                } else {
                    sb2.append('?');
                }
            }
            return sb2.toString();
        }

        public k a() {
            this.f56686a = true;
            return new k(this.f56687b);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static final class b implements j {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f56689a;

        b(String str) {
            this.f56689a = str;
        }

        @Override // x5.j
        public String a() {
            return this.f56689a;
        }

        public boolean equals(Object obj) {
            if (obj instanceof b) {
                return this.f56689a.equals(((b) obj).f56689a);
            }
            return false;
        }

        public int hashCode() {
            return this.f56689a.hashCode();
        }

        public String toString() {
            return "StringHeaderFactory{value='" + this.f56689a + "'}";
        }
    }

    k(Map map) {
        this.f56682c = Collections.unmodifiableMap(map);
    }

    private String b(List list) {
        StringBuilder sb2 = new StringBuilder();
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            String strA = ((j) list.get(i10)).a();
            if (!TextUtils.isEmpty(strA)) {
                sb2.append(strA);
                if (i10 != list.size() - 1) {
                    sb2.append(',');
                }
            }
        }
        return sb2.toString();
    }

    private Map c() {
        HashMap map = new HashMap();
        for (Map.Entry entry : this.f56682c.entrySet()) {
            String strB = b((List) entry.getValue());
            if (!TextUtils.isEmpty(strB)) {
                map.put((String) entry.getKey(), strB);
            }
        }
        return map;
    }

    @Override // x5.i
    public Map a() {
        if (this.f56683d == null) {
            synchronized (this) {
                try {
                    if (this.f56683d == null) {
                        this.f56683d = Collections.unmodifiableMap(c());
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return this.f56683d;
    }

    public boolean equals(Object obj) {
        if (obj instanceof k) {
            return this.f56682c.equals(((k) obj).f56682c);
        }
        return false;
    }

    public int hashCode() {
        return this.f56682c.hashCode();
    }

    public String toString() {
        return "LazyHeaders{headers=" + this.f56682c + '}';
    }
}
