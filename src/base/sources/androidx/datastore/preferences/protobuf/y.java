package androidx.datastore.preferences.protobuf;

import com.bytedance.adsdk.ugeno.dkl.Rmg.PvZsvNiPV;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'e' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:485)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:422)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:351)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:284)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:153)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes2.dex */
public final class y {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final y f3761d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final y f3762e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final y f3763f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final y f3764g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final y f3765h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final y f3766i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final y f3767j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final y f3768k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final y f3769l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final y f3770m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final /* synthetic */ y[] f3771n;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Class f3772a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Class f3773b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Object f3774c;

    private y(String str, int i10, Class cls, Class cls2, Object obj) {
        super(str, i10);
        this.f3772a = cls;
        this.f3773b = cls2;
        this.f3774c = obj;
    }

    public static y valueOf(String str) {
        return (y) Enum.valueOf(y.class, str);
    }

    public static y[] values() {
        return (y[]) f3771n.clone();
    }

    public Class d() {
        return this.f3773b;
    }

    static {
        y yVar = new y(PvZsvNiPV.WYSfUJgAKh, 0, Void.class, Void.class, null);
        f3761d = yVar;
        Class cls = Integer.TYPE;
        y yVar2 = new y("INT", 1, cls, Integer.class, 0);
        f3762e = yVar2;
        y yVar3 = new y("LONG", 2, Long.TYPE, Long.class, 0L);
        f3763f = yVar3;
        y yVar4 = new y("FLOAT", 3, Float.TYPE, Float.class, Float.valueOf(0.0f));
        f3764g = yVar4;
        y yVar5 = new y("DOUBLE", 4, Double.TYPE, Double.class, Double.valueOf(0.0d));
        f3765h = yVar5;
        y yVar6 = new y("BOOLEAN", 5, Boolean.TYPE, Boolean.class, Boolean.FALSE);
        f3766i = yVar6;
        y yVar7 = new y("STRING", 6, String.class, String.class, "");
        f3767j = yVar7;
        y yVar8 = new y("BYTE_STRING", 7, g.class, g.class, g.f3535b);
        f3768k = yVar8;
        y yVar9 = new y("ENUM", 8, cls, Integer.class, null);
        f3769l = yVar9;
        y yVar10 = new y("MESSAGE", 9, Object.class, Object.class, null);
        f3770m = yVar10;
        f3771n = new y[]{yVar, yVar2, yVar3, yVar4, yVar5, yVar6, yVar7, yVar8, yVar9, yVar10};
    }
}
