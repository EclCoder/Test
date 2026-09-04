package bm;

import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.nio.charset.Charset;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final d f9078a = new d();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Charset f9079b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Charset f9080c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Charset f9081d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Charset f9082e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final Charset f9083f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final Charset f9084g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static volatile Charset f9085h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static volatile Charset f9086i;

    static {
        Charset charsetForName = Charset.forName(C.UTF8_NAME);
        kotlin.jvm.internal.s.g(charsetForName, "forName(...)");
        f9079b = charsetForName;
        Charset charsetForName2 = Charset.forName(C.UTF16_NAME);
        kotlin.jvm.internal.s.g(charsetForName2, "forName(...)");
        f9080c = charsetForName2;
        Charset charsetForName3 = Charset.forName("UTF-16BE");
        kotlin.jvm.internal.s.g(charsetForName3, "forName(...)");
        f9081d = charsetForName3;
        Charset charsetForName4 = Charset.forName("UTF-16LE");
        kotlin.jvm.internal.s.g(charsetForName4, "forName(...)");
        f9082e = charsetForName4;
        Charset charsetForName5 = Charset.forName(C.ASCII_NAME);
        kotlin.jvm.internal.s.g(charsetForName5, "forName(...)");
        f9083f = charsetForName5;
        Charset charsetForName6 = Charset.forName("ISO-8859-1");
        kotlin.jvm.internal.s.g(charsetForName6, "forName(...)");
        f9084g = charsetForName6;
    }

    private d() {
    }

    public final Charset a() {
        Charset charset = f9086i;
        if (charset != null) {
            return charset;
        }
        Charset charsetForName = Charset.forName("UTF-32BE");
        kotlin.jvm.internal.s.g(charsetForName, "forName(...)");
        f9086i = charsetForName;
        return charsetForName;
    }

    public final Charset b() {
        Charset charset = f9085h;
        if (charset != null) {
            return charset;
        }
        Charset charsetForName = Charset.forName("UTF-32LE");
        kotlin.jvm.internal.s.g(charsetForName, "forName(...)");
        f9085h = charsetForName;
        return charsetForName;
    }
}
