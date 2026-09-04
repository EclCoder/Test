package pb;

import com.coremedia.iso.boxes.sampleentry.VisualSampleEntry;
import ob.d0;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f49839a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f49840b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f49841c;

    private d(int i10, int i11, String str) {
        this.f49839a = i10;
        this.f49840b = i11;
        this.f49841c = str;
    }

    public static d a(d0 d0Var) {
        String str;
        d0Var.V(2);
        int iH = d0Var.H();
        int i10 = iH >> 1;
        int iH2 = ((d0Var.H() >> 3) & 31) | ((iH & 1) << 5);
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
        sb2.append(iH2 >= 10 ? "." : ".0");
        sb2.append(iH2);
        return new d(i10, iH2, sb2.toString());
    }
}
