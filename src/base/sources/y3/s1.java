package y3;

import android.net.Uri;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public final class s1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final s1 f57297a = new s1();

    private s1() {
    }

    public static /* synthetic */ String c(s1 s1Var, String str, String str2, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            str2 = null;
        }
        return s1Var.b(str, str2);
    }

    public final String a(String s10) {
        kotlin.jvm.internal.s.h(s10, "s");
        String strDecode = Uri.decode(s10);
        kotlin.jvm.internal.s.g(strDecode, "decode(...)");
        return strDecode;
    }

    public final String b(String s10, String str) {
        kotlin.jvm.internal.s.h(s10, "s");
        String strEncode = Uri.encode(s10, str);
        kotlin.jvm.internal.s.g(strEncode, "encode(...)");
        return strEncode;
    }

    public final Uri d(String uriString) {
        kotlin.jvm.internal.s.h(uriString, "uriString");
        Uri uri = Uri.parse(uriString);
        kotlin.jvm.internal.s.g(uri, "parse(...)");
        return uri;
    }
}
