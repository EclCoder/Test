package n0;

import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public final class l {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    static final l f46691b = new l("", 0, 0, 1.0f, 0, 0, 0, 1.0f);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final a f46692a;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private interface a {
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static class b implements a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f46693a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final float f46694b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final int f46695c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final int f46696d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final int f46697e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final int f46698f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final int f46699g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private final float f46700h;

        b(String str, int i10, int i11, float f10, int i12, int i13, int i14, float f11) {
            this.f46693a = str;
            this.f46695c = i10;
            this.f46696d = i11;
            this.f46694b = f10;
            this.f46697e = i12;
            this.f46698f = i13;
            this.f46699g = i14;
            this.f46700h = f11;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return Objects.equals(this.f46693a, bVar.f46693a) && this.f46695c == bVar.f46695c && this.f46696d == bVar.f46696d && this.f46694b == bVar.f46694b && this.f46697e == bVar.f46697e && this.f46698f == bVar.f46698f && this.f46699g == bVar.f46699g && this.f46700h == bVar.f46700h;
        }

        public int hashCode() {
            return Objects.hash(this.f46693a, Integer.valueOf(this.f46695c), Integer.valueOf(this.f46696d), Float.valueOf(this.f46694b), Integer.valueOf(this.f46697e), Integer.valueOf(this.f46698f), Integer.valueOf(this.f46699g), Float.valueOf(this.f46700h));
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("DisplayShapeCompat{ spec=");
            String str = this.f46693a;
            sb2.append(str != null ? Integer.valueOf(str.hashCode()) : "null");
            sb2.append(" displayWidth=");
            sb2.append(this.f46695c);
            sb2.append(" displayHeight=");
            sb2.append(this.f46696d);
            sb2.append(" physicalPixelDisplaySizeRatio=");
            sb2.append(this.f46694b);
            sb2.append(" rotation=");
            sb2.append(this.f46697e);
            sb2.append(" offsetX=");
            sb2.append(this.f46698f);
            sb2.append(" offsetY=");
            sb2.append(this.f46699g);
            sb2.append(" scale=");
            sb2.append(this.f46700h);
            sb2.append("}");
            return sb2.toString();
        }
    }

    private l(String str, int i10, int i11, float f10, int i12, int i13, int i14, float f11) {
        this.f46692a = new b(str, i10, i11, f10, i12, i13, i14, f11);
    }

    public static l a(int i10, int i11, boolean z10, int i12, int i13, int i14, int i15) {
        return new l(b(i10, i11, z10, i12, i13, i14, i15), i10, i11, 1.0f, 0, 0, 0, 1.0f);
    }

    private static String b(int i10, int i11, boolean z10, int i12, int i13, int i14, int i15) {
        if (z10) {
            int i16 = i10 / 2;
            int i17 = i11 / 2;
            return "M0," + i17 + " A" + i16 + "," + i17 + " 0 1,1 " + i10 + "," + i17 + " A" + i16 + "," + i17 + " 0 1,1 0," + i17 + " Z";
        }
        StringBuilder sb2 = new StringBuilder();
        int iMin = Math.min(i10 / 2, i11 / 2);
        int iMin2 = Math.min(iMin, i12);
        int iMin3 = Math.min(iMin, i13);
        int iMin4 = Math.min(iMin, i14);
        int iMin5 = Math.min(iMin, i15);
        sb2.append("M ");
        sb2.append(iMin2);
        sb2.append(",0");
        sb2.append(" L ");
        sb2.append(i10 - iMin3);
        sb2.append(",0");
        if (iMin3 > 0) {
            sb2.append(" A ");
            sb2.append(iMin3);
            sb2.append(",");
            sb2.append(iMin3);
            sb2.append(" 0 0,1 ");
            sb2.append(i10);
            sb2.append(",");
            sb2.append(iMin3);
        }
        sb2.append(" L ");
        sb2.append(i10);
        sb2.append(",");
        sb2.append(i11 - iMin4);
        if (iMin4 > 0) {
            sb2.append(" A ");
            sb2.append(iMin4);
            sb2.append(",");
            sb2.append(iMin4);
            sb2.append(" 0 0,1 ");
            sb2.append(i10 - iMin4);
            sb2.append(",");
            sb2.append(i11);
        }
        sb2.append(" L ");
        sb2.append(iMin5);
        sb2.append(",");
        sb2.append(i11);
        if (iMin5 > 0) {
            sb2.append(" A ");
            sb2.append(iMin5);
            sb2.append(",");
            sb2.append(iMin5);
            sb2.append(" 0 0,1 ");
            sb2.append(0);
            sb2.append(",");
            sb2.append(i11 - iMin5);
        }
        if (iMin2 > 0) {
            sb2.append(" L ");
            sb2.append(0);
            sb2.append(",");
            sb2.append(iMin2);
            sb2.append(" A ");
            sb2.append(iMin2);
            sb2.append(",");
            sb2.append(iMin2);
            sb2.append(" 0 0,1 ");
            sb2.append(iMin2);
            sb2.append(",");
            sb2.append(0);
        }
        sb2.append(" Z");
        return sb2.toString();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof l) {
            return Objects.equals(this.f46692a, ((l) obj).f46692a);
        }
        return false;
    }

    public int hashCode() {
        return Objects.hashCode(this.f46692a);
    }

    public String toString() {
        return this.f46692a.toString();
    }
}
