package vp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes7.dex */
public class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final d f55715a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final d f55716b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final d f55717c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final d f55718d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final d f55719e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final d f55720f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final d f55721g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final d f55722h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final d f55723i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final d f55724j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final d f55725k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final d f55726l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final /* synthetic */ d[] f55727m;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static enum a extends d {
        a(String str, int i10) {
            super(str, i10, null);
        }
    }

    static {
        d dVar = new d("LOGIC", 0);
        f55715a = dVar;
        a aVar = new a("BYTE", 1);
        f55716b = aVar;
        d dVar2 = new d("UNSIGNED_BYTE", 2) { // from class: vp.d.b
            {
                a aVar2 = null;
            }
        };
        f55717c = dVar2;
        d dVar3 = new d("SHORT", 3) { // from class: vp.d.c
            {
                a aVar2 = null;
            }
        };
        f55718d = dVar3;
        d dVar4 = new d("INT", 4) { // from class: vp.d.d
            {
                a aVar2 = null;
            }
        };
        f55719e = dVar4;
        d dVar5 = new d("LONG", 5) { // from class: vp.d.e
            {
                a aVar2 = null;
            }
        };
        f55720f = dVar5;
        d dVar6 = new d("FLOAT", 6) { // from class: vp.d.f
            {
                a aVar2 = null;
            }
        };
        f55721g = dVar6;
        d dVar7 = new d("DOUBLE", 7) { // from class: vp.d.g
            {
                a aVar2 = null;
            }
        };
        f55722h = dVar7;
        d dVar8 = new d("COMPLEX_FLOAT", 8) { // from class: vp.d.h
            {
                a aVar2 = null;
            }
        };
        f55723i = dVar8;
        d dVar9 = new d("COMPLEX_DOUBLE", 9) { // from class: vp.d.i
            {
                a aVar2 = null;
            }
        };
        f55724j = dVar9;
        d dVar10 = new d("STRING", 10);
        f55725k = dVar10;
        d dVar11 = new d("OBJECT", 11);
        f55726l = dVar11;
        f55727m = new d[]{dVar, aVar, dVar2, dVar3, dVar4, dVar5, dVar6, dVar7, dVar8, dVar9, dVar10, dVar11};
    }

    private d(String str, int i10) {
        super(str, i10);
    }

    public static d valueOf(String str) {
        return (d) Enum.valueOf(d.class, str);
    }

    public static d[] values() {
        return (d[]) f55727m.clone();
    }

    /* synthetic */ d(String str, int i10, a aVar) {
        this(str, i10);
    }
}
