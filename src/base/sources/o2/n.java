package o2;

import com.coremedia.iso.boxes.sampleentry.VisualSampleEntry;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public final class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f48116a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f48117b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f48118c;

    private n(int i10, int i11, String str) {
        this.f48116a = i10;
        this.f48117b = i11;
        this.f48118c = str;
    }

    public static n a(w1.u uVar) {
        String str;
        uVar.U(2);
        int iG = uVar.G();
        int i10 = iG >> 1;
        int iG2 = ((uVar.G() >> 3) & 31) | ((iG & 1) << 5);
        if (i10 == 4 || i10 == 5 || i10 == 7) {
            str = "dvhe";
        } else if (i10 == 8) {
            str = VisualSampleEntry.TYPE7;
        } else {
            if (i10 != 9) {
                return null;
            }
            str = VisualSampleEntry.TYPE4;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str);
        sb2.append(".0");
        sb2.append(i10);
        sb2.append(iG2 >= 10 ? "." : ".0");
        sb2.append(iG2);
        return new n(i10, iG2, sb2.toString());
    }
}
