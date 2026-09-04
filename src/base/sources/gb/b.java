package gb;

import android.text.TextUtils;
import com.bytedance.sdk.openadsdk.gjv.wGW.dOIDCKnIR;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f39044a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f39045b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f39046c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f39047d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f39048e;

    private b(int i10, int i11, int i12, int i13, int i14) {
        this.f39044a = i10;
        this.f39045b = i11;
        this.f39046c = i12;
        this.f39047d = i13;
        this.f39048e = i14;
    }

    public static b a(String str) {
        ob.a.a(str.startsWith("Format:"));
        String[] strArrSplit = TextUtils.split(str.substring(7), dOIDCKnIR.kuMl);
        int i10 = -1;
        int i11 = -1;
        int i12 = -1;
        int i13 = -1;
        for (int i14 = 0; i14 < strArrSplit.length; i14++) {
            String strE = sc.c.e(strArrSplit[i14].trim());
            strE.getClass();
            switch (strE) {
                case "end":
                    i11 = i14;
                    break;
                case "text":
                    i13 = i14;
                    break;
                case "start":
                    i10 = i14;
                    break;
                case "style":
                    i12 = i14;
                    break;
            }
        }
        if (i10 == -1 || i11 == -1 || i13 == -1) {
            return null;
        }
        return new b(i10, i11, i12, i13, strArrSplit.length);
    }
}
