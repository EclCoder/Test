package zo;

import java.util.Date;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes7.dex */
public class c extends d implements uo.k {
    private static final long serialVersionUID = -7744598295706617057L;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private String f59027j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int[] f59028k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private boolean f59029l;

    public c(String str, String str2) {
        super(str, str2);
    }

    @Override // zo.d
    public Object clone() {
        c cVar = (c) super.clone();
        int[] iArr = this.f59028k;
        if (iArr != null) {
            cVar.f59028k = (int[]) iArr.clone();
        }
        return cVar;
    }

    @Override // zo.d, uo.c
    public int[] getPorts() {
        return this.f59028k;
    }

    @Override // uo.k
    public void i(boolean z10) {
        this.f59029l = z10;
    }

    @Override // uo.k
    public void k(String str) {
        this.f59027j = str;
    }

    @Override // zo.d, uo.c
    public boolean l(Date date) {
        return this.f59029l || super.l(date);
    }

    @Override // uo.k
    public void m(int[] iArr) {
        this.f59028k = iArr;
    }
}
