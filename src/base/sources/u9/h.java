package u9;

import android.net.Uri;
import ea.h0;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import ob.n0;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class h implements p {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final int[] f54285o = {5, 4, 12, 8, 3, 10, 9, 11, 6, 2, 0, 1, 7, 16, 15, 14};

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final a f54286p = new a(new a.InterfaceC0817a() { // from class: u9.f
        @Override // u9.h.a.InterfaceC0817a
        public final Constructor a() {
            return h.f();
        }
    });

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static final a f54287q = new a(new a.InterfaceC0817a() { // from class: u9.g
        @Override // u9.h.a.InterfaceC0817a
        public final Constructor a() {
            return h.g();
        }
    });

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f54288b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f54289c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f54290d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f54291e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f54292f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f54293g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f54294h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f54295i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f54296j;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f54298l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private com.google.common.collect.c0 f54299m;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f54297k = 1;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f54300n = 112800;

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final InterfaceC0817a f54301a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final AtomicBoolean f54302b = new AtomicBoolean(false);

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private Constructor f54303c;

        /* JADX INFO: renamed from: u9.h$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
        public interface InterfaceC0817a {
            Constructor a();
        }

        public a(InterfaceC0817a interfaceC0817a) {
            this.f54301a = interfaceC0817a;
        }

        private Constructor b() {
            synchronized (this.f54302b) {
                if (this.f54302b.get()) {
                    return this.f54303c;
                }
                try {
                    return this.f54301a.a();
                } catch (ClassNotFoundException unused) {
                    this.f54302b.set(true);
                    return this.f54303c;
                } catch (Exception e10) {
                    throw new RuntimeException("Error instantiating extension", e10);
                }
            }
        }

        public k a(Object... objArr) {
            Constructor constructorB = b();
            if (constructorB == null) {
                return null;
            }
            try {
                return (k) constructorB.newInstance(objArr);
            } catch (Exception e10) {
                throw new IllegalStateException("Unexpected error creating extractor", e10);
            }
        }
    }

    private void e(int i10, List list) {
        switch (i10) {
            case 0:
                list.add(new ea.b());
                break;
            case 1:
                list.add(new ea.e());
                break;
            case 2:
                list.add(new ea.h((this.f54289c ? 2 : 0) | ((this.f54290d | (this.f54288b ? 1 : 0)) == true ? 1 : 0)));
                break;
            case 3:
                list.add(new v9.b((this.f54289c ? 2 : 0) | this.f54291e | (this.f54288b ? 1 : 0)));
                break;
            case 4:
                k kVarA = f54286p.a(Integer.valueOf(this.f54292f));
                if (kVarA == null) {
                    list.add(new x9.d(this.f54292f));
                } else {
                    list.add(kVarA);
                }
                break;
            case 5:
                list.add(new com.google.android.exoplayer2.extractor.flv.b());
                break;
            case 6:
                list.add(new aa.e(this.f54293g));
                break;
            case 7:
                list.add(new ba.f((this.f54289c ? 2 : 0) | this.f54296j | (this.f54288b ? 1 : 0)));
                break;
            case 8:
                list.add(new ca.g(this.f54295i));
                list.add(new ca.k(this.f54294h));
                break;
            case 9:
                list.add(new da.d());
                break;
            case 10:
                list.add(new ea.a0());
                break;
            case 11:
                if (this.f54299m == null) {
                    this.f54299m = com.google.common.collect.c0.C();
                }
                list.add(new h0(this.f54297k, new n0(0L), new ea.j(this.f54298l, this.f54299m), this.f54300n));
                break;
            case 12:
                list.add(new fa.b());
                break;
            case 14:
                list.add(new z9.a());
                break;
            case 15:
                k kVarA2 = f54287q.a(new Object[0]);
                if (kVarA2 != null) {
                    list.add(kVarA2);
                }
                break;
            case 16:
                list.add(new w9.b());
                break;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Constructor f() {
        if (Boolean.TRUE.equals(Class.forName("com.google.android.exoplayer2.ext.flac.FlacLibrary").getMethod("isAvailable", null).invoke(null, null))) {
            return Class.forName("com.google.android.exoplayer2.ext.flac.FlacExtractor").asSubclass(k.class).getConstructor(Integer.TYPE);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Constructor g() {
        return Class.forName("com.google.android.exoplayer2.decoder.midi.MidiExtractor").asSubclass(k.class).getConstructor(null);
    }

    @Override // u9.p
    public synchronized k[] a(Uri uri, Map map) {
        ArrayList arrayList;
        try {
            int[] iArr = f54285o;
            arrayList = new ArrayList(iArr.length);
            int iB = ob.n.b(map);
            if (iB != -1) {
                e(iB, arrayList);
            }
            int iC = ob.n.c(uri);
            if (iC != -1 && iC != iB) {
                e(iC, arrayList);
            }
            for (int i10 : iArr) {
                if (i10 != iB && i10 != iC) {
                    e(i10, arrayList);
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return (k[]) arrayList.toArray(new k[arrayList.size()]);
    }

    @Override // u9.p
    public synchronized k[] createExtractors() {
        return a(Uri.EMPTY, new HashMap());
    }
}
