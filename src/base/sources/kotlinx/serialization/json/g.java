package kotlinx.serialization.json;

import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f43664a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f43665b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f43666c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final boolean f43667d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final boolean f43668e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final boolean f43669f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final String f43670g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final boolean f43671h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final boolean f43672i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final String f43673j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final boolean f43674k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final boolean f43675l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final boolean f43676m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final boolean f43677n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final boolean f43678o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private a f43679p;

    public g(boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, String prettyPrintIndent, boolean z16, boolean z17, String classDiscriminator, boolean z18, boolean z19, z zVar, boolean z20, boolean z21, boolean z22, a classDiscriminatorMode) {
        kotlin.jvm.internal.s.h(prettyPrintIndent, "prettyPrintIndent");
        kotlin.jvm.internal.s.h(classDiscriminator, "classDiscriminator");
        kotlin.jvm.internal.s.h(classDiscriminatorMode, "classDiscriminatorMode");
        this.f43664a = z10;
        this.f43665b = z11;
        this.f43666c = z12;
        this.f43667d = z13;
        this.f43668e = z14;
        this.f43669f = z15;
        this.f43670g = prettyPrintIndent;
        this.f43671h = z16;
        this.f43672i = z17;
        this.f43673j = classDiscriminator;
        this.f43674k = z18;
        this.f43675l = z19;
        this.f43676m = z20;
        this.f43677n = z21;
        this.f43678o = z22;
        this.f43679p = classDiscriminatorMode;
    }

    public final boolean a() {
        return this.f43678o;
    }

    public final boolean b() {
        return this.f43674k;
    }

    public final boolean c() {
        return this.f43667d;
    }

    public final boolean d() {
        return this.f43677n;
    }

    public final String e() {
        return this.f43673j;
    }

    public final a f() {
        return this.f43679p;
    }

    public final boolean g() {
        return this.f43671h;
    }

    public final boolean h() {
        return this.f43676m;
    }

    public final boolean i() {
        return this.f43664a;
    }

    public final boolean j() {
        return this.f43669f;
    }

    public final boolean k() {
        return this.f43665b;
    }

    public final z l() {
        return null;
    }

    public final boolean m() {
        return this.f43668e;
    }

    public final String n() {
        return this.f43670g;
    }

    public final boolean o() {
        return this.f43675l;
    }

    public final boolean p() {
        return this.f43672i;
    }

    public final boolean q() {
        return this.f43666c;
    }

    public String toString() {
        return "JsonConfiguration(encodeDefaults=" + this.f43664a + ", ignoreUnknownKeys=" + this.f43665b + ", isLenient=" + this.f43666c + ", allowStructuredMapKeys=" + this.f43667d + ", prettyPrint=" + this.f43668e + ", explicitNulls=" + this.f43669f + ", prettyPrintIndent='" + this.f43670g + "', coerceInputValues=" + this.f43671h + ", useArrayPolymorphism=" + this.f43672i + ", classDiscriminator='" + this.f43673j + "', allowSpecialFloatingPointValues=" + this.f43674k + ", useAlternativeNames=" + this.f43675l + ", namingStrategy=" + ((Object) null) + ", decodeEnumsCaseInsensitive=" + this.f43676m + ", allowTrailingComma=" + this.f43677n + ", allowComments=" + this.f43678o + ", classDiscriminatorMode=" + this.f43679p + ')';
    }

    public /* synthetic */ g(boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, String str, boolean z16, boolean z17, String str2, boolean z18, boolean z19, z zVar, boolean z20, boolean z21, boolean z22, a aVar, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? false : z10, (i10 & 2) != 0 ? false : z11, (i10 & 4) != 0 ? false : z12, (i10 & 8) != 0 ? false : z13, (i10 & 16) != 0 ? false : z14, (i10 & 32) != 0 ? true : z15, (i10 & 64) != 0 ? "    " : str, (i10 & 128) != 0 ? false : z16, (i10 & 256) != 0 ? false : z17, (i10 & 512) != 0 ? "type" : str2, (i10 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? false : z18, (i10 & 2048) == 0 ? z19 : true, (i10 & 4096) != 0 ? null : zVar, (i10 & 8192) != 0 ? false : z20, (i10 & 16384) != 0 ? false : z21, (i10 & 32768) != 0 ? false : z22, (i10 & C.DEFAULT_BUFFER_SEGMENT_SIZE) != 0 ? a.POLYMORPHIC : aVar);
    }
}
