package v;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class i extends c {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    double f54952d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    double f54953e;

    i(String str) {
        this.f54897a = str;
        int iIndexOf = str.indexOf(40);
        int iIndexOf2 = str.indexOf(44, iIndexOf);
        this.f54952d = Double.parseDouble(str.substring(iIndexOf + 1, iIndexOf2).trim());
        int i10 = iIndexOf2 + 1;
        this.f54953e = Double.parseDouble(str.substring(i10, str.indexOf(44, i10)).trim());
    }

    private double d(double d10) {
        double d11 = this.f54953e;
        if (d10 < d11) {
            double d12 = this.f54952d;
            return ((d12 * d11) * d11) / ((((d11 - d10) * d12) + d10) * ((d12 * (d11 - d10)) + d10));
        }
        double d13 = this.f54952d;
        return (((d11 - 1.0d) * d13) * (d11 - 1.0d)) / (((((-d13) * (d11 - d10)) - d10) + 1.0d) * ((((-d13) * (d11 - d10)) - d10) + 1.0d));
    }

    private double e(double d10) {
        double d11 = this.f54953e;
        return d10 < d11 ? (d11 * d10) / (d10 + (this.f54952d * (d11 - d10))) : ((1.0d - d11) * (d10 - 1.0d)) / ((1.0d - d10) - (this.f54952d * (d11 - d10)));
    }

    @Override // v.c
    public double a(double d10) {
        return e(d10);
    }

    @Override // v.c
    public double b(double d10) {
        return d(d10);
    }
}
