package v;

import java.lang.reflect.Array;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public abstract class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private v.b f54905a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private b f54906b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f54907c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f54908d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f54909e = null;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f54910f = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    ArrayList f54911g = new ArrayList();

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class a implements Comparator {
        a() {
        }

        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(c cVar, c cVar2) {
            return Integer.compare(cVar.f54929a, cVar2.f54929a);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f54913a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        h f54914b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final int f54915c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final int f54916d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final int f54917e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        float[] f54918f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        double[] f54919g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        float[] f54920h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        float[] f54921i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        float[] f54922j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        float[] f54923k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        int f54924l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        v.b f54925m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        double[] f54926n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        double[] f54927o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        float f54928p;

        b(int i10, String str, int i11, int i12) {
            h hVar = new h();
            this.f54914b = hVar;
            this.f54915c = 0;
            this.f54916d = 1;
            this.f54917e = 2;
            this.f54924l = i10;
            this.f54913a = i11;
            hVar.g(i10, str);
            this.f54918f = new float[i12];
            this.f54919g = new double[i12];
            this.f54920h = new float[i12];
            this.f54921i = new float[i12];
            this.f54922j = new float[i12];
            this.f54923k = new float[i12];
        }

        public double a(float f10) {
            v.b bVar = this.f54925m;
            if (bVar != null) {
                double d10 = f10;
                bVar.g(d10, this.f54927o);
                this.f54925m.d(d10, this.f54926n);
            } else {
                double[] dArr = this.f54927o;
                dArr[0] = 0.0d;
                dArr[1] = 0.0d;
                dArr[2] = 0.0d;
            }
            double d11 = f10;
            double dE = this.f54914b.e(d11, this.f54926n[1]);
            double d12 = this.f54914b.d(d11, this.f54926n[1], this.f54927o[1]);
            double[] dArr2 = this.f54927o;
            return dArr2[0] + (dE * dArr2[2]) + (d12 * this.f54926n[2]);
        }

        public double b(float f10) {
            v.b bVar = this.f54925m;
            if (bVar != null) {
                bVar.d(f10, this.f54926n);
            } else {
                double[] dArr = this.f54926n;
                dArr[0] = this.f54921i[0];
                dArr[1] = this.f54922j[0];
                dArr[2] = this.f54918f[0];
            }
            double[] dArr2 = this.f54926n;
            return dArr2[0] + (this.f54914b.e(f10, dArr2[1]) * this.f54926n[2]);
        }

        public void c(int i10, int i11, float f10, float f11, float f12, float f13) {
            this.f54919g[i10] = ((double) i11) / 100.0d;
            this.f54920h[i10] = f10;
            this.f54921i[i10] = f11;
            this.f54922j[i10] = f12;
            this.f54918f[i10] = f13;
        }

        public void d(float f10) {
            this.f54928p = f10;
            double[][] dArr = (double[][]) Array.newInstance((Class<?>) Double.TYPE, this.f54919g.length, 3);
            float[] fArr = this.f54918f;
            this.f54926n = new double[fArr.length + 2];
            this.f54927o = new double[fArr.length + 2];
            if (this.f54919g[0] > 0.0d) {
                this.f54914b.a(0.0d, this.f54920h[0]);
            }
            double[] dArr2 = this.f54919g;
            int length = dArr2.length - 1;
            if (dArr2[length] < 1.0d) {
                this.f54914b.a(1.0d, this.f54920h[length]);
            }
            for (int i10 = 0; i10 < dArr.length; i10++) {
                double[] dArr3 = dArr[i10];
                dArr3[0] = this.f54921i[i10];
                dArr3[1] = this.f54922j[i10];
                dArr3[2] = this.f54918f[i10];
                this.f54914b.a(this.f54919g[i10], this.f54920h[i10]);
            }
            this.f54914b.f();
            double[] dArr4 = this.f54919g;
            if (dArr4.length > 1) {
                this.f54925m = v.b.a(0, dArr4, dArr);
            } else {
                this.f54925m = null;
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f54929a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        float f54930b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        float f54931c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        float f54932d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        float f54933e;

        c(int i10, float f10, float f11, float f12, float f13) {
            this.f54929a = i10;
            this.f54930b = f13;
            this.f54931c = f11;
            this.f54932d = f10;
            this.f54933e = f12;
        }
    }

    public float a(float f10) {
        return (float) this.f54906b.b(f10);
    }

    public float b(float f10) {
        return (float) this.f54906b.a(f10);
    }

    public void d(int i10, int i11, String str, int i12, float f10, float f11, float f12, float f13) {
        this.f54911g.add(new c(i10, f10, f11, f12, f13));
        if (i12 != -1) {
            this.f54910f = i12;
        }
        this.f54908d = i11;
        this.f54909e = str;
    }

    public void e(int i10, int i11, String str, int i12, float f10, float f11, float f12, float f13, Object obj) {
        this.f54911g.add(new c(i10, f10, f11, f12, f13));
        if (i12 != -1) {
            this.f54910f = i12;
        }
        this.f54908d = i11;
        c(obj);
        this.f54909e = str;
    }

    public void f(String str) {
        this.f54907c = str;
    }

    public void g(float f10) {
        int size = this.f54911g.size();
        if (size == 0) {
            return;
        }
        Collections.sort(this.f54911g, new a());
        double[] dArr = new double[size];
        char c10 = 2;
        double[][] dArr2 = (double[][]) Array.newInstance((Class<?>) Double.TYPE, size, 3);
        this.f54906b = new b(this.f54908d, this.f54909e, this.f54910f, size);
        ArrayList arrayList = this.f54911g;
        int size2 = arrayList.size();
        int i10 = 0;
        int i11 = 0;
        while (i10 < size2) {
            int i12 = i10 + 1;
            c cVar = (c) arrayList.get(i10);
            float f11 = cVar.f54932d;
            dArr[i11] = ((double) f11) * 0.01d;
            double[] dArr3 = dArr2[i11];
            float f12 = cVar.f54930b;
            dArr3[0] = f12;
            float f13 = cVar.f54931c;
            char c11 = c10;
            dArr3[1] = f13;
            float f14 = cVar.f54933e;
            dArr3[c11] = f14;
            this.f54906b.c(i11, cVar.f54929a, f11, f13, f14, f12);
            i11++;
            i10 = i12;
            c10 = c11;
            dArr2 = dArr2;
        }
        this.f54906b.d(f10);
        this.f54905a = v.b.a(0, dArr, dArr2);
    }

    public boolean h() {
        return this.f54910f == 1;
    }

    public String toString() {
        String str = this.f54907c;
        DecimalFormat decimalFormat = new DecimalFormat("##.##");
        ArrayList arrayList = this.f54911g;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            c cVar = (c) obj;
            str = str + "[" + cVar.f54929a + " , " + decimalFormat.format(cVar.f54930b) + "] ";
        }
        return str;
    }

    protected void c(Object obj) {
    }
}
