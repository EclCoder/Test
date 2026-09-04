package u5;

import android.graphics.Bitmap;
import android.os.Build;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class o implements l {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final Bitmap.Config[] f54166d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final Bitmap.Config[] f54167e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final Bitmap.Config[] f54168f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final Bitmap.Config[] f54169g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final Bitmap.Config[] f54170h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final c f54171a = new c();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final g f54172b = new g();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Map f54173c = new HashMap();

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f54174a;

        static {
            int[] iArr = new int[Bitmap.Config.values().length];
            f54174a = iArr;
            try {
                iArr[Bitmap.Config.ARGB_8888.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f54174a[Bitmap.Config.RGB_565.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f54174a[Bitmap.Config.ARGB_4444.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f54174a[Bitmap.Config.ALPHA_8.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static final class b implements m {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final c f54175a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f54176b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private Bitmap.Config f54177c;

        public b(c cVar) {
            this.f54175a = cVar;
        }

        @Override // u5.m
        public void a() {
            this.f54175a.c(this);
        }

        public void b(int i10, Bitmap.Config config) {
            this.f54176b = i10;
            this.f54177c = config;
        }

        public boolean equals(Object obj) {
            if (obj instanceof b) {
                b bVar = (b) obj;
                if (this.f54176b == bVar.f54176b && m6.l.d(this.f54177c, bVar.f54177c)) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            int i10 = this.f54176b * 31;
            Bitmap.Config config = this.f54177c;
            return i10 + (config != null ? config.hashCode() : 0);
        }

        public String toString() {
            return o.h(this.f54176b, this.f54177c);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static class c extends u5.c {
        c() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // u5.c
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public b a() {
            return new b(this);
        }

        public b e(int i10, Bitmap.Config config) {
            b bVar = (b) b();
            bVar.b(i10, config);
            return bVar;
        }
    }

    static {
        Bitmap.Config[] configArr = {Bitmap.Config.ARGB_8888, null};
        if (Build.VERSION.SDK_INT >= 26) {
            configArr = (Bitmap.Config[]) Arrays.copyOf(configArr, 3);
            configArr[configArr.length - 1] = Bitmap.Config.RGBA_F16;
        }
        f54166d = configArr;
        f54167e = configArr;
        f54168f = new Bitmap.Config[]{Bitmap.Config.RGB_565};
        f54169g = new Bitmap.Config[]{Bitmap.Config.ARGB_4444};
        f54170h = new Bitmap.Config[]{Bitmap.Config.ALPHA_8};
    }

    private void f(Integer num, Bitmap bitmap) {
        NavigableMap navigableMapJ = j(bitmap.getConfig());
        Integer num2 = (Integer) navigableMapJ.get(num);
        if (num2 != null) {
            if (num2.intValue() == 1) {
                navigableMapJ.remove(num);
                return;
            } else {
                navigableMapJ.put(num, Integer.valueOf(num2.intValue() - 1));
                return;
            }
        }
        throw new NullPointerException("Tried to decrement empty size, size: " + num + ", removed: " + a(bitmap) + ", this: " + this);
    }

    private b g(int i10, Bitmap.Config config) {
        b bVarE = this.f54171a.e(i10, config);
        for (Bitmap.Config config2 : i(config)) {
            Integer num = (Integer) j(config2).ceilingKey(Integer.valueOf(i10));
            if (num != null && num.intValue() <= i10 * 8) {
                if (num.intValue() == i10 && (config2 != null ? config2.equals(config) : config == null)) {
                    break;
                    break;
                }
                this.f54171a.c(bVarE);
                return this.f54171a.e(num.intValue(), config2);
            }
        }
        return bVarE;
    }

    static String h(int i10, Bitmap.Config config) {
        return "[" + i10 + "](" + config + ")";
    }

    private static Bitmap.Config[] i(Bitmap.Config config) {
        if (Build.VERSION.SDK_INT >= 26 && Bitmap.Config.RGBA_F16.equals(config)) {
            return f54167e;
        }
        int i10 = a.f54174a[config.ordinal()];
        if (i10 == 1) {
            return f54166d;
        }
        if (i10 == 2) {
            return f54168f;
        }
        if (i10 != 3) {
            return i10 != 4 ? new Bitmap.Config[]{config} : f54170h;
        }
        return f54169g;
    }

    private NavigableMap j(Bitmap.Config config) {
        NavigableMap navigableMap = (NavigableMap) this.f54173c.get(config);
        if (navigableMap != null) {
            return navigableMap;
        }
        TreeMap treeMap = new TreeMap();
        this.f54173c.put(config, treeMap);
        return treeMap;
    }

    @Override // u5.l
    public String a(Bitmap bitmap) {
        return h(m6.l.h(bitmap), bitmap.getConfig());
    }

    @Override // u5.l
    public String b(int i10, int i11, Bitmap.Config config) {
        return h(m6.l.g(i10, i11, config), config);
    }

    @Override // u5.l
    public int c(Bitmap bitmap) {
        return m6.l.h(bitmap);
    }

    @Override // u5.l
    public void d(Bitmap bitmap) {
        b bVarE = this.f54171a.e(m6.l.h(bitmap), bitmap.getConfig());
        this.f54172b.d(bVarE, bitmap);
        NavigableMap navigableMapJ = j(bitmap.getConfig());
        Integer num = (Integer) navigableMapJ.get(Integer.valueOf(bVarE.f54176b));
        navigableMapJ.put(Integer.valueOf(bVarE.f54176b), Integer.valueOf(num != null ? 1 + num.intValue() : 1));
    }

    @Override // u5.l
    public Bitmap e(int i10, int i11, Bitmap.Config config) {
        b bVarG = g(m6.l.g(i10, i11, config), config);
        Bitmap bitmap = (Bitmap) this.f54172b.a(bVarG);
        if (bitmap != null) {
            f(Integer.valueOf(bVarG.f54176b), bitmap);
            bitmap.reconfigure(i10, i11, config);
        }
        return bitmap;
    }

    @Override // u5.l
    public Bitmap removeLast() {
        Bitmap bitmap = (Bitmap) this.f54172b.f();
        if (bitmap != null) {
            f(Integer.valueOf(m6.l.h(bitmap)), bitmap);
        }
        return bitmap;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("SizeConfigStrategy{groupedMap=");
        sb2.append(this.f54172b);
        sb2.append(", sortedSizes=(");
        for (Map.Entry entry : this.f54173c.entrySet()) {
            sb2.append(entry.getKey());
            sb2.append('[');
            sb2.append(entry.getValue());
            sb2.append("], ");
        }
        if (!this.f54173c.isEmpty()) {
            sb2.replace(sb2.length() - 2, sb2.length(), "");
        }
        sb2.append(")}");
        return sb2.toString();
    }
}
