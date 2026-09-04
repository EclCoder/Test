package p3;

import android.text.TextUtils;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f49466a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f49467b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f49468c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f49469d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f49470e;

    private a(int i10, int i11, int i12, int i13, int i14) {
        this.f49466a = i10;
        this.f49467b = i11;
        this.f49468c = i12;
        this.f49469d = i13;
        this.f49470e = i14;
    }

    public static a a(String str) {
        w1.a.a(str.startsWith("Format:"));
        String[] strArrSplit = TextUtils.split(str.substring(7), ",");
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
        return new a(i10, i11, i12, i13, strArrSplit.length);
    }
}
