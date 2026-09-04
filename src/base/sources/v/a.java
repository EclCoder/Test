package v;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class a extends b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final double[] f54871a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    C0823a[] f54872b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f54873c = true;

    /* JADX INFO: renamed from: v.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static class C0823a {

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        private static double[] f54874s = new double[91];

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        double[] f54875a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        double f54876b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        double f54877c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        double f54878d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        double f54879e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        double f54880f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        double f54881g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        double f54882h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        double f54883i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        double f54884j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        double f54885k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        double f54886l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        double f54887m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        double f54888n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        double f54889o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        double f54890p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        boolean f54891q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        boolean f54892r;

        C0823a(int i10, double d10, double d11, double d12, double d13, double d14, double d15) {
            this.f54892r = false;
            double d16 = d14 - d12;
            double d17 = d15 - d13;
            if (i10 == 1) {
                this.f54891q = true;
            } else if (i10 == 4) {
                this.f54891q = d17 > 0.0d;
            } else if (i10 != 5) {
                this.f54891q = false;
            } else {
                this.f54891q = d17 < 0.0d;
            }
            this.f54877c = d10;
            this.f54878d = d11;
            this.f54883i = 1.0d / (d11 - d10);
            if (3 == i10) {
                this.f54892r = true;
            }
            if (!this.f54892r && Math.abs(d16) >= 0.001d && Math.abs(d17) >= 0.001d) {
                this.f54875a = new double[101];
                boolean z10 = this.f54891q;
                this.f54884j = d16 * ((double) (z10 ? -1 : 1));
                this.f54885k = d17 * ((double) (z10 ? 1 : -1));
                this.f54886l = z10 ? d14 : d12;
                this.f54887m = z10 ? d13 : d15;
                a(d12, d13, d14, d15);
                this.f54888n = this.f54876b * this.f54883i;
                return;
            }
            this.f54892r = true;
            this.f54879e = d12;
            this.f54880f = d14;
            this.f54881g = d13;
            this.f54882h = d15;
            double dHypot = Math.hypot(d17, d16);
            this.f54876b = dHypot;
            this.f54888n = dHypot * this.f54883i;
            double d18 = this.f54878d;
            double d19 = this.f54877c;
            this.f54886l = d16 / (d18 - d19);
            this.f54887m = d17 / (d18 - d19);
        }

        private void a(double d10, double d11, double d12, double d13) {
            double d14 = d12 - d10;
            double d15 = d11 - d13;
            int i10 = 0;
            double dHypot = 0.0d;
            double d16 = 0.0d;
            double d17 = 0.0d;
            while (true) {
                double[] dArr = f54874s;
                if (i10 >= dArr.length) {
                    break;
                }
                int i11 = i10;
                double radians = Math.toRadians((((double) i10) * 90.0d) / ((double) (dArr.length - 1)));
                double dSin = Math.sin(radians) * d14;
                double dCos = Math.cos(radians) * d15;
                if (i11 > 0) {
                    dHypot += Math.hypot(dSin - d16, dCos - d17);
                    f54874s[i11] = dHypot;
                }
                i10 = i11 + 1;
                d16 = dSin;
                d17 = dCos;
            }
            this.f54876b = dHypot;
            int i12 = 0;
            while (true) {
                double[] dArr2 = f54874s;
                if (i12 >= dArr2.length) {
                    break;
                }
                dArr2[i12] = dArr2[i12] / dHypot;
                i12++;
            }
            int i13 = 0;
            while (true) {
                double[] dArr3 = this.f54875a;
                if (i13 >= dArr3.length) {
                    return;
                }
                double length = ((double) i13) / ((double) (dArr3.length - 1));
                int iBinarySearch = Arrays.binarySearch(f54874s, length);
                if (iBinarySearch >= 0) {
                    this.f54875a[i13] = ((double) iBinarySearch) / ((double) (f54874s.length - 1));
                } else if (iBinarySearch == -1) {
                    this.f54875a[i13] = 0.0d;
                } else {
                    int i14 = -iBinarySearch;
                    int i15 = i14 - 2;
                    double[] dArr4 = f54874s;
                    double d18 = dArr4[i15];
                    this.f54875a[i13] = (((double) i15) + ((length - d18) / (dArr4[i14 - 1] - d18))) / ((double) (dArr4.length - 1));
                }
                i13++;
            }
        }

        double b() {
            double d10 = this.f54884j * this.f54890p;
            double dHypot = this.f54888n / Math.hypot(d10, (-this.f54885k) * this.f54889o);
            return this.f54891q ? (-d10) * dHypot : d10 * dHypot;
        }

        double c() {
            double d10 = this.f54884j * this.f54890p;
            double d11 = (-this.f54885k) * this.f54889o;
            double dHypot = this.f54888n / Math.hypot(d10, d11);
            return this.f54891q ? (-d11) * dHypot : d11 * dHypot;
        }

        public double d(double d10) {
            return this.f54886l;
        }

        public double e(double d10) {
            return this.f54887m;
        }

        public double f(double d10) {
            double d11 = (d10 - this.f54877c) * this.f54883i;
            double d12 = this.f54879e;
            return d12 + (d11 * (this.f54880f - d12));
        }

        public double g(double d10) {
            double d11 = (d10 - this.f54877c) * this.f54883i;
            double d12 = this.f54881g;
            return d12 + (d11 * (this.f54882h - d12));
        }

        double h() {
            return this.f54886l + (this.f54884j * this.f54889o);
        }

        double i() {
            return this.f54887m + (this.f54885k * this.f54890p);
        }

        double j(double d10) {
            if (d10 <= 0.0d) {
                return 0.0d;
            }
            if (d10 >= 1.0d) {
                return 1.0d;
            }
            double[] dArr = this.f54875a;
            double length = d10 * ((double) (dArr.length - 1));
            int i10 = (int) length;
            double d11 = length - ((double) i10);
            double d12 = dArr[i10];
            return d12 + (d11 * (dArr[i10 + 1] - d12));
        }

        void k(double d10) {
            double dJ = j((this.f54891q ? this.f54878d - d10 : d10 - this.f54877c) * this.f54883i) * 1.5707963267948966d;
            this.f54889o = Math.sin(dJ);
            this.f54890p = Math.cos(dJ);
        }
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0036  */
    public a(int[] iArr, double[] dArr, double[][] dArr2) {
        this.f54871a = dArr;
        this.f54872b = new C0823a[dArr.length - 1];
        int i10 = 1;
        int i11 = 1;
        int i12 = 0;
        while (true) {
            C0823a[] c0823aArr = this.f54872b;
            if (i12 >= c0823aArr.length) {
                return;
            }
            int i13 = iArr[i12];
            int i14 = 3;
            if (i13 != 0) {
                if (i13 == 1) {
                    i10 = 1;
                    i14 = i10;
                } else {
                    if (i13 != 2) {
                        if (i13 != 3) {
                            i14 = 4;
                            if (i13 != 4) {
                                i14 = 5;
                                if (i13 != 5) {
                                    i14 = i11;
                                }
                            }
                        } else {
                            if (i10 != 1) {
                                i10 = 1;
                            }
                            i14 = i10;
                        }
                    }
                    i10 = 2;
                    i14 = i10;
                }
            }
            double d10 = dArr[i12];
            int i15 = i12 + 1;
            double d11 = dArr[i15];
            double[] dArr3 = dArr2[i12];
            double d12 = dArr3[0];
            double d13 = dArr3[1];
            double[] dArr4 = dArr2[i15];
            c0823aArr[i12] = new C0823a(i14, d10, d11, d12, d13, dArr4[0], dArr4[1]);
            i12 = i15;
            i11 = i14;
        }
    }

    @Override // v.b
    public double c(double d10, int i10) {
        double dG;
        double dE;
        double dI;
        double dC;
        double dG2;
        double dE2;
        int i11 = 0;
        if (this.f54873c) {
            C0823a[] c0823aArr = this.f54872b;
            C0823a c0823a = c0823aArr[0];
            double d11 = c0823a.f54877c;
            if (d10 < d11) {
                double d12 = d10 - d11;
                if (c0823a.f54892r) {
                    if (i10 == 0) {
                        dG2 = c0823a.f(d11);
                        dE2 = this.f54872b[0].d(d11);
                    } else {
                        dG2 = c0823a.g(d11);
                        dE2 = this.f54872b[0].e(d11);
                    }
                    return dG2 + (d12 * dE2);
                }
                c0823a.k(d11);
                if (i10 == 0) {
                    dI = this.f54872b[0].h();
                    dC = this.f54872b[0].b();
                } else {
                    dI = this.f54872b[0].i();
                    dC = this.f54872b[0].c();
                }
                return dI + (d12 * dC);
            }
            if (d10 > c0823aArr[c0823aArr.length - 1].f54878d) {
                double d13 = c0823aArr[c0823aArr.length - 1].f54878d;
                double d14 = d10 - d13;
                int length = c0823aArr.length - 1;
                if (i10 == 0) {
                    dG = c0823aArr[length].f(d13);
                    dE = this.f54872b[length].d(d13);
                } else {
                    dG = c0823aArr[length].g(d13);
                    dE = this.f54872b[length].e(d13);
                }
                return dG + (d14 * dE);
            }
        } else {
            C0823a[] c0823aArr2 = this.f54872b;
            double d15 = c0823aArr2[0].f54877c;
            if (d10 < d15) {
                d10 = d15;
            } else if (d10 > c0823aArr2[c0823aArr2.length - 1].f54878d) {
                d10 = c0823aArr2[c0823aArr2.length - 1].f54878d;
            }
        }
        while (true) {
            C0823a[] c0823aArr3 = this.f54872b;
            if (i11 >= c0823aArr3.length) {
                return Double.NaN;
            }
            C0823a c0823a2 = c0823aArr3[i11];
            if (d10 <= c0823a2.f54878d) {
                if (c0823a2.f54892r) {
                    return i10 == 0 ? c0823a2.f(d10) : c0823a2.g(d10);
                }
                c0823a2.k(d10);
                return i10 == 0 ? this.f54872b[i11].h() : this.f54872b[i11].i();
            }
            i11++;
        }
    }

    @Override // v.b
    public void d(double d10, double[] dArr) {
        if (this.f54873c) {
            C0823a[] c0823aArr = this.f54872b;
            C0823a c0823a = c0823aArr[0];
            double d11 = c0823a.f54877c;
            if (d10 < d11) {
                double d12 = d10 - d11;
                if (c0823a.f54892r) {
                    dArr[0] = c0823a.f(d11) + (this.f54872b[0].d(d11) * d12);
                    dArr[1] = this.f54872b[0].g(d11) + (d12 * this.f54872b[0].e(d11));
                    return;
                } else {
                    c0823a.k(d11);
                    dArr[0] = this.f54872b[0].h() + (this.f54872b[0].b() * d12);
                    dArr[1] = this.f54872b[0].i() + (d12 * this.f54872b[0].c());
                    return;
                }
            }
            if (d10 > c0823aArr[c0823aArr.length - 1].f54878d) {
                double d13 = c0823aArr[c0823aArr.length - 1].f54878d;
                double d14 = d10 - d13;
                int length = c0823aArr.length - 1;
                C0823a c0823a2 = c0823aArr[length];
                if (c0823a2.f54892r) {
                    dArr[0] = c0823a2.f(d13) + (this.f54872b[length].d(d13) * d14);
                    dArr[1] = this.f54872b[length].g(d13) + (d14 * this.f54872b[length].e(d13));
                    return;
                } else {
                    c0823a2.k(d10);
                    dArr[0] = this.f54872b[length].h() + (this.f54872b[length].b() * d14);
                    dArr[1] = this.f54872b[length].i() + (d14 * this.f54872b[length].c());
                    return;
                }
            }
        } else {
            C0823a[] c0823aArr2 = this.f54872b;
            double d15 = c0823aArr2[0].f54877c;
            if (d10 < d15) {
                d10 = d15;
            }
            if (d10 > c0823aArr2[c0823aArr2.length - 1].f54878d) {
                d10 = c0823aArr2[c0823aArr2.length - 1].f54878d;
            }
        }
        int i10 = 0;
        while (true) {
            C0823a[] c0823aArr3 = this.f54872b;
            if (i10 >= c0823aArr3.length) {
                return;
            }
            C0823a c0823a3 = c0823aArr3[i10];
            if (d10 <= c0823a3.f54878d) {
                if (c0823a3.f54892r) {
                    dArr[0] = c0823a3.f(d10);
                    dArr[1] = this.f54872b[i10].g(d10);
                    return;
                } else {
                    c0823a3.k(d10);
                    dArr[0] = this.f54872b[i10].h();
                    dArr[1] = this.f54872b[i10].i();
                    return;
                }
            }
            i10++;
        }
    }

    @Override // v.b
    public void e(double d10, float[] fArr) {
        if (this.f54873c) {
            C0823a[] c0823aArr = this.f54872b;
            C0823a c0823a = c0823aArr[0];
            double d11 = c0823a.f54877c;
            if (d10 < d11) {
                double d12 = d10 - d11;
                if (c0823a.f54892r) {
                    fArr[0] = (float) (c0823a.f(d11) + (this.f54872b[0].d(d11) * d12));
                    fArr[1] = (float) (this.f54872b[0].g(d11) + (d12 * this.f54872b[0].e(d11)));
                    return;
                } else {
                    c0823a.k(d11);
                    fArr[0] = (float) (this.f54872b[0].h() + (this.f54872b[0].b() * d12));
                    fArr[1] = (float) (this.f54872b[0].i() + (d12 * this.f54872b[0].c()));
                    return;
                }
            }
            if (d10 > c0823aArr[c0823aArr.length - 1].f54878d) {
                double d13 = c0823aArr[c0823aArr.length - 1].f54878d;
                double d14 = d10 - d13;
                int length = c0823aArr.length - 1;
                C0823a c0823a2 = c0823aArr[length];
                if (c0823a2.f54892r) {
                    fArr[0] = (float) (c0823a2.f(d13) + (this.f54872b[length].d(d13) * d14));
                    fArr[1] = (float) (this.f54872b[length].g(d13) + (d14 * this.f54872b[length].e(d13)));
                    return;
                } else {
                    c0823a2.k(d10);
                    fArr[0] = (float) this.f54872b[length].h();
                    fArr[1] = (float) this.f54872b[length].i();
                    return;
                }
            }
        } else {
            C0823a[] c0823aArr2 = this.f54872b;
            double d15 = c0823aArr2[0].f54877c;
            if (d10 < d15) {
                d10 = d15;
            } else if (d10 > c0823aArr2[c0823aArr2.length - 1].f54878d) {
                d10 = c0823aArr2[c0823aArr2.length - 1].f54878d;
            }
        }
        int i10 = 0;
        while (true) {
            C0823a[] c0823aArr3 = this.f54872b;
            if (i10 >= c0823aArr3.length) {
                return;
            }
            C0823a c0823a3 = c0823aArr3[i10];
            if (d10 <= c0823a3.f54878d) {
                if (c0823a3.f54892r) {
                    fArr[0] = (float) c0823a3.f(d10);
                    fArr[1] = (float) this.f54872b[i10].g(d10);
                    return;
                } else {
                    c0823a3.k(d10);
                    fArr[0] = (float) this.f54872b[i10].h();
                    fArr[1] = (float) this.f54872b[i10].i();
                    return;
                }
            }
            i10++;
        }
    }

    @Override // v.b
    public double f(double d10, int i10) {
        C0823a[] c0823aArr = this.f54872b;
        int i11 = 0;
        double d11 = c0823aArr[0].f54877c;
        if (d10 < d11) {
            d10 = d11;
        }
        if (d10 > c0823aArr[c0823aArr.length - 1].f54878d) {
            d10 = c0823aArr[c0823aArr.length - 1].f54878d;
        }
        while (true) {
            C0823a[] c0823aArr2 = this.f54872b;
            if (i11 >= c0823aArr2.length) {
                return Double.NaN;
            }
            C0823a c0823a = c0823aArr2[i11];
            if (d10 <= c0823a.f54878d) {
                if (c0823a.f54892r) {
                    return i10 == 0 ? c0823a.d(d10) : c0823a.e(d10);
                }
                c0823a.k(d10);
                return i10 == 0 ? this.f54872b[i11].b() : this.f54872b[i11].c();
            }
            i11++;
        }
    }

    @Override // v.b
    public void g(double d10, double[] dArr) {
        C0823a[] c0823aArr = this.f54872b;
        double d11 = c0823aArr[0].f54877c;
        if (d10 < d11) {
            d10 = d11;
        } else if (d10 > c0823aArr[c0823aArr.length - 1].f54878d) {
            d10 = c0823aArr[c0823aArr.length - 1].f54878d;
        }
        int i10 = 0;
        while (true) {
            C0823a[] c0823aArr2 = this.f54872b;
            if (i10 >= c0823aArr2.length) {
                return;
            }
            C0823a c0823a = c0823aArr2[i10];
            if (d10 <= c0823a.f54878d) {
                if (c0823a.f54892r) {
                    dArr[0] = c0823a.d(d10);
                    dArr[1] = this.f54872b[i10].e(d10);
                    return;
                } else {
                    c0823a.k(d10);
                    dArr[0] = this.f54872b[i10].b();
                    dArr[1] = this.f54872b[i10].c();
                    return;
                }
            }
            i10++;
        }
    }

    @Override // v.b
    public double[] h() {
        return this.f54871a;
    }
}
