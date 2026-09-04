package o2;

import android.net.Uri;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public final class l implements u {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final int[] f48084r = {5, 4, 12, 8, 3, 10, 9, 11, 6, 2, 0, 1, 7, 16, 15, 14, 17, 18, 19, 20, 21};

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static final a f48085s = new a(new a.InterfaceC0741a() { // from class: o2.j
        @Override // o2.l.a.InterfaceC0741a
        public final Constructor a() {
            return l.i();
        }
    });

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final a f48086t = new a(new a.InterfaceC0741a() { // from class: o2.k
        @Override // o2.l.a.InterfaceC0741a
        public final Constructor a() {
            return l.j();
        }
    });

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f48087b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f48088c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f48089d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f48090e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f48091f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f48092g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f48093h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f48094i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f48095j;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f48097l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private com.google.common.collect.c0 f48098m;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private int f48102q;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f48096k = 1;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f48099n = 112800;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private l3.r.a f48101p = new l3.h();

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private boolean f48100o = true;

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final InterfaceC0741a f48103a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final AtomicBoolean f48104b = new AtomicBoolean(false);

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private Constructor f48105c;

        /* JADX INFO: renamed from: o2.l$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
        public interface InterfaceC0741a {
            Constructor a();
        }

        public a(InterfaceC0741a interfaceC0741a) {
            this.f48103a = interfaceC0741a;
        }

        private Constructor b() {
            synchronized (this.f48104b) {
                if (this.f48104b.get()) {
                    return this.f48105c;
                }
                try {
                    return this.f48103a.a();
                } catch (ClassNotFoundException unused) {
                    this.f48104b.set(true);
                    return this.f48105c;
                } catch (Exception e10) {
                    throw new RuntimeException("Error instantiating extension", e10);
                }
            }
        }

        public p a(Object... objArr) {
            Constructor constructorB = b();
            if (constructorB == null) {
                return null;
            }
            try {
                return (p) constructorB.newInstance(objArr);
            } catch (Exception e10) {
                throw new IllegalStateException("Unexpected error creating extractor", e10);
            }
        }
    }

    private void g(int i10, List list) {
        switch (i10) {
            case 0:
                list.add(new u3.b());
                break;
            case 1:
                list.add(new u3.e());
                break;
            case 2:
                list.add(new u3.h((this.f48088c ? 2 : 0) | ((this.f48089d | (this.f48087b ? 1 : 0)) == true ? 1 : 0)));
                break;
            case 3:
                list.add(new p2.b((this.f48088c ? 2 : 0) | this.f48090e | (this.f48087b ? 1 : 0)));
                break;
            case 4:
                p pVarA = f48085s.a(Integer.valueOf(this.f48091f));
                if (pVarA == null) {
                    list.add(new t2.d(this.f48091f));
                } else {
                    list.add(pVarA);
                }
                break;
            case 5:
                list.add(new androidx.media3.extractor.flv.b());
                break;
            case 6:
                list.add(new g3.e(this.f48101p, (this.f48100o ? 0 : 2) | this.f48092g));
                break;
            case 7:
                list.add(new h3.f((this.f48088c ? 2 : 0) | this.f48095j | (this.f48087b ? 1 : 0)));
                break;
            case 8:
                list.add(new i3.h(this.f48101p, this.f48094i | (this.f48100o ? 0 : 32)));
                list.add(new i3.m(this.f48101p, (this.f48100o ? 0 : 16) | this.f48093h));
                break;
            case 9:
                list.add(new j3.d());
                break;
            case 10:
                list.add(new u3.c0());
                break;
            case 11:
                if (this.f48098m == null) {
                    this.f48098m = com.google.common.collect.c0.C();
                }
                list.add(new u3.j0(this.f48096k, !this.f48100o ? 1 : 0, this.f48101p, new w1.z(0L), new u3.j(this.f48097l, this.f48098m), this.f48099n));
                break;
            case 12:
                list.add(new v3.b());
                break;
            case 14:
                list.add(new w2.a(this.f48102q));
                break;
            case 15:
                p pVarA2 = f48086t.a(new Object[0]);
                if (pVarA2 != null) {
                    list.add(pVarA2);
                }
                break;
            case 16:
                list.add(new q2.b(!this.f48100o ? 1 : 0, this.f48101p));
                break;
            case 17:
                list.add(new k3.a());
                break;
            case 18:
                list.add(new w3.a());
                break;
            case 19:
                list.add(new s2.a());
                break;
            case 20:
                int i11 = this.f48093h;
                if ((i11 & 2) == 0 && (i11 & 4) == 0) {
                    list.add(new v2.a());
                    break;
                }
                break;
            case 21:
                list.add(new r2.a());
                break;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Constructor i() {
        if (Boolean.TRUE.equals(Class.forName("androidx.media3.decoder.flac.FlacLibrary").getMethod("isAvailable", null).invoke(null, null))) {
            return Class.forName("androidx.media3.decoder.flac.FlacExtractor").asSubclass(p.class).getConstructor(Integer.TYPE);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Constructor j() {
        return Class.forName("androidx.media3.decoder.midi.MidiExtractor").asSubclass(p.class).getConstructor(null);
    }

    @Override // o2.u
    public synchronized p[] a(Uri uri, Map map) {
        p[] pVarArr;
        try {
            int[] iArr = f48084r;
            ArrayList arrayList = new ArrayList(iArr.length);
            int iB = t1.m.b(map);
            if (iB != -1) {
                g(iB, arrayList);
            }
            int iC = t1.m.c(uri);
            if (iC != -1 && iC != iB) {
                g(iC, arrayList);
            }
            for (int i10 : iArr) {
                if (i10 != iB && i10 != iC) {
                    g(i10, arrayList);
                }
            }
            pVarArr = new p[arrayList.size()];
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                p sVar = (p) arrayList.get(i11);
                if (this.f48100o && !(sVar.e() instanceof i3.h) && !(sVar.e() instanceof i3.m) && !(sVar.e() instanceof u3.j0) && !(sVar.e() instanceof q2.b) && !(sVar.e() instanceof g3.e)) {
                    sVar = new l3.s(sVar, this.f48101p);
                }
                pVarArr[i11] = sVar;
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return pVarArr;
    }

    @Override // o2.u
    public synchronized p[] createExtractors() {
        return a(Uri.EMPTY, new HashMap());
    }

    @Override // o2.u
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public synchronized l c(boolean z10) {
        this.f48100o = z10;
        return this;
    }

    public synchronized l k(int i10) {
        this.f48102q = i10;
        return this;
    }

    @Override // o2.u
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public synchronized l b(l3.r.a aVar) {
        this.f48101p = aVar;
        return this;
    }
}
